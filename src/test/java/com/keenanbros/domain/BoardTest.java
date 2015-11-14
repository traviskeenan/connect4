package com.keenanbros.domain;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class BoardTest {

	@Test
	public void boardFirstDropTest() {
		Board board = new Board();
		int positionOfDropped = board.drop(4, 1);

		assertSame(1, positionOfDropped);
		System.out.println("BoardArray: " + board.toString());
	}

	@Test
	public void boardSecondDropTest() {
		Board board = new Board();

		int positionOfDropped = board.drop(4, 1);
		System.out.println("BoardArray: " + board.toString());
		assertSame(1, positionOfDropped);

		int positionOfDropped2 = board.drop(4, 2);
		System.out.println("BoardArray: " + board.toString());
		assertSame(2, positionOfDropped2);
	}

	@Test
	public void dropInLastColumn() {
		Board board = new Board();

		int positionOfDropped = board.drop(7, 1);
		System.out.println("BoardArray: " + board.toString());

		assertSame(2, positionOfDropped);
	}

}
