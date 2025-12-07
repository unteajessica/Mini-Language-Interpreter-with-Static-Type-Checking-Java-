package model.statements;

import model.PrgState;
import model.adt.*;
import model.expressions.*;
import model.values.*;
import model.types.*;
import exceptions.MyException;

public class NopStmt implements IStmt {
    public PrgState execute(PrgState state) throws MyException { return null; }
    public String toString() { return "nop"; }

    @Override
    public IStmt deepCopy() {
        return new NopStmt();
    }
}
