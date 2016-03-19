// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.components.common;

import org.talend.components.api.properties.ComponentProperties;

/**
 * Use this class for Output component that have a single input connection where you don't care about the schema.
 */
public class XSingleInputComponentProperties extends ComponentProperties {

    private static final String MAIN_INPUT_NAME = "mainInput";

    public XSingleInputComponentProperties(String name) {
        super(name);
    }

    // @Override
    // public Set<String> getAvailableConnections(Set<String> existingConnections, boolean isOutputConnection) {
    // if (!isOutputConnection && (existingConnections == null || !existingConnections.contains(MAIN_INPUT_NAME))) {
    // return Collections.singleton(MAIN_INPUT_NAME);
    // } else {
    // return Collections.EMPTY_SET;
    // }
    // }
}
