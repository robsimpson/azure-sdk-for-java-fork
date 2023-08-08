// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.storage.queue.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** An Access policy. */
@JacksonXmlRootElement(localName = "AccessPolicy")
@Fluent
public final class QueueAccessPolicy {

    /*
     * the date-time the policy is active
     */
    @JsonProperty(value = "Start")
    private OffsetDateTime startsOn;

    /*
     * the date-time the policy expires
     */
    @JsonProperty(value = "Expiry")
    private OffsetDateTime expiresOn;

    /*
     * the permissions for the acl policy
     */
    @JsonProperty(value = "Permission")
    private String permissions;

    /** Creates an instance of QueueAccessPolicy class. */
    public QueueAccessPolicy() {}

    /**
     * Get the startsOn property: the date-time the policy is active.
     *
     * @return the startsOn value.
     */
    public OffsetDateTime getStartsOn() {
        return this.startsOn;
    }

    /**
     * Set the startsOn property: the date-time the policy is active.
     *
     * @param startsOn the startsOn value to set.
     * @return the QueueAccessPolicy object itself.
     */
    public QueueAccessPolicy setStartsOn(OffsetDateTime startsOn) {
        this.startsOn = startsOn;
        return this;
    }

    /**
     * Get the expiresOn property: the date-time the policy expires.
     *
     * @return the expiresOn value.
     */
    public OffsetDateTime getExpiresOn() {
        return this.expiresOn;
    }

    /**
     * Set the expiresOn property: the date-time the policy expires.
     *
     * @param expiresOn the expiresOn value to set.
     * @return the QueueAccessPolicy object itself.
     */
    public QueueAccessPolicy setExpiresOn(OffsetDateTime expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Get the permissions property: the permissions for the acl policy.
     *
     * @return the permissions value.
     */
    public String getPermissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: the permissions for the acl policy.
     *
     * @param permissions the permissions value to set.
     * @return the QueueAccessPolicy object itself.
     */
    public QueueAccessPolicy setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
}
