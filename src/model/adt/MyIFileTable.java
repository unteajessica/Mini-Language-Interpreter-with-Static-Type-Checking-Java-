package model.adt;

import java.io.BufferedReader;

public interface MyIFileTable {
    public void put(String filename, BufferedReader fileDescriptor);
    public BufferedReader lookup(String filename);
    public boolean isDefined(String filename);
    public void remove(String filename);
    public String toString();
}
