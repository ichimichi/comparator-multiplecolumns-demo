package com.stackroute.demojava;

import java.util.Comparator;

public class PlayerSortByName implements Comparator<Player> {

	@Override
	public int compare(Player player1, Player player2) {
		
			return player1.playername.compareTo(player2.playername);	
	}


	
	
	
	


}
