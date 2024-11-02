package p1;

import java.util.HashSet;
import java.util.Set;
 
public class Team {
	private String name;
	private Set<Player> players;
	public Team(String name) {
		this.name = name;
		this.players = new HashSet<>();
	}
	public String getName() {
		return name;
	}
	public void addPlayer(Player player) {
		players.add(player);
	}
	public Set<Player> getPlayers() {
		return players;
	}
	
}
 