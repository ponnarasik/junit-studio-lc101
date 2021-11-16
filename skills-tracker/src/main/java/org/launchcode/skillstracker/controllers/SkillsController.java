package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String createHomepage(){
        return "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2> Skills and stuff!</h2>"+
                "<ol>"+
                "<li> JavaScript </li>"+
                "<li> Java </li>"+
                "<li> Python </li>"+
                "</ol>"+
                        "</body></html>";

    }
    @GetMapping("/form")
    @ResponseBody
    public String createForm(){
        return "<html><body>" +
"<form method ='post'>"+
                "<label> Name<br /> <input type ='text' name='name' /></label><br />"+
                "<label> My first language of choice<br />" +
                "<select name=\"firstlang\" id=\"firstlang\">"+
  "<option value=\"java\">Java</option>" +
  "<option value=\"javascript\">JavaScript</option>"+
  "<option value=\"python\">Python</option>"+
  
"</select></label><br />"+
                "<label> My second language of choice<br />" +
                "<select name=\"secondlang\" id=\"secondlang\">"+
                "<option value=\"java\">Java</option>" +
                "<option value=\"javascript\">JavaScript</option>"+
                "<option value=\"python\">Python</option>"+
                "</select></label><br />"+
                "<label> My third language of choice<br />" +
                "<select name=\"thirdlang\" id=\"thirdlang\">"+
                "<option value=\"java\">Java</option>" +
                "<option value=\"javascript\">JavaScript</option>"+
                "<option value=\"python\">Python</option>"+

                "</select></label><br />"+

        "<input type=\"submit\" value=\"Submit!\" />"+
                "</body></html>";
    }
    @PostMapping("/form")
    @ResponseBody
    public String formSubmission(@RequestParam String name, @RequestParam String firstlang, @RequestParam String secondlang, @RequestParam String thirdlang){
        return "<html><body>" +
                "<h1>" +name + "</h1>" +
                "<ol>" +
                 "<li>" + firstlang + "</li>" +
                "<li>" + secondlang + "</li>" +
                "<li>" + thirdlang + "</li>" +
                "</ol>" +
                "</body></html>";



    }
}
