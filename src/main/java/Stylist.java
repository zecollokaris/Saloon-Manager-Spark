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
    public double getId(){
        return this.id;
    }
    public String getFirst_name(){
        return this.first_name;
    }
    public String getSecond_name(){
        return this.second_name;
    }
    public String getLast_name(){
        return this.last_name;
    }
    public String getPhone_number(){
        return this.phone_number;
    }
    public String getEmail(){
        return this.email;
    }

    public boolean save(){

    db.getCon().createQuery("INSERT INTO stylist (id,first_name,second_name,last_name,phone_number,email) VALUES(:id,:first_name,:second_name,:last_name,:phone_number,:email)")
    .addParameter("id",id)
    .addParameter("first_name",first_name)
    .addParameter("second_name",second_name)
    .addParameter("last_name",last_name)
    .addParameter("phone_number",phone_number)
    .addParameter("email",email)
    .executeUpdate();
    return  true;
    }

}