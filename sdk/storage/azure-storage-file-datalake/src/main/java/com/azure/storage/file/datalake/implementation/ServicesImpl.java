// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.ResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.storage.file.datalake.implementation.models.FileSystem;
import com.azure.storage.file.datalake.implementation.models.FileSystemList;
import com.azure.storage.file.datalake.implementation.models.ServicesListFileSystemsHeaders;
import com.azure.storage.file.datalake.models.DataLakeStorageException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Services. */
public final class ServicesImpl {
    /** The proxy service used to perform REST calls. */
    private final ServicesService service;

    /** The service client containing this operation class. */
    private final AzureDataLakeStorageRestAPIImpl client;

    /**
     * Initializes an instance of ServicesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ServicesImpl(AzureDataLakeStorageRestAPIImpl client) {
        this.service = RestProxy.create(ServicesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureDataLakeStorageRestAPIServices to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureDataLakeStorage")
    public interface ServicesService {
        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageException.class)
        Mono<ResponseBase<ServicesListFileSystemsHeaders, FileSystemList>> listFileSystems(
                @HostParam("url") String url,
                @QueryParam("resource") String resource,
                @QueryParam("prefix") String prefix,
                @QueryParam("continuation") String continuation,
                @QueryParam("maxResults") Integer maxResults,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageException.class)
        Mono<Response<FileSystemList>> listFileSystemsNoCustomHeaders(
                @HostParam("url") String url,
                @QueryParam("resource") String resource,
                @QueryParam("prefix") String prefix,
                @QueryParam("continuation") String continuation,
                @QueryParam("maxResults") Integer maxResults,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * List FileSystems
     *
     * <p>List filesystems and their properties in given account.
     *
     * @param prefix Filters results to filesystems within the specified prefix.
     * @param continuation Optional. When deleting a directory, the number of paths that are deleted with each
     *     invocation is limited. If the number of paths to be deleted exceeds this limit, a continuation token is
     *     returned in this response header. When a continuation token is returned in the response, it must be specified
     *     in a subsequent invocation of the delete operation to continue deleting the directory.
     * @param maxResults An optional value that specifies the maximum number of items to return. If omitted or greater
     *     than 5,000, the response will include up to 5,000 items.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<FileSystem>> listFileSystemsSinglePageAsync(
            String prefix, String continuation, Integer maxResults, String requestId, Integer timeout) {
        final String resource = "account";
        final String accept = "application/json";
        return FluxUtil.withContext(
                        context ->
                                service.listFileSystems(
                                        this.client.getUrl(),
                                        resource,
                                        prefix,
                                        continuation,
                                        maxResults,
                                        requestId,
                                        timeout,
                                        this.client.getVersion(),
                                        accept,
                                        context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getFilesystems(),
                                        null,
                                        res.getDeserializedHeaders()));
    }

    /**
     * List FileSystems
     *
     * <p>List filesystems and their properties in given account.
     *
     * @param prefix Filters results to filesystems within the specified prefix.
     * @param continuation Optional. When deleting a directory, the number of paths that are deleted with each
     *     invocation is limited. If the number of paths to be deleted exceeds this limit, a continuation token is
     *     returned in this response header. When a continuation token is returned in the response, it must be specified
     *     in a subsequent invocation of the delete operation to continue deleting the directory.
     * @param maxResults An optional value that specifies the maximum number of items to return. If omitted or greater
     *     than 5,000, the response will include up to 5,000 items.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<FileSystem>> listFileSystemsSinglePageAsync(
            String prefix,
            String continuation,
            Integer maxResults,
            String requestId,
            Integer timeout,
            Context context) {
        final String resource = "account";
        final String accept = "application/json";
        return service.listFileSystems(
                        this.client.getUrl(),
                        resource,
                        prefix,
                        continuation,
                        maxResults,
                        requestId,
                        timeout,
                        this.client.getVersion(),
                        accept,
                        context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getFilesystems(),
                                        null,
                                        res.getDeserializedHeaders()));
    }

    /**
     * List FileSystems
     *
     * <p>List filesystems and their properties in given account.
     *
     * @param prefix Filters results to filesystems within the specified prefix.
     * @param continuation Optional. When deleting a directory, the number of paths that are deleted with each
     *     invocation is limited. If the number of paths to be deleted exceeds this limit, a continuation token is
     *     returned in this response header. When a continuation token is returned in the response, it must be specified
     *     in a subsequent invocation of the delete operation to continue deleting the directory.
     * @param maxResults An optional value that specifies the maximum number of items to return. If omitted or greater
     *     than 5,000, the response will include up to 5,000 items.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<FileSystem> listFileSystemsAsync(
            String prefix, String continuation, Integer maxResults, String requestId, Integer timeout) {
        return new PagedFlux<>(
                () -> listFileSystemsSinglePageAsync(prefix, continuation, maxResults, requestId, timeout));
    }

    /**
     * List FileSystems
     *
     * <p>List filesystems and their properties in given account.
     *
     * @param prefix Filters results to filesystems within the specified prefix.
     * @param continuation Optional. When deleting a directory, the number of paths that are deleted with each
     *     invocation is limited. If the number of paths to be deleted exceeds this limit, a continuation token is
     *     returned in this response header. When a continuation token is returned in the response, it must be specified
     *     in a subsequent invocation of the delete operation to continue deleting the directory.
     * @param maxResults An optional value that specifies the maximum number of items to return. If omitted or greater
     *     than 5,000, the response will include up to 5,000 items.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<FileSystem> listFileSystemsAsync(
            String prefix,
            String continuation,
            Integer maxResults,
            String requestId,
            Integer timeout,
            Context context) {
        return new PagedFlux<>(
                () -> listFileSystemsSinglePageAsync(prefix, continuation, maxResults, requestId, timeout, context));
    }

    /**
     * List FileSystems
     *
     * <p>List filesystems and their properties in given account.
     *
     * @param prefix Filters results to filesystems within the specified prefix.
     * @param continuation Optional. When deleting a directory, the number of paths that are deleted with each
     *     invocation is limited. If the number of paths to be deleted exceeds this limit, a continuation token is
     *     returned in this response header. When a continuation token is returned in the response, it must be specified
     *     in a subsequent invocation of the delete operation to continue deleting the directory.
     * @param maxResults An optional value that specifies the maximum number of items to return. If omitted or greater
     *     than 5,000, the response will include up to 5,000 items.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<FileSystem>> listFileSystemsNoCustomHeadersSinglePageAsync(
            String prefix, String continuation, Integer maxResults, String requestId, Integer timeout) {
        final String resource = "account";
        final String accept = "application/json";
        return FluxUtil.withContext(
                        context ->
                                service.listFileSystemsNoCustomHeaders(
                                        this.client.getUrl(),
                                        resource,
                                        prefix,
                                        continuation,
                                        maxResults,
                                        requestId,
                                        timeout,
                                        this.client.getVersion(),
                                        accept,
                                        context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getFilesystems(),
                                        null,
                                        null));
    }

    /**
     * List FileSystems
     *
     * <p>List filesystems and their properties in given account.
     *
     * @param prefix Filters results to filesystems within the specified prefix.
     * @param continuation Optional. When deleting a directory, the number of paths that are deleted with each
     *     invocation is limited. If the number of paths to be deleted exceeds this limit, a continuation token is
     *     returned in this response header. When a continuation token is returned in the response, it must be specified
     *     in a subsequent invocation of the delete operation to continue deleting the directory.
     * @param maxResults An optional value that specifies the maximum number of items to return. If omitted or greater
     *     than 5,000, the response will include up to 5,000 items.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<FileSystem>> listFileSystemsNoCustomHeadersSinglePageAsync(
            String prefix,
            String continuation,
            Integer maxResults,
            String requestId,
            Integer timeout,
            Context context) {
        final String resource = "account";
        final String accept = "application/json";
        return service.listFileSystemsNoCustomHeaders(
                        this.client.getUrl(),
                        resource,
                        prefix,
                        continuation,
                        maxResults,
                        requestId,
                        timeout,
                        this.client.getVersion(),
                        accept,
                        context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getFilesystems(),
                                        null,
                                        null));
    }

    /**
     * List FileSystems
     *
     * <p>List filesystems and their properties in given account.
     *
     * @param prefix Filters results to filesystems within the specified prefix.
     * @param continuation Optional. When deleting a directory, the number of paths that are deleted with each
     *     invocation is limited. If the number of paths to be deleted exceeds this limit, a continuation token is
     *     returned in this response header. When a continuation token is returned in the response, it must be specified
     *     in a subsequent invocation of the delete operation to continue deleting the directory.
     * @param maxResults An optional value that specifies the maximum number of items to return. If omitted or greater
     *     than 5,000, the response will include up to 5,000 items.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<FileSystem> listFileSystemsNoCustomHeadersAsync(
            String prefix, String continuation, Integer maxResults, String requestId, Integer timeout) {
        return new PagedFlux<>(
                () ->
                        listFileSystemsNoCustomHeadersSinglePageAsync(
                                prefix, continuation, maxResults, requestId, timeout));
    }

    /**
     * List FileSystems
     *
     * <p>List filesystems and their properties in given account.
     *
     * @param prefix Filters results to filesystems within the specified prefix.
     * @param continuation Optional. When deleting a directory, the number of paths that are deleted with each
     *     invocation is limited. If the number of paths to be deleted exceeds this limit, a continuation token is
     *     returned in this response header. When a continuation token is returned in the response, it must be specified
     *     in a subsequent invocation of the delete operation to continue deleting the directory.
     * @param maxResults An optional value that specifies the maximum number of items to return. If omitted or greater
     *     than 5,000, the response will include up to 5,000 items.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<FileSystem> listFileSystemsNoCustomHeadersAsync(
            String prefix,
            String continuation,
            Integer maxResults,
            String requestId,
            Integer timeout,
            Context context) {
        return new PagedFlux<>(
                () ->
                        listFileSystemsNoCustomHeadersSinglePageAsync(
                                prefix, continuation, maxResults, requestId, timeout, context));
    }
}
