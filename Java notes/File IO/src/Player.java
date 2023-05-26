public class Player implements Serializable{
    private String name;
    private int age;

    public Player(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " " + age + "\n";
    }
}