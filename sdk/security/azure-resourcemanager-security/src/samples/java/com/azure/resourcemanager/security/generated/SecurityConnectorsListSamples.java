// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for SecurityConnectors List. */
public final class SecurityConnectorsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2023-03-01-preview/examples/SecurityConnectors/GetSecurityConnectorsSubscription_example.json
     */
    /**
     * Sample code: List all security connectors of a specified subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listAllSecurityConnectorsOfASpecifiedSubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securityConnectors().list(com.azure.core.util.Context.NONE);
    }
}
