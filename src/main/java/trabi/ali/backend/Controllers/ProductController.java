package trabi.ali.backend.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getHello(){
        return "Welkom bij de dierenwinkel zijn eerste API request";
    }
}
