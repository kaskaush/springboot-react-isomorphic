package com.kaushik.springbootreactisomorphic.springbootreactisomorphicpoc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDTO {

	private Long id;
	private String title;
	private String description;

}
