// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.models.TopicSpaceProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Topic space resource. */
@Fluent
public final class TopicSpaceInner extends ProxyResource {
    /*
     * The properties of topic space.
     */
    @JsonProperty(value = "properties")
    private TopicSpaceProperties innerProperties;

    /*
     * The system metadata relating to the TopicSpace resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of TopicSpaceInner class. */
    public TopicSpaceInner() {
    }

    /**
     * Get the innerProperties property: The properties of topic space.
     *
     * @return the innerProperties value.
     */
    private TopicSpaceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to the TopicSpace resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: Description for the Topic Space resource.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description for the Topic Space resource.
     *
     * @param description the description value to set.
     * @return the TopicSpaceInner object itself.
     */
    public TopicSpaceInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicSpaceProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the topicTemplates property: The topic filters in the topic space. Example: "topicTemplates": [
     * "devices/foo/bar", "devices/topic1/+", "devices/${principal.name}/${principal.attributes.keyName}" ].
     *
     * @return the topicTemplates value.
     */
    public List<String> topicTemplates() {
        return this.innerProperties() == null ? null : this.innerProperties().topicTemplates();
    }

    /**
     * Set the topicTemplates property: The topic filters in the topic space. Example: "topicTemplates": [
     * "devices/foo/bar", "devices/topic1/+", "devices/${principal.name}/${principal.attributes.keyName}" ].
     *
     * @param topicTemplates the topicTemplates value to set.
     * @return the TopicSpaceInner object itself.
     */
    public TopicSpaceInner withTopicTemplates(List<String> topicTemplates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopicSpaceProperties();
        }
        this.innerProperties().withTopicTemplates(topicTemplates);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the TopicSpace resource.
     *
     * @return the provisioningState value.
     */
    public TopicSpaceProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
