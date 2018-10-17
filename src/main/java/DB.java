
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

    public List<Stylist> allData(){
        return con.createQuery("SELECT id,first_name,second_name,last_name,phone_number,email FROM stylist").executeAndFetch(Stylist.class);
    }

    public Stylist getStylist(double id){
        return (Stylist) con.createQuery("SELECT id,first_name,second_name,last_name,phone_number,email FROM stylist WHERE id=:id;")
        .addParameter("id",id)
        .executeAndFetch(Stylist.class);
    }

}