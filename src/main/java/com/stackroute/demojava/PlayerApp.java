package com.stackroute.demojava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerApp {
	
	
	public static void main(String[] args) {

		Player player1 = new Player(3, "Ivan Lendl", "Tennis");
		Player player2 = new Player(2, "Matts Wilander", "Tennis");
		Player player3 = new Player(4, "Sachin Tendulkar", "Cricket");
		Player player4 = new Player(2, "Maradona", "Soccer");
		Player player5 = new Player(3, "Carl lewis", "Athelete");
		Player player6 = new Player(2, "Stephen Edberg", "Tennis");
		Player player7 = new Player(4, "Martina Hingis", "Tennis");
		Player player8 = new Player(2, "Gabriela Sabatini", "Tennis");
		Player player9 = new Player(2, "Maradona", "Football");

	    List<Player> playerlist = new ArrayList<>();
		playerlist.add(player1);
		playerlist.add(player2);
		playerlist.add(player3);
		playerlist.add(player4);
		playerlist.add(player5);
		playerlist.add(player6);
		playerlist.add(player7);
		playerlist.add(player8);
		playerlist.add(player9);
		
		 	
		System.out.println("===Sorting based on id and name====");
		Collections.sort(playerlist,new PlayerSortByIdName());
		
		for(Player player: playerlist) {
			System.out.println(player);
		}
		

		System.out.println("===Sorting based on id, name and sports====");
		Collections.sort(playerlist,new PlayerSortByIdNameSports());
		
		for(Player player: playerlist) {
			System.out.println(player);
		}
		
	}


}
