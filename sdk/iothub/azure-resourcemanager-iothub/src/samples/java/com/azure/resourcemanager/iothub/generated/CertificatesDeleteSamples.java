// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

/** Samples for Certificates Delete. */
public final class CertificatesDeleteSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/preview/2022-11-15-preview/examples/iothub_certificatesdelete.json
     */
    /**
     * Sample code: Certificates_Delete.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void certificatesDelete(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager
            .certificates()
            .deleteWithResponse("myResourceGroup", "myhub", "cert", "AAAAAAAADGk=", com.azure.core.util.Context.NONE);
    }
}
