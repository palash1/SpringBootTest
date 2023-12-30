package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public String index() {
		return "OK1234";
	}

	@GetMapping("/ww")
	public String index1() {
		return "WW";
	}

	@GetMapping("/user")
	public String getUser() {
		try {
			return "Output-Change12-"+InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getMessage();
		}
	}
}