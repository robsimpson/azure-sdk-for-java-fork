// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.AlertsSuppressionRuleInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of AlertsSuppressionRule. */
public interface AlertsSuppressionRule {
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
     * Gets the alertType property: Type of the alert to automatically suppress. For all alert types, use '*'.
     *
     * @return the alertType value.
     */
    String alertType();

    /**
     * Gets the lastModifiedUtc property: The last time this rule was modified.
     *
     * @return the lastModifiedUtc value.
     */
    OffsetDateTime lastModifiedUtc();

    /**
     * Gets the expirationDateUtc property: Expiration date of the rule, if value is not provided or provided as null
     * this field will default to the maximum allowed expiration date.
     *
     * @return the expirationDateUtc value.
     */
    OffsetDateTime expirationDateUtc();

    /**
     * Gets the reason property: The reason for dismissing the alert.
     *
     * @return the reason value.
     */
    String reason();

    /**
     * Gets the state property: Possible states of the rule.
     *
     * @return the state value.
     */
    RuleState state();

    /**
     * Gets the comment property: Any comment regarding the rule.
     *
     * @return the comment value.
     */
    String comment();

    /**
     * Gets the suppressionAlertsScope property: The suppression conditions.
     *
     * @return the suppressionAlertsScope value.
     */
    SuppressionAlertsScope suppressionAlertsScope();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.AlertsSuppressionRuleInner object.
     *
     * @return the inner object.
     */
    AlertsSuppressionRuleInner innerModel();
}
