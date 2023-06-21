package hotelsystem;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class connection { 
Connection conn = null;
    public static Connection dbcon(){
          try{
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");

System.out.printf("Bağlandı");
return conn;
} catch(Exception e){
System.out.printf("Bağlanmadı");
    return null;
}
    }
}