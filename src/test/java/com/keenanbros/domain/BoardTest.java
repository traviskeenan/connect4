package com.keenanbros.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void boardTest() {
		Board board = new Board();
		int positionOfDropped = board.drop(4, 1);
		
		assertSame(positionOfDropped, 1);
	}

}
