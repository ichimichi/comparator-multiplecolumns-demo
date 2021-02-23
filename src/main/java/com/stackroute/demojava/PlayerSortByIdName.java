package com.stackroute.demojava;

import java.util.Comparator;

public class PlayerSortByIdName implements Comparator<Player> {

	@Override
	public int compare(Player player1, Player player2) {
		int result;
		if(player1.playerid == player2.playerid) {
			result = 0;
		}else if(player1.playerid > player2.playerid) {
			
			result = 1;
		}else {
			result = -1;
		}
		
        if (result != 0){
            return result;
        }
        result = player1.playername.compareTo(player2.playername);
        
        return result;
        
    }

	
	


}
