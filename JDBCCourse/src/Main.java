//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        import package
//        load and register
//        create connection
//        create statement
//        execute statement
//        process and results
//        close

        int sid=7;
        String sname="Johnny";
        int marks=33;

        String url="jdbc:postgresql://localhost:5433/demo";
        String uname="postgres";
        String pass="13246587";
        String sql="insert into student values(?, ?, ?)";

        Class.forName("org.postgresql.Driver");

        Connection con=DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");
         //statement
//        Statement statement=con.createStatement();
        //prepared statement to replace ? with var
        PreparedStatement statement=con.prepareStatement(sql);
        statement.setInt(1, sid);
        statement.setString(2, sname);
        statement.setInt(3, marks);
        //insert data to database
//        boolean status=statement.execute(sql);
//        System.out.println(status);
        statement.execute();



        //to get values from database
//        ResultSet resultSet=statement.executeQuery(sql);//execute to change and execute query when no change
//
////        System.out.println(resultSet.next());//goes to next line
////        System.out.println(resultSet);
////        String name=resultSet.getString("sname");
////        System.out.println("Name :"+ name);
//        while(resultSet.next()){
//            System.out.print(resultSet.getInt(1) + " - ");
//            System.out.print(resultSet.getString( 2)+ " - ");
//            System.out.println(resultSet.getInt(3) );
//
//        }

        con.close();
        System.out.println("connection closed");
    }


}