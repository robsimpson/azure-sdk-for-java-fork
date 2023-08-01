// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.models.DiagnosticParameters;

/** Samples for Deployments StartJfr. */
public final class DeploymentsStartJfrSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/Deployments_StartJFR.json
     */
    /**
     * Sample code: Deployments_StartJFR.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deploymentsStartJFR(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getDeployments()
            .startJfr(
                "myResourceGroup",
                "myservice",
                "myapp",
                "mydeployment",
                new DiagnosticParameters()
                    .withAppInstance("myappinstance")
                    .withFilePath("/byos/diagnose")
                    .withDuration("60s"),
                Context.NONE);
    }
}
