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
package com.github.pfmiles.dropincc.impl.hotcompile;

import com.github.pfmiles.dropincc.impl.util.Util;

/**
 * @author pf-miles
 * 
 */
public interface HotCompileConstants {

    /**
     * classpath string of this java process
     */
    String CLASSPATH = System.getProperty("java.class.path");

    /**
     * hot compilation target directory
     */
    String TARGETDIR = Util.getTempDirWithFileSeparatorSuffix() + "dcHotCompile";
}
