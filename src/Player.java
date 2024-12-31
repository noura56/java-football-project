import java.util.ArrayList;
import java.util.List;

public class Player extends Person{
    public String position ;
    private int id ;



    public Player(String name, int age, double height, double weight, String position, int id,List<String>achievements) {
        super(name,age,height,weight,achievements);
        this.position=position;
        this.id=id;

    }
    // create function for changePosition
    public String changePosition(String newPosition){
        this.position=newPosition;
        return newPosition;
    }

    // Generate a unique ID for each new player
    public int generateUniqueId() {
        return (int) (Math.random() * 10000);
    }
    public String getPosition(){
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
