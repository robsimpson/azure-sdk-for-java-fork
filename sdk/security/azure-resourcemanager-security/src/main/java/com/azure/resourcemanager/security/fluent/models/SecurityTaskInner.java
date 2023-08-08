// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.SecurityTaskParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Security task that we recommend to do in order to strengthen security. */
@Fluent
public final class SecurityTaskInner extends ProxyResource {
    /*
     * Describes properties of a task.
     */
    @JsonProperty(value = "properties")
    private SecurityTaskProperties innerProperties;

    /** Creates an instance of SecurityTaskInner class. */
    public SecurityTaskInner() {
    }

    /**
     * Get the innerProperties property: Describes properties of a task.
     *
     * @return the innerProperties value.
     */
    private SecurityTaskProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the state property: State of the task (Active, Resolved etc.).
     *
     * @return the state value.
     */
    public String state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the creationTimeUtc property: The time this task was discovered in UTC.
     *
     * @return the creationTimeUtc value.
     */
    public OffsetDateTime creationTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTimeUtc();
    }

    /**
     * Get the securityTaskParameters property: Changing set of properties, depending on the task type that is derived
     * from the name field.
     *
     * @return the securityTaskParameters value.
     */
    public SecurityTaskParameters securityTaskParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().securityTaskParameters();
    }

    /**
     * Set the securityTaskParameters property: Changing set of properties, depending on the task type that is derived
     * from the name field.
     *
     * @param securityTaskParameters the securityTaskParameters value to set.
     * @return the SecurityTaskInner object itself.
     */
    public SecurityTaskInner withSecurityTaskParameters(SecurityTaskParameters securityTaskParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityTaskProperties();
        }
        this.innerProperties().withSecurityTaskParameters(securityTaskParameters);
        return this;
    }

    /**
     * Get the lastStateChangeTimeUtc property: The time this task's details were last changed in UTC.
     *
     * @return the lastStateChangeTimeUtc value.
     */
    public OffsetDateTime lastStateChangeTimeUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().lastStateChangeTimeUtc();
    }

    /**
     * Get the subState property: Additional data on the state of the task.
     *
     * @return the subState value.
     */
    public String subState() {
        return this.innerProperties() == null ? null : this.innerProperties().subState();
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
