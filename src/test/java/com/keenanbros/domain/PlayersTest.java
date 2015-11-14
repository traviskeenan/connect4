package com.keenanbros.domain;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class PlayersTest {

	@Test
	public void defaultNumberOfPlayersTest() {
		Players players = new Players();
		
		assertThat(players.getNumberOfPlayers(), is(2));
	}

	@Test
	public void defaultCurrentPlayerTest() {
		Players players = new Players();
		
		assertThat(players.getCurrentPlayer(), is(1));
	}

	@Test
	public void takeTurnTest() {
		Players players = new Players();

		assertThat(players.getCurrentPlayer(), is(1));
		players.takeTurn();
		assertThat(players.getCurrentPlayer(), is(2));
	}

	@Test
	public void takeTwoTurnsTest() {
		Players players = new Players();

		assertThat(players.getCurrentPlayer(), is(1));
		players.takeTurn();
		assertThat(players.getCurrentPlayer(), is(2));
		players.takeTurn();
		assertThat(players.getCurrentPlayer(), is(1));
	}
	
}
