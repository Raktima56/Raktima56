package p1;


public class Match {
	private String name;
	private Team team1;
	private Team team2;
	public Match(String name, Team team1, Team team2) {
		super();
		this.name = name;
		this.team1 = team1;
		this.team2 = team2;
	}
	public String getName() {
		return name;
	}
	public Team getTeam1() {
		return team1;
	}
	public Team getTeam2() {
		return team2;
	}
}
 