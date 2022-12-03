import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random randMachine = new Random();
    
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int randomRoll = randMachine.nextInt(11) + 10; // I referred to Baeuldung for help with generating random numbers
            tenRolls.add(randomRoll);
        }
        return tenRolls;
    }

    public char getRandomLetter() {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int randomIndex = randMachine.nextInt(26) + 0;
        char randomLetter = alphabet[randomIndex];
        return randomLetter;
    }

}

// To use methods from the Random library you will need to create an instance of Random

// From there you can use any of the methods listed in the documentation. For example:
 // randMachine.setSeed(35679); <--- you won't need to use this method.

