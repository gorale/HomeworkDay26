package com.company;

public  class DefaultPair<K,V> implements Pair<K,V> {
    K key;
    V value;

    public DefaultPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
