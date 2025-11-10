package model.statements;

import exceptions.VariableAlreadyDefined;
import model.PrgState;
import model.adt.*;
import model.expressions.*;
import model.values.*;
import model.types.*;
import exceptions.MyException;

public class VarDeclStmt implements IStmt {
    private String name;
    private Type type;

    public VarDeclStmt(String n, Type t) {
        name = n;
        type = t;
    }

    public PrgState execute(PrgState state) throws MyException {
        MyIDictionary<String, Value> symTable = state.getSymTable();

        if (symTable.isDefined(name)) {
            throw new VariableAlreadyDefined(name);
        }

        symTable.put(name, type.defaultValue());
        return state;
    }

    public String toString() {
        return type + " " + name;
    }

    @Override
    public IStmt deepCopy() {
        return new VarDeclStmt(name, type);
    }
}
