package Backend.com.example.frontend;

import Backend.com.example.frontend.Model.Form;
import Backend.com.example.frontend.Model.Inquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {

    @Autowired
    private FormService formService;

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }

//    @GetMapping("/submit")
//    public String shop(Model model) {
//
//        model.addAttribute("forms", formService.postData());
//        homeService.getWatch();
//        return "shop";
//    }

    @PostMapping("/submit")
    public String postData(Model model, @ModelAttribute Inquiry inquiry) {

//        if (form.name.equals("")) {
//            System.out.println("Name must not be empty");
//        } else if (form.email.equals("")) {
//            System.out.println("Email must not be empty");
//
//        } else if (form.pass.matches("([a-zA-Z]{4,8})([0-9]{2,})")) {
//            System.out.println("Password must be Valid");
//
//        } else {
            String watchName = (inquiry.getSearchName());
            String watchEmail = (inquiry.getSearchEmail());
            Integer watchNum = (inquiry.getSearchNum());
            String watchPass = (inquiry.getSearchPass());

            model.addAttribute("forms", formService.postData(watchName, watchEmail, watchNum, watchPass));
            return "submit";
        }
}
