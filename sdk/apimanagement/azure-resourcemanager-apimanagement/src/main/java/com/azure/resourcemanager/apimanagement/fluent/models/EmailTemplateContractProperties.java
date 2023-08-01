// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.EmailTemplateParametersContractProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Email Template Contract properties. */
@Fluent
public final class EmailTemplateContractProperties {
    /*
     * Subject of the Template.
     */
    @JsonProperty(value = "subject", required = true)
    private String subject;

    /*
     * Email Template Body. This should be a valid XDocument
     */
    @JsonProperty(value = "body", required = true)
    private String body;

    /*
     * Title of the Template.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * Description of the Email Template.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Whether the template is the default template provided by API Management
     * or has been edited.
     */
    @JsonProperty(value = "isDefault", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDefault;

    /*
     * Email Template Parameter values.
     */
    @JsonProperty(value = "parameters")
    private List<EmailTemplateParametersContractProperties> parameters;

    /**
     * Get the subject property: Subject of the Template.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set the subject property: Subject of the Template.
     *
     * @param subject the subject value to set.
     * @return the EmailTemplateContractProperties object itself.
     */
    public EmailTemplateContractProperties withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the body property: Email Template Body. This should be a valid XDocument.
     *
     * @return the body value.
     */
    public String body() {
        return this.body;
    }

    /**
     * Set the body property: Email Template Body. This should be a valid XDocument.
     *
     * @param body the body value to set.
     * @return the EmailTemplateContractProperties object itself.
     */
    public EmailTemplateContractProperties withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get the title property: Title of the Template.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: Title of the Template.
     *
     * @param title the title value to set.
     * @return the EmailTemplateContractProperties object itself.
     */
    public EmailTemplateContractProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the description property: Description of the Email Template.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the Email Template.
     *
     * @param description the description value to set.
     * @return the EmailTemplateContractProperties object itself.
     */
    public EmailTemplateContractProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the isDefault property: Whether the template is the default template provided by API Management or has been
     * edited.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Get the parameters property: Email Template Parameter values.
     *
     * @return the parameters value.
     */
    public List<EmailTemplateParametersContractProperties> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Email Template Parameter values.
     *
     * @param parameters the parameters value to set.
     * @return the EmailTemplateContractProperties object itself.
     */
    public EmailTemplateContractProperties withParameters(List<EmailTemplateParametersContractProperties> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subject() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property subject in model EmailTemplateContractProperties"));
        }
        if (body() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property body in model EmailTemplateContractProperties"));
        }
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EmailTemplateContractProperties.class);
}
