package vms.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vms.user.dto.OperationStatusEnum;
import vms.user.dto.UserDto;
import vms.user.service.IUsers;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IUsers users;
	
	@PostMapping("")
	public OperationStatusEnum addUser(@RequestBody UserDto user) {
		return users.addUser(user);
	}
	
	@GetMapping("/{user_id}")
	public UserDto getUser(@PathVariable("user_id") int userId) {
		return users.getUser(userId);
	}

	@PostMapping("/update/{user_id}")
	public OperationStatusEnum updateUser(@PathVariable("user_id") int userId, @RequestBody UserDto user) {
		return users.updateUser(userId, user);
	}

	@DeleteMapping("/{user_id}")
	public OperationStatusEnum removeUser(@PathVariable("user_id") int userId) {
		return users.removeUser(userId);
	}

}
