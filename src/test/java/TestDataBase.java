import org.junit.rules.ExternalResource;
import org.sql2o.*;

public class TestDataBase extends ExternalResource{
    private Connection con;
    private Sql2o sql2o=new Sql2o("jdbc:postgresql://localhost:5432/saloon_manager_tests","karis","Kar!s123");

    @Override
    public void before(){
        con=sql2o.open();
    }
    @Override
    public  void after(){
        con.createQuery("DELETE FROM stylists *;").executeUpdate();
        con.createQuery("DELETE FROM clients *;").executeUpdate();
        con.close();
    }
    public Connection getCon(){
        return this.con;
    }
}
