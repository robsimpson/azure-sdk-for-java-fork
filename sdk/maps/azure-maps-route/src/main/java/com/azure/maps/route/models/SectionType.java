// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SectionType. */
public final class SectionType extends ExpandableStringEnum<SectionType> {
    /** Static value carTrain for SectionType. */
    public static final SectionType CAR_OR_TRAIN = fromString("carTrain");

    /** Static value country for SectionType. */
    public static final SectionType COUNTRY = fromString("country");

    /** Static value ferry for SectionType. */
    public static final SectionType FERRY = fromString("ferry");

    /** Static value motorway for SectionType. */
    public static final SectionType MOTORWAY = fromString("motorway");

    /** Static value pedestrian for SectionType. */
    public static final SectionType PEDESTRIAN = fromString("pedestrian");

    /** Static value tollRoad for SectionType. */
    public static final SectionType TOLL_ROAD = fromString("tollRoad");

    /** Static value tollVignette for SectionType. */
    public static final SectionType TOLL_VIGNETTE = fromString("tollVignette");

    /** Static value traffic for SectionType. */
    public static final SectionType TRAFFIC = fromString("traffic");

    /** Static value travelMode for SectionType. */
    public static final SectionType TRAVEL_MODE = fromString("travelMode");

    /** Static value tunnel for SectionType. */
    public static final SectionType TUNNEL = fromString("tunnel");

    /** Static value carpool for SectionType. */
    public static final SectionType CARPOOL = fromString("carpool");

    /** Static value urban for SectionType. */
    public static final SectionType URBAN = fromString("urban");

    /**
     * Creates or finds a SectionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SectionType.
     */
    @JsonCreator
    public static SectionType fromString(String name) {
        return fromString(name, SectionType.class);
    }

    /**
     * Gets known SectionType values.
     *
     * @return known SectionType values.
     */
    public static Collection<SectionType> values() {
        return values(SectionType.class);
    }
}
