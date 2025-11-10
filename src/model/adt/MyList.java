package model.adt;

import java.util.List;
import java.util.ArrayList;

public class MyList<T> implements MyIList<T> {
    private List<T> list = new ArrayList<>();
    public void add(T elem) { list.add(elem); }
    public T get(int i) { return list.get(i); }
    public int size() { return list.size(); }
    public String toString() { return list.toString(); }
}
