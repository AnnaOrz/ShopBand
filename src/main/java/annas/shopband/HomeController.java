package annas.shopband;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    Logger logger = LoggerFactory.getLogger("HomeLogger");

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("form", new MyForm());
        logger.info("in controller");
        return "/TextWithEditor";
    }

    @PostMapping("/save")
    @ResponseBody
    public String saveResponse(@ModelAttribute("form") MyForm myForm){
        logger.info(myForm.getMessage());
        return "This is your message: " + myForm.getMessage();

    }
}
