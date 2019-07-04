package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Set;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.Map;
import java.util.Set;

/**
 * Use a map to solve
 */
public class MonthConversion {

    HashMap<Integer, String> calender = new HashMap<>();


    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {

        calender.put(monthNumber, monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
//        throw new NullPointerException();


        if (calender.containsKey(monthNumber)) {

            return calender.get(monthNumber);
        }
        else {

            return null;
        }


    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer k = -1;

        if (calender.containsValue(monthName)) {

            //Getting Map.Entry elements using entrySet()
            Set<Map.Entry<Integer, String>> monthSet = calender.entrySet();

            // Looping the set of Map.Entry values
            for (Map.Entry<Integer, String> entry : monthSet) {

                if (entry.getValue() == monthName) {

                    k = entry.getKey();

                }
            }
            return k;
        }
        return null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {

        return calender.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {

        return calender.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return calender.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        calender.replace(monthNumber, monthName);
    }
}
