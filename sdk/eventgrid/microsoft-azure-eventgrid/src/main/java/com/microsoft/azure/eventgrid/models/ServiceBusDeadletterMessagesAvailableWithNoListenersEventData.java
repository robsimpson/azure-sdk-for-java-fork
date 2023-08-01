/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for a
 * Microsoft.ServiceBus.DeadletterMessagesAvailableWithNoListenersEvent event.
 */
public class ServiceBusDeadletterMessagesAvailableWithNoListenersEventData {
    /**
     * The namespace name of the Microsoft.ServiceBus resource.
     */
    @JsonProperty(value = "namespaceName")
    private String namespaceName;

    /**
     * The endpoint of the Microsoft.ServiceBus resource.
     */
    @JsonProperty(value = "requestUri")
    private String requestUri;

    /**
     * The entity type of the Microsoft.ServiceBus resource. Could be one of
     * 'queue' or 'subscriber'.
     */
    @JsonProperty(value = "entityType")
    private String entityType;

    /**
     * The name of the Microsoft.ServiceBus queue. If the entity type is of
     * type 'subscriber', then this value will be null.
     */
    @JsonProperty(value = "queueName")
    private String queueName;

    /**
     * The name of the Microsoft.ServiceBus topic. If the entity type is of
     * type 'queue', then this value will be null.
     */
    @JsonProperty(value = "topicName")
    private String topicName;

    /**
     * The name of the Microsoft.ServiceBus topic's subscription. If the entity
     * type is of type 'queue', then this value will be null.
     */
    @JsonProperty(value = "subscriptionName")
    private String subscriptionName;

    /**
     * Get the namespace name of the Microsoft.ServiceBus resource.
     *
     * @return the namespaceName value
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * Set the namespace name of the Microsoft.ServiceBus resource.
     *
     * @param namespaceName the namespaceName value to set
     * @return the ServiceBusDeadletterMessagesAvailableWithNoListenersEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailableWithNoListenersEventData withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * Get the endpoint of the Microsoft.ServiceBus resource.
     *
     * @return the requestUri value
     */
    public String requestUri() {
        return this.requestUri;
    }

    /**
     * Set the endpoint of the Microsoft.ServiceBus resource.
     *
     * @param requestUri the requestUri value to set
     * @return the ServiceBusDeadletterMessagesAvailableWithNoListenersEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailableWithNoListenersEventData withRequestUri(String requestUri) {
        this.requestUri = requestUri;
        return this;
    }

    /**
     * Get the entity type of the Microsoft.ServiceBus resource. Could be one of 'queue' or 'subscriber'.
     *
     * @return the entityType value
     */
    public String entityType() {
        return this.entityType;
    }

    /**
     * Set the entity type of the Microsoft.ServiceBus resource. Could be one of 'queue' or 'subscriber'.
     *
     * @param entityType the entityType value to set
     * @return the ServiceBusDeadletterMessagesAvailableWithNoListenersEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailableWithNoListenersEventData withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get the name of the Microsoft.ServiceBus queue. If the entity type is of type 'subscriber', then this value will be null.
     *
     * @return the queueName value
     */
    public String queueName() {
        return this.queueName;
    }

    /**
     * Set the name of the Microsoft.ServiceBus queue. If the entity type is of type 'subscriber', then this value will be null.
     *
     * @param queueName the queueName value to set
     * @return the ServiceBusDeadletterMessagesAvailableWithNoListenersEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailableWithNoListenersEventData withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * Get the name of the Microsoft.ServiceBus topic. If the entity type is of type 'queue', then this value will be null.
     *
     * @return the topicName value
     */
    public String topicName() {
        return this.topicName;
    }

    /**
     * Set the name of the Microsoft.ServiceBus topic. If the entity type is of type 'queue', then this value will be null.
     *
     * @param topicName the topicName value to set
     * @return the ServiceBusDeadletterMessagesAvailableWithNoListenersEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailableWithNoListenersEventData withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * Get the name of the Microsoft.ServiceBus topic's subscription. If the entity type is of type 'queue', then this value will be null.
     *
     * @return the subscriptionName value
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * Set the name of the Microsoft.ServiceBus topic's subscription. If the entity type is of type 'queue', then this value will be null.
     *
     * @param subscriptionName the subscriptionName value to set
     * @return the ServiceBusDeadletterMessagesAvailableWithNoListenersEventData object itself.
     */
    public ServiceBusDeadletterMessagesAvailableWithNoListenersEventData withSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }

}
