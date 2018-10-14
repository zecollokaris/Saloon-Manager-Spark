// IMPORTS
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import  static spark.Spark.*;

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


    }
}