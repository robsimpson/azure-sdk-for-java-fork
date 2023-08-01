// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkTapRuleInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of NetworkTapRule. */
public interface NetworkTapRule {
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
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the networkTapId property: The ARM resource Id of the NetworkTap.
     *
     * @return the networkTapId value.
     */
    String networkTapId();

    /**
     * Gets the pollingIntervalInSeconds property: Polling interval in seconds.
     *
     * @return the pollingIntervalInSeconds value.
     */
    PollingIntervalInSeconds pollingIntervalInSeconds();

    /**
     * Gets the lastSyncedTime property: The last sync timestamp.
     *
     * @return the lastSyncedTime value.
     */
    OffsetDateTime lastSyncedTime();

    /**
     * Gets the configurationState property: Configuration state of the resource.
     *
     * @return the configurationState value.
     */
    ConfigurationState configurationState();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the administrativeState property: Administrative state of the resource.
     *
     * @return the administrativeState value.
     */
    AdministrativeState administrativeState();

    /**
     * Gets the configurationType property: Input method to configure Network Tap Rule.
     *
     * @return the configurationType value.
     */
    ConfigurationType configurationType();

    /**
     * Gets the tapRulesUrl property: Network Tap Rules file URL.
     *
     * @return the tapRulesUrl value.
     */
    String tapRulesUrl();

    /**
     * Gets the matchConfigurations property: List of match configurations.
     *
     * @return the matchConfigurations value.
     */
    List<NetworkTapRuleMatchConfiguration> matchConfigurations();

    /**
     * Gets the dynamicMatchConfigurations property: List of dynamic match configurations.
     *
     * @return the dynamicMatchConfigurations value.
     */
    List<CommonDynamicMatchConfiguration> dynamicMatchConfigurations();

    /**
     * Gets the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    String annotation();

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
     * Gets the inner com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkTapRuleInner object.
     *
     * @return the inner object.
     */
    NetworkTapRuleInner innerModel();

    /** The entirety of the NetworkTapRule definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }

    /** The NetworkTapRule definition stages. */
    interface DefinitionStages {
        /** The first stage of the NetworkTapRule definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the NetworkTapRule definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /** The stage of the NetworkTapRule definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the NetworkTapRule definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithPollingIntervalInSeconds,
                DefinitionStages.WithConfigurationType,
                DefinitionStages.WithTapRulesUrl,
                DefinitionStages.WithMatchConfigurations,
                DefinitionStages.WithDynamicMatchConfigurations,
                DefinitionStages.WithAnnotation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NetworkTapRule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkTapRule create(Context context);
        }

        /** The stage of the NetworkTapRule definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the NetworkTapRule definition allowing to specify pollingIntervalInSeconds. */
        interface WithPollingIntervalInSeconds {
            /**
             * Specifies the pollingIntervalInSeconds property: Polling interval in seconds..
             *
             * @param pollingIntervalInSeconds Polling interval in seconds.
             * @return the next definition stage.
             */
            WithCreate withPollingIntervalInSeconds(PollingIntervalInSeconds pollingIntervalInSeconds);
        }

        /** The stage of the NetworkTapRule definition allowing to specify configurationType. */
        interface WithConfigurationType {
            /**
             * Specifies the configurationType property: Input method to configure Network Tap Rule..
             *
             * @param configurationType Input method to configure Network Tap Rule.
             * @return the next definition stage.
             */
            WithCreate withConfigurationType(ConfigurationType configurationType);
        }

        /** The stage of the NetworkTapRule definition allowing to specify tapRulesUrl. */
        interface WithTapRulesUrl {
            /**
             * Specifies the tapRulesUrl property: Network Tap Rules file URL..
             *
             * @param tapRulesUrl Network Tap Rules file URL.
             * @return the next definition stage.
             */
            WithCreate withTapRulesUrl(String tapRulesUrl);
        }

        /** The stage of the NetworkTapRule definition allowing to specify matchConfigurations. */
        interface WithMatchConfigurations {
            /**
             * Specifies the matchConfigurations property: List of match configurations..
             *
             * @param matchConfigurations List of match configurations.
             * @return the next definition stage.
             */
            WithCreate withMatchConfigurations(List<NetworkTapRuleMatchConfiguration> matchConfigurations);
        }

