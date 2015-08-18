import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("username", request.session().attribute("username"));

      String invalidUsername = "Please enter your username";
      model.put("invalidUsername", invalidUsername);

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  get("/result", (request, response) -> {
    HashMap<String, Object> model = new HashMap<String, Object>();

    String invalidUsername = "Please enter a username";
    model.put("invalidUsername", invalidUsername);

    model.put("template", "templages/result.vtl");
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());



    post("/result", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

    int length = Integer.parseInt(request.queryParams("length"));
    int width = Integer.parseInt(request.queryParams("width"));
    int height = Integer.parseInt(request.queryParams("height"));

    Triangle myTriangle = new Triangle(length, width, height);
    model.put("myTriangle", myTriangle);

    String inputtedUsername = request.session().attribute("username");
    model.put("username", inputtedUsername);

    model.put("template", "templates/result.vtl");
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

  post("/home", (request, response) -> {
    HashMap<String, Object> model = new HashMap<String, Object>();

    String inputtedUsername = request.queryParams("username");

    if (inputtedUsername !=null && inputtedUsername.trim().length() > 0) {
    request.session().attribute("username", inputtedUsername);
    model.put("username", inputtedUsername);
  }

  else {
    String invalidUsername = "Please enter a username";
    model.put("invalidUsername", invalidUsername);
  }

    model.put("template", "templates/home.vtl");
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());
}

}
