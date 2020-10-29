package com.finalproject;

import org.springframework.stereotype.Controller;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping("/start")
    public String start(Map <String, Object> model){
        model.put("line","You finally got started!!!");
        return "start";
    }

}
