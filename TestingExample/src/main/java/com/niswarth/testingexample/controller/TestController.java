package com.niswarth.testingexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/helloniswarth")
	public @ResponseBody String greeting() {
		return "Hello, Niswarth";
	}

}
