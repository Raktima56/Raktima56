package p1;


import java.util.HashMap;
import java.util.Map;
 
public class CricketMatch {
	private Map<Integer, Match> matches;
	public CricketMatch() {
        matches = new HashMap<>();
        initializeMatches();
    }
	
	private void initializeMatches() {
		Team india = new Team("India");
		india.addPlayer(new Player("Virat Kohli"));
        india.addPlayer(new Player("Rohit Sharma"));
 
        Team australia = new Team("Australia");
        australia.addPlayer(new Player("Steve Smith"));
        australia.addPlayer(new Player("David Warner"));
 
        Team bangladesh = new Team("Bangladesh");
        bangladesh.addPlayer(new Player("Shakib Al Hasan"));
        bangladesh.addPlayer(new Player("Tamim Iqbal"));
 
        Team southAfrica = new Team("South Africa");
        southAfrica.addPlayer(new Player("Quinton de Kock"));
        southAfrica.addPlayer(new Player("AB de Villiers"));
 
        Team sriLanka = new Team("Sri Lanka");
        sriLanka.addPlayer(new Player("Kusal Mendis"));
        sriLanka.addPlayer(new Player("Dimuth Karunaratne"));
 
        Team newZealand = new Team("New Zealand");
        newZealand.addPlayer(new Player("Kane Williamson"));
        newZealand.addPlayer(new Player("Ross Taylor"));
 
        matches.put(1, new Match("Match 1: India vs Australia", india, australia));
        matches.put(2, new Match("Match 2: Bangladesh vs South Africa", bangladesh, southAfrica));
        matches.put(3, new Match("Match 3: Sri Lanka vs New Zealand", sriLanka, newZealand));
	}
	
	public void displayMatches() {
		System.out.println("Matches happening: ");
		for(Map.Entry<Integer, Match> entry : matches.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue().getName());
		}
	}
	
	public Match getMatch(int matchId) {
        return matches.get(matchId);
    }
}

