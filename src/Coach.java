import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Coach extends Person{
    private String team;
    public Coach(String name , int age, double height, double weight , String team,List<String>achievements){
        super(name,age,height,weight,achievements);
        this.team=team;

    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


    // Method to add an achievement
    public void addAchievement(String achievement) {
        achievements.add(achievement);
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
