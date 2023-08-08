/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;


/**
 * The DeleteAppsOptionalParameter model.
 */
public class DeleteAppsOptionalParameter {
    /**
     * A flag to indicate whether to force an operation.
     */
    private Boolean force;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the force value.
     *
     * @return the force value
     */
    public Boolean force() {
        return this.force;
    }

    /**
     * Set the force value.
     *
     * @param force the force value to set
     * @return the DeleteAppsOptionalParameter object itself.
     */
    public DeleteAppsOptionalParameter withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the DeleteAppsOptionalParameter object itself.
     */
    public DeleteAppsOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
