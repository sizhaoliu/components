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

import org.apache.avro.Schema;

/**
 * A connector is a token used by a component to define the avaialble inputs and outputs it has. It shall be used to
 * retreive the schema {@link Schema} associated with a connector if any. A component may have multiple connectors of
 * the same types.<br>
 * WARNING: this interface should not be implemented by clients of the APIs, only component provide an implementations
 * for it.
 */
public interface Connector {

    public enum ConnectorType {
        MAIN,
        REJECT
    }

    public ConnectorType getType();
}
