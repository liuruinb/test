package lige.lige.Controller;

import lige.lige.Model.AooConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Autowired
    private AooConfig aooConfig;
    @ResponseBody
    @RequestMapping(value = "/index")
    public String index() {
        System.out.println(aooConfig.rui);
        return "hello xiao wei";
    }

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello li xiao wei";
    }
}
