// ============================================================================
//
// Copyright (C) 2006-2015 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.components.api.component;

/**
 * defines how many input this component can handle
 */
public class InputConnector {

    private int maxInput;

    public InputConnector(int maxInput) {
        this.maxInput = maxInput;
    }

    /**
     * Getter for maxInput possible for the associated component.
     * 
     * @return the maxInput
     */
    public int getMaxInput() {
        return maxInput;
    }

}
