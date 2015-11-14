package com.keenanbros.domain;

public class Players {
	int numberOfPlayers = 2;

	int currentPlayer;

	public int getCurrentPlayer() {
		currentPlayer = 1;
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

}
