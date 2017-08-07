package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Fields;
import com.example.demo.model.OtherTags;
import com.example.demo.model.ViewPoint;

@Controller
@RequestMapping(value = "/template")
public class ViewController {
	@RequestMapping("/index")
	public String index(Model model){
		model.addAttribute("viewPoint", new ViewPoint());
		model.addAttribute("fields", new Fields());
		model.addAttribute("otherTags", new OtherTags());
		
		return "index";
	}
	@RequestMapping("/result")
	public String index(){
		
		return "result";
	}

}
