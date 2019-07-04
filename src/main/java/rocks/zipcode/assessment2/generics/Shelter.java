package rocks.zipcode.assessment2.generics;

import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Occupant> extends Ageable implements Iterable {

//    private Shelter<_> shelter = new Shelter<_>();
    private List<Occupant> occupants;

    public Shelter() {
        this.occupants = new ArrayList<>();
//        Shelter<_> shelter = new Shelter<_>();
    }

        /**
         * @return the number of item in the shelter
         */
        public int size () {
            return occupants.size();
        }

        public void add (Occupant occupant){
            occupants.add(occupant);
        }

        public Boolean contains (Object object){
            return occupants.contains(object);
        }

        public void remove (Object object){
            occupants.remove(object);
        }

        public Object get (Integer index){
            return occupants.get(index);
        }

        public Integer getIndexOf (Object ageable){
            return occupants.indexOf(ageable);
        }

    @Override
    public Iterator iterator() {
        return null;
    }
}