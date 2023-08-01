// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.SyncPoller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class SentSharesCreateOrReplaceTests extends PurviewShareClientTestBase {
    @Test
    @Disabled
    public void testSentSharesCreateOrReplaceTests() {
        BinaryData sentShare =
                BinaryData.fromString(
                        "{\"properties\":{\"description\":\"description\",\"artifact\":{\"properties\":{\"paths\":[{\"containerName\":\"container1\",\"receiverPath\":\"SharedFile.txt\",\"senderPath\":\"directory/file.txt\"}]},\"storeKind\":\"AdlsGen2Account\",\"storeReference\":{\"type\":\"ArmResourceReference\",\"referenceName\":\"/subscriptions/de06c3a0-4610-4ca0-8cbb-bbdac204bd65/resourceGroups/sender-storage-rg/providers/Microsoft.Storage/storageAccounts/providerstorage\"}},\"displayName\":\"sentShare1\"},\"shareKind\":\"InPlace\"}");
        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, BinaryData> response =
                sentSharesClient.beginCreateOrReplaceSentShare(
                        "FF4A2AAE-8755-47BB-9C00-A774B5A7006E", sentShare, requestOptions);
        Assertions.assertEquals(
                LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, response.waitForCompletion().getStatus());
    }
}
