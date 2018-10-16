// IMPORTS
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import  static spark.Spark.*;


// APP Class
public class App{
    static DB db=new DB();
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("stylist",null);
            if(db.allData().size()>0){
                model.put("stylist",db.allData());
            }
            else{
                model.put("message","There Are No Stylists! Please Add...");
            }
            model.put("template", "templates/index.vtl" );
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/addStylist",(request,response)->{
            String id=request.queryParams("id");
            if(id.length()>8){
                id=id.substring(0,8);
            }
            Stylist stylist=new Stylist(
                    Double.parseDouble(id),
                    req.queryParams("first_name"),
                    req.queryParams("second_name"),
                    req.queryParams("last_name"),
                    req.queryParams("phone_number"),
                    req.queryParams("email")
            );
            if(stylist.save()){
                model.put("message","Successfully Added Stylist");
            }
            else{
                model.put("message","Id Number Exists");
            }
            res.redirect("/");
            return new ModelAndView(model,"templates/layout.vtl");
        },new VelocityTemplateEngine());


    }
}
