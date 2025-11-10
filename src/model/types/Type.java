package model.types;

import model.values.Value;

public interface Type {
    public boolean equals(Object o);
    public String toString();
    Value defaultValue();
}
