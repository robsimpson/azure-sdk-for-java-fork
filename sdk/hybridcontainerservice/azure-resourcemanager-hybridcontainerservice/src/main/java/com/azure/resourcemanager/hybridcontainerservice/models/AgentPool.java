// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.AgentPoolInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of AgentPool. */
public interface AgentPool {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the extendedLocation property: The extendedLocation property.
     *
     * @return the extendedLocation value.
     */
    AgentPoolExtendedLocation extendedLocation();

    /**
     * Gets the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    AgentPoolProvisioningState provisioningState();

    /**
     * Gets the status property: HybridAKSNodePoolStatus defines the observed state of HybridAKSNodePool.
     *
     * @return the status value.
     */
    AgentPoolProvisioningStatusStatus status();

    /**
     * Gets the count property: Count - Number of agents to host docker containers. Allowed values must be in the range
     * of 1 to 100 (inclusive). The default value is 1.
     *
     * @return the count value.
     */
    Integer count();

    /**
     * Gets the availabilityZones property: AvailabilityZones - The list of Availability zones to use for nodes.
     * Datacenter racks modelled as zones.
     *
     * @return the availabilityZones value.
     */
    List<String> availabilityZones();

    /**
     * Gets the maxCount property: The maximum number of nodes for auto-scaling.
     *
     * @return the maxCount value.
     */
    Integer maxCount();

    /**
     * Gets the maxPods property: The maximum number of pods that can run on a node.
     *
     * @return the maxPods value.
     */
    Integer maxPods();

    /**
     * Gets the minCount property: The minimum number of nodes for auto-scaling.
     *
     * @return the minCount value.
     */
    Integer minCount();

    /**
     * Gets the mode property: Mode - AgentPoolMode represents mode of an agent pool. Possible values include: 'System',
     * 'LB', 'User'. Default is 'User'.
     *
     * @return the mode value.
     */
    Mode mode();

    /**
     * Gets the nodeLabels property: NodeLabels - Agent pool node labels to be persisted across all nodes in agent pool.
     *
     * @return the nodeLabels value.
     */
    Map<String, String> nodeLabels();

    /**
     * Gets the nodeTaints property: NodeTaints - Taints added to new nodes during node pool create and scale. For
     * example, key=value:NoSchedule.
     *
     * @return the nodeTaints value.
     */
    List<String> nodeTaints();

    /**
     * Gets the osType property: OsType - OsType to be used to specify os type. Choose from Linux and Windows. Default
     * to Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @return the osType value.
     */
    OsType osType();

    /**
     * Gets the nodeImageVersion property: The version of node image.
     *
     * @return the nodeImageVersion value.
     */
    String nodeImageVersion();

    /**
     * Gets the vmSize property: VmSize - The size of the agent pool VMs.
     *
     * @return the vmSize value.
     */
    String vmSize();

    /**
     * Gets the cloudProviderProfile property: The underlying cloud infra provider properties.
     *
     * @return the cloudProviderProfile value.
     */
    CloudProviderProfile cloudProviderProfile();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.hybridcontainerservice.fluent.models.AgentPoolInner object.
     *
     * @return the inner object.
     */
    AgentPoolInner innerModel();

