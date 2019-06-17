package rocks.zipcode.assessment2.fundamentals;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public static Boolean isEven(Integer value) {

        Boolean test = false;


        if (value % 2 == 0) {
            test = true;
        }

        return test;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public static Boolean isOdd(Integer value) {

        Boolean test = false;


        if (value % 2 != 0) {
            test = true;
        }

        return test;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public static Boolean isMultipleOf3(Integer value) {

        Boolean test = false;


        if (value % 3 == 0) {
            test = true;
        }

        return test;

    }

    /**
     *
     * @param value - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public static Boolean isMultipleOfN(Integer value, Integer multiple) {

        Boolean test = false;


        if (value % multiple == 0) {
            test = true;
        }

        return test;
    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public static Boolean startsWithCapitalLetter(String string) {

        Boolean test = false;
        char letter = string.charAt(0);


        if ((letter >= 'A') && (letter <= 'Z')) {
            test = true;
        }



        return test;
    }
}
