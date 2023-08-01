// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Parameters for filtering, sorting, fuzzy matching, and other suggestions query behaviors. */
@Fluent
public final class SuggestRequest implements JsonSerializable<SuggestRequest> {
    /*
     * An OData expression that filters the documents considered for suggestions.
     */
    private String filter;

    /*
     * A value indicating whether to use fuzzy matching for the suggestion query. Default is false. When set to true,
     * the query will find suggestions even if there's a substituted or missing character in the search text. While
     * this provides a better experience in some scenarios, it comes at a performance cost as fuzzy suggestion searches
     * are slower and consume more resources.
     */
    private Boolean useFuzzyMatching;

    /*
     * A string tag that is appended to hit highlights. Must be set with highlightPreTag. If omitted, hit highlighting
     * of suggestions is disabled.
     */
    private String highlightPostTag;

    /*
     * A string tag that is prepended to hit highlights. Must be set with highlightPostTag. If omitted, hit
     * highlighting of suggestions is disabled.
     */
    private String highlightPreTag;

    /*
     * A number between 0 and 100 indicating the percentage of the index that must be covered by a suggestion query in
     * order for the query to be reported as a success. This parameter can be useful for ensuring search availability
     * even for services with only one replica. The default is 80.
     */
    private Double minimumCoverage;

    /*
     * The comma-separated list of OData $orderby expressions by which to sort the results. Each expression can be
     * either a field name or a call to either the geo.distance() or the search.score() functions. Each expression can
     * be followed by asc to indicate ascending, or desc to indicate descending. The default is ascending order. Ties
     * will be broken by the match scores of documents. If no $orderby is specified, the default sort order is
     * descending by document match score. There can be at most 32 $orderby clauses.
     */
    private String orderBy;

    /*
     * The search text to use to suggest documents. Must be at least 1 character, and no more than 100 characters.
     */
    private final String searchText;

    /*
     * The comma-separated list of field names to search for the specified search text. Target fields must be included
     * in the specified suggester.
     */
    private String searchFields;

    /*
     * The comma-separated list of fields to retrieve. If unspecified, only the key field will be included in the
     * results.
     */
    private String select;

    /*
     * The name of the suggester as specified in the suggesters collection that's part of the index definition.
     */
    private final String suggesterName;

    /*
     * The number of suggestions to retrieve. This must be a value between 1 and 100. The default is 5.
     */
    private Integer top;

    /**
     * Creates an instance of SuggestRequest class.
     *
     * @param searchText the searchText value to set.
     * @param suggesterName the suggesterName value to set.
     */
    public SuggestRequest(String searchText, String suggesterName) {
        this.searchText = searchText;
        this.suggesterName = suggesterName;
    }

    /**
     * Get the filter property: An OData expression that filters the documents considered for suggestions.
     *
     * @return the filter value.
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: An OData expression that filters the documents considered for suggestions.
     *
     * @param filter the filter value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the useFuzzyMatching property: A value indicating whether to use fuzzy matching for the suggestion query.
     * Default is false. When set to true, the query will find suggestions even if there's a substituted or missing
     * character in the search text. While this provides a better experience in some scenarios, it comes at a
     * performance cost as fuzzy suggestion searches are slower and consume more resources.
     *
     * @return the useFuzzyMatching value.
     */
    public Boolean isUseFuzzyMatching() {
        return this.useFuzzyMatching;
    }

    /**
     * Set the useFuzzyMatching property: A value indicating whether to use fuzzy matching for the suggestion query.
     * Default is false. When set to true, the query will find suggestions even if there's a substituted or missing
     * character in the search text. While this provides a better experience in some scenarios, it comes at a
     * performance cost as fuzzy suggestion searches are slower and consume more resources.
     *
     * @param useFuzzyMatching the useFuzzyMatching value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setUseFuzzyMatching(Boolean useFuzzyMatching) {
        this.useFuzzyMatching = useFuzzyMatching;
        return this;
    }

    /**
     * Get the highlightPostTag property: A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. If omitted, hit highlighting of suggestions is disabled.
     *
     * @return the highlightPostTag value.
     */
    public String getHighlightPostTag() {
        return this.highlightPostTag;
    }

