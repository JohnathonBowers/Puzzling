import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random randMachine = new Random();
    
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int randomRoll = randMachine.nextInt(11) + 10;
            tenRolls.add(randomRoll);
        }
        return tenRolls;
    }

    

}


// To use methods from the Random library you will need to create an instance of Random

// From there you can use any of the methods listed in the documentation. For example:
 // randMachine.setSeed(35679); <--- you won't need to use this method.

