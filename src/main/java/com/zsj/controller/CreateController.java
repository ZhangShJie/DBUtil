package com.zsj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CreateController {
	@ResponseBody
	@RequestMapping("/create")
	public String createBean(@RequestParam(required=false) String columns){
		System.out.println(columns);
		return "{\"asd\":1}";
	}
}
