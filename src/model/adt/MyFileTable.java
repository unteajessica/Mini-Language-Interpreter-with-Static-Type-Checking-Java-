package model.adt;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;

public class MyFileTable implements MyIFileTable {
    private final Map<String, BufferedReader> fileTable = new HashMap<>();

    @Override
    public void put(String filename, BufferedReader fileDescriptor) {
        fileTable.put(filename, fileDescriptor);
    }

    @Override
    public BufferedReader lookup(String filename) {
        return fileTable.get(filename);
    }

    @Override
    public boolean isDefined(String filename) {
        return fileTable.containsKey(filename);
    }

    @Override
    public void remove(String filename) {
        fileTable.remove(filename);
    }

    public Map<String, BufferedReader> getContent() {
        return fileTable;
    }

    @Override
    public String toString() {
        if (fileTable.isEmpty())
            return "{}";
        StringBuilder sb = new StringBuilder();
        for (String filename : fileTable.keySet()) {
            sb.append(filename); //.append(" -> ").append(fileTable.get(filename).toString()).append("\n");
        }
        return sb.toString();
    }


}
