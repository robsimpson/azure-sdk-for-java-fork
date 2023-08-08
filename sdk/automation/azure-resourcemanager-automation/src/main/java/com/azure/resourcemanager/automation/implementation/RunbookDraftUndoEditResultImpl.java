// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.resourcemanager.automation.fluent.models.RunbookDraftUndoEditResultInner;
import com.azure.resourcemanager.automation.models.HttpStatusCode;
import com.azure.resourcemanager.automation.models.RunbookDraftUndoEditResult;

public final class RunbookDraftUndoEditResultImpl implements RunbookDraftUndoEditResult {
    private RunbookDraftUndoEditResultInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    RunbookDraftUndoEditResultImpl(
        RunbookDraftUndoEditResultInner innerObject,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public HttpStatusCode statusCode() {
        return this.innerModel().statusCode();
    }

    public String requestId() {
        return this.innerModel().requestId();
    }

    public RunbookDraftUndoEditResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
