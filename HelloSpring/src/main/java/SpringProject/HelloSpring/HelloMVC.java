package SpringProject.HelloSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloMVC {

    @GetMapping("/web")
    public String hello()
    {
        return "message";
    }

    @GetMapping("/web/message")
    public String message(Model model)
    {
        model.addAttribute("message","Hello from BridgeLabz");
        return "message";
    }

}
