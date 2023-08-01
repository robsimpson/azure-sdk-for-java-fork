// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.AnalysisResolution;
import com.azure.resourcemanager.mediaservices.models.BlurType;
import com.azure.resourcemanager.mediaservices.models.FaceDetectorPreset;
import com.azure.resourcemanager.mediaservices.models.FaceRedactorMode;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FaceDetectorPresetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FaceDetectorPreset model =
            BinaryData
                .fromString(
                    "{\"@odata.type\":\"#Microsoft.Media.FaceDetectorPreset\",\"resolution\":\"SourceResolution\",\"mode\":\"Combined\",\"blurType\":\"Box\",\"experimentalOptions\":{\"eoybfhjxakvvjgs\":\"oorb\",\"dabg\":\"ordilmywwtkgkxny\"}}")
                .toObject(FaceDetectorPreset.class);
        Assertions.assertEquals(AnalysisResolution.SOURCE_RESOLUTION, model.resolution());
        Assertions.assertEquals(FaceRedactorMode.COMBINED, model.mode());
        Assertions.assertEquals(BlurType.BOX, model.blurType());
        Assertions.assertEquals("oorb", model.experimentalOptions().get("eoybfhjxakvvjgs"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FaceDetectorPreset model =
            new FaceDetectorPreset()
                .withResolution(AnalysisResolution.SOURCE_RESOLUTION)
                .withMode(FaceRedactorMode.COMBINED)
                .withBlurType(BlurType.BOX)
                .withExperimentalOptions(mapOf("eoybfhjxakvvjgs", "oorb", "dabg", "ordilmywwtkgkxny"));
        model = BinaryData.fromObject(model).toObject(FaceDetectorPreset.class);
        Assertions.assertEquals(AnalysisResolution.SOURCE_RESOLUTION, model.resolution());
        Assertions.assertEquals(FaceRedactorMode.COMBINED, model.mode());
        Assertions.assertEquals(BlurType.BOX, model.blurType());
        Assertions.assertEquals("oorb", model.experimentalOptions().get("eoybfhjxakvvjgs"));
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
