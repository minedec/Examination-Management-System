package com.neuedu.examsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.examsys.service.BanjiService;

@Controller //普通cotroller
@RequestMapping("/banji")
//@RestController //所有返回值都是json
public class BanjiController {
	
	@Autowired
	private BanjiService banjiservice;
	
	@GetMapping("/delete")
	public String deleteBanJi(Integer bid) {
		System.out.println("Trigger Controller");
		banjiservice.delete(bid);
		return "../success.html";
	}
}
