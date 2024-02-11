package com.project.questify.responses;

import lombok.Data;

@Data
public class AuthResponse {

	String message;
	Long userId;
	String accessToken;
	String refreshToken;
}
