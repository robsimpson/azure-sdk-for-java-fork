// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.SourceControlType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of an artifact source. */
@Fluent
public final class ArtifactSourceProperties {
    /*
     * The artifact source's display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The artifact source's URI.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /*
     * The artifact source's type.
     */
    @JsonProperty(value = "sourceType")
    private SourceControlType sourceType;

    /*
     * The folder containing artifacts.
     */
    @JsonProperty(value = "folderPath")
    private String folderPath;

    /*
     * The folder containing Azure Resource Manager templates.
     */
    @JsonProperty(value = "armTemplateFolderPath")
    private String armTemplateFolderPath;

    /*
     * The artifact source's branch reference.
     */
    @JsonProperty(value = "branchRef")
    private String branchRef;

    /*
     * The security token to authenticate to the artifact source.
     */
    @JsonProperty(value = "securityToken")
    private String securityToken;

    /*
     * Indicates if the artifact source is enabled (values: Enabled, Disabled).
     */
    @JsonProperty(value = "status")
    private EnableStatus status;

    /*
     * The artifact source's creation date.
     */
    @JsonProperty(value = "createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /** Creates an instance of ArtifactSourceProperties class. */
    public ArtifactSourceProperties() {
    }

    /**
     * Get the displayName property: The artifact source's display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The artifact source's display name.
     *
     * @param displayName the displayName value to set.
     * @return the ArtifactSourceProperties object itself.
     */
    public ArtifactSourceProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the uri property: The artifact source's URI.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The artifact source's URI.
     *
     * @param uri the uri value to set.
     * @return the ArtifactSourceProperties object itself.
     */
    public ArtifactSourceProperties withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the sourceType property: The artifact source's type.
     *
     * @return the sourceType value.
     */
    public SourceControlType sourceType() {
        return this.sourceType;
    }

    /**
     * Set the sourceType property: The artifact source's type.
     *
     * @param sourceType the sourceType value to set.
     * @return the ArtifactSourceProperties object itself.
     */
    public ArtifactSourceProperties withSourceType(SourceControlType sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the folderPath property: The folder containing artifacts.
     *
     * @return the folderPath value.
     */
    public String folderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: The folder containing artifacts.
     *
     * @param folderPath the folderPath value to set.
     * @return the ArtifactSourceProperties object itself.
     */
    public ArtifactSourceProperties withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the armTemplateFolderPath property: The folder containing Azure Resource Manager templates.
     *
     * @return the armTemplateFolderPath value.
     */
    public String armTemplateFolderPath() {
        return this.armTemplateFolderPath;
    }

    /**
     * Set the armTemplateFolderPath property: The folder containing Azure Resource Manager templates.
     *
     * @param armTemplateFolderPath the armTemplateFolderPath value to set.
     * @return the ArtifactSourceProperties object itself.
     */
    public ArtifactSourceProperties withArmTemplateFolderPath(String armTemplateFolderPath) {
        this.armTemplateFolderPath = armTemplateFolderPath;
        return this;
    }

    /**
     * Get the branchRef property: The artifact source's branch reference.
     *
     * @return the branchRef value.
     */
    public String branchRef() {
        return this.branchRef;
    }

    /**
     * Set the branchRef property: The artifact source's branch reference.
     *
     * @param branchRef the branchRef value to set.
     * @return the ArtifactSourceProperties object itself.
     */
    public ArtifactSourceProperties withBranchRef(String branchRef) {
        this.branchRef = branchRef;
        return this;
    }

    /**
     * Get the securityToken property: The security token to authenticate to the artifact source.
     *
     * @return the securityToken value.
     */
    public String securityToken() {
        return this.securityToken;
    }

    /**
     * Set the securityToken property: The security token to authenticate to the artifact source.
     *
     * @param securityToken the securityToken value to set.
     * @return the ArtifactSourceProperties object itself.
     */
    public ArtifactSourceProperties withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * Get the status property: Indicates if the artifact source is enabled (values: Enabled, Disabled).
     *
     * @return the status value.
     */
    public EnableStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Indicates if the artifact source is enabled (values: Enabled, Disabled).
     *
     * @param status the status value to set.
     * @return the ArtifactSourceProperties object itself.
     */
    public ArtifactSourceProperties withStatus(EnableStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the createdDate property: The artifact source's creation date.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
