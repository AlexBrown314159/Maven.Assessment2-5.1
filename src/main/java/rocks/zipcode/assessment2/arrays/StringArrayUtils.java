package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        if ((startingIndex >= 0) && (endingIndex >= 1)) {

            int len = endingIndex - startingIndex;

            String[] myAns = new String[len];

            int iCount = 0;
            for (int i = startingIndex; i < endingIndex; i++) {

                myAns[iCount] = arrayToBeSpliced[i];
                iCount++;

            }
            return myAns;
        }

        throw new  IllegalArgumentException ("Index < 0");

     //   return null;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        if (startingIndex < 0) {
            throw new IndexOutOfBoundsException ("Index < 0");
        }

        if (startingIndex > arrayToBeSpliced.length) {
            throw new IllegalArgumentException ("Index > length");
        }

        String[] myAns = new String[arrayToBeSpliced.length - startingIndex];

        int iCount = 0;
        for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
            myAns[iCount] = arrayToBeSpliced[i];
            iCount++;
        }

        return myAns;
    }
}
