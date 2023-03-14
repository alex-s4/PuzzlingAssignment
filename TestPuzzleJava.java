import java.util.ArrayList;
// import java.util.Random;

public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		
    	//..
		// Write your other test cases here.
		//..

        // System.out.println(generator.getNewPasswordSet(10));

        Object[] testArray = new Object[5];
        testArray[0] = "a";
        testArray[1] = "b";
        testArray[2] = "c";
        testArray[3] = "d";
        testArray[4] = "e";

        
        
        for(var i=0; i<testArray.length; i++){
            System.out.println(generator.shuffleList(testArray)[i]);
        }
        
	}
}
