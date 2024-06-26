// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.confidentialledger.models.ConfidentialLedgerBackup;
import org.junit.jupiter.api.Assertions;

public final class ConfidentialLedgerBackupTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfidentialLedgerBackup model = BinaryData.fromString("{\"restoreRegion\":\"ocxscpaierhhbcs\",\"uri\":\"l\"}")
            .toObject(ConfidentialLedgerBackup.class);
        Assertions.assertEquals("ocxscpaierhhbcs", model.restoreRegion());
        Assertions.assertEquals("l", model.uri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfidentialLedgerBackup model
            = new ConfidentialLedgerBackup().withRestoreRegion("ocxscpaierhhbcs").withUri("l");
        model = BinaryData.fromObject(model).toObject(ConfidentialLedgerBackup.class);
        Assertions.assertEquals("ocxscpaierhhbcs", model.restoreRegion());
        Assertions.assertEquals("l", model.uri());
    }
}
