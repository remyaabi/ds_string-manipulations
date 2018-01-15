package stack;

/**
 * Created by Remya on 1/11/2018.
 */
public class StringMain {
    public static void main(String args[]){
        String stringValue="The string to be reverse";
        StringManipulations stringManipulations=new StringManipulations();
        stringManipulations.reverseStringString(stringValue);
        System.out.println("string reversal using recursion: " + stringManipulations.reverseStringRecursive(stringValue));
        int num=10;
        System.out.println("The factorial of the "+ num + " is : "+ stringManipulations.factorialize(num));
        System.out.println("The string is palindrome : "+ stringManipulations.palindrome("mala y fghfgjAalam "));
        stringManipulations.longestWord("fhuighkjfnkbl kjgiojhlm kjgiorjhlktrm jhgirjnhikgjhokjmolhokmnolhkm");
        stringManipulations.anagramstring("slient", "slient");
    }
}
