// IMPORTS
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import  static spark.Spark.*;


// APP Class
public class App{
    static DB db=new DB();
    static Map<String,Object> model=new HashMap<String,Object>();
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

//      Route to Post Stylists!
        post("/newstylist",(request,response)->{
            String id=request.queryParams("id");
            System.out.println(id);
            Stylist stylist=new Stylist(
            Double.parseDouble(id),
            request.queryParams("first_name"),
            request.queryParams("second_name"),
            request.queryParams("last_name"),
            request.queryParams("phone_number"),
            request.queryParams("email")
            );
            stylist.save();
            response.redirect("/");
            return new ModelAndView(model,"templates/layout.vtl");
        },new VelocityTemplateEngine());


//      Route for home That fetches & displays stylists!
        get("/", (request, response) -> {
            model.put("stylist",null);
            if(db.allData().size()>0){
                model.put("stylist",db.allData());
            } else {
                model.put("message","There Are No Stylists! Please Add...");
            }

            model.put("template", "templates/index.vtl" );
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/addclient", ((request, response) ->{
            Client client = new Client(
            1,
            request.queryParams("first_name"),
            request.queryParams("second_name"),
            request.queryParams("last_name"),
            Double.parseDouble(request.queryParams("stylist")),
            request.queryParams("phone_number"),
            request.queryParams("email")
            );
            client.save();
            response.redirect("/getDetails/"+request.queryParams("stylist"));
            return new ModelAndView(model,"templates/layout.vtl");
        }, new VelocityTemplateEngine());

    }
}
