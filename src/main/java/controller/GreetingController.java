package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/list")
    public String list (
        Map<String, Object> model){
        return "list";
    }



    @GetMapping("/greeting")
    public String greeting(
        @RequestParam(name="name", required=false, defaultValue="World")
        String name,
        Map <String, Object> model) {
            model.put("name", name);
            return "greeting";
    }

    @GetMapping("/administrator")
    public String administrator (
            Map <String, Object> model
    ){
        return "administrator";
    }

}
