package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("git")
public class Cont {
	@RequestMapping("")
	public String index() {
		return "result";
	}
}
