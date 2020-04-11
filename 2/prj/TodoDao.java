package kr.or.connect.Todo.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.or.connect.Todo.Dto.TodoDto;

public class TodoDao {
	
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
	private static String dbuser = "connectUser";
	private static String dbpasswd = "connect123!@#";
	
	
	public TodoDao()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean CreateTable()
	{
		boolean SuccessVal = false;
		String sql = "create table todo ( id BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT, "
										 + "title VARCHER(255) NOT NULL, "
										 + "name VARCHAR(100) NOT NULL, "
										 + "sequence INT(1) NOT NULL, "
										 + "type VARCHAR(20) DEFAULT 'TODO', "
										 + "regDate DATETIME DEFAULT NOW(), "
										 + "PRIMARY KEY(id)); ";
		
		try(Connection conn = DriverManager.getConnection(dburl,dbuser,dbpasswd);
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
			
		}	
		
		SuccessVal = true;
		
		return SuccessVal;
	}
	
	public int addTodo(TodoDto todoDto)
	{
		int insertCount = 0;
		
		String sql = "insert into todo(title, name, sequence) value(?,?,?); ";
		
		try (Connection conn = DriverManager.getConnection(dburl, dbuser, dbpasswd);
				PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setString(1, todoDto.getTitle());
			ps.setString(2, todoDto.getName());
			ps.setInt(3, todoDto.getSequence());
			
			insertCount = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return insertCount;
	}
	
	public int updateTodo(TodoDto todoDto)
	{
		int updateCount = 0;
		
		String type = todoDto.getType();
		String sql = "";
		
		if(type.equals("TODO")) {
			type = "DOING";
		} else if(type.equals("DOING")) {
			type = "DONE";
		}
		
		sql = String.format("update todo set type='%s' where id =?", type);
		
		try (Connection conn = DriverManager.getConnection(dburl, dbuser,dbpasswd);
				PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setLong(1, todoDto.getId());
			updateCount  = ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return updateCount;
	}
	
	public List<TodoDto> getTodos() {
		List<TodoDto> list = new ArrayList<>();
		
		String sql = "select id, title, name, sequence, type, DATE_FORMT(regdate, \'%Y.%m.%') as regdate "
				   + "from order by regdate; ";
		
		try (Connection conn  = DriverManager.getConnection(dburl, dbuser, dbpasswd);
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()){
			
			while(rs.next()) {
				TodoDto todoDto = new TodoDto();
				todoDto.setId(rs.getLong("id"));
				todoDto.setTitle(rs.getNString("Title"));
				todoDto.setName(rs.getNString("name"));
				todoDto.setSequence(rs.getInt("sequence"));
				todoDto.setType(rs.getString("type"));
				todoDto.setRegDate(rs.getString("regdate"));
				list.add(todoDto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}
	
}
