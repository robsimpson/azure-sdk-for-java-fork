// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.HeaderAction;
import com.azure.resourcemanager.frontdoor.models.HeaderActionType;
import com.azure.resourcemanager.frontdoor.models.MatchProcessingBehavior;
import com.azure.resourcemanager.frontdoor.models.RouteConfiguration;
import com.azure.resourcemanager.frontdoor.models.RulesEngineAction;
import com.azure.resourcemanager.frontdoor.models.RulesEngineMatchCondition;
import com.azure.resourcemanager.frontdoor.models.RulesEngineMatchVariable;
import com.azure.resourcemanager.frontdoor.models.RulesEngineOperator;
import com.azure.resourcemanager.frontdoor.models.RulesEngineRule;
import com.azure.resourcemanager.frontdoor.models.Transform;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RulesEngineRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RulesEngineRule model =
            BinaryData
                .fromString(
                    "{\"name\":\"eil\",\"priority\":645994444,\"action\":{\"requestHeaderActions\":[{\"headerActionType\":\"Delete\",\"headerName\":\"yfjfcnjbkcn\",\"value\":\"hbttkphyw\"}],\"responseHeaderActions\":[{\"headerActionType\":\"Append\",\"headerName\":\"t\",\"value\":\"nermcl\"},{\"headerActionType\":\"Append\",\"headerName\":\"lphox\",\"value\":\"crpab\"},{\"headerActionType\":\"Delete\",\"headerName\":\"epsbjtazqu\",\"value\":\"ywpmueefjzwfqkq\"},{\"headerActionType\":\"Overwrite\",\"headerName\":\"ids\",\"value\":\"onobglaocqx\"}],\"routeConfigurationOverride\":{\"@odata.type\":\"RouteConfiguration\"}},\"matchConditions\":[{\"rulesEngineMatchVariable\":\"RequestPath\",\"selector\":\"udxytlmoyrx\",\"rulesEngineOperator\":\"Any\",\"negateCondition\":false,\"rulesEngineMatchValue\":[\"wpzntxhdzh\"],\"transforms\":[\"UrlEncode\"]},{\"rulesEngineMatchVariable\":\"RequestUri\",\"selector\":\"ck\",\"rulesEngineOperator\":\"Any\",\"negateCondition\":false,\"rulesEngineMatchValue\":[\"xsbkyvpyca\",\"uzbpzkafku\"],\"transforms\":[\"UrlEncode\",\"RemoveNulls\"]},{\"rulesEngineMatchVariable\":\"QueryString\",\"selector\":\"mehhseyvjusrtsl\",\"rulesEngineOperator\":\"IPMatch\",\"negateCondition\":true,\"rulesEngineMatchValue\":[\"eemaofmxagkvtme\",\"mqkrhahvljuahaqu\"],\"transforms\":[\"Uppercase\",\"RemoveNulls\"]},{\"rulesEngineMatchVariable\":\"RequestPath\",\"selector\":\"alaexqpvfadmwsrc\",\"rulesEngineOperator\":\"GeoMatch\",\"negateCondition\":false,\"rulesEngineMatchValue\":[\"vgomz\"],\"transforms\":[\"Lowercase\",\"Lowercase\"]}],\"matchProcessingBehavior\":\"Continue\"}")
                .toObject(RulesEngineRule.class);
        Assertions.assertEquals("eil", model.name());
        Assertions.assertEquals(645994444, model.priority());
        Assertions
            .assertEquals(HeaderActionType.DELETE, model.action().requestHeaderActions().get(0).headerActionType());
        Assertions.assertEquals("yfjfcnjbkcn", model.action().requestHeaderActions().get(0).headerName());
        Assertions.assertEquals("hbttkphyw", model.action().requestHeaderActions().get(0).value());
        Assertions
            .assertEquals(HeaderActionType.APPEND, model.action().responseHeaderActions().get(0).headerActionType());
        Assertions.assertEquals("t", model.action().responseHeaderActions().get(0).headerName());
        Assertions.assertEquals("nermcl", model.action().responseHeaderActions().get(0).value());
        Assertions
            .assertEquals(
                RulesEngineMatchVariable.REQUEST_PATH, model.matchConditions().get(0).rulesEngineMatchVariable());
        Assertions.assertEquals("udxytlmoyrx", model.matchConditions().get(0).selector());
        Assertions.assertEquals(RulesEngineOperator.ANY, model.matchConditions().get(0).rulesEngineOperator());
        Assertions.assertEquals(false, model.matchConditions().get(0).negateCondition());
        Assertions.assertEquals("wpzntxhdzh", model.matchConditions().get(0).rulesEngineMatchValue().get(0));
        Assertions.assertEquals(Transform.URL_ENCODE, model.matchConditions().get(0).transforms().get(0));
        Assertions.assertEquals(MatchProcessingBehavior.CONTINUE, model.matchProcessingBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RulesEngineRule model =
            new RulesEngineRule()
                .withName("eil")
                .withPriority(645994444)
                .withAction(
                    new RulesEngineAction()
                        .withRequestHeaderActions(
                            Arrays
                                .asList(
                                    new HeaderAction()
                                        .withHeaderActionType(HeaderActionType.DELETE)
                                        .withHeaderName("yfjfcnjbkcn")
                                        .withValue("hbttkphyw")))
                        .withResponseHeaderActions(
                            Arrays
                                .asList(
                                    new HeaderAction()
                                        .withHeaderActionType(HeaderActionType.APPEND)
                                        .withHeaderName("t")
                                        .withValue("nermcl"),
                                    new HeaderAction()
                                        .withHeaderActionType(HeaderActionType.APPEND)
                                        .withHeaderName("lphox")
                                        .withValue("crpab"),
                                    new HeaderAction()
                                        .withHeaderActionType(HeaderActionType.DELETE)
                                        .withHeaderName("epsbjtazqu")
                                        .withValue("ywpmueefjzwfqkq"),
                                    new HeaderAction()
                                        .withHeaderActionType(HeaderActionType.OVERWRITE)
                                        .withHeaderName("ids")
                                        .withValue("onobglaocqx")))
                        .withRouteConfigurationOverride(new RouteConfiguration()))
                .withMatchConditions(
                    Arrays
                        .asList(
                            new RulesEngineMatchCondition()
                                .withRulesEngineMatchVariable(RulesEngineMatchVariable.REQUEST_PATH)
                                .withSelector("udxytlmoyrx")
                                .withRulesEngineOperator(RulesEngineOperator.ANY)
                                .withNegateCondition(false)
                                .withRulesEngineMatchValue(Arrays.asList("wpzntxhdzh"))
                                .withTransforms(Arrays.asList(Transform.URL_ENCODE)),
                            new RulesEngineMatchCondition()
                                .withRulesEngineMatchVariable(RulesEngineMatchVariable.REQUEST_URI)
                                .withSelector("ck")
                                .withRulesEngineOperator(RulesEngineOperator.ANY)
                                .withNegateCondition(false)
                                .withRulesEngineMatchValue(Arrays.asList("xsbkyvpyca", "uzbpzkafku"))
                                .withTransforms(Arrays.asList(Transform.URL_ENCODE, Transform.REMOVE_NULLS)),
                            new RulesEngineMatchCondition()
                                .withRulesEngineMatchVariable(RulesEngineMatchVariable.QUERY_STRING)
                                .withSelector("mehhseyvjusrtsl")
                                .withRulesEngineOperator(RulesEngineOperator.IPMATCH)
                                .withNegateCondition(true)
                                .withRulesEngineMatchValue(Arrays.asList("eemaofmxagkvtme", "mqkrhahvljuahaqu"))
                                .withTransforms(Arrays.asList(Transform.UPPERCASE, Transform.REMOVE_NULLS)),
                            new RulesEngineMatchCondition()
                                .withRulesEngineMatchVariable(RulesEngineMatchVariable.REQUEST_PATH)
                                .withSelector("alaexqpvfadmwsrc")
                                .withRulesEngineOperator(RulesEngineOperator.GEO_MATCH)
                                .withNegateCondition(false)
                                .withRulesEngineMatchValue(Arrays.asList("vgomz"))
                                .withTransforms(Arrays.asList(Transform.LOWERCASE, Transform.LOWERCASE))))
                .withMatchProcessingBehavior(MatchProcessingBehavior.CONTINUE);
        model = BinaryData.fromObject(model).toObject(RulesEngineRule.class);
        Assertions.assertEquals("eil", model.name());
        Assertions.assertEquals(645994444, model.priority());
        Assertions
            .assertEquals(HeaderActionType.DELETE, model.action().requestHeaderActions().get(0).headerActionType());
        Assertions.assertEquals("yfjfcnjbkcn", model.action().requestHeaderActions().get(0).headerName());
        Assertions.assertEquals("hbttkphyw", model.action().requestHeaderActions().get(0).value());
        Assertions
            .assertEquals(HeaderActionType.APPEND, model.action().responseHeaderActions().get(0).headerActionType());
        Assertions.assertEquals("t", model.action().responseHeaderActions().get(0).headerName());
        Assertions.assertEquals("nermcl", model.action().responseHeaderActions().get(0).value());
        Assertions
            .assertEquals(
                RulesEngineMatchVariable.REQUEST_PATH, model.matchConditions().get(0).rulesEngineMatchVariable());
        Assertions.assertEquals("udxytlmoyrx", model.matchConditions().get(0).selector());
        Assertions.assertEquals(RulesEngineOperator.ANY, model.matchConditions().get(0).rulesEngineOperator());
        Assertions.assertEquals(false, model.matchConditions().get(0).negateCondition());
        Assertions.assertEquals("wpzntxhdzh", model.matchConditions().get(0).rulesEngineMatchValue().get(0));
        Assertions.assertEquals(Transform.URL_ENCODE, model.matchConditions().get(0).transforms().get(0));
        Assertions.assertEquals(MatchProcessingBehavior.CONTINUE, model.matchProcessingBehavior());
    }
}
