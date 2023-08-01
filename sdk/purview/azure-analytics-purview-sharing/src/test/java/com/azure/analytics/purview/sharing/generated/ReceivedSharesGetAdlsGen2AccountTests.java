// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class ReceivedSharesGetAdlsGen2AccountTests extends PurviewShareClientTestBase {
    @Test
    @Disabled
    public void testReceivedSharesGetAdlsGen2AccountTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                receivedSharesClient.getReceivedShareWithResponse(
                        "0D67B9C8-A6C6-4990-9EDE-12EA059D3002", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals("Wed, 12 July 2022 18:04:32 GMT", response.getHeaders().get("Date").getValue());
        Assertions.assertEquals(
                "25c78f97-0b0a-4fe9-ad39-883a482265cd",
                response.getHeaders().get("x-ms-correlation-request-id").getValue());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"type\":\"receivedShares\",\"id\":\"0D67B9C8-A6C6-4990-9EDE-12EA059D3002\",\"properties\":{\"assetLocation\":\"eastus\",\"assetStoreKind\":\"AdlsGen2Account\",\"createdAt\":\"2022-07-19T18:18:50.7095202Z\",\"displayName\":\"receivedShareName1\",\"receiverEmail\":\"johndoe@fabrikam.com\",\"receiverName\":\"John Doe\",\"receiverTenantName\":\"Fabrikam\",\"senderEmail\":\"ali.smith@contoso.com\",\"senderName\":\"Ali Smith\",\"senderTenantName\":\"Contoso\",\"sentShareDescription\":\"description\",\"shareStatus\":\"Attached\",\"sharedAt\":\"2022-07-18T18:17:56.1065304Z\",\"sink\":{\"properties\":{\"containerName\":\"receivingContainerAbc\",\"folder\":\"receivingFolderAbc\",\"location\":\"eastus\",\"mountPath\":\"pathAbc\"},\"storeKind\":\"AdlsGen2Account\",\"storeReference\":{\"type\":\"ArmResourceReference\",\"referenceName\":\"/subscriptions/4D8FD81D-431D-4B1D-B46C-C770CFC034FC/resourceGroups/contoso-rg/providers/Microsoft.Storage/storageAccounts/adlsAccount\"}},\"state\":\"Succeeded\"},\"shareKind\":\"InPlace\"}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
