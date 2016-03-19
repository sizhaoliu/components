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
package org.talend.components.api.component.runtime;

import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;

public interface Rejectable<T> {

    IndexedRecord handleRejectedRecord(T bestEffort, Schema.Field field, Exception exception);

}
