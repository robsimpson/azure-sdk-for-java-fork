// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.fluent.models.CustomerSubscriptionInner;

/** An immutable client-side representation of CustomerSubscription. */
public interface CustomerSubscription {
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
     * Gets the etag property: The entity tag used for optimistic concurrency when modifying the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the tenantId property: Tenant Id.
     *
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.fluent.models.CustomerSubscriptionInner object.
     *
     * @return the inner object.
     */
    CustomerSubscriptionInner innerModel();

    /** The entirety of the CustomerSubscription definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The CustomerSubscription definition stages. */
    interface DefinitionStages {
        /** The first stage of the CustomerSubscription definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the CustomerSubscription definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroup, registrationName.
             *
             * @param resourceGroup Name of the resource group.
             * @param registrationName Name of the Azure Stack registration.
             * @return the next definition stage.
             */
            WithCreate withExistingRegistration(String resourceGroup, String registrationName);
        }
        /**
         * The stage of the CustomerSubscription definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithEtag, DefinitionStages.WithTenantId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CustomerSubscription create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CustomerSubscription create(Context context);
        }
        /** The stage of the CustomerSubscription definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The entity tag used for optimistic concurrency when modifying the resource..
             *
             * @param etag The entity tag used for optimistic concurrency when modifying the resource.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the CustomerSubscription definition allowing to specify tenantId. */
        interface WithTenantId {
            /**
             * Specifies the tenantId property: Tenant Id..
             *
             * @param tenantId Tenant Id.
             * @return the next definition stage.
             */
            WithCreate withTenantId(String tenantId);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CustomerSubscription refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CustomerSubscription refresh(Context context);
}