        /** The stage of the NetworkTapRule definition allowing to specify dynamicMatchConfigurations. */
        interface WithDynamicMatchConfigurations {
            /**
             * Specifies the dynamicMatchConfigurations property: List of dynamic match configurations..
             *
             * @param dynamicMatchConfigurations List of dynamic match configurations.
             * @return the next definition stage.
             */
            WithCreate withDynamicMatchConfigurations(List<CommonDynamicMatchConfiguration> dynamicMatchConfigurations);
        }

        /** The stage of the NetworkTapRule definition allowing to specify annotation. */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             *
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            WithCreate withAnnotation(String annotation);
        }
    }

    /**
     * Begins update for the NetworkTapRule resource.
     *
     * @return the stage of resource update.
     */
    NetworkTapRule.Update update();

    /** The template for NetworkTapRule update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithConfigurationType,
            UpdateStages.WithTapRulesUrl,
            UpdateStages.WithMatchConfigurations,
            UpdateStages.WithDynamicMatchConfigurations,
            UpdateStages.WithAnnotation {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NetworkTapRule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkTapRule apply(Context context);
    }

    /** The NetworkTapRule update stages. */
    interface UpdateStages {
        /** The stage of the NetworkTapRule update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the NetworkTapRule update allowing to specify configurationType. */
        interface WithConfigurationType {
            /**
             * Specifies the configurationType property: Input method to configure Network Tap Rule..
             *
             * @param configurationType Input method to configure Network Tap Rule.
             * @return the next definition stage.
             */
            Update withConfigurationType(ConfigurationType configurationType);
        }

        /** The stage of the NetworkTapRule update allowing to specify tapRulesUrl. */
        interface WithTapRulesUrl {
            /**
             * Specifies the tapRulesUrl property: Network Tap Rules file URL..
             *
             * @param tapRulesUrl Network Tap Rules file URL.
             * @return the next definition stage.
             */
            Update withTapRulesUrl(String tapRulesUrl);
        }

        /** The stage of the NetworkTapRule update allowing to specify matchConfigurations. */
        interface WithMatchConfigurations {
            /**
             * Specifies the matchConfigurations property: List of match configurations..
             *
             * @param matchConfigurations List of match configurations.
             * @return the next definition stage.
             */
            Update withMatchConfigurations(List<NetworkTapRuleMatchConfiguration> matchConfigurations);
        }

        /** The stage of the NetworkTapRule update allowing to specify dynamicMatchConfigurations. */
        interface WithDynamicMatchConfigurations {
            /**
             * Specifies the dynamicMatchConfigurations property: List of dynamic match configurations..
             *
             * @param dynamicMatchConfigurations List of dynamic match configurations.
             * @return the next definition stage.
             */
            Update withDynamicMatchConfigurations(List<CommonDynamicMatchConfiguration> dynamicMatchConfigurations);
        }

        /** The stage of the NetworkTapRule update allowing to specify annotation. */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             *
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            Update withAnnotation(String annotation);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    NetworkTapRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkTapRule refresh(Context context);

    /**
     * Updates administrative state of Network Tap Rules.
     *
     * <p>Implements the operation to the underlying resources.
     *
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate updateAdministrativeState(UpdateAdministrativeState body);

    /**
     * Updates administrative state of Network Tap Rules.
     *
     * <p>Implements the operation to the underlying resources.
     *
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate updateAdministrativeState(UpdateAdministrativeState body, Context context);

    /**
     * Resync the Network Tap Rule.
     *
     * <p>Implements the operation to the underlying resources.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate resync();

    /**
     * Resync the Network Tap Rule.
     *
     * <p>Implements the operation to the underlying resources.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate resync(Context context);

    /**
     * Validates the configuration of the Network Tap Rule.
     *
     * <p>Implements the operation to the underlying resources.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the action validate configuration.
     */
    ValidateConfigurationResponse validateConfiguration();

    /**
     * Validates the configuration of the Network Tap Rule.
     *
     * <p>Implements the operation to the underlying resources.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the action validate configuration.
     */
    ValidateConfigurationResponse validateConfiguration(Context context);
}
