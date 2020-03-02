  
package com.wallet.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.wallet.entity.User;
import com.wallet.util.enums.RoleEnum;
/*
import lombok.NoArgsConstructor;

@NoArgsConstructor*/
public class JwtUserFactory {

	public static JwtUser create(User user) {
		return new JwtUser(user.getId(), user.getEmail(), user.getPassword());
	}
	

}