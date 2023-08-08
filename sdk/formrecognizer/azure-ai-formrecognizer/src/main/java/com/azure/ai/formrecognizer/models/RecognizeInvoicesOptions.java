// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;

import java.util.List;

/**
 * Options that may be passed when using recognize invoice APIs on Form Recognizer client.
 */
@Fluent
public final class RecognizeInvoicesOptions {
    private FormContentType contentType;
    private boolean includeFieldElements;
    private FormRecognizerLocale locale;
    private List<String> pages;

    /**
     * Get the type of the form. Supported Media types including .pdf, .jpg, .png or .tiff type file stream.
     *
     * @return the {@code contentType} value.
     */
    public FormContentType getContentType() {
        return contentType;
    }

    /**
     * Get the boolean which specifies if to include form element references in the result.
     *
     * @return the {@code includeFieldElements} value.
     */
    public boolean isFieldElementsIncluded() {
        return includeFieldElements;
    }

    /**
     * Set the type of the form. Supported Media types including .pdf, .jpg, .png or .tiff type file stream.
     *
     * @param contentType the provided form content type.
     *
     * @return the updated {@code RecognizeInvoicesOptions} value.
     */
    public RecognizeInvoicesOptions setContentType(final FormContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Set the boolean which specifies if to include form element references in the result.
     *
     * @param includeFieldElements the boolean to specify if to include form element references in the result.
     *
     * @return the updated {@code RecognizeInvoicesOptions} value.
     */
    public RecognizeInvoicesOptions setFieldElementsIncluded(final boolean includeFieldElements) {
        this.includeFieldElements = includeFieldElements;
        return this;
    }

    /**
     * Get the locale information for the invoice.
     * Supported locales include: en-US.
     *
     * @return the locale value.
     */
    public FormRecognizerLocale getLocale() {
        return locale;
    }

    /**
     * Set the locale information for the invoice.
     * Supported locales include: en-US.
     *
     * @param locale the locale value to set.
     * @return the updated {@code RecognizeInvoicesOptions} value.
     */
    public RecognizeInvoicesOptions setLocale(final FormRecognizerLocale locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get the custom page numbers for multi-page documents(PDF/TIFF). Input the number of the
     * pages you want to get the recognized result for.
     * <p>For a range of pages, use a hyphen, ex - ["1-3"]. Separate each page or a page
     * range with a comma, ex - ["1-3", 4].</p>
     *
     * @return the list of custom page numbers for a multi page document.
     */
    public List<String> getPages() {
        return pages;
    }

    /**
     * Set the custom page numbers for multi-page documents(PDF/TIFF). Input the number of the
     * pages you want to get the recognized result for.
     * <p>For a range of pages, use a hyphen, ex - ["1-3"]. Separate each page or a page
     * range with a comma, ex - ["1-3", 4].</p>
     *
     * @param pages the custom page numbers value to set.
     * @return the updated {@code RecognizeInvoicesOptions} value.
     */
    public RecognizeInvoicesOptions setPages(List<String> pages) {
        this.pages = pages;
        return this;
    }
}
