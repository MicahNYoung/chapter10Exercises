package org.launchcode.testProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")

    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //Handles request of the form/hello?name=LaunchCode

    @RequestMapping (method = {RequestMethod.GET,RequestMethod.POST})

    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    //Handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")

    public String helloWithPathName(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    @PostMapping("message")
    public static String createMessage(@RequestParam String name, @RequestParam String language) {
        System.out.println(language);
        if (language.equals("english") ) {
            return "Howdy, " + name;
        } else if(language.equals("spanish")){
            return "Hola " + name;
        } else if(language.equals("portuguese")){
            return "Oi " + name;
        } else if(language.equals("french")){
            return "Bonjour " + name;
        } else if(language.equals("german")){
            return "Hallo " + name;
        } else {
            return "Error";
        }
    }


    @GetMapping("form")

    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='message' method = 'post'>" + //submit a request to /hello
                "<input type='text' name='name'>" +
                "<select name='language'>\n" +
                "    <option value=\"english\">English</option>\n" +
                "    <option value = \"spanish\">Spanish</option>\n" +
                "    <option value=\"portuguese\">Portuguese</option>\n" +
                "    <option value=\"french\">French</option>\n" +
                "    <option value=\"german\">German</option>\n" +
                "</select>\n" +
                "<input type='submit' value='Greet Me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
