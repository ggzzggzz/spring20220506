package org.zerock.domain.ex02;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ReplyDto {
	private int id;
	private int boardId;
	private String content;
	private LocalDateTime inserted;
}
