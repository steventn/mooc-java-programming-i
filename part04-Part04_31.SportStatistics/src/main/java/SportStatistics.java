
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] part = line.split(",");
                
                String homeTeam = part[0];
                String awayTeam = part[1];
                int homePoints = Integer.valueOf(part[2]);
                int awayPoints = Integer.valueOf(part[3]);
                
                if (homeTeam.contains(team) || awayTeam.contains(team)) {
                    games++;
                    if (homeTeam.contains(team) && homePoints > awayPoints) {
                        wins++;
                    }
                    
                    if (awayTeam.contains(team) && awayPoints > homePoints) {
                        wins++;
                    } 
                    
                    if (homeTeam.contains(team) && homePoints < awayPoints) {
                        losses++;
                    }
                    
                    if (awayTeam.contains(team) && awayPoints < homePoints) {
                        losses++;
                    } 
                    
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
