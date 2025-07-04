package com.mrignaini.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;

	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 characters!!")
	private String name;

	@Email(message = "Email address is not valid!!")
	private String email;

	@NotEmpty
	@Size(min = 3, max = 10, message = "Password must be min of 3 chars and max of 10 chars!!")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[^a-zA-Z0-9]).+$", message = "Must contain at least one digit and one special character")
	private String password;

	@NotEmpty
	private String about;

}
