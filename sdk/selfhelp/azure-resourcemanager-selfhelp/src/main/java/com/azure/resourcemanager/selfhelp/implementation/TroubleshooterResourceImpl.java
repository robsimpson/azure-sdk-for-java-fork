// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.selfhelp.fluent.models.TroubleshooterResourceInner;
import com.azure.resourcemanager.selfhelp.models.ContinueRequestBody;
import com.azure.resourcemanager.selfhelp.models.RestartTroubleshooterResponse;
import com.azure.resourcemanager.selfhelp.models.Step;
import com.azure.resourcemanager.selfhelp.models.TroubleshooterProvisioningState;
import com.azure.resourcemanager.selfhelp.models.TroubleshooterResource;
import com.azure.resourcemanager.selfhelp.models.TroubleshootersContinueMethodResponse;
import com.azure.resourcemanager.selfhelp.models.TroubleshootersEndResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class TroubleshooterResourceImpl implements TroubleshooterResource, TroubleshooterResource.Definition {
    private TroubleshooterResourceInner innerObject;

    private final com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager;

    TroubleshooterResourceImpl(
        TroubleshooterResourceInner innerObject, com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String solutionId() {
        return this.innerModel().solutionId();
    }

    public Map<String, String> parameters() {
        Map<String, String> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public TroubleshooterProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<Step> steps() {
        List<Step> inner = this.innerModel().steps();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public TroubleshooterResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.selfhelp.SelfHelpManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String troubleshooterName;

    public TroubleshooterResourceImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public TroubleshooterResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTroubleshooters()
                .createWithResponse(scope, troubleshooterName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public TroubleshooterResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTroubleshooters()
                .createWithResponse(scope, troubleshooterName, this.innerModel(), context)
                .getValue();
        return this;
    }

    TroubleshooterResourceImpl(String name, com.azure.resourcemanager.selfhelp.SelfHelpManager serviceManager) {
        this.innerObject = new TroubleshooterResourceInner();
        this.serviceManager = serviceManager;
        this.troubleshooterName = name;
    }

    public TroubleshooterResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTroubleshooters()
                .getWithResponse(scope, troubleshooterName, Context.NONE)
                .getValue();
        return this;
    }

    public TroubleshooterResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTroubleshooters()
                .getWithResponse(scope, troubleshooterName, context)
                .getValue();
        return this;
    }

    public TroubleshootersContinueMethodResponse continueMethodWithResponse(
        ContinueRequestBody continueRequestBody, Context context) {
        return serviceManager
            .troubleshooters()
            .continueMethodWithResponse(scope, troubleshooterName, continueRequestBody, context);
    }

    public void continueMethod() {
        serviceManager.troubleshooters().continueMethod(scope, troubleshooterName);
    }

    public TroubleshootersEndResponse endWithResponse(Context context) {
        return serviceManager.troubleshooters().endWithResponse(scope, troubleshooterName, context);
    }

    public void end() {
        serviceManager.troubleshooters().end(scope, troubleshooterName);
    }

    public Response<RestartTroubleshooterResponse> restartWithResponse(Context context) {
        return serviceManager.troubleshooters().restartWithResponse(scope, troubleshooterName, context);
    }

    public RestartTroubleshooterResponse restart() {
        return serviceManager.troubleshooters().restart(scope, troubleshooterName);
    }

    public TroubleshooterResourceImpl withSolutionId(String solutionId) {
        this.innerModel().withSolutionId(solutionId);
        return this;
    }

    public TroubleshooterResourceImpl withParameters(Map<String, String> parameters) {
        this.innerModel().withParameters(parameters);
        return this;
    }
}
