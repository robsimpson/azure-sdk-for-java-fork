// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Grouping matching method. When method is Selected at least one of groupByEntities, groupByAlertDetails,
 * groupByCustomDetails must be provided and not empty.
 */
public final class MatchingMethod extends ExpandableStringEnum<MatchingMethod> {
    /** Static value AllEntities for MatchingMethod. */
    public static final MatchingMethod ALL_ENTITIES = fromString("AllEntities");

    /** Static value AnyAlert for MatchingMethod. */
    public static final MatchingMethod ANY_ALERT = fromString("AnyAlert");

    /** Static value Selected for MatchingMethod. */
    public static final MatchingMethod SELECTED = fromString("Selected");

    /**
     * Creates or finds a MatchingMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MatchingMethod.
     */
    @JsonCreator
    public static MatchingMethod fromString(String name) {
        return fromString(name, MatchingMethod.class);
    }

    /**
     * Gets known MatchingMethod values.
     *
     * @return known MatchingMethod values.
     */
    public static Collection<MatchingMethod> values() {
        return values(MatchingMethod.class);
    }
}
