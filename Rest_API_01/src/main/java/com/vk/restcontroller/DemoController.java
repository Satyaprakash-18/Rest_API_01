package com.vk.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController
{
	@GetMapping("/get")
	public String getMsg()
	{
		return "Virat The King Kohli...";
	}
}
