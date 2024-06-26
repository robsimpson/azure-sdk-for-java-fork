// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.confluent.fluent.models.ConfluentAgreementResourceInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of ConfluentAgreementResource.
 */
public interface ConfluentAgreementResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the publisher property: Publisher identifier string.
     * 
     * @return the publisher value.
     */
    String publisher();

    /**
     * Gets the product property: Product identifier string.
     * 
     * @return the product value.
     */
    String product();

    /**
     * Gets the plan property: Plan identifier string.
     * 
     * @return the plan value.
     */
    String plan();

    /**
     * Gets the licenseTextLink property: Link to HTML with Microsoft and Publisher terms.
     * 
     * @return the licenseTextLink value.
     */
    String licenseTextLink();

    /**
     * Gets the privacyPolicyLink property: Link to the privacy policy of the publisher.
     * 
     * @return the privacyPolicyLink value.
     */
    String privacyPolicyLink();

    /**
     * Gets the retrieveDatetime property: Date and time in UTC of when the terms were accepted. This is empty if
     * Accepted is false.
     * 
     * @return the retrieveDatetime value.
     */
    OffsetDateTime retrieveDatetime();

    /**
     * Gets the signature property: Terms signature.
     * 
     * @return the signature value.
     */
    String signature();

    /**
     * Gets the accepted property: If any version of the terms have been accepted, otherwise false.
     * 
     * @return the accepted value.
     */
    Boolean accepted();

    /**
     * Gets the inner com.azure.resourcemanager.confluent.fluent.models.ConfluentAgreementResourceInner object.
     * 
     * @return the inner object.
     */
    ConfluentAgreementResourceInner innerModel();
}
