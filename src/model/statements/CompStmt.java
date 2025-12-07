package model.statements;
import model.PrgState;
import model.adt.*;
import model.expressions.*;
import model.values.*;
import model.types.*;
import exceptions.MyException;

public class CompStmt implements IStmt {
    private IStmt first;
    private IStmt second;

    public CompStmt(IStmt s1, IStmt s2) {
        first = s1;
        second = s2;
    }

    public String toString() {
        return "(" + first.toString() + ";" + second.toString() + ")";
    }

    @Override
    public PrgState execute(PrgState state) throws MyException {
        MyIStack<IStmt> stack = state.getStack();
        stack.push(second);
        stack.push(first);
        return null;
    }

    @Override
    public IStmt deepCopy() {
        return new CompStmt(first.deepCopy(), second.deepCopy());
    }
}
