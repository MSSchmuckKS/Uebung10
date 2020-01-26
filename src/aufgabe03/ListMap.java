package aufgabe03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The class for creating ListMap objects, with the methods to add/remove entries or to get the respecting value of a key
 * @param <K>   The generic type of the key variable
 * @param <V>   The generic type of the value variable
 */
public class ListMap<K, V> {
    private List<MapEntry<K, V>> listMap = new ArrayList<>();


    /**
     * The getter of the private field listMap
     */
    public List<MapEntry<K, V>> getListMap() {
        return listMap;
    }

    /**
     * Adds a new entry with a key and a corresponding value to the list. Overwrites the value if the key already exists
     * @param key      The key of the new entry
     * @param value    The value of the new entry
     */
    public void put(K key, V value) {
        for (MapEntry<K, V> exist : listMap) {
            if (exist.getKey().equals(key)) {
                exist.setValue(value);
                return;
            }
        }
        listMap.add(new MapEntry<K, V>(key, value));
    }

    /**
     * Checks whether an entry contains the given key and gets the corresponding value.
     * @param key   The key that may be in a map entry
     * @return      The value corresponding to the given key, or null
     */
    public V get(K key) {
        // check for an entry with this key
        for (MapEntry<K, V> check : listMap) {
            if (check.getKey().equals(key)) {
                return check.getValue();
            }
        }

        // There is no entry with this key
        return null;
    }

    /**
     * Removes the map entry that contains the given key, if it exists
     * @param key   The key of the map entry to be removed
     */
    public void remove(K key) {
        // ceck for an entry with this key
        Iterator<MapEntry<K, V>> remover = listMap.iterator();

        while (remover.hasNext()) {
            K temp = remover.next().getKey();
            if (temp.equals(key)) {
                remover.remove();
                return;
            }
        }
    }
}
