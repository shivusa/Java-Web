import java.sql.*;

public class StudentDao {
	public Student getStudentDetails(int studeny_id) {
		Student s1 = new Student();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivu", "root", "Shivusa@123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM student WHERE studeny_id=" + studeny_id);
			if (rs.next()) {
				s1.setStudeny_id(rs.getInt("studeny_id"));
				s1.setName_s(rs.getString("name_s"));
				s1.setMajor(rs.getString("major"));
			}
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
		
		return s1;
	}

}
