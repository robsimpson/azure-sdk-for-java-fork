// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.AzureMLBatchExecutionActivity;
import com.azure.resourcemanager.datafactory.models.AzureMLWebServiceFile;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureMLBatchExecutionActivityTests {
    @Test
    public void testDeserialize() {
        AzureMLBatchExecutionActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureMLBatchExecution\",\"typeProperties\":{\"globalParameters\":{},\"webServiceOutputs\":{\"aujegqdtadra\":{},\"gddhjkrukizyhgs\":{},\"tnqsktx\":{}},\"webServiceInputs\":{\"jbqggweeiwdhdm\":{}}},\"linkedServiceName\":{\"referenceName\":\"gbfzu\",\"parameters\":{}},\"policy\":{\"retryIntervalInSeconds\":833559193,\"secureInput\":true,\"secureOutput\":true,\"\":{}},\"name\":\"lciichgjs\",\"description\":\"mvxodgwxfkzsif\",\"dependsOn\":[{\"activity\":\"bdujgcwxvecbb\",\"dependencyConditions\":[\"Failed\",\"Completed\"],\"\":{}},{\"activity\":\"rizagbbgiarks\",\"dependencyConditions\":[\"Skipped\",\"Skipped\",\"Completed\",\"Completed\"],\"\":{}},{\"activity\":\"abzrwiqrxha\",\"dependencyConditions\":[\"Skipped\",\"Skipped\",\"Skipped\"],\"\":{}},{\"activity\":\"kptjqgkifmmai\",\"dependencyConditions\":[\"Completed\"],\"\":{}}],\"userProperties\":[{\"name\":\"pbqwuntobu\"}],\"\":{}}")
                .toObject(AzureMLBatchExecutionActivity.class);
        Assertions.assertEquals("lciichgjs", model.name());
        Assertions.assertEquals("mvxodgwxfkzsif", model.description());
        Assertions.assertEquals("bdujgcwxvecbb", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("pbqwuntobu", model.userProperties().get(0).name());
        Assertions.assertEquals("gbfzu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(833559193, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
    }

    @Test
    public void testSerialize() {
        AzureMLBatchExecutionActivity model =
            new AzureMLBatchExecutionActivity()
                .withName("lciichgjs")
                .withDescription("mvxodgwxfkzsif")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("bdujgcwxvecbb")
                                .withDependencyConditions(
                                    Arrays.asList(DependencyCondition.FAILED, DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("rizagbbgiarks")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("abzrwiqrxha")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("kptjqgkifmmai")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(Arrays.asList(new UserProperty().withName("pbqwuntobu")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("gbfzu").withParameters(mapOf()))
                .withPolicy(
                    new ActivityPolicy()
                        .withRetryIntervalInSeconds(833559193)
                        .withSecureInput(true)
                        .withSecureOutput(true)
                        .withAdditionalProperties(mapOf()))
                .withGlobalParameters(mapOf())
                .withWebServiceOutputs(
                    mapOf(
                        "aujegqdtadra",
                        new AzureMLWebServiceFile(),
                        "gddhjkrukizyhgs",
                        new AzureMLWebServiceFile(),
                        "tnqsktx",
                        new AzureMLWebServiceFile()))
                .withWebServiceInputs(mapOf("jbqggweeiwdhdm", new AzureMLWebServiceFile()));
        model = BinaryData.fromObject(model).toObject(AzureMLBatchExecutionActivity.class);
        Assertions.assertEquals("lciichgjs", model.name());
        Assertions.assertEquals("mvxodgwxfkzsif", model.description());
        Assertions.assertEquals("bdujgcwxvecbb", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("pbqwuntobu", model.userProperties().get(0).name());
        Assertions.assertEquals("gbfzu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(833559193, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
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