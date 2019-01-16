package vms.user.dto;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
@Document(collection = "users")
public class UserDto {
	
	@Id
	public int userId;
	public String userName;
	public String password;
	public Set<String> roles;
	
	
	public UserDto(int userId, String userName, String password, Set<String> roles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}
	

}
