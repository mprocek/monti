package pl.sportowarywalizacja.monti;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(){

        return "home";
    }

    @GetMapping("/add")
    public String addEvent(){

        return "add";
    }


}
