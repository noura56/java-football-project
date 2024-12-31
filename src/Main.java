import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        List<String> achievements = new ArrayList<>();

        Player player1= new Player("ABO TREK",30,180,80,"Right wing", 20,achievements);
        player1.addAchievement("Won the Player of the Year award");

        Player player2= new Player("ahmed hassan",32,175,90,"left wing", 20,achievements);

        System.out.println("The id for player1   "+player1.generateUniqueId());
        System.out.println(player1.changePosition(" Forward"));

        player2.print_Achievement();
        player1.print_Achievement();

        Coach coach1=new Coach("medo",45,187,98,"Al ahly ",achievements);
        coach1.addAchievement("Won the 4 league");

        Coach coach2=new Coach("helmy ",49,181,65,"zamalek ",achievements);
        coach1.print_Achievement();
        coach2.print_Achievement();

        Team team1=new Team("Al ahly",70,200,2500,achievements);
        team1.addAchievement("Won the 4 league");

        Team team2=new Team("zamalek ",80,200,2500,achievements);
        team1.print_Achievement();
        team2.print_Achievement();

        team1.addPlayer(new Player("johan",40,165,78,"striker",65,achievements));
        team1.addPlayer(new Player("wesam",25,180,80,"defense",7,achievements));
        team1.displayPlayers();

        team2.addPlayer(new Player("fatooh",40,165,78,"striker",65,achievements));
        team2.addPlayer(new Player("zezoo",40,165,78,"striker",65,achievements));
        team2.displayPlayers();

        team1.removePlayer(new Player("johan",40,165,78,"striker",65,achievements));
        team1.displayPlayers();






    }
}