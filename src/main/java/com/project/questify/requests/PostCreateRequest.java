package com.project.questify.requests;

import lombok.Data;

@Data
public class PostCreateRequest {

	Long id;
	String text;
	String title;
	Long userId;
}
