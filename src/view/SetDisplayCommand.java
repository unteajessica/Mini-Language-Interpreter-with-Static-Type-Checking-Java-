package view;

import controller.Controller;

import java.util.List;

public class SetDisplayCommand extends Command {
    private final List<Controller> controllers;
    private boolean currentValue = true; // track global flag state

    public SetDisplayCommand(String key, String desc, List<Controller> controllers) {
        super(key, desc);
        this.controllers = controllers;
    }

    @Override
    public void execute() {
        currentValue = !currentValue;
        for (Controller ctr : controllers) {
            ctr.setDisplayFlag(currentValue);
        }
        System.out.println("Display flag set to: " + currentValue + " for all controllers");
    }
}
