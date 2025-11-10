package controller;

import model.PrgState;
import exceptions.MyException;

import java.io.IOException;

public interface IController {
    PrgState oneStep(PrgState state) throws MyException;
    void allSteps() throws MyException, IOException;
}
