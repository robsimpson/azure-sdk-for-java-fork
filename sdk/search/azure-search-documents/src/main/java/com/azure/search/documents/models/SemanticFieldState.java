// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** The way the field was used for the semantic enrichment process. */
public final class SemanticFieldState extends ExpandableStringEnum<SemanticFieldState> {
    /** The field was fully used for semantic enrichment. */
    public static final SemanticFieldState USED = fromString("used");

    /** The field was not used for semantic enrichment. */
    public static final SemanticFieldState UNUSED = fromString("unused");

    /** The field was partially used for semantic enrichment. */
    public static final SemanticFieldState PARTIAL = fromString("partial");

    /**
     * Creates a new instance of SemanticFieldState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SemanticFieldState() {}

    /**
     * Creates or finds a SemanticFieldState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SemanticFieldState.
     */
    public static SemanticFieldState fromString(String name) {
        return fromString(name, SemanticFieldState.class);
    }

    /**
     * Gets known SemanticFieldState values.
     *
     * @return known SemanticFieldState values.
     */
    public static Collection<SemanticFieldState> values() {
        return values(SemanticFieldState.class);
    }
}
