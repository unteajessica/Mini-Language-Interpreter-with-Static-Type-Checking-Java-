package repository;
import model.PrgState;
import exceptions.MyException;

import java.io.IOException;

public interface IRepo {
    PrgState getCurrentPrg();
    void addPrg(PrgState prg);
    void logPrgStateExec() throws MyException, IOException;
}
