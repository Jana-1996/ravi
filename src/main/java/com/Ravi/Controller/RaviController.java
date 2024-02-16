package com.Ravi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RaviController {

	@GetMapping(value="/get")
	public String get() {
		return "You Can do Anything you want to do ";
	}
}
