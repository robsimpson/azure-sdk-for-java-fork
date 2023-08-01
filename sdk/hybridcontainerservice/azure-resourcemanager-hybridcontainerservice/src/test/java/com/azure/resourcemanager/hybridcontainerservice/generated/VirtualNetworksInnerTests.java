// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.VirtualNetworksInner;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksPropertiesInfraVnetProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksPropertiesVipPoolItem;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksPropertiesVmipPoolItem;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VirtualNetworksInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworksInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"infraVnetProfile\":{},\"vipPool\":[{\"endIP\":\"euzsoi\",\"startIP\":\"ud\"},{\"endIP\":\"rx\",\"startIP\":\"thzvaytdwkqbrqu\"},{\"endIP\":\"axhexiilivp\",\"startIP\":\"iirqtd\"}],\"vmipPool\":[{\"endIP\":\"oruzfgsquyfxrxx\",\"startIP\":\"ptramxj\"},{\"endIP\":\"wlwnwxuqlcv\",\"startIP\":\"ypatdooaojkniod\"},{\"endIP\":\"oebwnujhemms\",\"startIP\":\"dkcrodt\"}],\"dhcpServers\":[\"fw\",\"lfltka\",\"jvefkdlfoakggkfp\",\"gaowpulpqblylsyx\"],\"dnsServers\":[\"nsj\",\"r\",\"tiagx\",\"dszue\"],\"gateway\":\"sbzkf\",\"ipAddressPrefix\":\"eyvpnqicvinvkj\",\"vlanID\":\"dxrbuukzcle\",\"provisioningState\":\"Updating\",\"status\":{}},\"extendedLocation\":{\"type\":\"ztzp\",\"name\":\"ncckw\"},\"location\":\"fz\",\"tags\":{\"xzfe\":\"xxbuyq\"},\"id\":\"ztppriolxorjalto\",\"name\":\"mncwsobqwcsdb\",\"type\":\"wdcfhucqdpfuv\"}")
                .toObject(VirtualNetworksInner.class);
        Assertions.assertEquals("fz", model.location());
        Assertions.assertEquals("xxbuyq", model.tags().get("xzfe"));
        Assertions.assertEquals("euzsoi", model.properties().vipPool().get(0).endIp());
        Assertions.assertEquals("ud", model.properties().vipPool().get(0).startIp());
        Assertions.assertEquals("oruzfgsquyfxrxx", model.properties().vmipPool().get(0).endIp());
        Assertions.assertEquals("ptramxj", model.properties().vmipPool().get(0).startIp());
        Assertions.assertEquals("nsj", model.properties().dnsServers().get(0));
        Assertions.assertEquals("sbzkf", model.properties().gateway());
        Assertions.assertEquals("eyvpnqicvinvkj", model.properties().ipAddressPrefix());
        Assertions.assertEquals("ztzp", model.extendedLocation().type());
        Assertions.assertEquals("ncckw", model.extendedLocation().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworksInner model =
            new VirtualNetworksInner()
                .withLocation("fz")
                .withTags(mapOf("xzfe", "xxbuyq"))
                .withProperties(
                    new VirtualNetworksProperties()
                        .withInfraVnetProfile(new VirtualNetworksPropertiesInfraVnetProfile())
                        .withVipPool(
                            Arrays
                                .asList(
                                    new VirtualNetworksPropertiesVipPoolItem().withEndIp("euzsoi").withStartIp("ud"),
                                    new VirtualNetworksPropertiesVipPoolItem()
                                        .withEndIp("rx")
                                        .withStartIp("thzvaytdwkqbrqu"),
                                    new VirtualNetworksPropertiesVipPoolItem()
                                        .withEndIp("axhexiilivp")
                                        .withStartIp("iirqtd")))
                        .withVmipPool(
                            Arrays
                                .asList(
                                    new VirtualNetworksPropertiesVmipPoolItem()
                                        .withEndIp("oruzfgsquyfxrxx")
                                        .withStartIp("ptramxj"),
                                    new VirtualNetworksPropertiesVmipPoolItem()
                                        .withEndIp("wlwnwxuqlcv")
                                        .withStartIp("ypatdooaojkniod"),
                                    new VirtualNetworksPropertiesVmipPoolItem()
                                        .withEndIp("oebwnujhemms")
                                        .withStartIp("dkcrodt")))
                        .withDnsServers(Arrays.asList("nsj", "r", "tiagx", "dszue"))
                        .withGateway("sbzkf")
                        .withIpAddressPrefix("eyvpnqicvinvkj"))
                .withExtendedLocation(new VirtualNetworksExtendedLocation().withType("ztzp").withName("ncckw"));
        model = BinaryData.fromObject(model).toObject(VirtualNetworksInner.class);
        Assertions.assertEquals("fz", model.location());
        Assertions.assertEquals("xxbuyq", model.tags().get("xzfe"));
        Assertions.assertEquals("euzsoi", model.properties().vipPool().get(0).endIp());
        Assertions.assertEquals("ud", model.properties().vipPool().get(0).startIp());
        Assertions.assertEquals("oruzfgsquyfxrxx", model.properties().vmipPool().get(0).endIp());
        Assertions.assertEquals("ptramxj", model.properties().vmipPool().get(0).startIp());
        Assertions.assertEquals("nsj", model.properties().dnsServers().get(0));
        Assertions.assertEquals("sbzkf", model.properties().gateway());
        Assertions.assertEquals("eyvpnqicvinvkj", model.properties().ipAddressPrefix());
        Assertions.assertEquals("ztzp", model.extendedLocation().type());
        Assertions.assertEquals("ncckw", model.extendedLocation().name());
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
