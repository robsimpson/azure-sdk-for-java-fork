// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.developer.devcenter.EnvironmentsClient;
import com.azure.developer.devcenter.EnvironmentsClientBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class EnvironmentsListCatalogItemVersions {
    public static void main(String[] args) {
        EnvironmentsClient environmentsClient =
                new EnvironmentsClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint(
                                "https://8a40af38-3b4c-4672-a6a4-5e964b1870ed-contosodevcenter.centralus.devcenter.azure.com/")
                        .buildClient();
        // BEGIN:com.azure.developer.devcenter.generated.environmentslistcatalogitemversions.environmentslistcatalogitemversions
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response =
                environmentsClient.listCatalogItemVersions("myProject", "foo", requestOptions);
        // END:com.azure.developer.devcenter.generated.environmentslistcatalogitemversions.environmentslistcatalogitemversions
    }
}
