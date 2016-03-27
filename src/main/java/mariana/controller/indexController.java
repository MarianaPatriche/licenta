package mariana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mariana on 27.03.2016.
 */
@Controller
public class indexController {
    @RequestMapping("/index")
    public String index(){
        return "tema/index";
    }
}
