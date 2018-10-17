import org.sql2o.Connection;
public class Client {
    private double id;
    private String first_name;
    private String second_name;
    private String last_name;
    private String stylist;
    private String phone_number;
    private String email;
    private DB db=new DB();
    public Client(double id,String first_name,String second_name, String last_name, String stylist, String phone_number, String email) {
        this.first_name=first_name;
        this.second_name=second_name;
        this.last_name=last_name;
        this.stylist=stylist;
        this.phone_number=phone_number;
        this.email=email;
    }



}