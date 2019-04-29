package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OfferController {

	@RequestMapping
	public void show() {
		System.out.println("dfdfd");
	}
}
