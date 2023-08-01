// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.ScriptCmdletsList;

public final class ScriptCmdletsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptCmdletsList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"description\":\"ft\",\"timeout\":\"ae\",\"parameters\":[]},\"id\":\"iahxicsl\",\"name\":\"aoqzpiyylhaln\",\"type\":\"whccs\"},{\"properties\":{\"description\":\"aivwitqscywu\",\"timeout\":\"woluhczbwemhair\",\"parameters\":[]},\"id\":\"rgzdwmsweyp\",\"name\":\"w\",\"type\":\"xggicccnxqhuexmk\"},{\"properties\":{\"description\":\"stvlzywemhzrnc\",\"timeout\":\"tclusiypbsfgy\",\"parameters\":[]},\"id\":\"uslfead\",\"name\":\"ygqukyhejh\",\"type\":\"isxgfp\"},{\"properties\":{\"description\":\"lppvksrpq\",\"timeout\":\"jzraehtwdwrf\",\"parameters\":[]},\"id\":\"wib\",\"name\":\"rcdlbhshfwpr\",\"type\":\"cstwity\"}],\"nextLink\":\"evxccedcp\"}")
                .toObject(ScriptCmdletsList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptCmdletsList model = new ScriptCmdletsList();
        model = BinaryData.fromObject(model).toObject(ScriptCmdletsList.class);
    }
}
