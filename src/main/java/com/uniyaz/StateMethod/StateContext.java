package com.uniyaz.StateMethod;

/**
 * @author Gaye DURMAZ
 * @date 7/5/2020
 */
public class StateContext implements StateInterface {

    private StateInterface state;

    public StateInterface getState() {
        return state;
    }

    public void setState(StateInterface state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        state.doAction();
    }
}
