package com.github.pfmiles.dropincc.impl.syntactical;

import com.github.pfmiles.dropincc.impl.GruleType;

/**
 * 
 * Represents a generated grule's type
 * 
 * @author pf-miles
 * 
 */
final class GenedGruleType extends GruleType {

    GenedGruleType(int index) {
        super(index);
    }

    // set GenedGruleType's def index to the merged type's def index
    void setDefIndex(int newIndex) {
        super.defIndex = newIndex;
    }

}
