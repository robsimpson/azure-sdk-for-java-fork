// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.models.AutomationAccountState;
import com.azure.resourcemanager.automation.models.EncryptionProperties;
import com.azure.resourcemanager.automation.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Definition of the account property. */
@Fluent
public final class AutomationAccountProperties {
    /*
     * Gets or sets the SKU of account.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Gets or sets the last modified by.
     */
    @JsonProperty(value = "lastModifiedBy")
    private String lastModifiedBy;

    /*
     * Gets status of account.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private AutomationAccountState state;

    /*
     * Gets the creation time.
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Gets the last modified time.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * Gets or sets the description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Encryption properties for the automation account
     */
    @JsonProperty(value = "encryption")
    private EncryptionProperties encryption;

    /*
     * List of Automation operations supported by the Automation resource provider.
     */
    @JsonProperty(value = "privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is allowed from the public internet
     */
    @JsonProperty(value = "publicNetworkAccess")
    private Boolean publicNetworkAccess;

    /*
     * Indicates whether requests using non-AAD authentication are blocked
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * URL of automation hybrid service which is used for hybrid worker on-boarding.
     */
    @JsonProperty(value = "automationHybridServiceUrl")
    private String automationHybridServiceUrl;

    /**
     * Get the sku property: Gets or sets the SKU of account.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Gets or sets the SKU of account.
     *
     * @param sku the sku value to set.
     * @return the AutomationAccountProperties object itself.
     */
    public AutomationAccountProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the lastModifiedBy property: Gets or sets the last modified by.
     *
     * @return the lastModifiedBy value.
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set the lastModifiedBy property: Gets or sets the last modified by.
     *
     * @param lastModifiedBy the lastModifiedBy value to set.
     * @return the AutomationAccountProperties object itself.
     */
    public AutomationAccountProperties withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get the state property: Gets status of account.
     *
     * @return the state value.
     */
    public AutomationAccountState state() {
        return this.state;
    }

    /**
     * Get the creationTime property: Gets the creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastModifiedTime property: Gets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the description property: Gets or sets the description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description.
     *
     * @param description the description value to set.
     * @return the AutomationAccountProperties object itself.
     */
    public AutomationAccountProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the encryption property: Encryption properties for the automation account.
     *
     * @return the encryption value.
     */
    public EncryptionProperties encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Encryption properties for the automation account.
     *
     * @param encryption the encryption value to set.
     * @return the AutomationAccountProperties object itself.
     */
    public AutomationAccountProperties withEncryption(EncryptionProperties encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of Automation operations supported by the Automation resource
     * provider.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: List of Automation operations supported by the Automation resource
     * provider.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the AutomationAccountProperties object itself.
     */
    public AutomationAccountProperties withPrivateEndpointConnections(
        List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is
     * allowed from the public internet.
     *
     * @return the publicNetworkAccess value.
     */
    public Boolean publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is
     * allowed from the public internet.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the AutomationAccountProperties object itself.
     */
    public AutomationAccountProperties withPublicNetworkAccess(Boolean publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the disableLocalAuth property: Indicates whether requests using non-AAD authentication are blocked.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: Indicates whether requests using non-AAD authentication are blocked.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the AutomationAccountProperties object itself.
     */
    public AutomationAccountProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the automationHybridServiceUrl property: URL of automation hybrid service which is used for hybrid worker
     * on-boarding.
     *
     * @return the automationHybridServiceUrl value.
     */
    public String automationHybridServiceUrl() {
        return this.automationHybridServiceUrl;
    }

    /**
     * Set the automationHybridServiceUrl property: URL of automation hybrid service which is used for hybrid worker
     * on-boarding.
     *
     * @param automationHybridServiceUrl the automationHybridServiceUrl value to set.
     * @return the AutomationAccountProperties object itself.
     */
    public AutomationAccountProperties withAutomationHybridServiceUrl(String automationHybridServiceUrl) {
        this.automationHybridServiceUrl = automationHybridServiceUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
