package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        int len = amountOfPadding - stringToBePadded.length();

        for (int i = 0; i < len; i++) {
            stringToBePadded = " " + stringToBePadded;
        }




        return stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        int len = amountOfPadding - stringToBePadded.length();

        for (int i = 0; i < len; i++) {
            stringToBePadded = stringToBePadded + " ";
        }




        return stringToBePadded;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        String myStr = "";


        for (int i = 0; i < numberOfTimeToRepeat; i++){

            myStr = myStr + stringToBeRepeated;

        }







        return myStr;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

        Boolean test = true;
        char letter;

        for (int i = 0; i < string.length(); i++) {

            letter = string.charAt(i);

            if (letter > 'Z') {
                if (letter < 'a') {
                    test = false;
                }
            }

            if (letter < 'A') {
                test = false;
            }

            if (letter > 'z') {
                test = false;
            }

        }

        return test;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        Boolean test = true;
        char letter;

        for (int i = 0; i < string.length(); i++) {

            letter = string.charAt(i);

            if (letter < '0') {
                test = false;
            }


            if (letter > '9') {
                test = false;
            }




        }

        return test;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

        Boolean test = true;
        char letter;

        for (int i = 0; i < string.length(); i++) {

            letter = string.charAt(i);

            if (letter >= 'A') {
                if (letter <= 'Z') {
                    test = false;
                }
            }

            if (letter >= 'a') {
                if (letter <= 'z') {
                    test = false;
                }
            }



            if (letter >= '0') {
                if (letter <= '9') {
                    test = false;
                }
            }





        }

        return test;
    }
}
