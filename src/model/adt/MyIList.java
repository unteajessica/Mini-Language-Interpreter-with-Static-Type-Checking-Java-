package model.adt;

public interface MyIList<T> {
    void add(T elem);
    T get(int i);
    int size();
    String toString();
}
