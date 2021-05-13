package netflix;

import java.sql.Connection;
import java.sql.DriverManager;

//desktop
public class Baglanti {
    public static Connection Bagla(){
     
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:netflix.sqlite");
            /*Class.forName("com.mysql.jdbc.Driver"); jdbc:mysql:C://netflixdb/netflix.db
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netflix", "root", "");*/
            //jdbc:mysql://192.168.1.7:8080/phpmyadmin/netflix
            //jdbc:mysql://192.168.1.7:3306/netflix?zeroDateTimeBehavior=convertToNull
            System.out.println("Baglandi");
        } catch (Exception ex) {
            System.out.println("Baglanti basarisiz");
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
  
}

    
