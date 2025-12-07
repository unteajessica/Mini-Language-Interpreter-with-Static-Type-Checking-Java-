package model;

import exceptions.MyException;
import model.adt.*;
import model.statements.*;
import model.values.*;

import java.util.EmptyStackException;

public class PrgState {
    private final MyIStack<IStmt> exeStack;
    private final MyIDictionary<String, Value> symTable;
    private final MyIList<Value> out;
    private final MyIFileTable fileTable;
    private final MyIHeap heap;

    private final int id;
    private static int lastId = 0;

    public PrgState(MyIStack<IStmt> stk,
                    MyIDictionary<String, Value> symtbl,
                    MyIList<Value> ot,
                    IStmt prg,
                    MyIFileTable ft,
                    MyIHeap h) {
        this.exeStack = stk;
        this.symTable = symtbl;
        this.out = ot;
        this.fileTable = ft;
        this.heap = h;
        this.id = getNextId();
        exeStack.push(prg);

    }

    // constructor used for fork (without pushing a new statement onto the stack)
    public PrgState(MyIStack<IStmt> stk,
                    MyIDictionary<String, Value> symtbl,
                    MyIList<Value> ot,
                    MyIFileTable ft,
                    MyIHeap h) {
        this.exeStack = stk;
        this.symTable = symtbl;
        this.out = ot;
        this.fileTable = ft;
        this.heap = h;
        this.id = getNextId();
    }

    public MyIStack<IStmt> getStack() { return exeStack; }
    public MyIDictionary<String, Value> getSymTable() { return symTable; }
    public MyIList<Value> getOut() { return out; }
    public MyIFileTable getFileTable() { return fileTable; }
    public MyIHeap getHeap() { return heap; }

    @Override
    public String toString() {
        return "Program ID: " + id + "\n" +
                "ExeStack: " + exeStack.toString() + "\n" +
                "SymTable: " + symTable.toString() + "\n" +
                "Out: " + out.toString() + "\n" +
                "FileTable: " + fileTable.toString() + "\n" +
                "Heap: " + heap.toString() + "\n";
    }

    public boolean isNotCompleted() {
        return !exeStack.isEmpty();
    }

    // we had oneStep(state) before, now we execute state.oneStep()
    // so this = state (the object on which the method is called)
    public PrgState oneStep() throws MyException {
        if (exeStack.isEmpty()) throw new EmptyStackException();
        IStmt currentStmt = exeStack.pop();
        return currentStmt.execute(this);
    }

    // synchronized to ensure thread safety when generating unique IDs
    // so no two PrgState instances access and modify lastId simultaneously
    private static synchronized int getNextId() {
        lastId++;
        return lastId;
    }

    public int getId() {
        return id;
    }
}
