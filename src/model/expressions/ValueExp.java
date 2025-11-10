package model.expressions;

import model.adt.MyIDictionary;
import model.values.Value;
import exceptions.MyException;

public class ValueExp implements Exp {
    private Value val;
    public ValueExp(Value v) { val = v; }
    public Value eval(MyIDictionary<String, Value> tbl) throws MyException { return val; }
    public String toString() { return val.toString(); }

    @Override
    public Exp deepCopy() {
        return new ValueExp(val);
    }
}
