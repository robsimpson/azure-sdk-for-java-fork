// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.RecurrenceSchedule;
import com.azure.resourcemanager.machinelearning.models.WeekDay;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RecurrenceScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecurrenceSchedule model =
            BinaryData
                .fromString(
                    "{\"hours\":[2030386405,1910653936,488610875,1439896312],\"minutes\":[1083020573],\"monthDays\":[1541422170,1378797079,254990993],\"weekDays\":[\"Friday\",\"Saturday\",\"Saturday\"]}")
                .toObject(RecurrenceSchedule.class);
        Assertions.assertEquals(2030386405, model.hours().get(0));
        Assertions.assertEquals(1083020573, model.minutes().get(0));
        Assertions.assertEquals(1541422170, model.monthDays().get(0));
        Assertions.assertEquals(WeekDay.FRIDAY, model.weekDays().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecurrenceSchedule model =
            new RecurrenceSchedule()
                .withHours(Arrays.asList(2030386405, 1910653936, 488610875, 1439896312))
                .withMinutes(Arrays.asList(1083020573))
                .withMonthDays(Arrays.asList(1541422170, 1378797079, 254990993))
                .withWeekDays(Arrays.asList(WeekDay.FRIDAY, WeekDay.SATURDAY, WeekDay.SATURDAY));
        model = BinaryData.fromObject(model).toObject(RecurrenceSchedule.class);
        Assertions.assertEquals(2030386405, model.hours().get(0));
        Assertions.assertEquals(1083020573, model.minutes().get(0));
        Assertions.assertEquals(1541422170, model.monthDays().get(0));
        Assertions.assertEquals(WeekDay.FRIDAY, model.weekDays().get(0));
    }
}
