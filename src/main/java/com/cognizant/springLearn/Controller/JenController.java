package com.cognizant.springLearn.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class JenController {
 @ResponseBody
 @GetMapping("/")
 public String home() {
  return "Running Application using CMD Line!!";
 }
 
 @GetMapping("/about")
 public String about() {
	 return "this boot app is unedited and maintained with jenkins";
 }
}