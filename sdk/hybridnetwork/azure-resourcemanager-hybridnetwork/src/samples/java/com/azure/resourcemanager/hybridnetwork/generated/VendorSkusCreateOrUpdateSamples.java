// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.hybridnetwork.models.CustomProfile;
import com.azure.resourcemanager.hybridnetwork.models.DataDisk;
import com.azure.resourcemanager.hybridnetwork.models.DiskCreateOptionTypes;
import com.azure.resourcemanager.hybridnetwork.models.ImageReference;
import com.azure.resourcemanager.hybridnetwork.models.IpAllocationMethod;
import com.azure.resourcemanager.hybridnetwork.models.IpVersion;
import com.azure.resourcemanager.hybridnetwork.models.LinuxConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionRoleConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionRoleConfigurationType;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionTemplate;
import com.azure.resourcemanager.hybridnetwork.models.NetworkInterface;
import com.azure.resourcemanager.hybridnetwork.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.OperatingSystemTypes;
import com.azure.resourcemanager.hybridnetwork.models.OsDisk;
import com.azure.resourcemanager.hybridnetwork.models.OsProfile;
import com.azure.resourcemanager.hybridnetwork.models.SkuDeploymentMode;
import com.azure.resourcemanager.hybridnetwork.models.SshConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.SshPublicKey;
import com.azure.resourcemanager.hybridnetwork.models.StorageProfile;
import com.azure.resourcemanager.hybridnetwork.models.VMSwitchType;
import com.azure.resourcemanager.hybridnetwork.models.VirtualHardDisk;
import com.azure.resourcemanager.hybridnetwork.models.VirtualMachineSizeTypes;
import java.io.IOException;
import java.util.Arrays;

/** Samples for VendorSkus CreateOrUpdate. */
public final class VendorSkusCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2021-05-01/examples/VendorSkuCreate.json
     */
    /**
     * Sample code: Create or update the sku of vendor resource.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void createOrUpdateTheSkuOfVendorResource(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) throws IOException {
        manager
            .vendorSkus()
            .define("TestSku")
            .withExistingVendor("TestVendor")
            .withDeploymentMode(SkuDeploymentMode.PRIVATE_EDGE_ZONE)
            .withPreview(true)
            .withManagedApplicationTemplate(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON))
            .withNetworkFunctionTemplate(
                new NetworkFunctionTemplate()
                    .withNetworkFunctionRoleConfigurations(
                        Arrays
                            .asList(
                                new NetworkFunctionRoleConfiguration()
                                    .withRoleName("test")
                                    .withRoleType(NetworkFunctionRoleConfigurationType.VIRTUAL_MACHINE)
                                    .withVirtualMachineSize(VirtualMachineSizeTypes.STANDARD_D3_V2)
                                    .withOsProfile(
                                        new OsProfile()
                                            .withAdminUsername("dummyuser")
                                            .withLinuxConfiguration(
                                                new LinuxConfiguration()
                                                    .withSsh(
                                                        new SshConfiguration()
                                                            .withPublicKeys(
                                                                Arrays
                                                                    .asList(
                                                                        new SshPublicKey()
                                                                            .withPath("home/user/.ssh/authorized_keys")
                                                                            .withKeyData(
                                                                                "ssh-rsa"
                                                                                    + " AAAAB3NzaC1yc2EAAAABIwAAAgEAwrr66r8n6B8Y0zMF3dOpXEapIQD9DiYQ6D6/zwor9o39jSkHNiMMER/GETBbzP83LOcekm02aRjo55ArO7gPPVvCXbrirJu9pkm4AC4BBre5xSLS="
                                                                                    + " user@constoso-DSH")))))
                                            .withCustomData("base-64 encoded string of custom data"))
                                    .withNetworkInterfaces(
                                        Arrays
                                            .asList(
                                                new NetworkInterface()
                                                    .withNetworkInterfaceName("nic1")
                                                    .withMacAddress("")
                                                    .withIpConfigurations(
                                                        Arrays
                                                            .asList(
                                                                new NetworkInterfaceIpConfiguration()
                                                                    .withIpAllocationMethod(IpAllocationMethod.DYNAMIC)
                                                                    .withIpAddress("")
                                                                    .withSubnet("")
                                                                    .withGateway("")
                                                                    .withIpVersion(IpVersion.IPV4)))
                                                    .withVmSwitchType(VMSwitchType.WAN),
                                                new NetworkInterface()
                                                    .withNetworkInterfaceName("nic2")
                                                    .withMacAddress("")
                                                    .withIpConfigurations(
                                                        Arrays
                                                            .asList(
                                                                new NetworkInterfaceIpConfiguration()
                                                                    .withIpAllocationMethod(IpAllocationMethod.DYNAMIC)
                                                                    .withIpAddress("")
                                                                    .withSubnet("")
                                                                    .withGateway("")
                                                                    .withIpVersion(IpVersion.IPV4)))
                                                    .withVmSwitchType(VMSwitchType.MANAGEMENT)))
                                    .withStorageProfile(
                                        new StorageProfile()
                                            .withImageReference(
                                                new ImageReference()
                                                    .withPublisher("Canonical")
                                                    .withOffer("UbuntuServer")
                                                    .withSku("18.04-LTS")
                                                    .withVersion("18.04.201804262"))
                                            .withOsDisk(
                                                new OsDisk()
                                                    .withOsType(OperatingSystemTypes.LINUX)
                                                    .withName("vhdName")
                                                    .withVhd(
                                                        new VirtualHardDisk()
                                                            .withUri(
                                                                "https://contoso.net/link/vnd.vhd?sp=rl&st=2020-10-08T20:38:19Z&se=2020-12-09T19:38:00Z&sv=2019-12-12&sr=b&sig=7BM2f4yOw%3D"))
                                                    .withDiskSizeGB(30))
                                            .withDataDisks(
                                                Arrays
                                                    .asList(
                                                        new DataDisk()
                                                            .withCreateOption(DiskCreateOptionTypes.EMPTY)
                                                            .withName("DataDisk1")
                                                            .withDiskSizeGB(10))))
                                    .withCustomProfile(
                                        new CustomProfile().withMetadataConfigurationPath("/var/logs/network.cfg")))))
            .create();
    }
}
