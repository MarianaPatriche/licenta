package mariana.models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by mariana on 17.03.2016.
 */

public class UserModel {

	private Long id;

	@NotEmpty
	@Size(min = 3, max = 30, message = "Usernameul trebuie sa contina intre 3 si 30 de caractere!")
	private String username;

	@NotEmpty
	@Size(min = 5, max = 30, message = "Parola trebuie sa contina intre 5 si 30 de caractere!")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
