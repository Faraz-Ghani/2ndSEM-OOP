/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13task;

/**
 *
 * @author faraz
 */
import java.sql.*;

//export CLASSPATH=<.jar>:.
class DBConnection  {
 DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/java","root",""); 
            
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery("SELECT * FROM test");
            while(r.next()){
                System.out.println("Id = " + r.getInt("id") + " Name = " + r.getString("name"));
            }
            con.close();  
            }catch(Exception e){ System.out.println(e);}  

    }
    public static void main(String[] args) {
        new DBConnection();
    }        
    
}