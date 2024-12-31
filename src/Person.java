import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String name;
    private int age;
    private double height ;
    private double weight ;
    public List<String> achievements;


    public Person(String name ,int age ,double height, double weight ,List<String>achievements){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.achievements=new ArrayList<>();
    }
    public String getName(){

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    abstract public void print_Achievement();
}
