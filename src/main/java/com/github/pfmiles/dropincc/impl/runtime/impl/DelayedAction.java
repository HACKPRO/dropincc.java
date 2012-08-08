package com.github.pfmiles.dropincc.impl.runtime.impl;

import com.github.pfmiles.dropincc.Action;
import com.github.pfmiles.dropincc.ParamedAction;

/**
 * Action should be delayed while backtracking until match success.
 * 
 * @author pf-miles
 * 
 */
public class DelayedAction {

    private Object action;
    private Object matched;

    public DelayedAction(Object action, Object matched) {
        this.action = action;
        this.matched = matched;
    }

    /**
     * Execute this action in post-order traverse(The same order as the parsing
     * process).
     * 
     * @param arg
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Object act(Object arg) {
        Object input = null;
        if (matched.getClass().isArray()) {
            Object[] ms = (Object[]) matched;
            Object[] is = new Object[ms.length];
            for (int i = 0; i < ms.length; i++) {
                if (ms[i] instanceof DelayedAction) {
                    is[i] = ((DelayedAction) ms[i]).act(arg);
                } else {
                    is[i] = ms[i];
                }
            }
            input = is;
        } else {
            if (matched instanceof DelayedAction) {
                input = ((DelayedAction) matched).act(arg);
            } else {
                input = matched;
            }
        }
        if (this.action == null) {
            return input;
        } else {
            if (this.action instanceof Action) {
                return ((Action) this.action).act(input);
            } else if (this.action instanceof ParamedAction) {
                return ((ParamedAction) this.action).act(arg, input);
            } else {
                throw new RuntimeException("Invalid action: " + this.action);
            }
        }
    }

}
