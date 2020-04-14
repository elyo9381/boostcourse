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
	private static String dbuser = "connectuser";
	private static String dbpasswd = "connect123!@#";
	
	
	public TodoDao()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	
	public int CreateTable()
	{
		int SuccessVal = 0; 
		String sql = "create table todo ( id BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,"
										 + "title varchar(255) NOT NULL,"
										 + "name varchar(100) NOT NULL,"
										 + "sequence INT(1) NOT NULL,"
										 + "type varchar(20) DEFAULT 'TODO',"
										 + "regDate DATETIME DEFAULT NOW())";
		
		try(Connection conn = DriverManager.getConnection(dburl,dbuser,dbpasswd);
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.executeUpdate();
			SuccessVal++;
		} catch (Exception e){
			e.printStackTrace();
			
		}	
		
		
		return SuccessVal;
	}

			
	
	public boolean istable() {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			String sql = "SELECT 1 FROM Information_schema.tables WHERE table_name = 'todo'";
			conn = DriverManager.getConnection(dburl,dbuser,dbpasswd);
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			int num = 0;
			
			num = rs.getInt("1");
				
			
			
			if(num == 1)
			{
				System.out.print("istable");
				
			}
			else 
			{
				CreateTable();
				System.out.print("createTable");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{

				if(rs!=null)rs.close();

				if(ps!=null)ps.close();

				if(conn!=null)conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return true;
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
		
		String sql = "select id, title, name, sequence, type, DATE_FORMAT(regdate, \'%Y.%m.%d\') as regdate from todo order by regdate";
		
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
