package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.Map;
import java.util.Set;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    HashMap<String, Integer> shelf = new HashMap<String, Integer>();

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {

        if (strings.size() < 1) {
            return;
        }

        for (int i = 0; i < strings.size(); i++) {

            if (shelf.containsKey(strings.get(i))) {
                Integer count = shelf.get(strings.get(i));
                count++;
                shelf.replace(strings.get(i), count);
            }
            else {
                shelf.put(strings.get(i), 1);
            }
        }

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,Integer> entry : shelf.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());


    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {

        shelf.putIfAbsent(item, 0);

                Integer count = shelf.get(item);
                count++;
                shelf.replace(item, count);

    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        shelf.putIfAbsent(item, 0);

        Integer count = shelf.get(item);
        count--;
        shelf.replace(item, count);

    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        shelf.putIfAbsent(item, 0);

        return shelf.get(item);
    }
}
