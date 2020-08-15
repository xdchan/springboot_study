package com.example.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.study.service.UserService;

@Controller
public class TestController {
	
	@Autowired
    private UserService userService;
	
	@RequestMapping("/h1")
	@ResponseBody
	public String helloWorld() {
		return "hello world1";
	}
	
	@GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
	
    @RequestMapping("getUser")
    @ResponseBody
    public String GetUser(){
        int id = 1;
        return userService.sel(id).toString();
    }
}
