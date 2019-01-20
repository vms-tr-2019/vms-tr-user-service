package vms.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vms.user.dto.OperationStatusEnum;
import vms.user.dto.UserDto;
import vms.user.repo.UsersDataRepository;


@Service
public class UserService implements IUsers {
	
	@Autowired
	UsersDataRepository repo;

	@Override
	public OperationStatusEnum addUser(UserDto user) {
		if(repo.existsById(user.userId)) {
			return OperationStatusEnum.USER_EXSIST;
		}
		repo.save(user);
		
		return OperationStatusEnum.OK;
	}

	@Override
	public UserDto getUser(int userId) {
		return repo.findById(userId).orElse(null);
		}

	@Override
	public OperationStatusEnum updateUser(int userId, UserDto user) {
		if(!repo.existsById(user.userId)) {
			return OperationStatusEnum.NO_EXSIST;
		}
		repo.save(user);
		return OperationStatusEnum.OK;
	}

	@Override
	public OperationStatusEnum removeUser(int userId) {
		if(!repo.existsById(userId)) {
			return OperationStatusEnum.NO_EXSIST;
		}
		repo.deleteById(userId);
		return OperationStatusEnum.OK;
	}
	@Override
	public List<UserDto> getAllUsers(){
		return repo.findAll();
	}

}
