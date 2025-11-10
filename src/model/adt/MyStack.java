package model.adt;
import exceptions.StackIsEmpty;

import java.util.Stack;

public class MyStack<T> implements MyIStack<T> {
    private Stack<T> stack = new Stack<>();
    public T pop() {
        if (stack.isEmpty()) throw new StackIsEmpty();
        return stack.pop(); }
    public void push(T elem) { stack.push(elem); }
    public boolean isEmpty() { return stack.isEmpty(); }
    public String toString() { return stack.toString(); }
}
