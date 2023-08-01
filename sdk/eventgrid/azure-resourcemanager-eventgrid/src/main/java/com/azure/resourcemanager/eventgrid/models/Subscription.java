// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.SubscriptionInner;

/** An immutable client-side representation of Subscription. */
public interface Subscription {
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
     * Gets the systemData property: The system metadata relating to Event Subscription resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of the event subscription.
     *
     * @return the provisioningState value.
     */
    SubscriptionProvisioningState provisioningState();

    /**
     * Gets the deliveryConfiguration property: Information about the delivery configuration of the event subscription.
     *
     * @return the deliveryConfiguration value.
     */
    DeliveryConfiguration deliveryConfiguration();

    /**
     * Gets the eventDeliverySchema property: The event delivery schema for the event subscription.
     *
     * @return the eventDeliverySchema value.
     */
    DeliverySchema eventDeliverySchema();

    /**
     * Gets the filtersConfiguration property: Information about the filter for the event subscription.
     *
     * @return the filtersConfiguration value.
     */
    FiltersConfiguration filtersConfiguration();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.SubscriptionInner object.
     *
     * @return the inner object.
     */
    SubscriptionInner innerModel();

    /** The entirety of the Subscription definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Subscription definition stages. */
    interface DefinitionStages {
        /** The first stage of the Subscription definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Subscription definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, namespaceName, topicName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription.
             * @param namespaceName Name of the namespace.
             * @param topicName Name of the namespace topic.
             * @return the next definition stage.
             */
            WithCreate withExistingTopic(String resourceGroupName, String namespaceName, String topicName);
        }
        /**
         * The stage of the Subscription definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDeliveryConfiguration,
                DefinitionStages.WithEventDeliverySchema,
                DefinitionStages.WithFiltersConfiguration {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Subscription create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Subscription create(Context context);
        }
        /** The stage of the Subscription definition allowing to specify deliveryConfiguration. */
        interface WithDeliveryConfiguration {
            /**
             * Specifies the deliveryConfiguration property: Information about the delivery configuration of the event
             * subscription..
             *
             * @param deliveryConfiguration Information about the delivery configuration of the event subscription.
             * @return the next definition stage.
             */
            WithCreate withDeliveryConfiguration(DeliveryConfiguration deliveryConfiguration);
        }
        /** The stage of the Subscription definition allowing to specify eventDeliverySchema. */
        interface WithEventDeliverySchema {
            /**
             * Specifies the eventDeliverySchema property: The event delivery schema for the event subscription..
             *
             * @param eventDeliverySchema The event delivery schema for the event subscription.
             * @return the next definition stage.
             */
            WithCreate withEventDeliverySchema(DeliverySchema eventDeliverySchema);
        }
        /** The stage of the Subscription definition allowing to specify filtersConfiguration. */
        interface WithFiltersConfiguration {
            /**
             * Specifies the filtersConfiguration property: Information about the filter for the event subscription..
             *
             * @param filtersConfiguration Information about the filter for the event subscription.
             * @return the next definition stage.
             */
            WithCreate withFiltersConfiguration(FiltersConfiguration filtersConfiguration);
        }
    }
    /**
     * Begins update for the Subscription resource.
     *
     * @return the stage of resource update.
     */
    Subscription.Update update();

    /** The template for Subscription update. */
    interface Update
        extends UpdateStages.WithDeliveryConfiguration,
            UpdateStages.WithEventDeliverySchema,
            UpdateStages.WithFiltersConfiguration {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Subscription apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Subscription apply(Context context);
    }
    /** The Subscription update stages. */
    interface UpdateStages {
        /** The stage of the Subscription update allowing to specify deliveryConfiguration. */
        interface WithDeliveryConfiguration {
            /**
             * Specifies the deliveryConfiguration property: Information about the delivery configuration of the event
             * subscription..
             *
             * @param deliveryConfiguration Information about the delivery configuration of the event subscription.
             * @return the next definition stage.
             */
            Update withDeliveryConfiguration(DeliveryConfiguration deliveryConfiguration);
        }
        /** The stage of the Subscription update allowing to specify eventDeliverySchema. */
        interface WithEventDeliverySchema {
            /**
             * Specifies the eventDeliverySchema property: The event delivery schema for the event subscription..
             *
             * @param eventDeliverySchema The event delivery schema for the event subscription.
             * @return the next definition stage.
             */
            Update withEventDeliverySchema(DeliverySchema eventDeliverySchema);
        }
        /** The stage of the Subscription update allowing to specify filtersConfiguration. */
        interface WithFiltersConfiguration {
            /**
             * Specifies the filtersConfiguration property: Information about the filter for the event subscription..
             *
             * @param filtersConfiguration Information about the filter for the event subscription.
             * @return the next definition stage.
             */
            Update withFiltersConfiguration(FiltersConfiguration filtersConfiguration);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Subscription refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Subscription refresh(Context context);
}
