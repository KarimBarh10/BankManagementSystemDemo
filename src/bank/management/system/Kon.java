package bank.management.system;

import java.sql.*;

public class Kon {
    Connection connection;
    Statement statement;

    public Kon(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","CeliaBarhmed10");
            statement = connection.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }


    }
}
