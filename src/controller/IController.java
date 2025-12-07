package controller;

import model.PrgState;
import java.util.List;

public interface IController {
    void setDisplayFlag(boolean value);
    boolean getDisplayFlag();
    void allSteps();
    List<PrgState> removeCompletedPrg(List<PrgState> inPrgList);
}
