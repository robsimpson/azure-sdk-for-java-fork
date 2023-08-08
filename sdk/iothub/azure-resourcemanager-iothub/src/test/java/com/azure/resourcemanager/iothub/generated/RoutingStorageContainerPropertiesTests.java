// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.AuthenticationType;
import com.azure.resourcemanager.iothub.models.ManagedIdentity;
import com.azure.resourcemanager.iothub.models.RoutingStorageContainerProperties;
import com.azure.resourcemanager.iothub.models.RoutingStorageContainerPropertiesEncoding;
import org.junit.jupiter.api.Assertions;

public final class RoutingStorageContainerPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RoutingStorageContainerProperties model =
            BinaryData
                .fromString(
                    "{\"id\":\"yvshxmz\",\"connectionString\":\"bzoggigrx\",\"endpointUri\":\"ur\",\"authenticationType\":\"identityBased\",\"identity\":{\"userAssignedIdentity\":\"nspydptkoenkoukn\"},\"name\":\"udwtiukbl\",\"subscriptionId\":\"gkpocipazyxoe\",\"resourceGroup\":\"kgjn\",\"containerName\":\"iucgygevqzn\",\"fileNameFormat\":\"pmr\",\"batchFrequencyInSeconds\":129742346,\"maxChunkSizeInBytes\":173387394,\"encoding\":\"Avro\"}")
                .toObject(RoutingStorageContainerProperties.class);
        Assertions.assertEquals("yvshxmz", model.id());
        Assertions.assertEquals("bzoggigrx", model.connectionString());
        Assertions.assertEquals("ur", model.endpointUri());
        Assertions.assertEquals(AuthenticationType.IDENTITY_BASED, model.authenticationType());
        Assertions.assertEquals("nspydptkoenkoukn", model.identity().userAssignedIdentity());
        Assertions.assertEquals("udwtiukbl", model.name());
        Assertions.assertEquals("gkpocipazyxoe", model.subscriptionId());
        Assertions.assertEquals("kgjn", model.resourceGroup());
        Assertions.assertEquals("iucgygevqzn", model.containerName());
        Assertions.assertEquals("pmr", model.fileNameFormat());
        Assertions.assertEquals(129742346, model.batchFrequencyInSeconds());
        Assertions.assertEquals(173387394, model.maxChunkSizeInBytes());
        Assertions.assertEquals(RoutingStorageContainerPropertiesEncoding.AVRO, model.encoding());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RoutingStorageContainerProperties model =
            new RoutingStorageContainerProperties()
                .withId("yvshxmz")
                .withConnectionString("bzoggigrx")
                .withEndpointUri("ur")
                .withAuthenticationType(AuthenticationType.IDENTITY_BASED)
                .withIdentity(new ManagedIdentity().withUserAssignedIdentity("nspydptkoenkoukn"))
                .withName("udwtiukbl")
                .withSubscriptionId("gkpocipazyxoe")
                .withResourceGroup("kgjn")
                .withContainerName("iucgygevqzn")
                .withFileNameFormat("pmr")
                .withBatchFrequencyInSeconds(129742346)
                .withMaxChunkSizeInBytes(173387394)
                .withEncoding(RoutingStorageContainerPropertiesEncoding.AVRO);
        model = BinaryData.fromObject(model).toObject(RoutingStorageContainerProperties.class);
        Assertions.assertEquals("yvshxmz", model.id());
        Assertions.assertEquals("bzoggigrx", model.connectionString());
        Assertions.assertEquals("ur", model.endpointUri());
        Assertions.assertEquals(AuthenticationType.IDENTITY_BASED, model.authenticationType());
        Assertions.assertEquals("nspydptkoenkoukn", model.identity().userAssignedIdentity());
        Assertions.assertEquals("udwtiukbl", model.name());
        Assertions.assertEquals("gkpocipazyxoe", model.subscriptionId());
        Assertions.assertEquals("kgjn", model.resourceGroup());
        Assertions.assertEquals("iucgygevqzn", model.containerName());
        Assertions.assertEquals("pmr", model.fileNameFormat());
        Assertions.assertEquals(129742346, model.batchFrequencyInSeconds());
        Assertions.assertEquals(173387394, model.maxChunkSizeInBytes());
        Assertions.assertEquals(RoutingStorageContainerPropertiesEncoding.AVRO, model.encoding());
    }
}
