/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.*;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    public boolean addDrivable (String theID, Drivable item) {
        if (drivable_map.containsKey(theID)) {
            return false;
        } else {
            drivable_map.put(theID, item);
            return true;
        }
    }


    public boolean hasFasterThan(int speed) {
        for (Drivable item: drivable_map.values()) {
            if (item.getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }

    public List<Tradable> getTradable () {
        ArrayList<Tradable> lst = new ArrayList<>();
        for (Drivable item: drivable_map.values()) {
            if (item instanceof Tradable) {
                lst.add((Tradable) item);
            }
        }
        return lst;
    }
}