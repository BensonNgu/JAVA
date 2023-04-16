
package Interface;

/*
Fish can be both prey and predator depending of their size
 */
public class Fish implements Prey,Predator{

    @Override
    public void hunt() {
        Helper.display("This fish is hunting smaller fish.");
    }

    @Override
    public void flee() {
        Helper.display("This fish is fleeing.");
    }

    
}
