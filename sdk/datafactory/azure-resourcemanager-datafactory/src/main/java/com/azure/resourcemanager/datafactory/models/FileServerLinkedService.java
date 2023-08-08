// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.FileServerLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** File system linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FileServer")
@Fluent
public final class FileServerLinkedService extends LinkedService {
    /*
     * File system linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private FileServerLinkedServiceTypeProperties innerTypeProperties = new FileServerLinkedServiceTypeProperties();

    /** Creates an instance of FileServerLinkedService class. */
    public FileServerLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: File system linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private FileServerLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public FileServerLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FileServerLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FileServerLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FileServerLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the host property: Host name of the server. Type: string (or Expression with resultType string).
     *
     * @return the host value.
     */
    public Object host() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().host();
    }

    /**
     * Set the host property: Host name of the server. Type: string (or Expression with resultType string).
     *
     * @param host the host value to set.
     * @return the FileServerLinkedService object itself.
     */
    public FileServerLinkedService withHost(Object host) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHost(host);
        return this;
    }

    /**
     * Get the userId property: User ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @return the userId value.
     */
    public Object userId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().userId();
    }

    /**
     * Set the userId property: User ID to logon the server. Type: string (or Expression with resultType string).
     *
     * @param userId the userId value to set.
     * @return the FileServerLinkedService object itself.
     */
    public FileServerLinkedService withUserId(Object userId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUserId(userId);
        return this;
    }

    /**
     * Get the password property: Password to logon the server.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: Password to logon the server.
     *
     * @param password the password value to set.
     * @return the FileServerLinkedService object itself.
     */
    public FileServerLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the FileServerLinkedService object itself.
     */
    public FileServerLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FileServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model FileServerLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FileServerLinkedService.class);
}
