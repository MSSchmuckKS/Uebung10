package aufgabe03;

/**
 * The class for a map entry, consisting of a key and its corresponding value
 * @param <K>   the key of the entry
 * @param <V>   the value of the entry
 */
public class MapEntry<K, V> {
    private K key;
    private V value;

    /**
     * The constructor of a map entry object
     * @param key       The new key of the object
     * @param value     The new value of the object
     */
    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The default constructor of a map entry object
     */
    public MapEntry() {
    }

    /**
     * The getter of the private field key
     */
    public K getKey() {
        return key;
    }

    /**
     * The setter of the private field key
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * The getter of the private field value
     */
    public V getValue() {
        return value;
    }

    /**
     * The setter of the private field value
     */
    public void setValue(V value) {
        this.value = value;
    }

    /**
     * Returns the key and value of a Map entry as a string
     * @return
     */
    @Override
    public String toString() {
        String pair = "Key: " + key + " & Value: " + value;
        return pair;
    }
}
