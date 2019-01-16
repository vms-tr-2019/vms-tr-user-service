package vms.user.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import vms.user.dto.UserDto;


@Repository
public interface UsersDataRepository extends MongoRepository<UserDto, Integer> {

}
