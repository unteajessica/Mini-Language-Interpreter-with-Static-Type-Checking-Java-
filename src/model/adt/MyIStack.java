package model.adt;

public interface MyIStack<T> {
    T pop();
    void push(T elem);
    boolean isEmpty();
    String toString();
}
