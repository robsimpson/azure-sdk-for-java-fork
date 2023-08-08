// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.resourcemanager.kusto.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.kusto.models.DataConnection;

public final class DataConnectionImpl implements DataConnection {
    private DataConnectionInner innerObject;

    private final com.azure.resourcemanager.kusto.KustoManager serviceManager;

    DataConnectionImpl(DataConnectionInner innerObject, com.azure.resourcemanager.kusto.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public DataConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.kusto.KustoManager manager() {
        return this.serviceManager;
    }
}
