// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessRequestInner;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequest;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequestVirtualMachine;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class JitNetworkAccessRequestImpl implements JitNetworkAccessRequest {
    private JitNetworkAccessRequestInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    JitNetworkAccessRequestImpl(
        JitNetworkAccessRequestInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<JitNetworkAccessRequestVirtualMachine> virtualMachines() {
        List<JitNetworkAccessRequestVirtualMachine> inner = this.innerModel().virtualMachines();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OffsetDateTime startTimeUtc() {
        return this.innerModel().startTimeUtc();
    }

    public String requestor() {
        return this.innerModel().requestor();
    }

    public String justification() {
        return this.innerModel().justification();
    }

    public JitNetworkAccessRequestInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