    /**
     * Set the highlightPostTag property: A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. If omitted, hit highlighting of suggestions is disabled.
     *
     * @param highlightPostTag the highlightPostTag value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setHighlightPostTag(String highlightPostTag) {
        this.highlightPostTag = highlightPostTag;
        return this;
    }

    /**
     * Get the highlightPreTag property: A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. If omitted, hit highlighting of suggestions is disabled.
     *
     * @return the highlightPreTag value.
     */
    public String getHighlightPreTag() {
        return this.highlightPreTag;
    }

    /**
     * Set the highlightPreTag property: A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. If omitted, hit highlighting of suggestions is disabled.
     *
     * @param highlightPreTag the highlightPreTag value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setHighlightPreTag(String highlightPreTag) {
        this.highlightPreTag = highlightPreTag;
        return this;
    }

    /**
     * Get the minimumCoverage property: A number between 0 and 100 indicating the percentage of the index that must be
     * covered by a suggestion query in order for the query to be reported as a success. This parameter can be useful
     * for ensuring search availability even for services with only one replica. The default is 80.
     *
     * @return the minimumCoverage value.
     */
    public Double getMinimumCoverage() {
        return this.minimumCoverage;
    }

    /**
     * Set the minimumCoverage property: A number between 0 and 100 indicating the percentage of the index that must be
     * covered by a suggestion query in order for the query to be reported as a success. This parameter can be useful
     * for ensuring search availability even for services with only one replica. The default is 80.
     *
     * @param minimumCoverage the minimumCoverage value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setMinimumCoverage(Double minimumCoverage) {
        this.minimumCoverage = minimumCoverage;
        return this;
    }

    /**
     * Get the orderBy property: The comma-separated list of OData $orderby expressions by which to sort the results.
     * Each expression can be either a field name or a call to either the geo.distance() or the search.score()
     * functions. Each expression can be followed by asc to indicate ascending, or desc to indicate descending. The
     * default is ascending order. Ties will be broken by the match scores of documents. If no $orderby is specified,
     * the default sort order is descending by document match score. There can be at most 32 $orderby clauses.
     *
     * @return the orderBy value.
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: The comma-separated list of OData $orderby expressions by which to sort the results.
     * Each expression can be either a field name or a call to either the geo.distance() or the search.score()
     * functions. Each expression can be followed by asc to indicate ascending, or desc to indicate descending. The
     * default is ascending order. Ties will be broken by the match scores of documents. If no $orderby is specified,
     * the default sort order is descending by document match score. There can be at most 32 $orderby clauses.
     *
     * @param orderBy the orderBy value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get the searchText property: The search text to use to suggest documents. Must be at least 1 character, and no
     * more than 100 characters.
     *
     * @return the searchText value.
     */
    public String getSearchText() {
        return this.searchText;
    }

    /**
     * Get the searchFields property: The comma-separated list of field names to search for the specified search text.
     * Target fields must be included in the specified suggester.
     *
     * @return the searchFields value.
     */
    public String getSearchFields() {
        return this.searchFields;
    }

    /**
     * Set the searchFields property: The comma-separated list of field names to search for the specified search text.
     * Target fields must be included in the specified suggester.
     *
     * @param searchFields the searchFields value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setSearchFields(String searchFields) {
        this.searchFields = searchFields;
        return this;
    }

    /**
     * Get the select property: The comma-separated list of fields to retrieve. If unspecified, only the key field will
     * be included in the results.
     *
     * @return the select value.
     */
    public String getSelect() {
        return this.select;
    }

    /**
     * Set the select property: The comma-separated list of fields to retrieve. If unspecified, only the key field will
     * be included in the results.
     *
     * @param select the select value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setSelect(String select) {
        this.select = select;
        return this;
    }

    /**
     * Get the suggesterName property: The name of the suggester as specified in the suggesters collection that's part
     * of the index definition.
     *
     * @return the suggesterName value.
     */
    public String getSuggesterName() {
        return this.suggesterName;
    }

