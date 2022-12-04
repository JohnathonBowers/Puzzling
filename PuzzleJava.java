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

    public String generatePassword() {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String password = "";
        for (int i = 1; i < 9; i++) {
            int randomIndex = randMachine.nextInt(26) + 0;
            password += alphabet[randomIndex];
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int arrayLength){
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        ArrayList<String> passwordArray = new ArrayList<String>();
        for (int i = 0; i <= arrayLength; i++){
            String password = "";
            for (int j = 0; j < 9; j++){
                int randomIndex = randMachine.nextInt(26) + 0;
                password += alphabet[randomIndex];
            }
            passwordArray.add(password);
        }
        return passwordArray;
    }
}