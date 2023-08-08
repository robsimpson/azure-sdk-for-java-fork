// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.perf;

import com.azure.core.perf.core.CorePerfStressOptions;
import com.azure.core.perf.core.RestProxyTestBase;
import com.azure.core.perf.core.TestDataFactory;
import com.azure.core.perf.models.UserDatabase;
import reactor.core.publisher.Mono;

public class XmlSendTest extends RestProxyTestBase<CorePerfStressOptions> {
    private final UserDatabase userDatabase;

    public XmlSendTest(CorePerfStressOptions options) {
        super(options);
        userDatabase = TestDataFactory.generateUserDatabase(options.getSize());
    }

    @Override
    public void run() {
        runAsync().block();
    }

    @Override
    public Mono<Void> runAsync() {
        return service.setUserDatabaseXml(endpoint, id, userDatabase).then();
    }
}
