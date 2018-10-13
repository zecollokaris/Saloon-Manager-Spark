import  org.junit.Test;
import  org.junit.Rule;
import  static org.junit.Assert.assertEquals;


public class SaloonTest{

    @Rule
    public TestDataBase db=new TestDataBase();



    public boolean InsertClient(){
        db.getCon().createQuery("INSERT INTO client (id,first_name,second_name,last_name,stylist,phone_number,email) VALUES (:id,:first_name,:second_name,:last_name,:stylist,:phone_number,:email);")
        .addParameter("id","123456")
        .addParameter("first_name","Collins")
        .addParameter("second_name","Kariuki")
        .addParameter("last_name","Njoroge")
        .addParameter("stylist","123456")
        .addParameter("phone_number","0798123456")
        .addParameter("email","collo@gmail.com")
        .executeUpdate();
        return true;
    }

    public boolean InsertStylist(){
        db.getCon().createQuery("INSERT INTO stylist (id,first_name,second_name,last_name,phone_number,email) VALUES (:id,:first_name,:second_name,:last_name,:phone_number,:email);")
                .addParameter("id","123456")
                .addParameter("first_name","Collins")
                .addParameter("second_name","Kariuki")
                .addParameter("last_name","Njoroge")
                .addParameter("phone_number","0798123456")
                .addParameter("email","collo@gmail.com")
                .executeUpdate();
        return true;
    }


//    Execution Commands
    @Test
    public void InsertClient_True(){
        assertEquals(true,InsertClient());
    }
    @Test
    public void ensureInsertStylist_True(){
        assertEquals(true,InsertStylist());
    }



}