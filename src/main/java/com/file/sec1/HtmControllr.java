package com.file.sec1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HtmControllr {

	@GetMapping("/get")
	public String get(Model model) {
		List s= new ArrayList<>();
		Htm htm= new Htm(1,"mani","chennai");
		Htm htm1= new Htm(2,"dines","bangalurunai");
		Htm htm2= new Htm(3,"anii","salemai");
		s.add(htm);
		s.add(htm1);
		s.add(htm2);
		System.out.println(s);
		model.addAttribute("s", s);
		return "view";
	}

}
