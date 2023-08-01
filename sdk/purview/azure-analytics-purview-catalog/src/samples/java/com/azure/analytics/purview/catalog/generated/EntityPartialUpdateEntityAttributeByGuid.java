// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.EntityClient;
import com.azure.analytics.purview.catalog.EntityClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class EntityPartialUpdateEntityAttributeByGuid {
    public static void main(String[] args) {
        EntityClient entityClient =
                new EntityClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.catalog.generated.entitypartialupdateentityattributebyguid.entitypartialupdateentityattributebyguid
        BinaryData body = BinaryData.fromString("\"ExampleNewName\"");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                entityClient.partialUpdateEntityAttributeByGuidWithResponse(
                        "394d9a03-912e-483b-bbd2-bedee1a69798", "ExampleName", body, requestOptions);
        // END:com.azure.analytics.purview.catalog.generated.entitypartialupdateentityattributebyguid.entitypartialupdateentityattributebyguid
    }
}
