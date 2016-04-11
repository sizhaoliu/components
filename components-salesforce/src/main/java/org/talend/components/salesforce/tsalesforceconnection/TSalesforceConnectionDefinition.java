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
package org.talend.components.salesforce.tsalesforceconnection;

import org.talend.components.api.Constants;
import org.talend.components.api.component.ComponentDefinition;
import org.talend.components.api.component.Connector;
import org.talend.components.api.component.Connector.ConnectorType;
import org.talend.components.api.component.RunnableComponentDefinition;
import org.talend.components.api.component.Trigger;
import org.talend.components.api.component.Trigger.TriggerType;
import org.talend.components.api.component.runtime.SourceOrSink;
import org.talend.components.api.properties.ComponentProperties;
import org.talend.components.salesforce.SalesforceConnectionProperties;
import org.talend.components.salesforce.SalesforceDefinition;

import aQute.bnd.annotation.component.Component;
import org.talend.components.salesforce.runtime.SalesforceSourceOrSink;

@Component(name = Constants.COMPONENT_BEAN_PREFIX
        + TSalesforceConnectionDefinition.COMPONENT_NAME, provide = ComponentDefinition.class)
public class TSalesforceConnectionDefinition extends SalesforceDefinition implements RunnableComponentDefinition {

    public static final String COMPONENT_NAME = "tSalesforceConnectionNew"; //$NON-NLS-1$

    public TSalesforceConnectionDefinition() {
        super(COMPONENT_NAME);
        setConnectors(new Connector(ConnectorType.FLOW, 0, 0));
        setTriggers(new Trigger(TriggerType.ITERATE, 1, 0), new Trigger(TriggerType.SUBJOB_OK, 1, 0),
                new Trigger(TriggerType.SUBJOB_ERROR, 1, 0));
    }

    @Override
    public Class<? extends ComponentProperties> getPropertyClass() {
        return SalesforceConnectionProperties.class;
    }

    @Override
    public boolean isStartable() {
        return true;
    }

    @Override
    public SourceOrSink getRuntime() {
        return new SalesforceSourceOrSink();
    }
}
