package SpringProject.HelloSpring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloREST {


    @RequestMapping("/")

    public String display()
    {
        return "Hello from BridgeLabz !";
    }
}
