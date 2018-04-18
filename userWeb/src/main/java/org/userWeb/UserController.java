package org.userWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.userDomain.User;
import org.userService.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/getUserById/{id}")
	public User getUserById(@PathVariable Long id){
		System.out.println("id is :"+id);
		return userService.getUserById(id);
	}
	
	@GetMapping("/test")
	public String test(){
		return "test";
	}

}
