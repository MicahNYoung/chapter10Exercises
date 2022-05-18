package org.launchcode.testProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller


public class HelloController {

    //Handles request at path /hello
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})

    public String hello(@RequestParam String name, Model model) {
        String greeting = "Hello " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }


//
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//    //Handles request of the form/hello?name=LaunchCode
//
//    @RequestMapping (method = {RequestMethod.GET,RequestMethod.POST}, value = "hello")
//    @ResponseBody
//
//    public String helloWithQueryParam(@RequestParam String name){
//        return "Hello, " + name + "!";
//    }
//
////    //Handles requests of the form /hello/LaunchCode
//    @GetMapping("hello/{name}")
//    @ResponseBody
//    public String helloWithPathName(@PathVariable String name){
//        return "Hello, " + name + "!";
//    }
//
//    @PostMapping("message")
//    @ResponseBody
//    public static String createMessage(@RequestParam String name, @RequestParam String language) {
//        System.out.println(language);
//        if (language.equals("english") ) {
//            return "Howdy, " + name;
//        } else if(language.equals("spanish")){
//            return "Hola " + name;
//        } else if(language.equals("portuguese")){
//            return "Oi " + name;
//        } else if(language.equals("french")){
//            return "Bonjour " + name;
//        } else if(language.equals("german")){
//            return "Hallo " + name;
//        } else {
//            return "Error";
//        }
//    }
//
//
    @GetMapping("form")

    public String helloForm(){
        return "form";
    }
    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";
    }
}
