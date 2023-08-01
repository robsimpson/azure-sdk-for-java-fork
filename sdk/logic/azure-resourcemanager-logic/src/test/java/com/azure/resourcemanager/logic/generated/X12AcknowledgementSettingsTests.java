// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.X12AcknowledgementSettings;
import org.junit.jupiter.api.Assertions;

public final class X12AcknowledgementSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        X12AcknowledgementSettings model =
            BinaryData
                .fromString(
                    "{\"needTechnicalAcknowledgement\":false,\"batchTechnicalAcknowledgements\":false,\"needFunctionalAcknowledgement\":true,\"functionalAcknowledgementVersion\":\"xkzb\",\"batchFunctionalAcknowledgements\":true,\"needImplementationAcknowledgement\":false,\"implementationAcknowledgementVersion\":\"eivsiykzkdnc\",\"batchImplementationAcknowledgements\":true,\"needLoopForValidMessages\":true,\"sendSynchronousAcknowledgement\":true,\"acknowledgementControlNumberPrefix\":\"bzo\",\"acknowledgementControlNumberSuffix\":\"culapzwyrpgogtq\",\"acknowledgementControlNumberLowerBound\":2072237694,\"acknowledgementControlNumberUpperBound\":1190019177,\"rolloverAcknowledgementControlNumber\":false}")
                .toObject(X12AcknowledgementSettings.class);
        Assertions.assertEquals(false, model.needTechnicalAcknowledgement());
        Assertions.assertEquals(false, model.batchTechnicalAcknowledgements());
        Assertions.assertEquals(true, model.needFunctionalAcknowledgement());
        Assertions.assertEquals("xkzb", model.functionalAcknowledgementVersion());
        Assertions.assertEquals(true, model.batchFunctionalAcknowledgements());
        Assertions.assertEquals(false, model.needImplementationAcknowledgement());
        Assertions.assertEquals("eivsiykzkdnc", model.implementationAcknowledgementVersion());
        Assertions.assertEquals(true, model.batchImplementationAcknowledgements());
        Assertions.assertEquals(true, model.needLoopForValidMessages());
        Assertions.assertEquals(true, model.sendSynchronousAcknowledgement());
        Assertions.assertEquals("bzo", model.acknowledgementControlNumberPrefix());
        Assertions.assertEquals("culapzwyrpgogtq", model.acknowledgementControlNumberSuffix());
        Assertions.assertEquals(2072237694, model.acknowledgementControlNumberLowerBound());
        Assertions.assertEquals(1190019177, model.acknowledgementControlNumberUpperBound());
        Assertions.assertEquals(false, model.rolloverAcknowledgementControlNumber());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        X12AcknowledgementSettings model =
            new X12AcknowledgementSettings()
                .withNeedTechnicalAcknowledgement(false)
                .withBatchTechnicalAcknowledgements(false)
                .withNeedFunctionalAcknowledgement(true)
                .withFunctionalAcknowledgementVersion("xkzb")
                .withBatchFunctionalAcknowledgements(true)
                .withNeedImplementationAcknowledgement(false)
                .withImplementationAcknowledgementVersion("eivsiykzkdnc")
                .withBatchImplementationAcknowledgements(true)
                .withNeedLoopForValidMessages(true)
                .withSendSynchronousAcknowledgement(true)
                .withAcknowledgementControlNumberPrefix("bzo")
                .withAcknowledgementControlNumberSuffix("culapzwyrpgogtq")
                .withAcknowledgementControlNumberLowerBound(2072237694)
                .withAcknowledgementControlNumberUpperBound(1190019177)
                .withRolloverAcknowledgementControlNumber(false);
        model = BinaryData.fromObject(model).toObject(X12AcknowledgementSettings.class);
        Assertions.assertEquals(false, model.needTechnicalAcknowledgement());
        Assertions.assertEquals(false, model.batchTechnicalAcknowledgements());
        Assertions.assertEquals(true, model.needFunctionalAcknowledgement());
        Assertions.assertEquals("xkzb", model.functionalAcknowledgementVersion());
        Assertions.assertEquals(true, model.batchFunctionalAcknowledgements());
        Assertions.assertEquals(false, model.needImplementationAcknowledgement());
        Assertions.assertEquals("eivsiykzkdnc", model.implementationAcknowledgementVersion());
        Assertions.assertEquals(true, model.batchImplementationAcknowledgements());
        Assertions.assertEquals(true, model.needLoopForValidMessages());
        Assertions.assertEquals(true, model.sendSynchronousAcknowledgement());
        Assertions.assertEquals("bzo", model.acknowledgementControlNumberPrefix());
        Assertions.assertEquals("culapzwyrpgogtq", model.acknowledgementControlNumberSuffix());
        Assertions.assertEquals(2072237694, model.acknowledgementControlNumberLowerBound());
        Assertions.assertEquals(1190019177, model.acknowledgementControlNumberUpperBound());
        Assertions.assertEquals(false, model.rolloverAcknowledgementControlNumber());
    }
}
