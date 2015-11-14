package com.keenanbros.domain;

public class Board {
	// int [row] [column]
	private int[][] boardArray = new int[6][7];

	public int drop(int columnNumber, int playerNumber) {
		int poss = 0;
        for(; poss < 6; poss++){
            if(boardArray[poss][columnNumber] == 0){
                boardArray[poss][columnNumber] = playerNumber;
                break;
            }
        }
		return poss + 1;
	}

}
