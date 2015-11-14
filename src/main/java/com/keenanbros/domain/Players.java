package com.keenanbros.domain;

public class Players {
	int numberOfPlayers = 2;

	int currentPlayer = 1;

	public int getCurrentPlayer() {

		return currentPlayer;
	}

	public void setCurrentPlayer(int currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public void takeTurn() {
		currentPlayer = 2;

	}

}
