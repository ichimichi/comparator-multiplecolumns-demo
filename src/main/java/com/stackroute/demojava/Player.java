package com.stackroute.demojava;

public class Player implements Comparable<Player> {

	int playerid;
	String playername;
	String sports;
	
	public Player(int playerid, String playername, String sports) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.sports = sports;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", sports=" + sports + "]";
	}

//	@Override
//	public int compareTo(Player player) {
//		
//		if(playerid == player.playerid) {
//			return 0;
//		}else if(playerid > player.playerid) {
//			return 1;
//		}else {
//			return -1;
//		}
//		
//	}
	
//	@Override
//	public int compareTo(Player player) {
//		
//		if(playerid == player.playerid) {
//			return 0;
//		}else if(playerid < player.playerid) {
//			return 1;
//		}else {
//			return -1;
//		}
//		
//	}
//	
	@Override
	public int compareTo(Player player) {
		return playername.compareTo(player.playername);
	}
	
	
	
	
	


}
