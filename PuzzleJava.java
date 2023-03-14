import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{

    Random randMachine = new Random();

    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomIntArray = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            randomIntArray.add(randMachine.nextInt(20) + 1);
        }
        return randomIntArray;
    }

    /*
        Write a method that will:

        1. Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values).
        2. Generate a random index between 0-25 and use it to pull a random letter out of the array.
        3. Return the random letter.
    */

    public Character getRandomLetter(){
        ArrayList<Character> alphabetList = new ArrayList<Character>();
        for(char i='a';i<='z';i++){
            alphabetList.add(i);
        }
        Character randomLetter = alphabetList.get(randMachine.nextInt(26));
        return randomLetter;
    }

    // Write a method that uses the previous method to create a random string of eight characters and return that string.

    public String generatePassword(){
        String randomPassword = "";
        for(int i=0; i<8; i++){
            randomPassword+=getRandomLetter();
        }
        return randomPassword;
    }

    /*
     * Write a method that takes an int length as an argument and creates an array of random eight-character words. 
     * The array should be the length passed in as an int. Return the array of passwords.
     */

    public ArrayList<String> getNewPasswordSet(int passwordSetLength){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i=0; i<passwordSetLength; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

    /*
     * Write a method that takes an array and mixes up all the values in a pseudo-random way. 
     * Hint: use random indexes within the array, and swap values repeatedly.
     */

    public Object[] shuffleList(Object[] arrayInput){
        for(var i=0; i<arrayInput.length; i++){
            int randomInt = randMachine.nextInt(arrayInput.length);
            Object temp = arrayInput[i];
            arrayInput[i] = arrayInput[randomInt];
            arrayInput[randomInt] = temp;
        }
        return arrayInput;
    }

}