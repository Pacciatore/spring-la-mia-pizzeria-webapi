package org.lessons.java.pizzeria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping
	public String index() {
		return "front/homepage";
	}

	@GetMapping("/pizza")
	public String show(@RequestParam(name = "pizza", required = false) String keyword) {
		return "front/show";
	}

	@GetMapping("/create-pizza")
	public String create() {
		return "front/create-pizza";
	}

}
