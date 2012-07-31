/*******************************************************************************
 * Copyright (c) 2012 pf_miles.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     pf_miles - initial API and implementation
 ******************************************************************************/
package com.github.pfmiles.dropincc.impl.llstar;

import com.github.pfmiles.dropincc.impl.GruleType;

/**
 * Generated grule type while LL(*) analysis.
 * 
 * @author pf-miles
 * 
 */
public class GenedKleeneGruleType extends GruleType {

    public GenedKleeneGruleType(int index) {
        super(index);
    }

    public String toCodeGenStr() {
        return "kr" + this.defIndex;
    }
}
