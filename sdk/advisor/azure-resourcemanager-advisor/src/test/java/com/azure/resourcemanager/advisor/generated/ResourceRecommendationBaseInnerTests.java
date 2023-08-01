// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.advisor.fluent.models.ResourceRecommendationBaseInner;
import com.azure.resourcemanager.advisor.models.Category;
import com.azure.resourcemanager.advisor.models.Impact;
import com.azure.resourcemanager.advisor.models.ResourceMetadata;
import com.azure.resourcemanager.advisor.models.ShortDescription;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class ResourceRecommendationBaseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceRecommendationBaseInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"category\":\"Performance\",\"impact\":\"Low\",\"impactedField\":\"njbiksqrglssain\",\"impactedValue\":\"jwnzlljfmp\",\"lastUpdated\":\"2021-09-21T11:36:48Z\",\"metadata\":{\"yqduujit\":\"datamgxsab\",\"rwpdappdsbdkvwrw\":\"datajczdzevndh\"},\"recommendationTypeId\":\"eusnhutj\",\"shortDescription\":{\"problem\":\"mrldhu\",\"solution\":\"zzd\"},\"suppressionIds\":[\"7edaf309-156b-4fa8-84db-d97fe78c459e\",\"5b410fd8-362a-4c4a-8624-92464dd7bd45\",\"3852d285-8e67-49f3-8463-59bd01ee8d65\",\"84cbe077-afa8-46e3-bf17-3e31cbf738af\"],\"extendedProperties\":{\"geablgphuticndvk\":\"oc\",\"ftyxolniw\":\"ozwyiftyhxhuro\"},\"resourceMetadata\":{\"resourceId\":\"ukjfkgiawxklr\",\"source\":\"lwckbasyypnddhs\",\"action\":{\"qgoulznd\":\"dataacphejkoty\",\"wyqkgfgibm\":\"datai\",\"qsrxybzqqed\":\"datadgak\"},\"singular\":\"tbciqfouflmm\",\"plural\":\"zsm\"},\"description\":\"mglougpbkw\",\"label\":\"utduqktapspwgcu\",\"learnMoreLink\":\"tumkdosvqwhbm\",\"potentialBenefits\":\"bbjfddgmbmbexp\",\"actions\":[{\"rolfpfp\":\"dataq\"},{\"yjgzjaoyfhrtxiln\":\"datalgbquxig\",\"vlejuvfqa\":\"datarkujy\",\"xgjvtbv\":\"datarlyxwjkcprbnw\",\"uouq\":\"dataysszdnrujqguh\"},{\"itnwuizgazxufi\":\"datarwzwbng\",\"hr\":\"datauckyf\",\"zwdzuh\":\"dataidf\",\"wxmnteiwao\":\"dataymwisdkft\"}],\"remediation\":{\"pymzidnsezcxtbzs\":\"datamijcmmxdcufufs\"},\"exposedMetadataProperties\":{\"sne\":\"datac\"}},\"id\":\"mdwzjeiachboo\",\"name\":\"flnrosfqpteehzz\",\"type\":\"ypyqrimzinp\"}")
                .toObject(ResourceRecommendationBaseInner.class);
        Assertions.assertEquals(Category.PERFORMANCE, model.category());
        Assertions.assertEquals(Impact.LOW, model.impact());
        Assertions.assertEquals("njbiksqrglssain", model.impactedField());
        Assertions.assertEquals("jwnzlljfmp", model.impactedValue());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-21T11:36:48Z"), model.lastUpdated());
        Assertions.assertEquals("eusnhutj", model.recommendationTypeId());
        Assertions.assertEquals("mrldhu", model.shortDescription().problem());
        Assertions.assertEquals("zzd", model.shortDescription().solution());
        Assertions.assertEquals(UUID.fromString("7edaf309-156b-4fa8-84db-d97fe78c459e"), model.suppressionIds().get(0));
        Assertions.assertEquals("oc", model.extendedProperties().get("geablgphuticndvk"));
        Assertions.assertEquals("ukjfkgiawxklr", model.resourceMetadata().resourceId());
        Assertions.assertEquals("lwckbasyypnddhs", model.resourceMetadata().source());
        Assertions.assertEquals("tbciqfouflmm", model.resourceMetadata().singular());
        Assertions.assertEquals("zsm", model.resourceMetadata().plural());
        Assertions.assertEquals("mglougpbkw", model.description());
        Assertions.assertEquals("utduqktapspwgcu", model.label());
        Assertions.assertEquals("tumkdosvqwhbm", model.learnMoreLink());
        Assertions.assertEquals("bbjfddgmbmbexp", model.potentialBenefits());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceRecommendationBaseInner model =
            new ResourceRecommendationBaseInner()
                .withCategory(Category.PERFORMANCE)
                .withImpact(Impact.LOW)
                .withImpactedField("njbiksqrglssain")
                .withImpactedValue("jwnzlljfmp")
                .withLastUpdated(OffsetDateTime.parse("2021-09-21T11:36:48Z"))
                .withMetadata(mapOf("yqduujit", "datamgxsab", "rwpdappdsbdkvwrw", "datajczdzevndh"))
                .withRecommendationTypeId("eusnhutj")
                .withShortDescription(new ShortDescription().withProblem("mrldhu").withSolution("zzd"))
                .withSuppressionIds(
                    Arrays
                        .asList(
                            UUID.fromString("7edaf309-156b-4fa8-84db-d97fe78c459e"),
                            UUID.fromString("5b410fd8-362a-4c4a-8624-92464dd7bd45"),
                            UUID.fromString("3852d285-8e67-49f3-8463-59bd01ee8d65"),
                            UUID.fromString("84cbe077-afa8-46e3-bf17-3e31cbf738af")))
                .withExtendedProperties(mapOf("geablgphuticndvk", "oc", "ftyxolniw", "ozwyiftyhxhuro"))
                .withResourceMetadata(
                    new ResourceMetadata()
                        .withResourceId("ukjfkgiawxklr")
                        .withSource("lwckbasyypnddhs")
                        .withAction(
                            mapOf("qgoulznd", "dataacphejkoty", "wyqkgfgibm", "datai", "qsrxybzqqed", "datadgak"))
                        .withSingular("tbciqfouflmm")
                        .withPlural("zsm"))
                .withDescription("mglougpbkw")
                .withLabel("utduqktapspwgcu")
                .withLearnMoreLink("tumkdosvqwhbm")
                .withPotentialBenefits("bbjfddgmbmbexp")
                .withActions(
                    Arrays
                        .asList(
                            mapOf("rolfpfp", "dataq"),
                            mapOf(
                                "yjgzjaoyfhrtxiln",
                                "datalgbquxig",
                                "vlejuvfqa",
                                "datarkujy",
                                "xgjvtbv",
                                "datarlyxwjkcprbnw",
                                "uouq",
                                "dataysszdnrujqguh"),
                            mapOf(
                                "itnwuizgazxufi",
                                "datarwzwbng",
                                "hr",
                                "datauckyf",
                                "zwdzuh",
                                "dataidf",
                                "wxmnteiwao",
                                "dataymwisdkft")))
                .withRemediation(mapOf("pymzidnsezcxtbzs", "datamijcmmxdcufufs"))
                .withExposedMetadataProperties(mapOf("sne", "datac"));
        model = BinaryData.fromObject(model).toObject(ResourceRecommendationBaseInner.class);
        Assertions.assertEquals(Category.PERFORMANCE, model.category());
        Assertions.assertEquals(Impact.LOW, model.impact());
        Assertions.assertEquals("njbiksqrglssain", model.impactedField());
        Assertions.assertEquals("jwnzlljfmp", model.impactedValue());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-21T11:36:48Z"), model.lastUpdated());
        Assertions.assertEquals("eusnhutj", model.recommendationTypeId());
        Assertions.assertEquals("mrldhu", model.shortDescription().problem());
        Assertions.assertEquals("zzd", model.shortDescription().solution());
        Assertions.assertEquals(UUID.fromString("7edaf309-156b-4fa8-84db-d97fe78c459e"), model.suppressionIds().get(0));
        Assertions.assertEquals("oc", model.extendedProperties().get("geablgphuticndvk"));
        Assertions.assertEquals("ukjfkgiawxklr", model.resourceMetadata().resourceId());
        Assertions.assertEquals("lwckbasyypnddhs", model.resourceMetadata().source());
        Assertions.assertEquals("tbciqfouflmm", model.resourceMetadata().singular());
        Assertions.assertEquals("zsm", model.resourceMetadata().plural());
        Assertions.assertEquals("mglougpbkw", model.description());
        Assertions.assertEquals("utduqktapspwgcu", model.label());
        Assertions.assertEquals("tumkdosvqwhbm", model.learnMoreLink());
        Assertions.assertEquals("bbjfddgmbmbexp", model.potentialBenefits());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
