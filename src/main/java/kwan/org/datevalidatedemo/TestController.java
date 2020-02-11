package kwan.org.datevalidatedemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by https://github.com/kwanpham
 */
@Controller
public class TestController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("myDate" ,new MyDate());
        return "index";
    }

    @PostMapping("/date1")
    public String date1(@ModelAttribute @Valid MyDate myDate , BindingResult br , Model model) {
        System.out.println("date:  " + myDate.getDate1().toString());
        if (br.hasErrors()) {
            return "index";
        }

        model.addAttribute("ok" , "ok");
        model.addAttribute("myDate" , myDate);
        return "index";

    }

}
