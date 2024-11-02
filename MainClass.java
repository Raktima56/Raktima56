package p1;
 
import java.util.Scanner;
 
public class MainClass {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CricketMatch m = new CricketMatch();
 
     
        m.displayMatches();
 
 
        System.out.print("Enter match number to view teams: ");
        int matchId = scanner.nextInt();
 
        Match selectedMatch = m.getMatch(matchId);
        if (selectedMatch != null) {
            System.out.println("Teams: " + selectedMatch.getTeam1().getName() + " vs " + selectedMatch.getTeam2().getName());
 
  
            System.out.print("Enter team name to view players: ");
            scanner.nextLine();
            String teamName = scanner.nextLine();
 
            if (teamName.equalsIgnoreCase(selectedMatch.getTeam1().getName())) {
                System.out.println("Players in " + selectedMatch.getTeam1().getName() + ":");
                for (Player player : selectedMatch.getTeam1().getPlayers()) {
                    System.out.println("- " + player.getName());
                }
            } else if (teamName.equalsIgnoreCase(selectedMatch.getTeam2().getName())) {
                System.out.println("Players in " + selectedMatch.getTeam2().getName() + ":");
                for (Player player : selectedMatch.getTeam2().getPlayers()) {
                    System.out.println("- " + player.getName());
                }
            } else {
                System.out.println("Invalid team name.");
            }
        } else {
            System.out.println("Invalid match number.");
        }
 
        scanner.close();
    }
}
