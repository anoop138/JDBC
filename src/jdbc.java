
import java.sql.*;

public class jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url:"jdbc:mysql://localhost:3306/lab 26/11",user:"root",password:"");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(sql:"select * from student");
        while (rs.next())
        {

            System.out.println(rs.getInt(columnindex:1)+ " "+ rs.getString(columnindex:2)+ "  "+ rs.getInt(columnindex:3)+ "  "+rs.getInt(columnindex:4)+"  "+ rs.getString(columnindex:5));

        }
        con.close();


    }
}
