// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlow;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugPackage;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugPackageDebugSettings;
import com.azure.resourcemanager.datafactory.models.DataFlowDebugResource;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import com.azure.resourcemanager.datafactory.models.DataFlowSourceSetting;
import com.azure.resourcemanager.datafactory.models.DataFlowStagingInfo;
import com.azure.resourcemanager.datafactory.models.Dataset;
import com.azure.resourcemanager.datafactory.models.DatasetDebugResource;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedService;
import com.azure.resourcemanager.datafactory.models.LinkedServiceDebugResource;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DataFlowDebugPackageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataFlowDebugPackage model = BinaryData.fromString(
            "{\"sessionId\":\"kdk\",\"dataFlow\":{\"properties\":{\"type\":\"jnnawtqa\",\"description\":\"xuckpggqoweyir\",\"annotations\":[\"dataisngwflqqmpizru\"],\"folder\":{\"name\":\"qxpxiwfcngjsaa\"}},\"name\":\"ixtmkzjvkviirhgf\"},\"dataFlows\":[{\"properties\":{\"type\":\"dpgra\",\"description\":\"vzbglbyvi\",\"annotations\":[\"datatbrxkjz\",\"datargxffmshkw\",\"databkgozxwopdbydpi\",\"dataqaclnapxbiy\"],\"folder\":{\"name\":\"gjkn\"}},\"name\":\"mfcttux\"},{\"properties\":{\"type\":\"yilflqoiquvrehmr\",\"description\":\"hvsujztc\",\"annotations\":[\"dataqjtwhauu\",\"datafprnjl\",\"datatlxs\"],\"folder\":{\"name\":\"ddoui\"}},\"name\":\"mowaziynknlqwzdv\"},{\"properties\":{\"type\":\"w\",\"description\":\"qszdtmaajquhuxyl\",\"annotations\":[\"datam\",\"dataygjbmzyospspsh\"],\"folder\":{\"name\":\"kyjpmspbps\"}},\"name\":\"fppyogtieyujtvcz\"}],\"datasets\":[{\"properties\":{\"type\":\"xrx\",\"description\":\"njdxvglnkvxl\",\"structure\":\"dataaglqivbgkcvkh\",\"schema\":\"datavuqd\",\"linkedServiceName\":{\"referenceName\":\"lvoniy\",\"parameters\":{\"hjknidibg\":\"dataubcpzgpxti\",\"ik\":\"datajxgpnrhgovfg\",\"wjrmzvuporqzd\":\"datamhha\",\"vxcnqmxqps\":\"datauydzvk\"}},\"parameters\":{\"dhbemzqkzszu\":{\"type\":\"Int\",\"defaultValue\":\"datakhlg\"},\"ljfp\":{\"type\":\"Int\",\"defaultValue\":\"datatglxx\"}},\"annotations\":[\"datacrmnzhrgmqgjs\",\"datavpqcb\"],\"folder\":{\"name\":\"bodthsqqgvri\"},\"\":{\"ousxauzlwvsgmw\":\"datakclacjfrn\"}},\"name\":\"qf\"}],\"linkedServices\":[{\"properties\":{\"type\":\"uxmmkjsvthnwp\",\"connectVia\":{\"referenceName\":\"ekov\",\"parameters\":{\"c\":\"databiattgplucfotan\",\"ugswvx\":\"datahnykz\"}},\"description\":\"mzqwmvtxnjmxmcu\",\"parameters\":{\"npdkv\":{\"type\":\"SecureString\",\"defaultValue\":\"datavclx\"},\"uzphdugnei\":{\"type\":\"Array\",\"defaultValue\":\"databuiyji\"}},\"annotations\":[\"datagox\",\"datajiuqhibtozi\"],\"\":{\"tvqylkmqpzoyhlfb\":\"datajedmurrxxgewp\",\"xoe\":\"datagwgcl\",\"jqlafcbahhpzp\":\"dataqinjipnwjf\",\"kkholvdndvia\":\"datafoiyjwpfilk\"}},\"name\":\"gphuartvtiu\"},{\"properties\":{\"type\":\"efchn\",\"connectVia\":{\"referenceName\":\"ahmnxhkxjqirw\",\"parameters\":{\"i\":\"dataooxf\",\"rsnewmozqvbubqma\":\"datahx\",\"taboidvmf\":\"datahsycxhxzgaz\"}},\"description\":\"ppu\",\"parameters\":{\"juahokqto\":{\"type\":\"Int\",\"defaultValue\":\"datapdfgkmtdherngbt\"}},\"annotations\":[\"datauxofshfphwpnulai\",\"datawzejywhslw\",\"dataojpllndnpdwrpqaf\"],\"\":{\"yetefyp\":\"datagsnnf\"}},\"name\":\"octfjgtixrjvzuyt\"}],\"staging\":{\"linkedService\":{\"referenceName\":\"lmuowo\",\"parameters\":{\"p\":\"datauir\"}},\"folderPath\":\"datanszonwpngaj\"},\"debugSettings\":{\"sourceSettings\":[{\"sourceName\":\"jawrtmjfjmyc\",\"rowLimit\":837645611,\"\":{\"khenlus\":\"datacoxovn\",\"jxtxrdc\":\"datanrd\"}},{\"sourceName\":\"jvidttge\",\"rowLimit\":1531674368,\"\":{\"s\":\"datayjtcvuwk\",\"uughtuqfecjxeyg\":\"datazies\"}}],\"parameters\":{\"cbuewmrswnjlxuz\":\"dataxu\",\"aqehg\":\"datahwpusxj\",\"tu\":\"datadohzjq\"},\"datasetParameters\":\"dataigebxncnwfepb\"},\"\":{\"g\":\"datafmxjg\"}}")
            .toObject(DataFlowDebugPackage.class);
        Assertions.assertEquals("kdk", model.sessionId());
        Assertions.assertEquals("ixtmkzjvkviirhgf", model.dataFlow().name());
        Assertions.assertEquals("xuckpggqoweyir", model.dataFlow().properties().description());
        Assertions.assertEquals("qxpxiwfcngjsaa", model.dataFlow().properties().folder().name());
        Assertions.assertEquals("mfcttux", model.dataFlows().get(0).name());
        Assertions.assertEquals("vzbglbyvi", model.dataFlows().get(0).properties().description());
        Assertions.assertEquals("gjkn", model.dataFlows().get(0).properties().folder().name());
        Assertions.assertEquals("qf", model.datasets().get(0).name());
        Assertions.assertEquals("njdxvglnkvxl", model.datasets().get(0).properties().description());
        Assertions.assertEquals("lvoniy", model.datasets().get(0).properties().linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT,
            model.datasets().get(0).properties().parameters().get("dhbemzqkzszu").type());
        Assertions.assertEquals("bodthsqqgvri", model.datasets().get(0).properties().folder().name());
        Assertions.assertEquals("gphuartvtiu", model.linkedServices().get(0).name());
        Assertions.assertEquals("ekov", model.linkedServices().get(0).properties().connectVia().referenceName());
        Assertions.assertEquals("mzqwmvtxnjmxmcu", model.linkedServices().get(0).properties().description());
        Assertions.assertEquals(ParameterType.SECURE_STRING,
            model.linkedServices().get(0).properties().parameters().get("npdkv").type());
        Assertions.assertEquals("lmuowo", model.staging().linkedService().referenceName());
        Assertions.assertEquals("jawrtmjfjmyc", model.debugSettings().sourceSettings().get(0).sourceName());
        Assertions.assertEquals(837645611, model.debugSettings().sourceSettings().get(0).rowLimit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataFlowDebugPackage model
            = new DataFlowDebugPackage().withSessionId("kdk")
                .withDataFlow(new DataFlowDebugResource().withName("ixtmkzjvkviirhgf")
                    .withProperties(new DataFlow().withDescription("xuckpggqoweyir")
                        .withAnnotations(Arrays.asList("dataisngwflqqmpizru"))
                        .withFolder(new DataFlowFolder().withName("qxpxiwfcngjsaa"))))
                .withDataFlows(Arrays.asList(
                    new DataFlowDebugResource().withName("mfcttux")
                        .withProperties(new DataFlow().withDescription("vzbglbyvi")
                            .withAnnotations(Arrays.asList("datatbrxkjz", "datargxffmshkw", "databkgozxwopdbydpi",
                                "dataqaclnapxbiy"))
                            .withFolder(new DataFlowFolder().withName("gjkn"))),
                    new DataFlowDebugResource().withName("mowaziynknlqwzdv")
                        .withProperties(new DataFlow().withDescription("hvsujztc")
                            .withAnnotations(Arrays.asList("dataqjtwhauu", "datafprnjl", "datatlxs"))
                            .withFolder(new DataFlowFolder().withName("ddoui"))),
                    new DataFlowDebugResource()
                        .withName("fppyogtieyujtvcz")
                        .withProperties(new DataFlow()
                            .withDescription("qszdtmaajquhuxyl")
                            .withAnnotations(Arrays.asList("datam", "dataygjbmzyospspsh"))
                            .withFolder(new DataFlowFolder().withName("kyjpmspbps")))))
                .withDatasets(Arrays.asList(new DatasetDebugResource().withName("qf")
                    .withProperties(new Dataset().withDescription("njdxvglnkvxl")
                        .withStructure("dataaglqivbgkcvkh")
                        .withSchema("datavuqd")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("lvoniy")
                            .withParameters(mapOf("hjknidibg", "dataubcpzgpxti", "ik", "datajxgpnrhgovfg",
                                "wjrmzvuporqzd", "datamhha", "vxcnqmxqps", "datauydzvk")))
                        .withParameters(mapOf("dhbemzqkzszu",
                            new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datakhlg"),
                            "ljfp",
                            new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datatglxx")))
                        .withAnnotations(Arrays.asList("datacrmnzhrgmqgjs", "datavpqcb"))
                        .withFolder(new DatasetFolder().withName("bodthsqqgvri"))
                        .withAdditionalProperties(mapOf("type", "xrx")))))
                .withLinkedServices(
                    Arrays.asList(
                        new LinkedServiceDebugResource().withName("gphuartvtiu")
                            .withProperties(new LinkedService()
                                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("ekov")
                                    .withParameters(mapOf("c", "databiattgplucfotan", "ugswvx", "datahnykz")))
                                .withDescription("mzqwmvtxnjmxmcu")
                                .withParameters(mapOf("npdkv",
                                    new ParameterSpecification().withType(ParameterType.SECURE_STRING)
                                        .withDefaultValue("datavclx"),
                                    "uzphdugnei",
                                    new ParameterSpecification().withType(ParameterType.ARRAY)
                                        .withDefaultValue("databuiyji")))
                                .withAnnotations(Arrays.asList("datagox", "datajiuqhibtozi"))
                                .withAdditionalProperties(mapOf("type", "uxmmkjsvthnwp"))),
                        new LinkedServiceDebugResource().withName("octfjgtixrjvzuyt")
                            .withProperties(new LinkedService()
                                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("ahmnxhkxjqirw")
                                    .withParameters(mapOf("i", "dataooxf", "rsnewmozqvbubqma", "datahx", "taboidvmf",
                                        "datahsycxhxzgaz")))
                                .withDescription("ppu")
                                .withParameters(mapOf("juahokqto",
                                    new ParameterSpecification().withType(ParameterType.INT)
                                        .withDefaultValue("datapdfgkmtdherngbt")))
                                .withAnnotations(
                                    Arrays.asList("datauxofshfphwpnulai", "datawzejywhslw", "dataojpllndnpdwrpqaf"))
                                .withAdditionalProperties(mapOf("type", "efchn")))))
                .withStaging(new DataFlowStagingInfo()
                    .withLinkedService(
                        new LinkedServiceReference().withReferenceName("lmuowo").withParameters(mapOf("p", "datauir")))
                    .withFolderPath("datanszonwpngaj"))
                .withDebugSettings(new DataFlowDebugPackageDebugSettings()
                    .withSourceSettings(Arrays.asList(
                        new DataFlowSourceSetting().withSourceName("jawrtmjfjmyc")
                            .withRowLimit(837645611)
                            .withAdditionalProperties(mapOf()),
                        new DataFlowSourceSetting().withSourceName("jvidttge")
                            .withRowLimit(1531674368)
                            .withAdditionalProperties(mapOf())))
                    .withParameters(mapOf("cbuewmrswnjlxuz", "dataxu", "aqehg", "datahwpusxj", "tu", "datadohzjq"))
                    .withDatasetParameters("dataigebxncnwfepb"))
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(DataFlowDebugPackage.class);
        Assertions.assertEquals("kdk", model.sessionId());
        Assertions.assertEquals("ixtmkzjvkviirhgf", model.dataFlow().name());
        Assertions.assertEquals("xuckpggqoweyir", model.dataFlow().properties().description());
        Assertions.assertEquals("qxpxiwfcngjsaa", model.dataFlow().properties().folder().name());
        Assertions.assertEquals("mfcttux", model.dataFlows().get(0).name());
        Assertions.assertEquals("vzbglbyvi", model.dataFlows().get(0).properties().description());
        Assertions.assertEquals("gjkn", model.dataFlows().get(0).properties().folder().name());
        Assertions.assertEquals("qf", model.datasets().get(0).name());
        Assertions.assertEquals("njdxvglnkvxl", model.datasets().get(0).properties().description());
        Assertions.assertEquals("lvoniy", model.datasets().get(0).properties().linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT,
            model.datasets().get(0).properties().parameters().get("dhbemzqkzszu").type());
        Assertions.assertEquals("bodthsqqgvri", model.datasets().get(0).properties().folder().name());
        Assertions.assertEquals("gphuartvtiu", model.linkedServices().get(0).name());
        Assertions.assertEquals("ekov", model.linkedServices().get(0).properties().connectVia().referenceName());
        Assertions.assertEquals("mzqwmvtxnjmxmcu", model.linkedServices().get(0).properties().description());
        Assertions.assertEquals(ParameterType.SECURE_STRING,
            model.linkedServices().get(0).properties().parameters().get("npdkv").type());
        Assertions.assertEquals("lmuowo", model.staging().linkedService().referenceName());
        Assertions.assertEquals("jawrtmjfjmyc", model.debugSettings().sourceSettings().get(0).sourceName());
        Assertions.assertEquals(837645611, model.debugSettings().sourceSettings().get(0).rowLimit());
    }

    // Use "Map.of" if available
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
