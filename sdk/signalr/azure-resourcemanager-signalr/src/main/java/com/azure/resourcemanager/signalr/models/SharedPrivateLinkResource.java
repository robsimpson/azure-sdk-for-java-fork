// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.fluent.models.SharedPrivateLinkResourceInner;

/** An immutable client-side representation of SharedPrivateLinkResource. */
public interface SharedPrivateLinkResource {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the groupId property: The group id from the provider of resource the shared private link resource is for.
     *
     * @return the groupId value.
     */
    String groupId();

    /**
     * Gets the privateLinkResourceId property: The resource id of the resource the shared private link resource is for.
     *
     * @return the privateLinkResourceId value.
     */
    String privateLinkResourceId();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the requestMessage property: The request message for requesting approval of the shared private link
     * resource.
     *
     * @return the requestMessage value.
     */
    String requestMessage();

    /**
     * Gets the status property: Status of the shared private link resource.
     *
     * @return the status value.
     */
    SharedPrivateLinkResourceStatus status();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.signalr.fluent.models.SharedPrivateLinkResourceInner object.
     *
     * @return the inner object.
     */
    SharedPrivateLinkResourceInner innerModel();

    /** The entirety of the SharedPrivateLinkResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The SharedPrivateLinkResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the SharedPrivateLinkResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SharedPrivateLinkResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param resourceName The name of the resource.
             * @return the next definition stage.
             */
            WithCreate withExistingSignalR(String resourceGroupName, String resourceName);
        }
        /**
         * The stage of the SharedPrivateLinkResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithGroupId,
                DefinitionStages.WithPrivateLinkResourceId,
                DefinitionStages.WithRequestMessage {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SharedPrivateLinkResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SharedPrivateLinkResource create(Context context);
        }
        /** The stage of the SharedPrivateLinkResource definition allowing to specify groupId. */
        interface WithGroupId {
            /**
             * Specifies the groupId property: The group id from the provider of resource the shared private link
             * resource is for.
             *
             * @param groupId The group id from the provider of resource the shared private link resource is for.
             * @return the next definition stage.
             */
            WithCreate withGroupId(String groupId);
        }
        /** The stage of the SharedPrivateLinkResource definition allowing to specify privateLinkResourceId. */
        interface WithPrivateLinkResourceId {
            /**
             * Specifies the privateLinkResourceId property: The resource id of the resource the shared private link
             * resource is for.
             *
             * @param privateLinkResourceId The resource id of the resource the shared private link resource is for.
             * @return the next definition stage.
             */
            WithCreate withPrivateLinkResourceId(String privateLinkResourceId);
        }
        /** The stage of the SharedPrivateLinkResource definition allowing to specify requestMessage. */
        interface WithRequestMessage {
            /**
             * Specifies the requestMessage property: The request message for requesting approval of the shared private
             * link resource.
             *
             * @param requestMessage The request message for requesting approval of the shared private link resource.
             * @return the next definition stage.
             */
            WithCreate withRequestMessage(String requestMessage);
        }
    }
    /**
     * Begins update for the SharedPrivateLinkResource resource.
     *
     * @return the stage of resource update.
     */
    SharedPrivateLinkResource.Update update();

    /** The template for SharedPrivateLinkResource update. */
    interface Update
        extends UpdateStages.WithGroupId, UpdateStages.WithPrivateLinkResourceId, UpdateStages.WithRequestMessage {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SharedPrivateLinkResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SharedPrivateLinkResource apply(Context context);
    }
    /** The SharedPrivateLinkResource update stages. */
    interface UpdateStages {
        /** The stage of the SharedPrivateLinkResource update allowing to specify groupId. */
        interface WithGroupId {
            /**
             * Specifies the groupId property: The group id from the provider of resource the shared private link
             * resource is for.
             *
             * @param groupId The group id from the provider of resource the shared private link resource is for.
             * @return the next definition stage.
             */
            Update withGroupId(String groupId);
        }
        /** The stage of the SharedPrivateLinkResource update allowing to specify privateLinkResourceId. */
        interface WithPrivateLinkResourceId {
            /**
             * Specifies the privateLinkResourceId property: The resource id of the resource the shared private link
             * resource is for.
             *
             * @param privateLinkResourceId The resource id of the resource the shared private link resource is for.
             * @return the next definition stage.
             */
            Update withPrivateLinkResourceId(String privateLinkResourceId);
        }
        /** The stage of the SharedPrivateLinkResource update allowing to specify requestMessage. */
        interface WithRequestMessage {
            /**
             * Specifies the requestMessage property: The request message for requesting approval of the shared private
             * link resource.
             *
             * @param requestMessage The request message for requesting approval of the shared private link resource.
             * @return the next definition stage.
             */
            Update withRequestMessage(String requestMessage);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SharedPrivateLinkResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SharedPrivateLinkResource refresh(Context context);
}
