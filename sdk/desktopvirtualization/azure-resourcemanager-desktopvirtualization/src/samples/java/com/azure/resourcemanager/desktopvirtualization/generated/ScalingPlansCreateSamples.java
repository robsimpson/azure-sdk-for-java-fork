// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.resourcemanager.desktopvirtualization.models.ScalingHostPoolReference;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingHostPoolType;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingSchedule;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingScheduleDaysOfWeekItem;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostLoadBalancingAlgorithm;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ScalingPlans Create. */
public final class ScalingPlansCreateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2022-09-09/examples/ScalingPlan_Create.json
     */
    /**
     * Sample code: ScalingPlans_Create.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlansCreate(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .scalingPlans()
            .define("scalingPlan1")
            .withRegion("centralus")
            .withExistingResourceGroup("resourceGroup1")
            .withTimeZone("Central Standard Time")
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withDescription("Description of Scaling Plan")
            .withFriendlyName("Scaling Plan 1")
            .withHostPoolType(ScalingHostPoolType.POOLED)
            .withExclusionTag("value")
            .withSchedules(
                Arrays
                    .asList(
                        new ScalingSchedule()
                            .withName("schedule1")
                            .withDaysOfWeek(
                                Arrays
                                    .asList(
                                        ScalingScheduleDaysOfWeekItem.MONDAY,
                                        ScalingScheduleDaysOfWeekItem.TUESDAY,
                                        ScalingScheduleDaysOfWeekItem.WEDNESDAY,
                                        ScalingScheduleDaysOfWeekItem.THURSDAY,
                                        ScalingScheduleDaysOfWeekItem.FRIDAY))
                            .withRampUpStartTime(new Time().withHour(6).withMinute(0))
                            .withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                            .withRampUpMinimumHostsPct(20)
                            .withRampUpCapacityThresholdPct(80)
                            .withPeakStartTime(new Time().withHour(8).withMinute(0))
                            .withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST)
                            .withRampDownStartTime(new Time().withHour(18).withMinute(0))
                            .withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)
                            .withRampDownMinimumHostsPct(20)
                            .withRampDownCapacityThresholdPct(50)
                            .withRampDownForceLogoffUsers(true)
                            .withRampDownWaitTimeMinutes(30)
                            .withRampDownNotificationMessage("message")
                            .withOffPeakStartTime(new Time().withHour(20).withMinute(0))
                            .withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST)))
            .withHostPoolReferences(
                Arrays
                    .asList(
                        new ScalingHostPoolReference()
                            .withHostPoolArmPath(
                                "/subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroup1/providers/Microsoft.DesktopVirtualization/hostPools/hostPool1")
                            .withScalingPlanEnabled(true)))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
