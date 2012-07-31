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
package com.github.pfmiles.dropincc.impl.runtime.impl;

import com.github.pfmiles.dropincc.impl.runtime.Parser;

/**
 * The parser prototype for runtime copy & use.
 * 
 * @author pf-miles
 * 
 */
public interface ParserPrototype {

    /**
     * Create a new parser instance
     * 
     * @param lexer
     * @param arg
     * @return
     */
    Parser create(Lexer lexer);
}
