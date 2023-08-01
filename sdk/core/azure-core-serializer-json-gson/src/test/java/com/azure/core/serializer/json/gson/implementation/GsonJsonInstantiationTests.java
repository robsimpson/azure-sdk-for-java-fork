// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.serializer.json.gson.implementation;

import com.google.gson.stream.JsonReader;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Tests instantiating {@link GsonJsonReader} and {@link GsonJsonWriter}.
 */
public class GsonJsonInstantiationTests {
    @ParameterizedTest
    @MethodSource("throwsNullPointerExceptionSupplier")
    public void throwsNullPointerException(Executable executable) {
        assertThrows(NullPointerException.class, executable);
    }

    @SuppressWarnings("resource")
    private static Stream<Executable> throwsNullPointerExceptionSupplier() {
        return Stream.of(
            () -> AzureJsonUtils.createReader((byte[]) null, null),
            () -> AzureJsonUtils.createReader((String) null, null),
            () -> AzureJsonUtils.createReader((InputStream) null, null),
            () -> AzureJsonUtils.createReader((Reader) null, null),
            () -> AzureJsonUtils.createReader((JsonReader) null, null),

            () -> AzureJsonUtils.createWriter((OutputStream) null, null),
            () -> AzureJsonUtils.createWriter((Writer) null, null),
            () -> AzureJsonUtils.createWriter(null)
        );
    }
}
