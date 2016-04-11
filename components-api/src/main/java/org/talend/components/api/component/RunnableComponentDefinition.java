package org.talend.components.api.component;

import org.talend.components.api.component.runtime.SourceOrSink;

public interface RunnableComponentDefinition {
    public SourceOrSink getRuntime();
}
