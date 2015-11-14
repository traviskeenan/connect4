package com.keenanbros.domain;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class PlayersTest {

	@Test
	public void test() {
		Players players = new Players();
		
		assertThat(players.getNumberOfPlayers(), is(2));
	}
}
