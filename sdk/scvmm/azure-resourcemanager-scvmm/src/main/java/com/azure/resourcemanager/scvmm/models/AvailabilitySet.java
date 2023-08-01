// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.scvmm.fluent.models.AvailabilitySetInner;
import java.util.Map;

/** An immutable client-side representation of AvailabilitySet. */
public interface AvailabilitySet {
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
     * Gets the systemData property: The system data.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the extendedLocation property: The extended location.
     *
     * @return the extendedLocation value.
     */
    ExtendedLocation extendedLocation();

    /**
     * Gets the availabilitySetName property: Name of the availability set.
     *
     * @return the availabilitySetName value.
     */
    String availabilitySetName();

    /**
     * Gets the vmmServerId property: ARM Id of the vmmServer resource in which this resource resides.
     *
     * @return the vmmServerId value.
     */
    String vmmServerId();

    /**
     * Gets the provisioningState property: Gets or sets the provisioning state.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

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
     * Gets the inner com.azure.resourcemanager.scvmm.fluent.models.AvailabilitySetInner object.
     *
     * @return the inner object.
     */
    AvailabilitySetInner innerModel();

    /** The entirety of the AvailabilitySet definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The AvailabilitySet definition stages. */
    interface DefinitionStages {
        /** The first stage of the AvailabilitySet definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AvailabilitySet definition allowing to specify location. */
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
        /** The stage of the AvailabilitySet definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the AvailabilitySet definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithExtendedLocation,
                DefinitionStages.WithAvailabilitySetName,
                DefinitionStages.WithVmmServerId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AvailabilitySet create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AvailabilitySet create(Context context);
        }
        /** The stage of the AvailabilitySet definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AvailabilitySet definition allowing to specify extendedLocation. */
        interface WithExtendedLocation {
            /**
             * Specifies the extendedLocation property: The extended location..
             *
             * @param extendedLocation The extended location.
             * @return the next definition stage.
             */
            WithCreate withExtendedLocation(ExtendedLocation extendedLocation);
        }
        /** The stage of the AvailabilitySet definition allowing to specify availabilitySetName. */
        interface WithAvailabilitySetName {
            /**
             * Specifies the availabilitySetName property: Name of the availability set..
             *
             * @param availabilitySetName Name of the availability set.
             * @return the next definition stage.
             */
            WithCreate withAvailabilitySetName(String availabilitySetName);
        }
        /** The stage of the AvailabilitySet definition allowing to specify vmmServerId. */
        interface WithVmmServerId {
            /**
             * Specifies the vmmServerId property: ARM Id of the vmmServer resource in which this resource resides..
             *
             * @param vmmServerId ARM Id of the vmmServer resource in which this resource resides.
             * @return the next definition stage.
             */
            WithCreate withVmmServerId(String vmmServerId);
        }
    }
    /**
     * Begins update for the AvailabilitySet resource.
     *
     * @return the stage of resource update.
     */
    AvailabilitySet.Update update();

    /** The template for AvailabilitySet update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AvailabilitySet apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AvailabilitySet apply(Context context);
    }
    /** The AvailabilitySet update stages. */
    interface UpdateStages {
        /** The stage of the AvailabilitySet update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AvailabilitySet refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AvailabilitySet refresh(Context context);
}
