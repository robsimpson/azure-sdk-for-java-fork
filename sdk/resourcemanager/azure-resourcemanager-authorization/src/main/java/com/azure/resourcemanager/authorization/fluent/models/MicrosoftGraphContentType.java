// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** contentType. */
@Fluent
public final class MicrosoftGraphContentType extends MicrosoftGraphEntity {
    /*
     * The descriptive text for the item.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The name of the group this content type belongs to. Helps organize related content types.
     */
    @JsonProperty(value = "group")
    private String group;

    /*
     * Indicates whether the content type is hidden in the list's 'New' menu.
     */
    @JsonProperty(value = "hidden")
    private Boolean hidden;

    /*
     * itemReference
     */
    @JsonProperty(value = "inheritedFrom")
    private MicrosoftGraphItemReference inheritedFrom;

    /*
     * The name of the content type.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * contentTypeOrder
     */
    @JsonProperty(value = "order")
    private MicrosoftGraphContentTypeOrder order;

    /*
     * The unique identifier of the content type.
     */
    @JsonProperty(value = "parentId")
    private String parentId;

    /*
     * If true, the content type cannot be modified unless this value is first set to false.
     */
    @JsonProperty(value = "readOnly")
    private Boolean readOnly;

    /*
     * If true, the content type cannot be modified by users or through push-down operations. Only site collection
     * administrators can seal or unseal content types.
     */
    @JsonProperty(value = "sealed")
    private Boolean sealed;

    /*
     * The collection of columns that are required by this content type
     */
    @JsonProperty(value = "columnLinks")
    private List<MicrosoftGraphColumnLink> columnLinks;

    /*
     * contentType
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphContentType class. */
    public MicrosoftGraphContentType() {
    }

    /**
     * Get the description property: The descriptive text for the item.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The descriptive text for the item.
     *
     * @param description the description value to set.
     * @return the MicrosoftGraphContentType object itself.
     */
    public MicrosoftGraphContentType withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the group property: The name of the group this content type belongs to. Helps organize related content types.
     *
     * @return the group value.
     */
    public String group() {
        return this.group;
    }

    /**
     * Set the group property: The name of the group this content type belongs to. Helps organize related content types.
     *
     * @param group the group value to set.
     * @return the MicrosoftGraphContentType object itself.
     */
    public MicrosoftGraphContentType withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Get the hidden property: Indicates whether the content type is hidden in the list's 'New' menu.
     *
     * @return the hidden value.
     */
    public Boolean hidden() {
        return this.hidden;
    }

    /**
     * Set the hidden property: Indicates whether the content type is hidden in the list's 'New' menu.
     *
     * @param hidden the hidden value to set.
     * @return the MicrosoftGraphContentType object itself.
     */
    public MicrosoftGraphContentType withHidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    /**
     * Get the inheritedFrom property: itemReference.
     *
     * @return the inheritedFrom value.
     */
    public MicrosoftGraphItemReference inheritedFrom() {
        return this.inheritedFrom;
    }

    /**
     * Set the inheritedFrom property: itemReference.
     *
     * @param inheritedFrom the inheritedFrom value to set.
     * @return the MicrosoftGraphContentType object itself.
     */
    public MicrosoftGraphContentType withInheritedFrom(MicrosoftGraphItemReference inheritedFrom) {
        this.inheritedFrom = inheritedFrom;
        return this;
    }

    /**
     * Get the name property: The name of the content type.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the content type.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphContentType object itself.
     */
    public MicrosoftGraphContentType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the order property: contentTypeOrder.
     *
     * @return the order value.
     */
    public MicrosoftGraphContentTypeOrder order() {
        return this.order;
    }

    /**
     * Set the order property: contentTypeOrder.
     *
     * @param order the order value to set.
     * @return the MicrosoftGraphContentType object itself.
     */
    public MicrosoftGraphContentType withOrder(MicrosoftGraphContentTypeOrder order) {
        this.order = order;
        return this;
    }

    /**
     * Get the parentId property: The unique identifier of the content type.
     *
     * @return the parentId value.
     */
    public String parentId() {
        return this.parentId;
    }

    /**
     * Set the parentId property: The unique identifier of the content type.
     *
     * @param parentId the parentId value to set.
     * @return the MicrosoftGraphContentType object itself.
     */
    public MicrosoftGraphContentType withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Get the readOnly property: If true, the content type cannot be modified unless this value is first set to false.
     *
     * @return the readOnly value.
     */
    public Boolean readOnly() {
        return this.readOnly;
    }

    /**
     * Set the readOnly property: If true, the content type cannot be modified unless this value is first set to false.
     *
     * @param readOnly the readOnly value to set.
     * @return the MicrosoftGraphContentType object itself.
     */
    public MicrosoftGraphContentType withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Get the sealed property: If true, the content type cannot be modified by users or through push-down operations.
     * Only site collection administrators can seal or unseal content types.
     *
     * @return the sealed value.
     */
    public Boolean sealed() {
        return this.sealed;
    }

    /**
     * Set the sealed property: If true, the content type cannot be modified by users or through push-down operations.
     * Only site collection administrators can seal or unseal content types.
     *
     * @param sealed the sealed value to set.
     * @return the MicrosoftGraphContentType object itself.
     */
    public MicrosoftGraphContentType withSealed(Boolean sealed) {
        this.sealed = sealed;
        return this;
    }

    /**
     * Get the columnLinks property: The collection of columns that are required by this content type.
     *
     * @return the columnLinks value.
     */
    public List<MicrosoftGraphColumnLink> columnLinks() {
        return this.columnLinks;
    }

    /**
     * Set the columnLinks property: The collection of columns that are required by this content type.
     *
     * @param columnLinks the columnLinks value to set.
     * @return the MicrosoftGraphContentType object itself.
     */
    public MicrosoftGraphContentType withColumnLinks(List<MicrosoftGraphColumnLink> columnLinks) {
        this.columnLinks = columnLinks;
        return this;
    }

    /**
     * Get the additionalProperties property: contentType.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: contentType.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphContentType object itself.
     */
    public MicrosoftGraphContentType withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphContentType withId(String id) {
        super.withId(id);
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
        if (inheritedFrom() != null) {
            inheritedFrom().validate();
        }
        if (order() != null) {
            order().validate();
        }
        if (columnLinks() != null) {
            columnLinks().forEach(e -> e.validate());
        }
    }
}
