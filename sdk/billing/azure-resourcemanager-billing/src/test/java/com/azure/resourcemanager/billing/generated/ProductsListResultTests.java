// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.ProductsListResult;

public final class ProductsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProductsListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"autoRenew\":\"On\",\"displayName\":\"rn\",\"purchaseDate\":\"2021-01-14T16:52:07Z\",\"productTypeId\":\"q\",\"productType\":\"hxcr\",\"status\":\"PastDue\",\"endDate\":\"2021-11-28T02:47:56Z\",\"billingFrequency\":\"OneTime\",\"lastChargeDate\":\"2021-03-25T00:29:47Z\",\"quantity\":52.194805,\"skuId\":\"hsqfsubcgjbirxbp\",\"skuDescription\":\"srfbjfdtwss\",\"tenantId\":\"ftpvjzbexil\",\"availabilityId\":\"nfqqnvwp\",\"invoiceSectionId\":\"taruoujmkcj\",\"invoiceSectionDisplayName\":\"qytjrybnwjewgd\",\"billingProfileId\":\"ervnaenqpehi\",\"billingProfileDisplayName\":\"oygmift\",\"customerId\":\"zdnds\",\"customerDisplayName\":\"nayqi\"},\"id\":\"nduhavhqlkthum\",\"name\":\"qolbgyc\",\"type\":\"uie\"},{\"properties\":{\"autoRenew\":\"On\",\"displayName\":\"y\",\"purchaseDate\":\"2021-01-19T22:33:55Z\",\"productTypeId\":\"l\",\"productType\":\"slqlfmmdn\",\"status\":\"Expired\",\"endDate\":\"2021-10-21T18:49:25Z\",\"billingFrequency\":\"Monthly\",\"lastChargeDate\":\"2021-11-30T08:30:44Z\",\"quantity\":76.70319,\"skuId\":\"wyhzdx\",\"skuDescription\":\"adbzmnvdfznud\",\"tenantId\":\"dvxzbncblylpst\",\"availabilityId\":\"hh\",\"invoiceSectionId\":\"rzdzucerscdnt\",\"invoiceSectionDisplayName\":\"vfiwjmygtdss\",\"billingProfileId\":\"wtmwerio\",\"billingProfileDisplayName\":\"pyqs\",\"customerId\":\"wab\",\"customerDisplayName\":\"tshhszhedp\"},\"id\":\"wiwubm\",\"name\":\"mbes\",\"type\":\"dnkwwtppjflcxog\"},{\"properties\":{\"autoRenew\":\"Off\",\"displayName\":\"z\",\"purchaseDate\":\"2021-05-06T06:04:09Z\",\"productTypeId\":\"kvmkqzeqq\",\"productType\":\"l\",\"status\":\"Expired\",\"endDate\":\"2021-06-11T23:31:33Z\",\"billingFrequency\":\"OneTime\",\"lastChargeDate\":\"2021-01-04T21:57:35Z\",\"quantity\":1.5751779,\"skuId\":\"odkwobd\",\"skuDescription\":\"xtibqdxbxwakbog\",\"tenantId\":\"ndlkzgxhurip\",\"availabilityId\":\"podxunkb\",\"invoiceSectionId\":\"xmubyyntwlrbq\",\"invoiceSectionDisplayName\":\"oievseotgqrlltm\",\"billingProfileId\":\"lauwzizxbmpgcjef\",\"billingProfileDisplayName\":\"muvp\",\"customerId\":\"tdum\",\"customerDisplayName\":\"p\"},\"id\":\"ebmnzbtbhjpglk\",\"name\":\"gohdneuelfphsd\",\"type\":\"htozfikdow\"}],\"totalCount\":1185627072,\"nextLink\":\"v\"}")
                .toObject(ProductsListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProductsListResult model = new ProductsListResult();
        model = BinaryData.fromObject(model).toObject(ProductsListResult.class);
    }
}
