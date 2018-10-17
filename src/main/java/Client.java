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

    public double getId() {
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
    public String getStylist(){
        return this.stylist;
    }
    public String getPhone_number(){
        return this.phone_number;
    }
    public String getEmail(){
        return this.email;
    }

    public boolean save(){
        try {
            db.getCon().createQuery("INSERT INTO client(first_name,second_name,last_name,stylist,phone_number,email) VALUES(:first_name,:second_name,:last_name,:stylist,:phone_number,:email)")
                    .addParameter("first_name",first_name)
                    .addParameter("second_name",second_name)
                    .addParameter("last_name",last_name)
                    .addParameter("stylist",stylist)
                    .addParameter("phone_number",phone_number)
                    .addParameter("email",email)
                    .executeUpdate();
                    return true;
        }
    }

}