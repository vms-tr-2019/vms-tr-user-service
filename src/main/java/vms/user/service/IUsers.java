package vms.user.service;

import vms.user.dto.OperationStatusEnum;
import vms.user.dto.UserDto;

public interface IUsers {
	
	public OperationStatusEnum addUser(UserDto user);
	public UserDto getUser(int userId);
	public OperationStatusEnum updateUser(int userId, UserDto user);
	public OperationStatusEnum removeUser(int userId);
	
}
