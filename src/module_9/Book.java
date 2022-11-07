package module_9;

public interface Book<K, V> extends Iterable<V> {
    boolean put (K key, V value);
    boolean remove (K key);
    V get(K key);
    int size();

}