    /**
     * Get the top property: The number of suggestions to retrieve. This must be a value between 1 and 100. The default
     * is 5.
     *
     * @return the top value.
     */
    public Integer getTop() {
        return this.top;
    }

    /**
     * Set the top property: The number of suggestions to retrieve. This must be a value between 1 and 100. The default
     * is 5.
     *
     * @param top the top value to set.
     * @return the SuggestRequest object itself.
     */
    public SuggestRequest setTop(Integer top) {
        this.top = top;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("search", this.searchText);
        jsonWriter.writeStringField("suggesterName", this.suggesterName);
        jsonWriter.writeStringField("filter", this.filter);
        jsonWriter.writeBooleanField("fuzzy", this.useFuzzyMatching);
        jsonWriter.writeStringField("highlightPostTag", this.highlightPostTag);
        jsonWriter.writeStringField("highlightPreTag", this.highlightPreTag);
        jsonWriter.writeNumberField("minimumCoverage", this.minimumCoverage);
        jsonWriter.writeStringField("orderby", this.orderBy);
        jsonWriter.writeStringField("searchFields", this.searchFields);
        jsonWriter.writeStringField("select", this.select);
        jsonWriter.writeNumberField("top", this.top);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SuggestRequest from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SuggestRequest if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SuggestRequest.
     */
    public static SuggestRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean searchTextFound = false;
                    String searchText = null;
                    boolean suggesterNameFound = false;
                    String suggesterName = null;
                    String filter = null;
                    Boolean useFuzzyMatching = null;
                    String highlightPostTag = null;
                    String highlightPreTag = null;
                    Double minimumCoverage = null;
                    String orderBy = null;
                    String searchFields = null;
                    String select = null;
                    Integer top = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("search".equals(fieldName)) {
                            searchText = reader.getString();
                            searchTextFound = true;
                        } else if ("suggesterName".equals(fieldName)) {
                            suggesterName = reader.getString();
                            suggesterNameFound = true;
                        } else if ("filter".equals(fieldName)) {
                            filter = reader.getString();
                        } else if ("fuzzy".equals(fieldName)) {
                            useFuzzyMatching = reader.getNullable(JsonReader::getBoolean);
                        } else if ("highlightPostTag".equals(fieldName)) {
                            highlightPostTag = reader.getString();
                        } else if ("highlightPreTag".equals(fieldName)) {
                            highlightPreTag = reader.getString();
                        } else if ("minimumCoverage".equals(fieldName)) {
                            minimumCoverage = reader.getNullable(JsonReader::getDouble);
                        } else if ("orderby".equals(fieldName)) {
                            orderBy = reader.getString();
                        } else if ("searchFields".equals(fieldName)) {
                            searchFields = reader.getString();
                        } else if ("select".equals(fieldName)) {
                            select = reader.getString();
                        } else if ("top".equals(fieldName)) {
                            top = reader.getNullable(JsonReader::getInt);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (searchTextFound && suggesterNameFound) {
                        SuggestRequest deserializedSuggestRequest = new SuggestRequest(searchText, suggesterName);
                        deserializedSuggestRequest.filter = filter;
                        deserializedSuggestRequest.useFuzzyMatching = useFuzzyMatching;
                        deserializedSuggestRequest.highlightPostTag = highlightPostTag;
                        deserializedSuggestRequest.highlightPreTag = highlightPreTag;
                        deserializedSuggestRequest.minimumCoverage = minimumCoverage;
                        deserializedSuggestRequest.orderBy = orderBy;
                        deserializedSuggestRequest.searchFields = searchFields;
                        deserializedSuggestRequest.select = select;
                        deserializedSuggestRequest.top = top;

                        return deserializedSuggestRequest;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!searchTextFound) {
                        missingProperties.add("search");
                    }
                    if (!suggesterNameFound) {
                        missingProperties.add("suggesterName");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
