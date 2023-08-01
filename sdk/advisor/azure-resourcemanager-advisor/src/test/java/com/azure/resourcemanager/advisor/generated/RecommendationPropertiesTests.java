// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.advisor.fluent.models.RecommendationProperties;
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

public final class RecommendationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecommendationProperties model =
            BinaryData
                .fromString(
                    "{\"category\":\"OperationalExcellence\",\"impact\":\"Medium\",\"impactedField\":\"irsoodqxhcrmnohj\",\"impactedValue\":\"kwh\",\"lastUpdated\":\"2021-05-11T08:11:32Z\",\"metadata\":{\"pjxsqwpgrjbznor\":\"dataiy\",\"ocpcy\":\"datajxvsnbyxqabn\",\"gpbtoqcjmklj\":\"datahurzafblj\",\"qajzyulpkudjkr\":\"datavbqid\"},\"recommendationTypeId\":\"hbzhfepg\",\"shortDescription\":{\"problem\":\"e\",\"solution\":\"locx\"},\"suppressionIds\":[\"6b445862-0f55-4f3d-858d-420859a95f61\",\"e41a5c93-9e36-4f1a-b2cc-9640330c27f2\"],\"extendedProperties\":{\"jtjaodxobnbdxkq\":\"erhhbcsglumm\",\"ajionpimexgstxg\":\"xo\",\"gmaajrm\":\"po\",\"clwhijcoejctbz\":\"djwzrlov\"},\"resourceMetadata\":{\"resourceId\":\"qsycbkbfkgu\",\"source\":\"kexxppof\",\"action\":{\"fjpgddtocjjxhvp\":\"datax\",\"exhd\":\"datao\",\"bzv\":\"dataxibqeojnx\",\"pzaoqvuhr\":\"datadntwndeicbtw\"},\"singular\":\"f\",\"plural\":\"yd\"},\"description\":\"lmjthjq\",\"label\":\"pyeicxm\",\"learnMoreLink\":\"iwqvhkh\",\"potentialBenefits\":\"uigdtopbobjog\",\"actions\":[{\"m\":\"datau\"}],\"remediation\":{\"t\":\"datarzayv\",\"ln\":\"datagvdfgiotkftutq\",\"qmi\":\"dataxlefgugnxkrx\",\"abhjybi\":\"datatthzrvqd\"},\"exposedMetadataProperties\":{\"zlcuiywgqywgndrv\":\"dataoqfbowskanyk\"}}")
                .toObject(RecommendationProperties.class);
        Assertions.assertEquals(Category.OPERATIONAL_EXCELLENCE, model.category());
        Assertions.assertEquals(Impact.MEDIUM, model.impact());
        Assertions.assertEquals("irsoodqxhcrmnohj", model.impactedField());
        Assertions.assertEquals("kwh", model.impactedValue());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-11T08:11:32Z"), model.lastUpdated());
        Assertions.assertEquals("hbzhfepg", model.recommendationTypeId());
        Assertions.assertEquals("e", model.shortDescription().problem());
        Assertions.assertEquals("locx", model.shortDescription().solution());
        Assertions.assertEquals(UUID.fromString("6b445862-0f55-4f3d-858d-420859a95f61"), model.suppressionIds().get(0));
        Assertions.assertEquals("erhhbcsglumm", model.extendedProperties().get("jtjaodxobnbdxkq"));
        Assertions.assertEquals("qsycbkbfkgu", model.resourceMetadata().resourceId());
        Assertions.assertEquals("kexxppof", model.resourceMetadata().source());
        Assertions.assertEquals("f", model.resourceMetadata().singular());
        Assertions.assertEquals("yd", model.resourceMetadata().plural());
        Assertions.assertEquals("lmjthjq", model.description());
        Assertions.assertEquals("pyeicxm", model.label());
        Assertions.assertEquals("iwqvhkh", model.learnMoreLink());
        Assertions.assertEquals("uigdtopbobjog", model.potentialBenefits());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecommendationProperties model =
            new RecommendationProperties()
                .withCategory(Category.OPERATIONAL_EXCELLENCE)
                .withImpact(Impact.MEDIUM)
                .withImpactedField("irsoodqxhcrmnohj")
                .withImpactedValue("kwh")
                .withLastUpdated(OffsetDateTime.parse("2021-05-11T08:11:32Z"))
                .withMetadata(
                    mapOf(
                        "pjxsqwpgrjbznor",
                        "dataiy",
                        "ocpcy",
                        "datajxvsnbyxqabn",
                        "gpbtoqcjmklj",
                        "datahurzafblj",
                        "qajzyulpkudjkr",
                        "datavbqid"))
                .withRecommendationTypeId("hbzhfepg")
                .withShortDescription(new ShortDescription().withProblem("e").withSolution("locx"))
                .withSuppressionIds(
                    Arrays
                        .asList(
                            UUID.fromString("6b445862-0f55-4f3d-858d-420859a95f61"),
                            UUID.fromString("e41a5c93-9e36-4f1a-b2cc-9640330c27f2")))
                .withExtendedProperties(
                    mapOf(
                        "jtjaodxobnbdxkq",
                        "erhhbcsglumm",
                        "ajionpimexgstxg",
                        "xo",
                        "gmaajrm",
                        "po",
                        "clwhijcoejctbz",
                        "djwzrlov"))
                .withResourceMetadata(
                    new ResourceMetadata()
                        .withResourceId("qsycbkbfkgu")
                        .withSource("kexxppof")
                        .withAction(
                            mapOf(
                                "fjpgddtocjjxhvp",
                                "datax",
                                "exhd",
                                "datao",
                                "bzv",
                                "dataxibqeojnx",
                                "pzaoqvuhr",
                                "datadntwndeicbtw"))
                        .withSingular("f")
                        .withPlural("yd"))
                .withDescription("lmjthjq")
                .withLabel("pyeicxm")
                .withLearnMoreLink("iwqvhkh")
                .withPotentialBenefits("uigdtopbobjog")
                .withActions(Arrays.asList(mapOf("m", "datau")))
                .withRemediation(
                    mapOf(
                        "t",
                        "datarzayv",
                        "ln",
                        "datagvdfgiotkftutq",
                        "qmi",
                        "dataxlefgugnxkrx",
                        "abhjybi",
                        "datatthzrvqd"))
                .withExposedMetadataProperties(mapOf("zlcuiywgqywgndrv", "dataoqfbowskanyk"));
        model = BinaryData.fromObject(model).toObject(RecommendationProperties.class);
        Assertions.assertEquals(Category.OPERATIONAL_EXCELLENCE, model.category());
        Assertions.assertEquals(Impact.MEDIUM, model.impact());
        Assertions.assertEquals("irsoodqxhcrmnohj", model.impactedField());
        Assertions.assertEquals("kwh", model.impactedValue());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-11T08:11:32Z"), model.lastUpdated());
        Assertions.assertEquals("hbzhfepg", model.recommendationTypeId());
        Assertions.assertEquals("e", model.shortDescription().problem());
        Assertions.assertEquals("locx", model.shortDescription().solution());
        Assertions.assertEquals(UUID.fromString("6b445862-0f55-4f3d-858d-420859a95f61"), model.suppressionIds().get(0));
        Assertions.assertEquals("erhhbcsglumm", model.extendedProperties().get("jtjaodxobnbdxkq"));
        Assertions.assertEquals("qsycbkbfkgu", model.resourceMetadata().resourceId());
        Assertions.assertEquals("kexxppof", model.resourceMetadata().source());
        Assertions.assertEquals("f", model.resourceMetadata().singular());
        Assertions.assertEquals("yd", model.resourceMetadata().plural());
        Assertions.assertEquals("lmjthjq", model.description());
        Assertions.assertEquals("pyeicxm", model.label());
        Assertions.assertEquals("iwqvhkh", model.learnMoreLink());
        Assertions.assertEquals("uigdtopbobjog", model.potentialBenefits());
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
