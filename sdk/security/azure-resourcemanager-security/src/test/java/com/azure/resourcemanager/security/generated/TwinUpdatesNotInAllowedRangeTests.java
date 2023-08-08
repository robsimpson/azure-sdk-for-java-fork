// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.TwinUpdatesNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class TwinUpdatesNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TwinUpdatesNotInAllowedRange model =
            BinaryData
                .fromString(
                    "{\"ruleType\":\"TwinUpdatesNotInAllowedRange\",\"timeWindowSize\":\"PT111H16M9S\",\"minThreshold\":2122337466,\"maxThreshold\":634264746,\"displayName\":\"ntrpcaqkiof\",\"description\":\"tfmhklbnldpvcb\",\"isEnabled\":false}")
                .toObject(TwinUpdatesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(2122337466, model.minThreshold());
        Assertions.assertEquals(634264746, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT111H16M9S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TwinUpdatesNotInAllowedRange model =
            new TwinUpdatesNotInAllowedRange()
                .withIsEnabled(false)
                .withMinThreshold(2122337466)
                .withMaxThreshold(634264746)
                .withTimeWindowSize(Duration.parse("PT111H16M9S"));
        model = BinaryData.fromObject(model).toObject(TwinUpdatesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(2122337466, model.minThreshold());
        Assertions.assertEquals(634264746, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT111H16M9S"), model.timeWindowSize());
    }
}
