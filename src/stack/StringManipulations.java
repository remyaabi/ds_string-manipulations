package stack;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by Remya  on 1/11/2018.
 */
public class StringManipulations {

    /***
     * to find the reverse of the string
     *
     * @param stringValue holds the string to be reversed
     */
    public void reverseStringString(String stringValue) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = stringValue.length() - 1; i >= 0; i--) {
            reverseString.append(stringValue.charAt(i));
        }
        System.out.println("The string to be reversed is : " + stringValue);
        System.out.println("the reversed string is : " + reverseString.toString());
    }

    /**
     * recursive function to reverse the string
     * @param input holds the string to be reversed
     * @return string
      */
    public String reverseStringRecursive(String input) {
        if (input == null) {
            return null;
        } else if (input.length() == 1) {
            return input;
        }
        return reverseStringRecursive(input.substring(1)) + input.charAt(0);
    }

    /**
     * To find the factorial of the entered value
     * @param num holds the value for which the factorial value to be calculated
     * @return int
     */
    public int factorialize(int num) {
        if (num > 1) {
            return num * factorialize(num - 1);
        } else {
            return 1;
        }

    }

    /***
     * To check whether a string is palindrome or not
     * @param stringVal holds the string
     * @return boolean
     */
    public boolean palindrome(String stringVal) {
        boolean palindromeFlag = false;
        StringBuilder palindrome = new StringBuilder();
        stringVal = stringVal.replaceAll("[^A-Z0-9a-z]", "");
        System.out.println("stringVal " + stringVal);
        for (int i = stringVal.length() - 1; i >= 0; i--) {
            palindrome.append(stringVal.charAt(i));
        }
        System.out.println("the reverse string is : " + palindrome);
        int i, j;
        int lengthofString = stringVal.length();
        for (i = 0, j = lengthofString - 1; i < lengthofString / 2; i++, j--) {
            if ((stringVal.charAt(i) == stringVal.charAt(j))) {
                palindromeFlag = true;
            } else {
                palindromeFlag = false;
                break;
            }

        }
        return palindromeFlag;
    }

    public void longestWord(String stringvalue) {
       String[] wordArray = stringvalue.split("['']");
        for (int i = 0; i <=wordArray.length - 1; i++) {
            System.out.println("wordArray value at index " + i + " is " + wordArray[i]);
        }

}
    public void anagramstring(String str1, String str2){
        boolean anagramFlag=false;
        str1=str1.replaceAll("[^A-Z0-9a-z]","");
        str2=str2.replaceAll("[^A-Z0-9a-z]","");
        if(str1.length()==str2.length()) {
            char[] str1toChar = str1.toLowerCase().toCharArray();
            char[] str2toChar = str2.toLowerCase().toCharArray();
            Arrays.sort(str1toChar);
            Arrays.sort(str2toChar);
            anagramFlag=Arrays.equals(str1toChar,str2toChar);
        }

      if (anagramFlag)
      {
          System.out.println("The string is anagram");
      }else{
          System.out.println("The string is not anagram");
      }
    }

}





