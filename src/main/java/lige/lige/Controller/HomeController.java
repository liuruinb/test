package lige.lige.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
    @ResponseBody
    @RequestMapping(value = "/index")
    public String index()
    {
        return "hello xiao wei";
    }

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello()
    {
        return "hello li xiao wei";
    }
}
