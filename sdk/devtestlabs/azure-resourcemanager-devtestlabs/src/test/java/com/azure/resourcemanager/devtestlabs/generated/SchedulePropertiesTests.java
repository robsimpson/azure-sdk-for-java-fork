// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleProperties;
import com.azure.resourcemanager.devtestlabs.models.DayDetails;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.HourDetails;
import com.azure.resourcemanager.devtestlabs.models.NotificationSettings;
import com.azure.resourcemanager.devtestlabs.models.WeekDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SchedulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleProperties model =
            BinaryData
                .fromString(
                    "{\"status\":\"Enabled\",\"taskType\":\"jeyp\",\"weeklyRecurrence\":{\"weekdays\":[\"rkgqhcjrefo\",\"gm\",\"qsl\",\"yyvxyqjpkcattpn\"],\"time\":\"cr\"},\"dailyRecurrence\":{\"time\":\"sqpjhvmdajvn\"},\"hourlyRecurrence\":{\"minute\":340667292},\"timeZoneId\":\"q\",\"notificationSettings\":{\"status\":\"Enabled\",\"timeInMinutes\":389510865,\"webhookUrl\":\"upfh\",\"emailRecipient\":\"ltrpmopj\",\"notificationLocale\":\"matuok\"},\"createdDate\":\"2021-07-09T17:51:05Z\",\"targetResourceId\":\"iuaod\",\"provisioningState\":\"cpkvxodp\",\"uniqueIdentifier\":\"zmyzydagf\"}")
                .toObject(ScheduleProperties.class);
        Assertions.assertEquals(EnableStatus.ENABLED, model.status());
        Assertions.assertEquals("jeyp", model.taskType());
        Assertions.assertEquals("rkgqhcjrefo", model.weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("cr", model.weeklyRecurrence().time());
        Assertions.assertEquals("sqpjhvmdajvn", model.dailyRecurrence().time());
        Assertions.assertEquals(340667292, model.hourlyRecurrence().minute());
        Assertions.assertEquals("q", model.timeZoneId());
        Assertions.assertEquals(EnableStatus.ENABLED, model.notificationSettings().status());
        Assertions.assertEquals(389510865, model.notificationSettings().timeInMinutes());
        Assertions.assertEquals("upfh", model.notificationSettings().webhookUrl());
        Assertions.assertEquals("ltrpmopj", model.notificationSettings().emailRecipient());
        Assertions.assertEquals("matuok", model.notificationSettings().notificationLocale());
        Assertions.assertEquals("iuaod", model.targetResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleProperties model =
            new ScheduleProperties()
                .withStatus(EnableStatus.ENABLED)
                .withTaskType("jeyp")
                .withWeeklyRecurrence(
                    new WeekDetails()
                        .withWeekdays(Arrays.asList("rkgqhcjrefo", "gm", "qsl", "yyvxyqjpkcattpn"))
                        .withTime("cr"))
                .withDailyRecurrence(new DayDetails().withTime("sqpjhvmdajvn"))
                .withHourlyRecurrence(new HourDetails().withMinute(340667292))
                .withTimeZoneId("q")
                .withNotificationSettings(
                    new NotificationSettings()
                        .withStatus(EnableStatus.ENABLED)
                        .withTimeInMinutes(389510865)
                        .withWebhookUrl("upfh")
                        .withEmailRecipient("ltrpmopj")
                        .withNotificationLocale("matuok"))
                .withTargetResourceId("iuaod");
        model = BinaryData.fromObject(model).toObject(ScheduleProperties.class);
        Assertions.assertEquals(EnableStatus.ENABLED, model.status());
        Assertions.assertEquals("jeyp", model.taskType());
        Assertions.assertEquals("rkgqhcjrefo", model.weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("cr", model.weeklyRecurrence().time());
        Assertions.assertEquals("sqpjhvmdajvn", model.dailyRecurrence().time());
        Assertions.assertEquals(340667292, model.hourlyRecurrence().minute());
        Assertions.assertEquals("q", model.timeZoneId());
        Assertions.assertEquals(EnableStatus.ENABLED, model.notificationSettings().status());
        Assertions.assertEquals(389510865, model.notificationSettings().timeInMinutes());
        Assertions.assertEquals("upfh", model.notificationSettings().webhookUrl());
        Assertions.assertEquals("ltrpmopj", model.notificationSettings().emailRecipient());
        Assertions.assertEquals("matuok", model.notificationSettings().notificationLocale());
        Assertions.assertEquals("iuaod", model.targetResourceId());
    }
}
