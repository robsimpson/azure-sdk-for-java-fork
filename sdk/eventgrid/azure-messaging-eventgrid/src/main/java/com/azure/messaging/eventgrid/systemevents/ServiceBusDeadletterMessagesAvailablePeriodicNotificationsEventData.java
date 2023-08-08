// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for a
 * Microsoft.ServiceBus.DeadletterMessagesAvailablePeriodicNotifications event.
 */
@Fluent
public final class ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData {
    /*
     * The namespace name of the Microsoft.ServiceBus resource.
     */
    @JsonProperty(value = "namespaceName")
    private String namespaceName;

    /*
     * The endpoint of the Microsoft.ServiceBus resource.
     */
    @JsonProperty(value = "requestUri")
    private String requestUri;

    /*
     * The entity type of the Microsoft.ServiceBus resource. Could be one of 'queue' or 'subscriber'.
     */
    @JsonProperty(value = "entityType")
    private String entityType;

    /*
     * The name of the Microsoft.ServiceBus queue. If the entity type is of type 'subscriber', then this value will be
     * null.
     */
    @JsonProperty(value = "queueName")
    private String queueName;

    /*
     * The name of the Microsoft.ServiceBus topic. If the entity type is of type 'queue', then this value will be null.
     */
    @JsonProperty(value = "topicName")
    private String topicName;

    /*
     * The name of the Microsoft.ServiceBus topic's subscription. If the entity type is of type 'queue', then this
     * value will be null.
     */
    @JsonProperty(value = "subscriptionName")
    private String subscriptionName;

    /** Creates an instance of ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData class. */
    public ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData() {}

    /**
     * Get the namespaceName property: The namespace name of the Microsoft.ServiceBus resource.
     *
     * @return the namespaceName value.
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Set the namespaceName property: The namespace name of the Microsoft.ServiceBus resource.
     *
     * @param namespaceName the namespaceName value to set.
     * @return the ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * Get the requestUri property: The endpoint of the Microsoft.ServiceBus resource.
     *
     * @return the requestUri value.
     */
    public String getRequestUri() {
        return this.requestUri;
    }

    /**
     * Set the requestUri property: The endpoint of the Microsoft.ServiceBus resource.
     *
     * @param requestUri the requestUri value to set.
     * @return the ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData setRequestUri(String requestUri) {
        this.requestUri = requestUri;
        return this;
    }

    /**
     * Get the entityType property: The entity type of the Microsoft.ServiceBus resource. Could be one of 'queue' or
     * 'subscriber'.
     *
     * @return the entityType value.
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * Set the entityType property: The entity type of the Microsoft.ServiceBus resource. Could be one of 'queue' or
     * 'subscriber'.
     *
     * @param entityType the entityType value to set.
     * @return the ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get the queueName property: The name of the Microsoft.ServiceBus queue. If the entity type is of type
     * 'subscriber', then this value will be null.
     *
     * @return the queueName value.
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * Set the queueName property: The name of the Microsoft.ServiceBus queue. If the entity type is of type
     * 'subscriber', then this value will be null.
     *
     * @param queueName the queueName value to set.
     * @return the ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * Get the topicName property: The name of the Microsoft.ServiceBus topic. If the entity type is of type 'queue',
     * then this value will be null.
     *
     * @return the topicName value.
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * Set the topicName property: The name of the Microsoft.ServiceBus topic. If the entity type is of type 'queue',
     * then this value will be null.
     *
     * @param topicName the topicName value to set.
     * @return the ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * Get the subscriptionName property: The name of the Microsoft.ServiceBus topic's subscription. If the entity type
     * is of type 'queue', then this value will be null.
     *
     * @return the subscriptionName value.
     */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * Set the subscriptionName property: The name of the Microsoft.ServiceBus topic's subscription. If the entity type
     * is of type 'queue', then this value will be null.
     *
     * @param subscriptionName the subscriptionName value to set.
     * @return the ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailablePeriodicNotificationsEventData setSubscriptionName(
            String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
}
