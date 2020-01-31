package com.wallet.security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TokenDTO {

	

	private String token;

	public TokenDTO(String _token) {
			this.setToken(_token);
		}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}