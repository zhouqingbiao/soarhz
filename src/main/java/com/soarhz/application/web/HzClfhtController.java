package com.soarhz.application.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HzClfhtController {

	@GetMapping("/HzClfht")
	public String controller(Model model, HttpServletRequest request) {

		return "HzClfht";
	}
}
