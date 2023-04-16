
package Interface;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();
        /*
        Hawk can't invoke the method call 'flee()' 
        as there is no 'flee()' method in predator interface
        */

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

    }
}
