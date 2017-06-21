package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
     private static final String template = "Hello, %s!";
     private final AtomicLong counter = new AtomicLong();
     
     
     
     @RequestMapping("/greeting")
     public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
    	 return new Greeting(counter.incrementAndGet(),String.format(template, name));
    	  	  
     }
     @RequestMapping("/firstgreeting")
     public String html(@RequestParam(value = "name", defaultValue = "World") String name, Model model){
    	 model.addAttribute("message2", "My first spring html page");
    	 model.addAttribute("message3",greeting(name));
    	 return "Hello"; 
     }
  }
     













/*@RequestMapping("/")
     public String index(){
    	 return "Greeting from Spring Boot";
     }*/
    

     
     
     
     
     

