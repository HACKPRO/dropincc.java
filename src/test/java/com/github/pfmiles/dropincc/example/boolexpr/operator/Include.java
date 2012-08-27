package com.github.pfmiles.dropincc.example.boolexpr.operator;

import java.util.Set;

import com.github.pfmiles.dropincc.example.boolexpr.Operator;

/**
 * @author pf-miles Aug 21, 2012 9:46:14 AM
 */
public class Include implements Operator {

    public Boolean compute(Object left, Object right) {
        if (left == null)
            return false;
        if (!(left instanceof Set))
            throw new RuntimeException("Left operand of 'include' operator must be of type Set.");
        return ((Set<?>) left).contains(right);
    }

}
