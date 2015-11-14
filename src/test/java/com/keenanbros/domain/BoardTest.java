package com.keenanbros.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void boardFirstDropTest() {
		Board board = new Board();
		int positionOfDropped = board.drop(4, 1);
		
		assertSame(1, positionOfDropped);
	}

	@Test
	public void boardSecondDropTest() {
		Board board = new Board();

		int positionOfDropped = board.drop(4, 1);
		assertSame(1, positionOfDropped);

		int positionOfDropped2 = board.drop(4, 2);
		assertSame(2, positionOfDropped2);
	}
}
