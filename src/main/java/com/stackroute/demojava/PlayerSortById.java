package com.stackroute.demojava;

import java.util.Comparator;

public class PlayerSortById implements Comparator<Player>{

	@Override
	public int compare(Player player1, Player player2) {
		
		if(player1.playerid == player2.playerid) {
			return 0;
		}else if(player1.playerid > player2.playerid) {
			
			return 1;
		}else {
			return -1;
		}
		
		
	}



}
