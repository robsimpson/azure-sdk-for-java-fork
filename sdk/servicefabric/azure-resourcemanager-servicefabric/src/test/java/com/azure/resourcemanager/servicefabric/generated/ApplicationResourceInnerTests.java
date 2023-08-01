// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationResourceInner;
import com.azure.resourcemanager.servicefabric.models.ApplicationMetricDescription;
import com.azure.resourcemanager.servicefabric.models.ApplicationUpgradePolicy;
import com.azure.resourcemanager.servicefabric.models.ApplicationUserAssignedIdentity;
import com.azure.resourcemanager.servicefabric.models.ManagedIdentity;
import com.azure.resourcemanager.servicefabric.models.ManagedIdentityType;
import com.azure.resourcemanager.servicefabric.models.RollingUpgradeMode;
import com.azure.resourcemanager.servicefabric.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ApplicationResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationResourceInner model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"principalId\":\"zpwv\",\"tenantId\":\"dqgbiqylihkaetc\",\"type\":\"None\",\"userAssignedIdentities\":{\"cxerf\":{\"principalId\":\"vf\",\"clientId\":\"kymuctqhjfbebr\"},\"yq\":{\"principalId\":\"utttxfvjrbirp\",\"clientId\":\"epcyvahfnlj\"},\"yoxgvcltbgsnc\":{\"principalId\":\"vuujq\",\"clientId\":\"dokgjl\"},\"gx\":{\"principalId\":\"kjeszz\",\"clientId\":\"ijhtxf\"}}},\"properties\":{\"provisioningState\":\"mxnehmp\",\"typeName\":\"cxgod\",\"typeVersion\":\"fqkkr\",\"parameters\":{\"flz\":\"ukgri\",\"qzahmgkbrp\":\"fbxzpuzycisp\",\"hibnuqqkpika\":\"y\",\"buynhijggm\":\"rgvtqag\"},\"upgradePolicy\":{\"upgradeReplicaSetCheckTimeout\":\"siarbutrcvpn\",\"forceRestart\":true,\"upgradeMode\":\"UnmonitoredAuto\",\"recreateApplication\":false},\"minimumNodes\":4074617538772232959,\"maximumNodes\":79694980854382594,\"removeApplicationCapacity\":true,\"metrics\":[{\"name\":\"l\",\"maximumCapacity\":1322573122193945613,\"reservationCapacity\":8942368239178938465,\"totalApplicationCapacity\":3156305155033798302},{\"name\":\"enbtkcxywny\",\"maximumCapacity\":3938572142149816322,\"reservationCapacity\":3502767194143566423,\"totalApplicationCapacity\":531733013424860873},{\"name\":\"by\",\"maximumCapacity\":4347735401611848674,\"reservationCapacity\":1889476323954031642,\"totalApplicationCapacity\":8740719776623853829},{\"name\":\"babphlwrqlfk\",\"maximumCapacity\":4312008787205173543,\"reservationCapacity\":3711072422112516968,\"totalApplicationCapacity\":1275387452257923509}],\"managedIdentities\":[{\"name\":\"yazttbtwwrqpue\",\"principalId\":\"ckzywbiexzfeyue\"},{\"name\":\"xibxujwbhqwalm\",\"principalId\":\"zyoxaepdkzjan\"}]},\"location\":\"xrhdwbavxbniwdjs\",\"tags\":{\"bpg\":\"s\",\"fzab\":\"xytxhpzxbz\"},\"etag\":\"cuh\",\"id\":\"tcty\",\"name\":\"iklbbovpl\",\"type\":\"zbhvgyuguosv\"}")
                .toObject(ApplicationResourceInner.class);
        Assertions.assertEquals(ManagedIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("xrhdwbavxbniwdjs", model.location());
        Assertions.assertEquals("s", model.tags().get("bpg"));
        Assertions.assertEquals("cxgod", model.typeName());
        Assertions.assertEquals("fqkkr", model.typeVersion());
        Assertions.assertEquals("ukgri", model.parameters().get("flz"));
        Assertions.assertEquals("siarbutrcvpn", model.upgradePolicy().upgradeReplicaSetCheckTimeout());
        Assertions.assertEquals(true, model.upgradePolicy().forceRestart());
        Assertions.assertEquals(RollingUpgradeMode.UNMONITORED_AUTO, model.upgradePolicy().upgradeMode());
        Assertions.assertEquals(false, model.upgradePolicy().recreateApplication());
        Assertions.assertEquals(4074617538772232959L, model.minimumNodes());
        Assertions.assertEquals(79694980854382594L, model.maximumNodes());
        Assertions.assertEquals(true, model.removeApplicationCapacity());
        Assertions.assertEquals("l", model.metrics().get(0).name());
        Assertions.assertEquals(1322573122193945613L, model.metrics().get(0).maximumCapacity());
        Assertions.assertEquals(8942368239178938465L, model.metrics().get(0).reservationCapacity());
        Assertions.assertEquals(3156305155033798302L, model.metrics().get(0).totalApplicationCapacity());
        Assertions.assertEquals("yazttbtwwrqpue", model.managedIdentities().get(0).name());
        Assertions.assertEquals("ckzywbiexzfeyue", model.managedIdentities().get(0).principalId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationResourceInner model =
            new ApplicationResourceInner()
                .withIdentity(
                    new ManagedIdentity()
                        .withType(ManagedIdentityType.NONE)
                        .withUserAssignedIdentities(
                            mapOf(
                                "cxerf",
                                new UserAssignedIdentity(),
                                "yq",
                                new UserAssignedIdentity(),
                                "yoxgvcltbgsnc",
                                new UserAssignedIdentity(),
                                "gx",
                                new UserAssignedIdentity())))
                .withLocation("xrhdwbavxbniwdjs")
                .withTags(mapOf("bpg", "s", "fzab", "xytxhpzxbz"))
                .withTypeName("cxgod")
                .withTypeVersion("fqkkr")
                .withParameters(
                    mapOf("flz", "ukgri", "qzahmgkbrp", "fbxzpuzycisp", "hibnuqqkpika", "y", "buynhijggm", "rgvtqag"))
                .withUpgradePolicy(
                    new ApplicationUpgradePolicy()
                        .withUpgradeReplicaSetCheckTimeout("siarbutrcvpn")
                        .withForceRestart(true)
                        .withUpgradeMode(RollingUpgradeMode.UNMONITORED_AUTO)
                        .withRecreateApplication(false))
                .withMinimumNodes(4074617538772232959L)
                .withMaximumNodes(79694980854382594L)
                .withRemoveApplicationCapacity(true)
                .withMetrics(
                    Arrays
                        .asList(
                            new ApplicationMetricDescription()
                                .withName("l")
                                .withMaximumCapacity(1322573122193945613L)
                                .withReservationCapacity(8942368239178938465L)
                                .withTotalApplicationCapacity(3156305155033798302L),
                            new ApplicationMetricDescription()
                                .withName("enbtkcxywny")
                                .withMaximumCapacity(3938572142149816322L)
                                .withReservationCapacity(3502767194143566423L)
                                .withTotalApplicationCapacity(531733013424860873L),
                            new ApplicationMetricDescription()
                                .withName("by")
                                .withMaximumCapacity(4347735401611848674L)
                                .withReservationCapacity(1889476323954031642L)
                                .withTotalApplicationCapacity(8740719776623853829L),
                            new ApplicationMetricDescription()
                                .withName("babphlwrqlfk")
                                .withMaximumCapacity(4312008787205173543L)
                                .withReservationCapacity(3711072422112516968L)
                                .withTotalApplicationCapacity(1275387452257923509L)))
                .withManagedIdentities(
                    Arrays
                        .asList(
                            new ApplicationUserAssignedIdentity()
                                .withName("yazttbtwwrqpue")
                                .withPrincipalId("ckzywbiexzfeyue"),
                            new ApplicationUserAssignedIdentity()
                                .withName("xibxujwbhqwalm")
                                .withPrincipalId("zyoxaepdkzjan")));
        model = BinaryData.fromObject(model).toObject(ApplicationResourceInner.class);
        Assertions.assertEquals(ManagedIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("xrhdwbavxbniwdjs", model.location());
        Assertions.assertEquals("s", model.tags().get("bpg"));
        Assertions.assertEquals("cxgod", model.typeName());
        Assertions.assertEquals("fqkkr", model.typeVersion());
        Assertions.assertEquals("ukgri", model.parameters().get("flz"));
        Assertions.assertEquals("siarbutrcvpn", model.upgradePolicy().upgradeReplicaSetCheckTimeout());
        Assertions.assertEquals(true, model.upgradePolicy().forceRestart());
        Assertions.assertEquals(RollingUpgradeMode.UNMONITORED_AUTO, model.upgradePolicy().upgradeMode());
        Assertions.assertEquals(false, model.upgradePolicy().recreateApplication());
        Assertions.assertEquals(4074617538772232959L, model.minimumNodes());
        Assertions.assertEquals(79694980854382594L, model.maximumNodes());
        Assertions.assertEquals(true, model.removeApplicationCapacity());
        Assertions.assertEquals("l", model.metrics().get(0).name());
        Assertions.assertEquals(1322573122193945613L, model.metrics().get(0).maximumCapacity());
        Assertions.assertEquals(8942368239178938465L, model.metrics().get(0).reservationCapacity());
        Assertions.assertEquals(3156305155033798302L, model.metrics().get(0).totalApplicationCapacity());
        Assertions.assertEquals("yazttbtwwrqpue", model.managedIdentities().get(0).name());
        Assertions.assertEquals("ckzywbiexzfeyue", model.managedIdentities().get(0).principalId());
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
