/*
 * Dalia Sinclair
 * RouteController
 * Controller class containing methods for each URL route
 */

package com.daliasblog.Blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController {
	// Route mappings for main frontend pages

	@GetMapping("/about")
	public String getAboutPage() {
		return "about";
	}
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	
	@GetMapping("/register")
	public String getRegisterPage() {
		return "register";
	}

}