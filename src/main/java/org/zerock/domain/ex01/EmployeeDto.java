package org.zerock.domain.ex01;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmployeeDto {
	private int id;
	private String lastName;
	private String firstName;
//	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;
	private String photo;
	private String notes;
}
