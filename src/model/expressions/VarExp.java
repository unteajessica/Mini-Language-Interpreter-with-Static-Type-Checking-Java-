package model.expressions;

import model.adt.MyIDictionary;
import model.values.Value;
import exceptions.MyException;

public class VarExp implements Exp {
    private String id;

    public VarExp(String i) { id = i; }

    public Value eval(MyIDictionary<String, Value> tbl) throws MyException {
        return tbl.lookup(id);
    }

    public String toString() { return id; }

    @Override
    public Exp deepCopy() {
        return new VarExp(id);
    }
}
