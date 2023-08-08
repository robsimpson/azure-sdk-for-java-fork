// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LtrPreBackupResponseInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrPreBackupResponse;

public final class LtrPreBackupResponseImpl implements LtrPreBackupResponse {
    private LtrPreBackupResponseInner innerObject;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    LtrPreBackupResponseImpl(
        LtrPreBackupResponseInner innerObject,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public int numberOfContainers() {
        return this.innerModel().numberOfContainers();
    }

    public LtrPreBackupResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
