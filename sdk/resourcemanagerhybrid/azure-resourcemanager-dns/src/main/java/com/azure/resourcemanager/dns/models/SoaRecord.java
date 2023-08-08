// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An SOA record. */
@Fluent
public final class SoaRecord {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SoaRecord.class);

    /*
     * The domain name of the authoritative name server for this SOA record.
     */
    @JsonProperty(value = "host")
    private String host;

    /*
     * The email contact for this SOA record.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * The serial number for this SOA record.
     */
    @JsonProperty(value = "serialNumber")
    private Long serialNumber;

    /*
     * The refresh value for this SOA record.
     */
    @JsonProperty(value = "refreshTime")
    private Long refreshTime;

    /*
     * The retry time for this SOA record.
     */
    @JsonProperty(value = "retryTime")
    private Long retryTime;

    /*
     * The expire time for this SOA record.
     */
    @JsonProperty(value = "expireTime")
    private Long expireTime;

    /*
     * The minimum value for this SOA record. By convention this is used to
     * determine the negative caching duration.
     */
    @JsonProperty(value = "minimumTTL")
    private Long minimumTtl;

    /**
     * Get the host property: The domain name of the authoritative name server for this SOA record.
     *
     * @return the host value.
     */
    public String host() {
        return this.host;
    }

    /**
     * Set the host property: The domain name of the authoritative name server for this SOA record.
     *
     * @param host the host value to set.
     * @return the SoaRecord object itself.
     */
    public SoaRecord withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the email property: The email contact for this SOA record.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: The email contact for this SOA record.
     *
     * @param email the email value to set.
     * @return the SoaRecord object itself.
     */
    public SoaRecord withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the serialNumber property: The serial number for this SOA record.
     *
     * @return the serialNumber value.
     */
    public Long serialNumber() {
        return this.serialNumber;
    }

    /**
     * Set the serialNumber property: The serial number for this SOA record.
     *
     * @param serialNumber the serialNumber value to set.
     * @return the SoaRecord object itself.
     */
    public SoaRecord withSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Get the refreshTime property: The refresh value for this SOA record.
     *
     * @return the refreshTime value.
     */
    public Long refreshTime() {
        return this.refreshTime;
    }

    /**
     * Set the refreshTime property: The refresh value for this SOA record.
     *
     * @param refreshTime the refreshTime value to set.
     * @return the SoaRecord object itself.
     */
    public SoaRecord withRefreshTime(Long refreshTime) {
        this.refreshTime = refreshTime;
        return this;
    }

    /**
     * Get the retryTime property: The retry time for this SOA record.
     *
     * @return the retryTime value.
     */
    public Long retryTime() {
        return this.retryTime;
    }

    /**
     * Set the retryTime property: The retry time for this SOA record.
     *
     * @param retryTime the retryTime value to set.
     * @return the SoaRecord object itself.
     */
    public SoaRecord withRetryTime(Long retryTime) {
        this.retryTime = retryTime;
        return this;
    }

    /**
     * Get the expireTime property: The expire time for this SOA record.
     *
     * @return the expireTime value.
     */
    public Long expireTime() {
        return this.expireTime;
    }

    /**
     * Set the expireTime property: The expire time for this SOA record.
     *
     * @param expireTime the expireTime value to set.
     * @return the SoaRecord object itself.
     */
    public SoaRecord withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * Get the minimumTtl property: The minimum value for this SOA record. By convention this is used to determine the
     * negative caching duration.
     *
     * @return the minimumTtl value.
     */
    public Long minimumTtl() {
        return this.minimumTtl;
    }

    /**
     * Set the minimumTtl property: The minimum value for this SOA record. By convention this is used to determine the
     * negative caching duration.
     *
     * @param minimumTtl the minimumTtl value to set.
     * @return the SoaRecord object itself.
     */
    public SoaRecord withMinimumTtl(Long minimumTtl) {
        this.minimumTtl = minimumTtl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
