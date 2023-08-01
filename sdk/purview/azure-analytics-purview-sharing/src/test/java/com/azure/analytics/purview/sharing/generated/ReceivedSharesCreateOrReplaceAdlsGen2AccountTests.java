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

public final class ReceivedSharesCreateOrReplaceAdlsGen2AccountTests extends PurviewShareClientTestBase {
    @Test
    @Disabled
    public void testReceivedSharesCreateOrReplaceAdlsGen2AccountTests() {
        BinaryData receivedShare =
                BinaryData.fromString(
                        "{\"properties\":{\"displayName\":\"updatedReceivedShareNameAdls\",\"sink\":{\"properties\":{\"containerName\":\"receivingContainerAbc\",\"folder\":\"receivingFolderAbc\",\"mountPath\":\"pathAbc\"},\"storeKind\":\"AdlsGen2Account\",\"storeReference\":{\"type\":\"ArmResourceReference\",\"referenceName\":\"/subscriptions/4D8FD81D-431D-4B1D-B46C-C770CFC034FC/resourceGroups/contoso-rg/providers/Microsoft.Storage/storageAccounts/adlsAccount\"}}},\"shareKind\":\"InPlace\"}");
        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, BinaryData> response =
                receivedSharesClient.beginCreateOrReplaceReceivedShare(
                        "35E28F0E-DEA4-472F-84E4-5F1E45FB9937", receivedShare, requestOptions);
        Assertions.assertEquals(
                LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, response.waitForCompletion().getStatus());
    }
}
