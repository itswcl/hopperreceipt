package com.wei.hopperreceipt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
		@RequestMapping("/")
		public String index(Model model) {
			String fullName = "Grace wefsdfsd Hopper";
			String itemName = "Copper sdsvsv wire";
			double price = 5.231235;
			String desc = "Metal strips. ads Also an illustration of nanoseconds";
			String vendor = "Little Things asdd Corner Store";
			
			model.addAttribute("fullName", fullName);
			model.addAttribute("itemName", itemName);
			model.addAttribute("price", price);
			model.addAttribute("desc", desc);
			model.addAttribute("vendor", vendor);
			
			return "index.jsp";
		}

		
}
