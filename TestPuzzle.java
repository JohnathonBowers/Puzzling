public class TestPuzzle {
    public static void main(String[] args) {

        PuzzleJava puzzleTest = new PuzzleJava();
        
        /* ========== Puzzle Test Cases ========== */

        // Method for getting an array of ten random integers

        System.out.println("\n----- Ten Rolls Test -----");
            System.out.println(puzzleTest.getTenRolls());

        // Method for returning a random letter

        System.out.println("\n----- Random Letter Test -----");
            System.out.println(puzzleTest.getRandomLetter());
    }
}