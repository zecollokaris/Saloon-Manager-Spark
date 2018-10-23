
import org.sql2o.*;
import java.util.List;

public class DB {
    private Connection con;
    public DB(){
        con=new Sql2o("jdbc:postgresql://ec2-54-243-61-194.compute-1.amazonaws.com:5432/d9i14o321comr7","tvyqktjmvjzglo","aeba17f4fa1782f78bdcdb9c28c2e22e677eb5c7e22d883e912199a60b67ef9f").open();
    }

    public Connection getCon(){
        return con;
    }

    public  String executeCommand(String sql){
        try{
            con.createQuery(sql).executeUpdate();
        }
        catch (Exception ex) {
            return "Error insertion";
        }
        return "Complete";
    }

    public List<Stylist> allData(){
        return con.createQuery("SELECT id,first_name,second_name,last_name,phone_number,email FROM stylist").executeAndFetch(Stylist.class);
    }

    public Stylist getStylist(double id){
        return (Stylist) con.createQuery("SELECT id,first_name,second_name,last_name,phone_number,email FROM stylist WHERE id=:id;")
        .addParameter("id",id)
        .executeAndFetchFirst(Stylist.class);
    }

    public List<Client> getClients(double id) {
        return  con.createQuery("SELECT id, first_name, second_ame,last_name,stylist,phone_number,email FROM client WHERE stylist=:id;")
        .addParameter("id", id)
        .executeAndFetch(Client.class);
    }

    public List<Client> getClient(double id) {
        return con.createQuery("SELECT id,first_name,second_name,last_name,stylist,phone_number,email FROM client WHERE stylist=:id;")
                //Cast From Double To String
                .addParameter("id", Double.toString(id))
                .executeAndFetch(Client.class);
    }

}