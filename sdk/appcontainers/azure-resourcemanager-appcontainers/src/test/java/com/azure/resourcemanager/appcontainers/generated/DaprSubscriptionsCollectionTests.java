// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprSubscriptionInner;
import com.azure.resourcemanager.appcontainers.models.DaprSubscriptionBulkSubscribeOptions;
import com.azure.resourcemanager.appcontainers.models.DaprSubscriptionRouteRule;
import com.azure.resourcemanager.appcontainers.models.DaprSubscriptionRoutes;
import com.azure.resourcemanager.appcontainers.models.DaprSubscriptionsCollection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DaprSubscriptionsCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprSubscriptionsCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"pubsubName\":\"rmoucsofl\",\"topic\":\"uviyfcaabeo\",\"deadLetterTopic\":\"bh\",\"routes\":{\"rules\":[{}],\"default\":\"uqibsxtkcu\"},\"scopes\":[\"sfar\"],\"metadata\":{\"gf\":\"owlkjxnqpv\"},\"bulkSubscribe\":{\"enabled\":true,\"maxMessagesCount\":889840232,\"maxAwaitDurationMs\":1864942425}},\"id\":\"mdksaoa\",\"name\":\"cluqvo\",\"type\":\"mycjimryvwgcwwp\"},{\"properties\":{\"pubsubName\":\"gwe\",\"topic\":\"dsxwefoh\",\"deadLetterTopic\":\"bvopwndyqle\",\"routes\":{\"rules\":[{},{},{}],\"default\":\"mtkhlowkxxpvbr\"},\"scopes\":[\"mzsyzfhotl\",\"ikcyyc\"],\"metadata\":{\"uic\":\"sjlpjrtwszhv\",\"ubhvj\":\"hvtrrmhwrbfdpyf\",\"memhooclutnpq\":\"lrocuyzlwh\"},\"bulkSubscribe\":{\"enabled\":false,\"maxMessagesCount\":339637531,\"maxAwaitDurationMs\":1132519096}},\"id\":\"ykyujxsg\",\"name\":\"hsrrryejylmbkz\",\"type\":\"dnigrfihot\"},{\"properties\":{\"pubsubName\":\"lpxuzzjgnrefq\",\"topic\":\"qotoihiqakydiwfb\",\"deadLetterTopic\":\"wpzdqtvhcspo\",\"routes\":{\"rules\":[{},{},{}],\"default\":\"sipi\"},\"scopes\":[\"bebjfu\",\"bmoichd\"],\"metadata\":{\"iqsowsaaelc\":\"fpubntnbatz\",\"mjvlgfgg\":\"ttcjuhplrvkmjc\",\"sfuztlvtmv\":\"vkyylizrzbjpsf\"},\"bulkSubscribe\":{\"enabled\":false,\"maxMessagesCount\":891535208,\"maxAwaitDurationMs\":563395516}},\"id\":\"hukoveofizrv\",\"name\":\"f\",\"type\":\"mjm\"},{\"properties\":{\"pubsubName\":\"yzgib\",\"topic\":\"ujr\",\"deadLetterTopic\":\"fojuidjpuuyj\",\"routes\":{\"rules\":[{},{},{},{}],\"default\":\"kzoeovvtzejetj\"},\"scopes\":[\"tikyj\"],\"metadata\":{\"rhtgvgzpcrrkol\":\"dbqzolxrzvhqjw\"},\"bulkSubscribe\":{\"enabled\":false,\"maxMessagesCount\":817860491,\"maxAwaitDurationMs\":660756224}},\"id\":\"okcdxfzzzwyjaf\",\"name\":\"tlhguynuchl\",\"type\":\"mltx\"}],\"nextLink\":\"hmoz\"}")
            .toObject(DaprSubscriptionsCollection.class);
        Assertions.assertEquals("rmoucsofl", model.value().get(0).pubsubName());
        Assertions.assertEquals("uviyfcaabeo", model.value().get(0).topic());
        Assertions.assertEquals("bh", model.value().get(0).deadLetterTopic());
        Assertions.assertEquals("uqibsxtkcu", model.value().get(0).routes().defaultProperty());
        Assertions.assertEquals("sfar", model.value().get(0).scopes().get(0));
        Assertions.assertEquals("owlkjxnqpv", model.value().get(0).metadata().get("gf"));
        Assertions.assertEquals(true, model.value().get(0).bulkSubscribe().enabled());
        Assertions.assertEquals(889840232, model.value().get(0).bulkSubscribe().maxMessagesCount());
        Assertions.assertEquals(1864942425, model.value().get(0).bulkSubscribe().maxAwaitDurationMs());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprSubscriptionsCollection model
            = new DaprSubscriptionsCollection()
                .withValue(Arrays.asList(
                    new DaprSubscriptionInner().withPubsubName("rmoucsofl").withTopic("uviyfcaabeo")
                        .withDeadLetterTopic("bh")
                        .withRoutes(
                            new DaprSubscriptionRoutes().withRules(Arrays.asList(new DaprSubscriptionRouteRule()))
                                .withDefaultProperty("uqibsxtkcu"))
                        .withScopes(Arrays.asList("sfar")).withMetadata(
                            mapOf("gf", "owlkjxnqpv"))
                        .withBulkSubscribe(
                            new DaprSubscriptionBulkSubscribeOptions().withEnabled(true).withMaxMessagesCount(889840232)
                                .withMaxAwaitDurationMs(1864942425)),
                    new DaprSubscriptionInner().withPubsubName("gwe").withTopic("dsxwefoh")
                        .withDeadLetterTopic("bvopwndyqle")
                        .withRoutes(
                            new DaprSubscriptionRoutes()
                                .withRules(Arrays.asList(new DaprSubscriptionRouteRule(),
                                    new DaprSubscriptionRouteRule(), new DaprSubscriptionRouteRule()))
                                .withDefaultProperty("mtkhlowkxxpvbr"))
                        .withScopes(Arrays.asList("mzsyzfhotl", "ikcyyc"))
                        .withMetadata(
                            mapOf("uic", "sjlpjrtwszhv", "ubhvj", "hvtrrmhwrbfdpyf", "memhooclutnpq", "lrocuyzlwh"))
                        .withBulkSubscribe(
                            new DaprSubscriptionBulkSubscribeOptions().withEnabled(false).withMaxMessagesCount(
                                339637531).withMaxAwaitDurationMs(1132519096)),
                    new DaprSubscriptionInner().withPubsubName("lpxuzzjgnrefq").withTopic("qotoihiqakydiwfb")
                        .withDeadLetterTopic("wpzdqtvhcspo")
                        .withRoutes(
                            new DaprSubscriptionRoutes()
                                .withRules(Arrays.asList(new DaprSubscriptionRouteRule(),
                                    new DaprSubscriptionRouteRule(), new DaprSubscriptionRouteRule()))
                                .withDefaultProperty("sipi"))
                        .withScopes(Arrays.asList("bebjfu", "bmoichd"))
                        .withMetadata(mapOf("iqsowsaaelc", "fpubntnbatz", "mjvlgfgg", "ttcjuhplrvkmjc", "sfuztlvtmv",
                            "vkyylizrzbjpsf"))
                        .withBulkSubscribe(new DaprSubscriptionBulkSubscribeOptions().withEnabled(false)
                            .withMaxMessagesCount(891535208).withMaxAwaitDurationMs(563395516)),
                    new DaprSubscriptionInner().withPubsubName("yzgib").withTopic("ujr")
                        .withDeadLetterTopic("fojuidjpuuyj")
                        .withRoutes(new DaprSubscriptionRoutes()
                            .withRules(Arrays.asList(new DaprSubscriptionRouteRule(), new DaprSubscriptionRouteRule(),
                                new DaprSubscriptionRouteRule(), new DaprSubscriptionRouteRule()))
                            .withDefaultProperty("kzoeovvtzejetj"))
                        .withScopes(Arrays.asList("tikyj")).withMetadata(mapOf("rhtgvgzpcrrkol", "dbqzolxrzvhqjw"))
                        .withBulkSubscribe(new DaprSubscriptionBulkSubscribeOptions().withEnabled(false)
                            .withMaxMessagesCount(817860491).withMaxAwaitDurationMs(660756224))));
        model = BinaryData.fromObject(model).toObject(DaprSubscriptionsCollection.class);
        Assertions.assertEquals("rmoucsofl", model.value().get(0).pubsubName());
        Assertions.assertEquals("uviyfcaabeo", model.value().get(0).topic());
        Assertions.assertEquals("bh", model.value().get(0).deadLetterTopic());
        Assertions.assertEquals("uqibsxtkcu", model.value().get(0).routes().defaultProperty());
        Assertions.assertEquals("sfar", model.value().get(0).scopes().get(0));
        Assertions.assertEquals("owlkjxnqpv", model.value().get(0).metadata().get("gf"));
        Assertions.assertEquals(true, model.value().get(0).bulkSubscribe().enabled());
        Assertions.assertEquals(889840232, model.value().get(0).bulkSubscribe().maxMessagesCount());
        Assertions.assertEquals(1864942425, model.value().get(0).bulkSubscribe().maxAwaitDurationMs());
    }

    // Use "Map.of" if available
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
