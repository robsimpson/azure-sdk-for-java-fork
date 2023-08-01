// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.email.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Content of the email. */
@Fluent
public final class EmailContent {
    /*
     * Subject of the email message
     */
    @JsonProperty(value = "subject", required = true)
    private String subject;

    /*
     * Plain text version of the email message.
     */
    @JsonProperty(value = "plainText")
    private String plainText;

    /*
     * Html version of the email message.
     */
    @JsonProperty(value = "html")
    private String html;

    /**
     * Creates an instance of EmailContent class.
     *
     * @param subject the subject value to set.
     */
    @JsonCreator
    public EmailContent(@JsonProperty(value = "subject", required = true) String subject) {
        this.subject = subject;
    }

    /**
     * Get the subject property: Subject of the email message.
     *
     * @return the subject value.
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Get the plainText property: Plain text version of the email message.
     *
     * @return the plainText value.
     */
    public String getPlainText() {
        return this.plainText;
    }

    /**
     * Set the plainText property: Plain text version of the email message.
     *
     * @param plainText the plainText value to set.
     * @return the EmailContent object itself.
     */
    public EmailContent setPlainText(String plainText) {
        this.plainText = plainText;
        return this;
    }

    /**
     * Get the html property: Html version of the email message.
     *
     * @return the html value.
     */
    public String getHtml() {
        return this.html;
    }

    /**
     * Set the html property: Html version of the email message.
     *
     * @param html the html value to set.
     * @return the EmailContent object itself.
     */
    public EmailContent setHtml(String html) {
        this.html = html;
        return this;
    }
}
