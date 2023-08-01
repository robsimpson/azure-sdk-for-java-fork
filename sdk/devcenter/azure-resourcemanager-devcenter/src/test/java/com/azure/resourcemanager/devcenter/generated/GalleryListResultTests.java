// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.GalleryListResult;

public final class GalleryListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GalleryListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Updating\",\"galleryResourceId\":\"rzafbljjgpbtoqcj\"},\"id\":\"ljavbqid\",\"name\":\"qajzyulpkudjkr\",\"type\":\"khbzhfepgzg\"}],\"nextLink\":\"xzlocxscp\"}")
                .toObject(GalleryListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GalleryListResult model = new GalleryListResult();
        model = BinaryData.fromObject(model).toObject(GalleryListResult.class);
    }
}
