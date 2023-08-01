// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeResourceInner;
import java.util.Map;

/** An immutable client-side representation of ApplicationTypeResource. */
public interface ApplicationTypeResource {
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
     * Gets the location property: It will be deprecated in New API, resource location depends on the parent resource.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Azure resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: Azure resource etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
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
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeResourceInner object.
     *
     * @return the inner object.
     */
    ApplicationTypeResourceInner innerModel();

    /** The entirety of the ApplicationTypeResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ApplicationTypeResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ApplicationTypeResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ApplicationTypeResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, clusterName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param clusterName The name of the cluster resource.
             * @return the next definition stage.
             */
            WithCreate withExistingCluster(String resourceGroupName, String clusterName);
        }
        /**
         * The stage of the ApplicationTypeResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithLocation, DefinitionStages.WithTags {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ApplicationTypeResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ApplicationTypeResource create(Context context);
        }
        /** The stage of the ApplicationTypeResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location It will be deprecated in New API, resource location depends on the parent resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location It will be deprecated in New API, resource location depends on the parent resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the ApplicationTypeResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Azure resource tags..
             *
             * @param tags Azure resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }
    /**
     * Begins update for the ApplicationTypeResource resource.
     *
     * @return the stage of resource update.
     */
    ApplicationTypeResource.Update update();

    /** The template for ApplicationTypeResource update. */
    interface Update {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ApplicationTypeResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ApplicationTypeResource apply(Context context);
    }
    /** The ApplicationTypeResource update stages. */
    interface UpdateStages {
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ApplicationTypeResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ApplicationTypeResource refresh(Context context);
}
