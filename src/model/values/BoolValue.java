package model.values;

import model.types.BoolType;
import model.types.Type;

public class BoolValue implements Value {
    boolean val;
    public BoolValue(boolean v) { val = v; }
    public boolean getVal() { return val; }

    @Override
    public String toString() { return "" + val; }

    @Override
    public Type getType() { return new BoolType(); }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BoolValue)
            return ((BoolValue)o).getVal() == val;
        else
            return false;
    }
}
