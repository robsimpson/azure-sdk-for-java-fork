// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logz.fluent.models.VMResourcesInner;
import com.azure.resourcemanager.logz.models.VMHostUpdateRequest;
import com.azure.resourcemanager.logz.models.VMHostUpdateStates;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VMHostUpdateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMHostUpdateRequest model =
            BinaryData
                .fromString(
                    "{\"vmResourceIds\":[{\"id\":\"ebxetqgtzxdp\",\"agentVersion\":\"bqqwxrj\"},{\"id\":\"al\",\"agentVersion\":\"wsubisnja\"},{\"id\":\"mngnzscxaqw\",\"agentVersion\":\"chcbonqvpkvlrxnj\"},{\"id\":\"seiphe\",\"agentVersion\":\"lokeyy\"}],\"state\":\"Install\"}")
                .toObject(VMHostUpdateRequest.class);
        Assertions.assertEquals("ebxetqgtzxdp", model.vmResourceIds().get(0).id());
        Assertions.assertEquals("bqqwxrj", model.vmResourceIds().get(0).agentVersion());
        Assertions.assertEquals(VMHostUpdateStates.INSTALL, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMHostUpdateRequest model =
            new VMHostUpdateRequest()
                .withVmResourceIds(
                    Arrays
                        .asList(
                            new VMResourcesInner().withId("ebxetqgtzxdp").withAgentVersion("bqqwxrj"),
                            new VMResourcesInner().withId("al").withAgentVersion("wsubisnja"),
                            new VMResourcesInner().withId("mngnzscxaqw").withAgentVersion("chcbonqvpkvlrxnj"),
                            new VMResourcesInner().withId("seiphe").withAgentVersion("lokeyy")))
                .withState(VMHostUpdateStates.INSTALL);
        model = BinaryData.fromObject(model).toObject(VMHostUpdateRequest.class);
        Assertions.assertEquals("ebxetqgtzxdp", model.vmResourceIds().get(0).id());
        Assertions.assertEquals("bqqwxrj", model.vmResourceIds().get(0).agentVersion());
        Assertions.assertEquals(VMHostUpdateStates.INSTALL, model.state());
    }
}
