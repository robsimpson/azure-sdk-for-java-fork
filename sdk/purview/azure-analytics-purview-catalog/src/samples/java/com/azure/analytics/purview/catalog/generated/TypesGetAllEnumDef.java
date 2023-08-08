// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.TypesClient;
import com.azure.analytics.purview.catalog.TypesClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class TypesGetAllEnumDef {
    public static void main(String[] args) {
        TypesClient typesClient =
                new TypesClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.catalog.generated.typesgetalltypedefinitions.typesgetallenumdef
        RequestOptions requestOptions = new RequestOptions().addQueryParam("type", "enum");
        Response<BinaryData> response = typesClient.getAllTypeDefinitionsWithResponse(requestOptions);
        // END:com.azure.analytics.purview.catalog.generated.typesgetalltypedefinitions.typesgetallenumdef
    }
}
