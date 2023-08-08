// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.ApiCollectionResponseInner;
import com.azure.resourcemanager.security.models.ApiCollectionResponse;
import java.util.Collections;
import java.util.Map;

public final class ApiCollectionResponseImpl implements ApiCollectionResponse {
    private ApiCollectionResponseInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    ApiCollectionResponseImpl(
        ApiCollectionResponseInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
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

    public String displayName() {
        return this.innerModel().displayName();
    }

    public Map<String, String> additionalData() {
        Map<String, String> inner = this.innerModel().additionalData();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ApiCollectionResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
