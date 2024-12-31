import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
public class Team extends Person {

    public List<Player>players;

    public Team (String name ,int age ,double height ,double weight,List<String>achievements ){
        super( name, age , height , weight,achievements);
        this.players=new ArrayList<>();
    }

  // methods to add and remover player
    public void addPlayer(Player player){
        players.add(player);
        System.out.println( "player1 add sucsessfully with name :"+player.getName());
    }

    public void removePlayer(Player player){
        players.remove(player);
        System.out.println( "player1 remove sucsessfully with name :"+player.getName());
    }

    // Method to add an achievement
    public void addAchievement(String achievement) {
        achievements.add(achievement);
    }

    //Method to display all players

    public void displayPlayers() {
        for (Player player : players) {
            System.out.println(player);

        }
    }

   // implement for print achievement function
   @Override
   public void print_Achievement() {
       if (achievements.isEmpty()) {
           System.out.println(getName() + " has no achievements yet.");
       } else {
           System.out.println( getName() + "'s Achievements:");
           for (String achievement : achievements) {
               System.out.println("- " + achievement);
           }
       }
   }
}


