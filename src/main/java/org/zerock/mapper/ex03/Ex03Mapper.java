package org.zerock.mapper.ex03;

import java.util.List;

import org.zerock.domain.ex02.BoardDto;

public interface Ex03Mapper {

	String selectCustomerNameById(int id);

	String selectEmployeeFirstNameById(int id);

	List<BoardDto> selectBoard();

	BoardDto getBoardById(int id);

	int updateBoard(BoardDto board);

	int removeBoardById(int id);

	int addBoard(BoardDto board);

}
