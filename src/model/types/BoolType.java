package model.types;

import model.values.Value;

public class BoolType implements Type {
    @Override
    public boolean equals(Object o) {
        if (o instanceof BoolType) {
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "bool";
    }

    @Override
    public Value defaultValue() {
        return new model.values.BoolValue(false);
    }
}
