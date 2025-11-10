package model.expressions;
import exceptions.MyException;
import model.values.Value;
import model.adt.MyIDictionary;

public interface Exp {
    Value eval(MyIDictionary<String, Value> tbl) throws MyException;
    Exp deepCopy();
}
