package com.example.lesson04.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class User {
	private int	id;
	private String	name;
	private String	yyyymmdd;
	private String	introduce;
	private String	email;
	private LocalDate createdAt;
	private LocalDate updatedAt;

	
	
}
