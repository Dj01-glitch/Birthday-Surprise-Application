package birthday.birthdaysurpriseapplication.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BirthdayController {

    // Landing page (the fun teaser page)
    @GetMapping("/")
    public String landing() {
        return "landing";
    }

    // Main birthday surprise page
    @GetMapping("/main")
    public String main() {
        return "main";
    }

    // Alternative route
    @GetMapping("/surprise")
    public String surprise() {
        return "main";
    }
}