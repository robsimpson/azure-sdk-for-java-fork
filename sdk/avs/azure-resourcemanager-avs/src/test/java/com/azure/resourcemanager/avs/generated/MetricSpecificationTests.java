// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.MetricDimension;
import com.azure.resourcemanager.avs.models.MetricSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MetricSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MetricSpecification model =
            BinaryData
                .fromString(
                    "{\"name\":\"zidnsezcxtbzsgfy\",\"displayName\":\"sne\",\"displayDescription\":\"dwzjeiach\",\"unit\":\"osfln\",\"category\":\"sfqpteehz\",\"aggregationType\":\"ypyqrimzinp\",\"supportedAggregationTypes\":[\"jdkirsoodqx\"],\"supportedTimeGrainTypes\":[\"mnoh\",\"t\"],\"fillGapWithZero\":true,\"dimensions\":[{\"name\":\"oifiyipjxsqwpgr\",\"displayName\":\"znorcj\",\"internalName\":\"snb\",\"toBeExportedForShoebox\":false},{\"name\":\"bnmo\",\"displayName\":\"cyshurzafbljjgp\",\"internalName\":\"oq\",\"toBeExportedForShoebox\":false},{\"name\":\"ljavbqid\",\"displayName\":\"ajzyul\",\"internalName\":\"u\",\"toBeExportedForShoebox\":true}],\"enableRegionalMdmAccount\":\"lkhbz\",\"sourceMdmAccount\":\"epgzgqexz\",\"sourceMdmNamespace\":\"c\"}")
                .toObject(MetricSpecification.class);
        Assertions.assertEquals("zidnsezcxtbzsgfy", model.name());
        Assertions.assertEquals("sne", model.displayName());
        Assertions.assertEquals("dwzjeiach", model.displayDescription());
        Assertions.assertEquals("osfln", model.unit());
        Assertions.assertEquals("sfqpteehz", model.category());
        Assertions.assertEquals("ypyqrimzinp", model.aggregationType());
        Assertions.assertEquals("jdkirsoodqx", model.supportedAggregationTypes().get(0));
        Assertions.assertEquals("mnoh", model.supportedTimeGrainTypes().get(0));
        Assertions.assertEquals(true, model.fillGapWithZero());
        Assertions.assertEquals("oifiyipjxsqwpgr", model.dimensions().get(0).name());
        Assertions.assertEquals("znorcj", model.dimensions().get(0).displayName());
        Assertions.assertEquals("snb", model.dimensions().get(0).internalName());
        Assertions.assertEquals(false, model.dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals("lkhbz", model.enableRegionalMdmAccount());
        Assertions.assertEquals("epgzgqexz", model.sourceMdmAccount());
        Assertions.assertEquals("c", model.sourceMdmNamespace());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MetricSpecification model =
            new MetricSpecification()
                .withName("zidnsezcxtbzsgfy")
                .withDisplayName("sne")
                .withDisplayDescription("dwzjeiach")
                .withUnit("osfln")
                .withCategory("sfqpteehz")
                .withAggregationType("ypyqrimzinp")
                .withSupportedAggregationTypes(Arrays.asList("jdkirsoodqx"))
                .withSupportedTimeGrainTypes(Arrays.asList("mnoh", "t"))
                .withFillGapWithZero(true)
                .withDimensions(
                    Arrays
                        .asList(
                            new MetricDimension()
                                .withName("oifiyipjxsqwpgr")
                                .withDisplayName("znorcj")
                                .withInternalName("snb")
                                .withToBeExportedForShoebox(false),
                            new MetricDimension()
                                .withName("bnmo")
                                .withDisplayName("cyshurzafbljjgp")
                                .withInternalName("oq")
                                .withToBeExportedForShoebox(false),
                            new MetricDimension()
                                .withName("ljavbqid")
                                .withDisplayName("ajzyul")
                                .withInternalName("u")
                                .withToBeExportedForShoebox(true)))
                .withEnableRegionalMdmAccount("lkhbz")
                .withSourceMdmAccount("epgzgqexz")
                .withSourceMdmNamespace("c");
        model = BinaryData.fromObject(model).toObject(MetricSpecification.class);
        Assertions.assertEquals("zidnsezcxtbzsgfy", model.name());
        Assertions.assertEquals("sne", model.displayName());
        Assertions.assertEquals("dwzjeiach", model.displayDescription());
        Assertions.assertEquals("osfln", model.unit());
        Assertions.assertEquals("sfqpteehz", model.category());
        Assertions.assertEquals("ypyqrimzinp", model.aggregationType());
        Assertions.assertEquals("jdkirsoodqx", model.supportedAggregationTypes().get(0));
        Assertions.assertEquals("mnoh", model.supportedTimeGrainTypes().get(0));
        Assertions.assertEquals(true, model.fillGapWithZero());
        Assertions.assertEquals("oifiyipjxsqwpgr", model.dimensions().get(0).name());
        Assertions.assertEquals("znorcj", model.dimensions().get(0).displayName());
        Assertions.assertEquals("snb", model.dimensions().get(0).internalName());
        Assertions.assertEquals(false, model.dimensions().get(0).toBeExportedForShoebox());
        Assertions.assertEquals("lkhbz", model.enableRegionalMdmAccount());
        Assertions.assertEquals("epgzgqexz", model.sourceMdmAccount());
        Assertions.assertEquals("c", model.sourceMdmNamespace());
    }
}
