import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
public class HelloPruthviController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello Pruthvi World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloPruthviController.class, args);
    }
}