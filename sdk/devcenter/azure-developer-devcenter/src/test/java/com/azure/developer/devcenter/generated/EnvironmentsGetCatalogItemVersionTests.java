// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class EnvironmentsGetCatalogItemVersionTests extends DevCenterClientTestBase {
    @Test
    @Disabled
    public void testEnvironmentsGetCatalogItemVersionTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                environmentsClient.getCatalogItemVersionWithResponse("myProject", "foo", "1.0.0", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"description\":\"Hello world template to deploy a basic API service\",\"actions\":[{\"name\":\"Reset\",\"type\":\"Custom\",\"description\":\"Reset the environment to its original state.\",\"id\":\"reset\",\"typeName\":\"reset\"},{\"name\":\"Clear\",\"type\":\"Custom\",\"description\":\"Delete all resources, but keep the environment alive.\",\"id\":\"clear\",\"typeName\":\"clear\"}],\"catalogItemId\":\"foo\",\"catalogItemName\":\"foo\",\"catalogName\":\"main\",\"eligibleForLatestVersion\":true,\"parameters\":[{\"name\":\"Function App Runtime\",\"type\":\"string\",\"default\":\"dotnet\",\"allowed\":[\"node\",\"dotnet\",\"java\"],\"id\":\"functionAppRuntime\",\"required\":true},{\"name\":\"Storage Account Type\",\"type\":\"string\",\"default\":\"Standard_LRS\",\"allowed\":[\"Standard_LRS\",\"Standard_GRS\",\"Standard_RAGRS\"],\"id\":\"storageAccountType\",\"required\":true},{\"name\":\"HTTPS only\",\"type\":\"boolean\",\"default\":true,\"id\":\"httpsOnly\"}],\"parametersSchema\":\"{\\\"type\\\":\\\"object\\\",\\\"properties\\\":{\\\"functionAppRuntime\\\":{\\\"$id\\\":\\\"functionAppRuntime\\\",\\\"value\\\":\\\"dotnet\\\",\\\"displayName\\\":\\\"Function App Runtime\\\",\\\"type\\\":\\\"string\\\",\\\"enum\\\":[\\\"node\\\",\\\"dotnet\\\",\\\"java\\\"]},\\\"storageAccountType\\\":{\\\"$id\\\":\\\"storageAccountType\\\",\\\"value\\\":\\\"Standard_LRS\\\",\\\"displayName\\\":\\\"Storage Account Type\\\",\\\"type\\\":\\\"string\\\",\\\"enum\\\":[\\\"Standard_LRS\\\",\\\"Standard_GRS\\\",\\\"Standard_RAGRS\\\"]},\\\"httpsOnly\\\":{\\\"$id\\\":\\\"httpsOnly\\\",\\\"value\\\":true,\\\"displayName\\\":\\\"HTTPS only\\\",\\\"type\\\":\\\"boolean\\\"}},\\\"required\\\":[\\\"functionAppRuntime\\\",\\\"storageAccountType\\\"]}\",\"runner\":\"devcenter/arm\",\"status\":\"Enabled\",\"summary\":\"Hello world template\",\"templatePath\":\"azuredeploy.json\",\"version\":\"1.0.0\"}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
