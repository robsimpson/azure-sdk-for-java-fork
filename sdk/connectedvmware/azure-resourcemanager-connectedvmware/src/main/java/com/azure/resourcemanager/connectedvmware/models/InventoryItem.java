// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.connectedvmware.fluent.models.InventoryItemInner;

/** An immutable client-side representation of InventoryItem. */
public interface InventoryItem {
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
     * Gets the systemData property: The system data.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the resource provider must
     * validate and persist this value.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the managedResourceId property: Gets or sets the tracked resource id corresponding to the inventory
     * resource.
     *
     * @return the managedResourceId value.
     */
    String managedResourceId();

    /**
     * Gets the moRefId property: Gets or sets the MoRef (Managed Object Reference) ID for the inventory item.
     *
     * @return the moRefId value.
     */
    String moRefId();

    /**
     * Gets the moName property: Gets or sets the vCenter Managed Object name for the inventory item.
     *
     * @return the moName value.
     */
    String moName();

    /**
     * Gets the provisioningState property: Gets or sets the provisioning state.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.connectedvmware.fluent.models.InventoryItemInner object.
     *
     * @return the inner object.
     */
    InventoryItemInner innerModel();

    /** The entirety of the InventoryItem definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The InventoryItem definition stages. */
    interface DefinitionStages {
        /** The first stage of the InventoryItem definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the InventoryItem definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, vcenterName.
             *
             * @param resourceGroupName The Resource Group Name.
             * @param vcenterName Name of the vCenter.
             * @return the next definition stage.
             */
            WithCreate withExistingVcenter(String resourceGroupName, String vcenterName);
        }
        /**
         * The stage of the InventoryItem definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithKind,
                DefinitionStages.WithManagedResourceId,
                DefinitionStages.WithMoRefId,
                DefinitionStages.WithMoName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            InventoryItem create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            InventoryItem create(Context context);
        }
        /** The stage of the InventoryItem definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Metadata used by portal/tooling/etc to render different UX experiences for
             * resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the
             * resource provider must validate and persist this value..
             *
             * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the
             *     same type; e.g. ApiApps are a kind of Microsoft.Web/sites type. If supported, the resource provider
             *     must validate and persist this value.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the InventoryItem definition allowing to specify managedResourceId. */
        interface WithManagedResourceId {
            /**
             * Specifies the managedResourceId property: Gets or sets the tracked resource id corresponding to the
             * inventory resource..
             *
             * @param managedResourceId Gets or sets the tracked resource id corresponding to the inventory resource.
             * @return the next definition stage.
             */
            WithCreate withManagedResourceId(String managedResourceId);
        }
        /** The stage of the InventoryItem definition allowing to specify moRefId. */
        interface WithMoRefId {
            /**
             * Specifies the moRefId property: Gets or sets the MoRef (Managed Object Reference) ID for the inventory
             * item..
             *
             * @param moRefId Gets or sets the MoRef (Managed Object Reference) ID for the inventory item.
             * @return the next definition stage.
             */
            WithCreate withMoRefId(String moRefId);
        }
        /** The stage of the InventoryItem definition allowing to specify moName. */
        interface WithMoName {
            /**
             * Specifies the moName property: Gets or sets the vCenter Managed Object name for the inventory item..
             *
             * @param moName Gets or sets the vCenter Managed Object name for the inventory item.
             * @return the next definition stage.
             */
            WithCreate withMoName(String moName);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    InventoryItem refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    InventoryItem refresh(Context context);
}
