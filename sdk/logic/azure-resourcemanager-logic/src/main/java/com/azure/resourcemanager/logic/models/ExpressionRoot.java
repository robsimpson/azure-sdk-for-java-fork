// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The expression root. */
@Fluent
public final class ExpressionRoot extends Expression {
    /*
     * The path.
     */
    @JsonProperty(value = "path")
    private String path;

    /** Creates an instance of ExpressionRoot class. */
    public ExpressionRoot() {
    }

    /**
     * Get the path property: The path.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path.
     *
     * @param path the path value to set.
     * @return the ExpressionRoot object itself.
     */
    public ExpressionRoot withPath(String path) {
        this.path = path;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressionRoot withText(String text) {
        super.withText(text);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressionRoot withValue(Object value) {
        super.withValue(value);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressionRoot withSubexpressions(List<Expression> subexpressions) {
        super.withSubexpressions(subexpressions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressionRoot withError(AzureResourceErrorInfo error) {
        super.withError(error);
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
    }
}
