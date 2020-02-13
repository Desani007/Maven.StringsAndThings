package io.zipcoder;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */


    public Integer countYZ(String input) {
        String result = "";
        String words = input.replaceAll(" ", "");

        for (int i = 0; i < words.length(); i++) {
            char a = words.charAt(i);
            if (String.valueOf(a).equals("y") || ((String.valueOf(a).equals("z")))) {
                result += String.valueOf(a);
            }
        }
        return result.length();
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String res = "";
        res = base.replace(remove, "");
        return res;
    }


    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */

    public Boolean containsEqualNumberOfIsAndNot(String input) {

        String space = input.replace(" ","");
        String  not = input.replace("not","" );
        String not2=not.replaceAll(" ","");
        int lengthWithOutNot=not2.length();
        int lengthOriginal =space.length();
        int numberOfOccaciesForNot=(lengthOriginal-lengthWithOutNot)/3;

        String space2 = input.replace(" ","");
        String  is = input.replace("is","" );
        String is2=is.replaceAll(" ","");
        int lengthWithOutIs=is2.length();
        int lengthOriginalIs =space2.length();
        int numberOfOccaciesForIs=(lengthOriginalIs-lengthWithOutIs)/2;

        if (numberOfOccaciesForIs==numberOfOccaciesForNot){
            return true;
        }






    return false;
    }
    /*
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */


    public Boolean gIsHappy(String input) {
        if (input.contains("gg")){
            return true;
        } else
        return false;
    }



    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        String [] letters= input.split("");
        int j=0; int k=0; int count=0;
        for ( int i=1; i<= letters.length-1;i++) {
            String letter = letters[i];
            k = i - 1;
            if (i!=letters.length-1 ){
                j = i + 1;
            }

            if ((k >= 0) && (j<=letters.length-1)) {

                if (letters[i].equals(letters[k]) && (letter.equals(letters[j]))) {
                    count++;
                }

            }

        }
        return count;
    }
}
