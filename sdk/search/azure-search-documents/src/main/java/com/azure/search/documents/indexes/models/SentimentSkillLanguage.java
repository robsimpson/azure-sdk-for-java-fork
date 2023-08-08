// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Deprecated. The language codes supported for input text by SentimentSkill. */
public final class SentimentSkillLanguage extends ExpandableStringEnum<SentimentSkillLanguage> {
    /** Danish. */
    public static final SentimentSkillLanguage DA = fromString("da");

    /** Dutch. */
    public static final SentimentSkillLanguage NL = fromString("nl");

    /** English. */
    public static final SentimentSkillLanguage EN = fromString("en");

    /** Finnish. */
    public static final SentimentSkillLanguage FI = fromString("fi");

    /** French. */
    public static final SentimentSkillLanguage FR = fromString("fr");

    /** German. */
    public static final SentimentSkillLanguage DE = fromString("de");

    /** Greek. */
    public static final SentimentSkillLanguage EL = fromString("el");

    /** Italian. */
    public static final SentimentSkillLanguage IT = fromString("it");

    /** Norwegian (Bokmaal). */
    public static final SentimentSkillLanguage NO = fromString("no");

    /** Polish. */
    public static final SentimentSkillLanguage PL = fromString("pl");

    /** Portuguese (Portugal). */
    public static final SentimentSkillLanguage PT_PT = fromString("pt-PT");

    /** Russian. */
    public static final SentimentSkillLanguage RU = fromString("ru");

    /** Spanish. */
    public static final SentimentSkillLanguage ES = fromString("es");

    /** Swedish. */
    public static final SentimentSkillLanguage SV = fromString("sv");

    /** Turkish. */
    public static final SentimentSkillLanguage TR = fromString("tr");

    /**
     * Creates a new instance of SentimentSkillLanguage value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SentimentSkillLanguage() {}

    /**
     * Creates or finds a SentimentSkillLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SentimentSkillLanguage.
     */
    public static SentimentSkillLanguage fromString(String name) {
        return fromString(name, SentimentSkillLanguage.class);
    }

    /**
     * Gets known SentimentSkillLanguage values.
     *
     * @return known SentimentSkillLanguage values.
     */
    public static Collection<SentimentSkillLanguage> values() {
        return values(SentimentSkillLanguage.class);
    }
}
