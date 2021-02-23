package com.stackroute.demojava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerApp {
	
	
	public static void main(String[] args) {

		Player player1 = new Player(3, "Ivan Lendl", "Tennis");
		Player player2 = new Player(2, "Matts Wilander", "Tennis");
		Player player3 = new Player(4, "Sachin Tendulkar", "Cricket");
		Player player4 = new Player(2, "Maradona", "Football");
		
	    List<Player> playerlist = new ArrayList<>();
		playerlist.add(player1);
		playerlist.add(player2);
		playerlist.add(player3);
		playerlist.add(player4);
		
		System.out.println("Without Sorting");
		for(Player player: playerlist) {
			System.out.println(player);
		}
	 
		System.out.println("===Sorting based on id====");
		Collections.sort(playerlist,new PlayerSortById());
		
		for(Player player: playerlist) {
			System.out.println(player);
		}
	 	
		System.out.println("===Sorting based on name====");
		Collections.sort(playerlist,new PlayerSortByName());
		
		for(Player player: playerlist) {
			System.out.println(player);
		}
		

	}


}