    /** The entirety of the AgentPool definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The AgentPool definition stages. */
    interface DefinitionStages {
        /** The first stage of the AgentPool definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AgentPool definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the AgentPool definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param resourceName Parameter for the name of the provisioned cluster.
             * @return the next definition stage.
             */
            WithCreate withExistingProvisionedCluster(String resourceGroupName, String resourceName);
        }
        /**
         * The stage of the AgentPool definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithExtendedLocation,
                DefinitionStages.WithStatus,
                DefinitionStages.WithCount,
                DefinitionStages.WithAvailabilityZones,
                DefinitionStages.WithMaxCount,
                DefinitionStages.WithMaxPods,
                DefinitionStages.WithMinCount,
                DefinitionStages.WithMode,
                DefinitionStages.WithNodeLabels,
                DefinitionStages.WithNodeTaints,
                DefinitionStages.WithOsType,
                DefinitionStages.WithNodeImageVersion,
                DefinitionStages.WithVmSize,
                DefinitionStages.WithCloudProviderProfile {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AgentPool create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AgentPool create(Context context);
        }
        /** The stage of the AgentPool definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AgentPool definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extendedLocation property..
             *
             * @param extendedLocation The extendedLocation property.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(AgentPoolExtendedLocation extendedLocation);
        }
        /** The stage of the AgentPool definition allowing to specify status. */
        interface WithStatus {
            /**
             * Specifies the status property: HybridAKSNodePoolStatus defines the observed state of HybridAKSNodePool.
             *
             * @param status HybridAKSNodePoolStatus defines the observed state of HybridAKSNodePool.
             * @return the next definition stage.
             */
            WithCreate withStatus(AgentPoolProvisioningStatusStatus status);
        }
        /** The stage of the AgentPool definition allowing to specify count. */
        interface WithCount {
            /**
             * Specifies the count property: Count - Number of agents to host docker containers. Allowed values must be
             * in the range of 1 to 100 (inclusive). The default value is 1..
             *
             * @param count Count - Number of agents to host docker containers. Allowed values must be in the range of 1
             *     to 100 (inclusive). The default value is 1.
             * @return the next definition stage.
             */
            WithCreate withCount(Integer count);
        }
        /** The stage of the AgentPool definition allowing to specify availabilityZones. */
        interface WithAvailabilityZones {
            /**
             * Specifies the availabilityZones property: AvailabilityZones - The list of Availability zones to use for
             * nodes. Datacenter racks modelled as zones.
             *
             * @param availabilityZones AvailabilityZones - The list of Availability zones to use for nodes. Datacenter
             *     racks modelled as zones.
             * @return the next definition stage.
             */
            WithCreate withAvailabilityZones(List<String> availabilityZones);
        }
        /** The stage of the AgentPool definition allowing to specify maxCount. */
        interface WithMaxCount {
            /**
             * Specifies the maxCount property: The maximum number of nodes for auto-scaling.
             *
             * @param maxCount The maximum number of nodes for auto-scaling.
             * @return the next definition stage.
             */
            WithCreate withMaxCount(Integer maxCount);
        }
        /** The stage of the AgentPool definition allowing to specify maxPods. */
        interface WithMaxPods {
            /**
             * Specifies the maxPods property: The maximum number of pods that can run on a node..
             *
             * @param maxPods The maximum number of pods that can run on a node.
             * @return the next definition stage.
             */
            WithCreate withMaxPods(Integer maxPods);
        }
        /** The stage of the AgentPool definition allowing to specify minCount. */
        interface WithMinCount {
            /**
             * Specifies the minCount property: The minimum number of nodes for auto-scaling.
             *
             * @param minCount The minimum number of nodes for auto-scaling.
             * @return the next definition stage.
             */
            WithCreate withMinCount(Integer minCount);
        }
        /** The stage of the AgentPool definition allowing to specify mode. */
        interface WithMode {
            /**
             * Specifies the mode property: Mode - AgentPoolMode represents mode of an agent pool. Possible values
             * include: 'System', 'LB', 'User'. Default is 'User'.
             *
             * @param mode Mode - AgentPoolMode represents mode of an agent pool. Possible values include: 'System',
             *     'LB', 'User'. Default is 'User'.
             * @return the next definition stage.
             */
            WithCreate withMode(Mode mode);
        }
        /** The stage of the AgentPool definition allowing to specify nodeLabels. */
        interface WithNodeLabels {
            /**
             * Specifies the nodeLabels property: NodeLabels - Agent pool node labels to be persisted across all nodes
             * in agent pool..
             *
             * @param nodeLabels NodeLabels - Agent pool node labels to be persisted across all nodes in agent pool.
             * @return the next definition stage.
             */
            WithCreate withNodeLabels(Map<String, String> nodeLabels);
        }
        /** The stage of the AgentPool definition allowing to specify nodeTaints. */
        interface WithNodeTaints {
            /**
             * Specifies the nodeTaints property: NodeTaints - Taints added to new nodes during node pool create and
             * scale. For example, key=value:NoSchedule..
             *
             * @param nodeTaints NodeTaints - Taints added to new nodes during node pool create and scale. For example,
             *     key=value:NoSchedule.
             * @return the next definition stage.
             */
            WithCreate withNodeTaints(List<String> nodeTaints);
        }
        /** The stage of the AgentPool definition allowing to specify osType. */
        interface WithOsType {
            /**
             * Specifies the osType property: OsType - OsType to be used to specify os type. Choose from Linux and
             * Windows. Default to Linux. Possible values include: 'Linux', 'Windows'.
             *
             * @param osType OsType - OsType to be used to specify os type. Choose from Linux and Windows. Default to
             *     Linux. Possible values include: 'Linux', 'Windows'.
             * @return the next definition stage.
             */
            WithCreate withOsType(OsType osType);
        }
        /** The stage of the AgentPool definition allowing to specify nodeImageVersion. */
        interface WithNodeImageVersion {
            /**
             * Specifies the nodeImageVersion property: The version of node image.
             *
             * @param nodeImageVersion The version of node image.
             * @return the next definition stage.
             */
            WithCreate withNodeImageVersion(String nodeImageVersion);
        }
        /** The stage of the AgentPool definition allowing to specify vmSize. */
        interface WithVmSize {
            /**
             * Specifies the vmSize property: VmSize - The size of the agent pool VMs..
             *
             * @param vmSize VmSize - The size of the agent pool VMs.
             * @return the next definition stage.
             */
            WithCreate withVmSize(String vmSize);
        }
        /** The stage of the AgentPool definition allowing to specify cloudProviderProfile. */
        interface WithCloudProviderProfile {
            /**
             * Specifies the cloudProviderProfile property: The underlying cloud infra provider properties..
             *
             * @param cloudProviderProfile The underlying cloud infra provider properties.
             * @return the next definition stage.
             */
            WithCreate withCloudProviderProfile(CloudProviderProfile cloudProviderProfile);
        }
    }
    /**
     * Begins update for the AgentPool resource.
     *
     * @return the stage of resource update.
     */
    AgentPool.Update update();

    /** The template for AgentPool update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithExtendedLocation,
            UpdateStages.WithStatus,
            UpdateStages.WithCount,
            UpdateStages.WithAvailabilityZones,
            UpdateStages.WithMaxCount,
            UpdateStages.WithMaxPods,
            UpdateStages.WithMinCount,
            UpdateStages.WithMode,
            UpdateStages.WithNodeLabels,
            UpdateStages.WithNodeTaints,
            UpdateStages.WithOsType,
            UpdateStages.WithNodeImageVersion,
            UpdateStages.WithVmSize,
            UpdateStages.WithCloudProviderProfile {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AgentPool apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AgentPool apply(Context context);
    }
    /** The AgentPool update stages. */
    interface UpdateStages {
        /** The stage of the AgentPool update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the AgentPool update allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extendedLocation property..
             *
             * @param extendedLocation The extendedLocation property.
             * @return the next definition stage.
             */
            Update withExtendedLocation(AgentPoolExtendedLocation extendedLocation);
        }
        /** The stage of the AgentPool update allowing to specify status. */
        interface WithStatus {
            /**
             * Specifies the status property: HybridAKSNodePoolStatus defines the observed state of HybridAKSNodePool.
             *
             * @param status HybridAKSNodePoolStatus defines the observed state of HybridAKSNodePool.
             * @return the next definition stage.
             */
            Update withStatus(AgentPoolProvisioningStatusStatus status);
        }
        /** The stage of the AgentPool update allowing to specify count. */
        interface WithCount {
            /**
             * Specifies the count property: Count - Number of agents to host docker containers. Allowed values must be
             * in the range of 1 to 100 (inclusive). The default value is 1..
             *
             * @param count Count - Number of agents to host docker containers. Allowed values must be in the range of 1
             *     to 100 (inclusive). The default value is 1.
             * @return the next definition stage.
             */
            Update withCount(Integer count);
        }
        /** The stage of the AgentPool update allowing to specify availabilityZones. */
        interface WithAvailabilityZones {
            /**
             * Specifies the availabilityZones property: AvailabilityZones - The list of Availability zones to use for
             * nodes. Datacenter racks modelled as zones.
             *
             * @param availabilityZones AvailabilityZones - The list of Availability zones to use for nodes. Datacenter
             *     racks modelled as zones.
             * @return the next definition stage.
             */
            Update withAvailabilityZones(List<String> availabilityZones);
        }
        /** The stage of the AgentPool update allowing to specify maxCount. */
        interface WithMaxCount {
            /**
             * Specifies the maxCount property: The maximum number of nodes for auto-scaling.
             *
             * @param maxCount The maximum number of nodes for auto-scaling.
             * @return the next definition stage.
             */
            Update withMaxCount(Integer maxCount);
        }
        /** The stage of the AgentPool update allowing to specify maxPods. */
        interface WithMaxPods {
            /**
             * Specifies the maxPods property: The maximum number of pods that can run on a node..
             *
             * @param maxPods The maximum number of pods that can run on a node.
             * @return the next definition stage.
             */
            Update withMaxPods(Integer maxPods);
        }
        /** The stage of the AgentPool update allowing to specify minCount. */
        interface WithMinCount {
            /**
             * Specifies the minCount property: The minimum number of nodes for auto-scaling.
             *
             * @param minCount The minimum number of nodes for auto-scaling.
             * @return the next definition stage.
             */
            Update withMinCount(Integer minCount);
        }
        /** The stage of the AgentPool update allowing to specify mode. */
        interface WithMode {
            /**
             * Specifies the mode property: Mode - AgentPoolMode represents mode of an agent pool. Possible values
             * include: 'System', 'LB', 'User'. Default is 'User'.
             *
             * @param mode Mode - AgentPoolMode represents mode of an agent pool. Possible values include: 'System',
             *     'LB', 'User'. Default is 'User'.
             * @return the next definition stage.
             */
            Update withMode(Mode mode);
        }
        /** The stage of the AgentPool update allowing to specify nodeLabels. */
        interface WithNodeLabels {
            /**
             * Specifies the nodeLabels property: NodeLabels - Agent pool node labels to be persisted across all nodes
             * in agent pool..
             *
             * @param nodeLabels NodeLabels - Agent pool node labels to be persisted across all nodes in agent pool.
             * @return the next definition stage.
             */
            Update withNodeLabels(Map<String, String> nodeLabels);
        }
        /** The stage of the AgentPool update allowing to specify nodeTaints. */
        interface WithNodeTaints {
            /**
             * Specifies the nodeTaints property: NodeTaints - Taints added to new nodes during node pool create and
             * scale. For example, key=value:NoSchedule..
             *
             * @param nodeTaints NodeTaints - Taints added to new nodes during node pool create and scale. For example,
             *     key=value:NoSchedule.
             * @return the next definition stage.
             */
            Update withNodeTaints(List<String> nodeTaints);
        }
        /** The stage of the AgentPool update allowing to specify osType. */
        interface WithOsType {
            /**
             * Specifies the osType property: OsType - OsType to be used to specify os type. Choose from Linux and
             * Windows. Default to Linux. Possible values include: 'Linux', 'Windows'.
             *
             * @param osType OsType - OsType to be used to specify os type. Choose from Linux and Windows. Default to
             *     Linux. Possible values include: 'Linux', 'Windows'.
             * @return the next definition stage.
             */
            Update withOsType(OsType osType);
        }
        /** The stage of the AgentPool update allowing to specify nodeImageVersion. */
        interface WithNodeImageVersion {
            /**
             * Specifies the nodeImageVersion property: The version of node image.
             *
             * @param nodeImageVersion The version of node image.
             * @return the next definition stage.
             */
            Update withNodeImageVersion(String nodeImageVersion);
        }
        /** The stage of the AgentPool update allowing to specify vmSize. */
        interface WithVmSize {
            /**
             * Specifies the vmSize property: VmSize - The size of the agent pool VMs..
             *
             * @param vmSize VmSize - The size of the agent pool VMs.
             * @return the next definition stage.
             */
            Update withVmSize(String vmSize);
        }
        /** The stage of the AgentPool update allowing to specify cloudProviderProfile. */
        interface WithCloudProviderProfile {
            /**
             * Specifies the cloudProviderProfile property: The underlying cloud infra provider properties..
             *
             * @param cloudProviderProfile The underlying cloud infra provider properties.
             * @return the next definition stage.
             */
            Update withCloudProviderProfile(CloudProviderProfile cloudProviderProfile);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AgentPool refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AgentPool refresh(Context context);
}
