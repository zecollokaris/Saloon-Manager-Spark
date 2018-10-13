import org.sql2o.*;
import java.util.List;

public class DB {
    private Connection con;
    public DB(){
        con=new Sql2o("jdbc:postgresql://localhost:5432/saloon_manager","karis","Kar!s123").open();
    }

    public Connection getCon(){
        return con;
    }
    public  String executeCommand(String sql){
        try{
            con.createQuery(sql).executeUpdate();
        }
        catch (Exception ex) {
            return "Error Adding..";
        }
        return "Added!!! Complete..";
    }



}