import org.sql2o.Connection;

public class Stylist{
    private double id;
    private String first_name;
    private String second_name;
    private String last_name;
    private String phone_number;
    private String email;
    private DB db=new DB();
    public Stylist(double id,String first_name,String second_name,String last_name, String phone_number, String email){

//      Adding Instances for easy Calling and Usage.
        this.id=id;
        this.first_name=first_name;
        this.second_name=second_name;
        this.last_name=last_name;
        this.phone_number=phone_number;
        this.email=email;
    }


}