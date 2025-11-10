package model.statements;

import exceptions.MyException;
import model.PrgState;
import model.adt.MyIDictionary;
import model.adt.MyIFileTable;
import model.expressions.Exp;
import model.types.StringType;
import model.values.StringValue;
import model.values.Value;

import java.io.BufferedReader;
import java.io.IOException;

public class closeRFileStmt implements IStmt {
    private final Exp exp;

    public closeRFileStmt(Exp e) {
        this.exp = e;
    }

    @Override
    public String toString() {
        return "closeRFile(" + exp.toString() + ")";
    }

    @Override
    public PrgState execute(PrgState state) throws MyException {
        MyIDictionary<String, Value> symTable = state.getSymTable();
        Value val = exp.eval(symTable);

        if (!val.getType().equals(new StringType())) {
            throw new MyException("closeRFile: expression is not string-typed");
        }

        MyIFileTable fileTable = state.getFileTable();
        String fileName = ((StringValue) val).getVal();

        if (!fileTable.isDefined(fileName)) {
            throw new MyException("closeRFile: file " + fileName + " is not opened");
        }

        BufferedReader fileDescriptor = fileTable.lookup(fileName);
        try {
            fileDescriptor.close();
        } catch (IOException e) {
            throw new MyException("closeRFile: error closing file " + fileName + ": " + e.getMessage());
        }

        fileTable.remove(fileName);

        return state;
    }

    @Override
    public IStmt deepCopy() {
        return new closeRFileStmt(exp);
    }
}
