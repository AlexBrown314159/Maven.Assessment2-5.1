package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {



        String myStr = string1 + string2;



        return myStr;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {

        String myStr = "";

        for (int i = 0; i < string1.length(); i++) {
            myStr = string1.charAt(i) + myStr;
        }



        return myStr;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {


        String myStr = "";



        for (int i = 0; i < string2.length(); i++) {
            myStr = string2.charAt(i) + myStr;
        }

        for (int i = 0; i < string1.length(); i++) {
            myStr = string1.charAt(i) + myStr;
        }





        return myStr;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {

        String myStr = "";
        char test1;
        char test2;

        for (int i1 = 0; i1 < charactersToRemove.length(); i1++) {

            test1 = charactersToRemove.charAt(i1);

            for (int i2 = 0; i2 < string.length(); i2++) {

                test2 = string.charAt(i2);

                if (test2 != test1) {
                    myStr = myStr + test2;

                }

            }

            string = myStr;
            myStr = "";
        }

        return string;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {


        String myStr = "";
        char test1;
        char test2;

        for (int i1 = 0; i1 < charactersToRemove.length(); i1++) {

            test1 = charactersToRemove.charAt(i1);

            for (int i2 = 0; i2 < string.length(); i2++) {

                test2 = string.charAt(i2);

                if (test2 != test1) {
                    myStr = myStr + test2;

                }

            }

            string = myStr;
            myStr = "";
        }





        for (int i = 0; i < string.length(); i++) {
            myStr = string.charAt(i) + myStr;
        }



        return myStr;
    }
}
