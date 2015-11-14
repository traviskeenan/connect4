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
}
