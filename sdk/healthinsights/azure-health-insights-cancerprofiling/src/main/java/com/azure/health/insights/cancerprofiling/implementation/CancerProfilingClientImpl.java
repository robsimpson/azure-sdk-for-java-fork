// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.health.insights.cancerprofiling.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.DefaultPollingStrategy;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.TypeReference;
import com.azure.health.insights.cancerprofiling.CancerProfilingServiceVersion;
import com.azure.health.insights.cancerprofiling.models.OncoPhenotypeResult;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the CancerProfilingClient type. */
public final class CancerProfilingClientImpl {
    /** The proxy service used to perform REST calls. */
    private final CancerProfilingClientService service;

    /**
     * Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://westus2.api.cognitive.microsoft.com).
     */
    private final String endpoint;

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://westus2.api.cognitive.microsoft.com).
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Service version. */
    private final CancerProfilingServiceVersion serviceVersion;

    /**
     * Gets Service version.
     *
     * @return the serviceVersion value.
     */
    public CancerProfilingServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of CancerProfilingClient client.
     *
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     *     https://westus2.api.cognitive.microsoft.com).
     * @param serviceVersion Service version.
     */
    public CancerProfilingClientImpl(String endpoint, CancerProfilingServiceVersion serviceVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                serviceVersion);
    }

    /**
     * Initializes an instance of CancerProfilingClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     *     https://westus2.api.cognitive.microsoft.com).
     * @param serviceVersion Service version.
     */
    public CancerProfilingClientImpl(
            HttpPipeline httpPipeline, String endpoint, CancerProfilingServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of CancerProfilingClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     *     https://westus2.api.cognitive.microsoft.com).
     * @param serviceVersion Service version.
     */
    public CancerProfilingClientImpl(
            HttpPipeline httpPipeline,
            SerializerAdapter serializerAdapter,
            String endpoint,
            CancerProfilingServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.service =
                RestProxy.create(CancerProfilingClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for CancerProfilingClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{endpoint}/healthinsights")
    @ServiceInterface(name = "CancerProfilingClien")
    public interface CancerProfilingClientService {
        @Post("/oncophenotype/jobs")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> inferCancerProfile(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData oncoPhenotypeData,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Create Onco Phenotype job
     *
     * <p>Creates an Onco Phenotype job with the given request body.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     patients (Required): [
     *          (Required){
     *             id: String (Required)
     *             info (Optional): {
     *                 sex: String(female/male/unspecified) (Optional)
     *                 birthDate: LocalDate (Optional)
     *                 clinicalInfo (Optional): [
     *                      (Optional){
     *                         system: String (Required)
     *                         code: String (Required)
     *                         name: String (Optional)
     *                         value: String (Optional)
     *                     }
     *                 ]
     *             }
     *             data (Optional): [
     *                  (Optional){
     *                     type: String(note/fhirBundle/dicom/genomicSequencing) (Required)
     *                     clinicalType: String(consultation/dischargeSummary/historyAndPhysical/procedure/progress/imaging/laboratory/pathology) (Optional)
     *                     id: String (Required)
     *                     language: String (Optional)
     *                     createdDateTime: OffsetDateTime (Optional)
     *                     content (Required): {
     *                         sourceType: String(inline/reference) (Required)
     *                         value: String (Required)
     *                     }
     *                 }
     *             ]
     *         }
     *     ]
     *     configuration (Optional): {
     *         verbose: Boolean (Optional)
     *         includeEvidence: Boolean (Optional)
     *         inferenceTypes (Optional): [
     *             String(tumorSite/histology/clinicalStageT/clinicalStageN/clinicalStageM/pathologicStageT/pathologicStageN/pathologicStageM) (Optional)
     *         ]
     *         checkForCancerCase: Boolean (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     createdDateTime: OffsetDateTime (Required)
     *     expirationDateTime: OffsetDateTime (Required)
     *     lastUpdateDateTime: OffsetDateTime (Required)
     *     status: String(notStarted/running/succeeded/failed/partiallyCompleted) (Required)
     *     errors (Optional): [
     *         ResponseError (Optional)
     *     ]
     *     results (Optional): {
     *         patients (Required): [
     *              (Required){
     *                 id: String (Required)
     *                 inferences (Required): [
     *                      (Required){
     *                         type: String(tumorSite/histology/clinicalStageT/clinicalStageN/clinicalStageM/pathologicStageT/pathologicStageN/pathologicStageM) (Required)
     *                         value: String (Required)
     *                         description: String (Optional)
     *                         confidenceScore: Double (Optional)
     *                         evidence (Optional): [
     *                              (Optional){
     *                                 patientDataEvidence (Optional): {
     *                                     id: String (Required)
     *                                     text: String (Optional)
     *                                     offset: int (Required)
     *                                     length: int (Required)
     *                                 }
     *                                 patientInfoEvidence (Optional): {
     *                                     system: String (Required)
     *                                     code: String (Required)
     *                                     name: String (Optional)
     *                                     value: String (Optional)
     *                                 }
     *                                 importance: Double (Optional)
     *                             }
     *                         ]
     *                         caseId: String (Optional)
     *                     }
     *                 ]
     *             }
     *         ]
     *         modelVersion: String (Required)
     *     }
     * }
     * }</pre>
     *
     * @param oncoPhenotypeData The body of the Onco Phenotype request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response for the Onco Phenotype request along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BinaryData>> inferCancerProfileWithResponseAsync(
            BinaryData oncoPhenotypeData, RequestOptions requestOptions) {
        final String accept = "application/json";
        RequestOptions requestOptionsLocal = requestOptions == null ? new RequestOptions() : requestOptions;
        requestOptionsLocal.setHeader("repeatability-request-id", UUID.randomUUID().toString());
        requestOptionsLocal.setHeader(
                "repeatability-first-sent", DateTimeRfc1123.toRfc1123String(OffsetDateTime.now()));
        return FluxUtil.withContext(
                context ->
                        service.inferCancerProfile(
                                this.getEndpoint(),
                                this.getServiceVersion().getVersion(),
                                accept,
                                oncoPhenotypeData,
                                requestOptionsLocal,
                                context));
    }

    /**
     * Create Onco Phenotype job
     *
     * <p>Creates an Onco Phenotype job with the given request body.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     patients (Required): [
     *          (Required){
     *             id: String (Required)
     *             info (Optional): {
     *                 sex: String(female/male/unspecified) (Optional)
     *                 birthDate: LocalDate (Optional)
     *                 clinicalInfo (Optional): [
     *                      (Optional){
     *                         system: String (Required)
     *                         code: String (Required)
     *                         name: String (Optional)
     *                         value: String (Optional)
     *                     }
     *                 ]
     *             }
     *             data (Optional): [
     *                  (Optional){
     *                     type: String(note/fhirBundle/dicom/genomicSequencing) (Required)
     *                     clinicalType: String(consultation/dischargeSummary/historyAndPhysical/procedure/progress/imaging/laboratory/pathology) (Optional)
     *                     id: String (Required)
     *                     language: String (Optional)
     *                     createdDateTime: OffsetDateTime (Optional)
     *                     content (Required): {
     *                         sourceType: String(inline/reference) (Required)
     *                         value: String (Required)
     *                     }
     *                 }
     *             ]
     *         }
     *     ]
     *     configuration (Optional): {
     *         verbose: Boolean (Optional)
     *         includeEvidence: Boolean (Optional)
     *         inferenceTypes (Optional): [
     *             String(tumorSite/histology/clinicalStageT/clinicalStageN/clinicalStageM/pathologicStageT/pathologicStageN/pathologicStageM) (Optional)
     *         ]
     *         checkForCancerCase: Boolean (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     createdDateTime: OffsetDateTime (Required)
     *     expirationDateTime: OffsetDateTime (Required)
     *     lastUpdateDateTime: OffsetDateTime (Required)
     *     status: String(notStarted/running/succeeded/failed/partiallyCompleted) (Required)
     *     errors (Optional): [
     *         ResponseError (Optional)
     *     ]
     *     results (Optional): {
     *         patients (Required): [
     *              (Required){
     *                 id: String (Required)
     *                 inferences (Required): [
     *                      (Required){
     *                         type: String(tumorSite/histology/clinicalStageT/clinicalStageN/clinicalStageM/pathologicStageT/pathologicStageN/pathologicStageM) (Required)
     *                         value: String (Required)
     *                         description: String (Optional)
     *                         confidenceScore: Double (Optional)
     *                         evidence (Optional): [
     *                              (Optional){
     *                                 patientDataEvidence (Optional): {
     *                                     id: String (Required)
     *                                     text: String (Optional)
     *                                     offset: int (Required)
     *                                     length: int (Required)
     *                                 }
     *                                 patientInfoEvidence (Optional): {
     *                                     system: String (Required)
     *                                     code: String (Required)
     *                                     name: String (Optional)
     *                                     value: String (Optional)
     *                                 }
     *                                 importance: Double (Optional)
     *                             }
     *                         ]
     *                         caseId: String (Optional)
     *                     }
     *                 ]
     *             }
     *         ]
     *         modelVersion: String (Required)
     *     }
     * }
     * }</pre>
     *
     * @param oncoPhenotypeData The body of the Onco Phenotype request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of the response for the Onco Phenotype request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginInferCancerProfileAsync(
            BinaryData oncoPhenotypeData, RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.inferCancerProfileWithResponseAsync(oncoPhenotypeData, requestOptions),
                new DefaultPollingStrategy<>(
                        this.getHttpPipeline(),
                        "{endpoint}/healthinsights".replace("{endpoint}", this.getEndpoint()),
                        null,
                        requestOptions != null && requestOptions.getContext() != null
                                ? requestOptions.getContext()
                                : Context.NONE),
                TypeReference.createInstance(BinaryData.class),
                TypeReference.createInstance(BinaryData.class));
    }

    /**
     * Create Onco Phenotype job
     *
     * <p>Creates an Onco Phenotype job with the given request body.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     patients (Required): [
     *          (Required){
     *             id: String (Required)
     *             info (Optional): {
     *                 sex: String(female/male/unspecified) (Optional)
     *                 birthDate: LocalDate (Optional)
     *                 clinicalInfo (Optional): [
     *                      (Optional){
     *                         system: String (Required)
     *                         code: String (Required)
     *                         name: String (Optional)
     *                         value: String (Optional)
     *                     }
     *                 ]
     *             }
     *             data (Optional): [
     *                  (Optional){
     *                     type: String(note/fhirBundle/dicom/genomicSequencing) (Required)
     *                     clinicalType: String(consultation/dischargeSummary/historyAndPhysical/procedure/progress/imaging/laboratory/pathology) (Optional)
     *                     id: String (Required)
     *                     language: String (Optional)
     *                     createdDateTime: OffsetDateTime (Optional)
     *                     content (Required): {
     *                         sourceType: String(inline/reference) (Required)
     *                         value: String (Required)
     *                     }
     *                 }
     *             ]
     *         }
     *     ]
     *     configuration (Optional): {
     *         verbose: Boolean (Optional)
     *         includeEvidence: Boolean (Optional)
     *         inferenceTypes (Optional): [
     *             String(tumorSite/histology/clinicalStageT/clinicalStageN/clinicalStageM/pathologicStageT/pathologicStageN/pathologicStageM) (Optional)
     *         ]
     *         checkForCancerCase: Boolean (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     createdDateTime: OffsetDateTime (Required)
     *     expirationDateTime: OffsetDateTime (Required)
     *     lastUpdateDateTime: OffsetDateTime (Required)
     *     status: String(notStarted/running/succeeded/failed/partiallyCompleted) (Required)
     *     errors (Optional): [
     *         ResponseError (Optional)
     *     ]
     *     results (Optional): {
     *         patients (Required): [
     *              (Required){
     *                 id: String (Required)
     *                 inferences (Required): [
     *                      (Required){
     *                         type: String(tumorSite/histology/clinicalStageT/clinicalStageN/clinicalStageM/pathologicStageT/pathologicStageN/pathologicStageM) (Required)
     *                         value: String (Required)
     *                         description: String (Optional)
     *                         confidenceScore: Double (Optional)
     *                         evidence (Optional): [
     *                              (Optional){
     *                                 patientDataEvidence (Optional): {
     *                                     id: String (Required)
     *                                     text: String (Optional)
     *                                     offset: int (Required)
     *                                     length: int (Required)
     *                                 }
     *                                 patientInfoEvidence (Optional): {
     *                                     system: String (Required)
     *                                     code: String (Required)
     *                                     name: String (Optional)
     *                                     value: String (Optional)
     *                                 }
     *                                 importance: Double (Optional)
     *                             }
     *                         ]
     *                         caseId: String (Optional)
     *                     }
     *                 ]
     *             }
     *         ]
     *         modelVersion: String (Required)
     *     }
     * }
     * }</pre>
     *
     * @param oncoPhenotypeData The body of the Onco Phenotype request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of the response for the Onco Phenotype request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginInferCancerProfile(
            BinaryData oncoPhenotypeData, RequestOptions requestOptions) {
        return this.beginInferCancerProfileAsync(oncoPhenotypeData, requestOptions).getSyncPoller();
    }

    /**
     * Create Onco Phenotype job
     *
     * <p>Creates an Onco Phenotype job with the given request body.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     patients (Required): [
     *          (Required){
     *             id: String (Required)
     *             info (Optional): {
     *                 sex: String(female/male/unspecified) (Optional)
     *                 birthDate: LocalDate (Optional)
     *                 clinicalInfo (Optional): [
     *                      (Optional){
     *                         system: String (Required)
     *                         code: String (Required)
     *                         name: String (Optional)
     *                         value: String (Optional)
     *                     }
     *                 ]
     *             }
     *             data (Optional): [
     *                  (Optional){
     *                     type: String(note/fhirBundle/dicom/genomicSequencing) (Required)
     *                     clinicalType: String(consultation/dischargeSummary/historyAndPhysical/procedure/progress/imaging/laboratory/pathology) (Optional)
     *                     id: String (Required)
     *                     language: String (Optional)
     *                     createdDateTime: OffsetDateTime (Optional)
     *                     content (Required): {
     *                         sourceType: String(inline/reference) (Required)
     *                         value: String (Required)
     *                     }
     *                 }
     *             ]
     *         }
     *     ]
     *     configuration (Optional): {
     *         verbose: Boolean (Optional)
     *         includeEvidence: Boolean (Optional)
     *         inferenceTypes (Optional): [
     *             String(tumorSite/histology/clinicalStageT/clinicalStageN/clinicalStageM/pathologicStageT/pathologicStageN/pathologicStageM) (Optional)
     *         ]
     *         checkForCancerCase: Boolean (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     createdDateTime: OffsetDateTime (Required)
     *     expirationDateTime: OffsetDateTime (Required)
     *     lastUpdateDateTime: OffsetDateTime (Required)
     *     status: String(notStarted/running/succeeded/failed/partiallyCompleted) (Required)
     *     errors (Optional): [
     *         ResponseError (Optional)
     *     ]
     *     results (Optional): {
     *         patients (Required): [
     *              (Required){
     *                 id: String (Required)
     *                 inferences (Required): [
     *                      (Required){
     *                         type: String(tumorSite/histology/clinicalStageT/clinicalStageN/clinicalStageM/pathologicStageT/pathologicStageN/pathologicStageM) (Required)
     *                         value: String (Required)
     *                         description: String (Optional)
     *                         confidenceScore: Double (Optional)
     *                         evidence (Optional): [
     *                              (Optional){
     *                                 patientDataEvidence (Optional): {
     *                                     id: String (Required)
     *                                     text: String (Optional)
     *                                     offset: int (Required)
     *                                     length: int (Required)
     *                                 }
     *                                 patientInfoEvidence (Optional): {
     *                                     system: String (Required)
     *                                     code: String (Required)
     *                                     name: String (Optional)
     *                                     value: String (Optional)
     *                                 }
     *                                 importance: Double (Optional)
     *                             }
     *                         ]
     *                         caseId: String (Optional)
     *                     }
     *                 ]
     *             }
     *         ]
     *         modelVersion: String (Required)
     *     }
     * }
     * }</pre>
     *
     * @param oncoPhenotypeData The body of the Onco Phenotype request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of the response for the Onco Phenotype request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<OncoPhenotypeResult, OncoPhenotypeResult> beginInferCancerProfileWithModelAsync(
            BinaryData oncoPhenotypeData, RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.inferCancerProfileWithResponseAsync(oncoPhenotypeData, requestOptions),
                new DefaultPollingStrategy<>(
                        this.getHttpPipeline(),
                        "{endpoint}/healthinsights".replace("{endpoint}", this.getEndpoint()),
                        null,
                        requestOptions != null && requestOptions.getContext() != null
                                ? requestOptions.getContext()
                                : Context.NONE),
                TypeReference.createInstance(OncoPhenotypeResult.class),
                TypeReference.createInstance(OncoPhenotypeResult.class));
    }

    /**
     * Create Onco Phenotype job
     *
     * <p>Creates an Onco Phenotype job with the given request body.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>repeatability-request-id</td><td>String</td><td>No</td><td>Repeatability request ID header</td></tr>
     *     <tr><td>repeatability-first-sent</td><td>String</td><td>No</td><td>Repeatability first sent header as HTTP-date</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     patients (Required): [
     *          (Required){
     *             id: String (Required)
     *             info (Optional): {
     *                 sex: String(female/male/unspecified) (Optional)
     *                 birthDate: LocalDate (Optional)
     *                 clinicalInfo (Optional): [
     *                      (Optional){
     *                         system: String (Required)
     *                         code: String (Required)
     *                         name: String (Optional)
     *                         value: String (Optional)
     *                     }
     *                 ]
     *             }
     *             data (Optional): [
     *                  (Optional){
     *                     type: String(note/fhirBundle/dicom/genomicSequencing) (Required)
     *                     clinicalType: String(consultation/dischargeSummary/historyAndPhysical/procedure/progress/imaging/laboratory/pathology) (Optional)
     *                     id: String (Required)
     *                     language: String (Optional)
     *                     createdDateTime: OffsetDateTime (Optional)
     *                     content (Required): {
     *                         sourceType: String(inline/reference) (Required)
     *                         value: String (Required)
     *                     }
     *                 }
     *             ]
     *         }
     *     ]
     *     configuration (Optional): {
     *         verbose: Boolean (Optional)
     *         includeEvidence: Boolean (Optional)
     *         inferenceTypes (Optional): [
     *             String(tumorSite/histology/clinicalStageT/clinicalStageN/clinicalStageM/pathologicStageT/pathologicStageN/pathologicStageM) (Optional)
     *         ]
     *         checkForCancerCase: Boolean (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     jobId: String (Required)
     *     createdDateTime: OffsetDateTime (Required)
     *     expirationDateTime: OffsetDateTime (Required)
     *     lastUpdateDateTime: OffsetDateTime (Required)
     *     status: String(notStarted/running/succeeded/failed/partiallyCompleted) (Required)
     *     errors (Optional): [
     *         ResponseError (Optional)
     *     ]
     *     results (Optional): {
     *         patients (Required): [
     *              (Required){
     *                 id: String (Required)
     *                 inferences (Required): [
     *                      (Required){
     *                         type: String(tumorSite/histology/clinicalStageT/clinicalStageN/clinicalStageM/pathologicStageT/pathologicStageN/pathologicStageM) (Required)
     *                         value: String (Required)
     *                         description: String (Optional)
     *                         confidenceScore: Double (Optional)
     *                         evidence (Optional): [
     *                              (Optional){
     *                                 patientDataEvidence (Optional): {
     *                                     id: String (Required)
     *                                     text: String (Optional)
     *                                     offset: int (Required)
     *                                     length: int (Required)
     *                                 }
     *                                 patientInfoEvidence (Optional): {
     *                                     system: String (Required)
     *                                     code: String (Required)
     *                                     name: String (Optional)
     *                                     value: String (Optional)
     *                                 }
     *                                 importance: Double (Optional)
     *                             }
     *                         ]
     *                         caseId: String (Optional)
     *                     }
     *                 ]
     *             }
     *         ]
     *         modelVersion: String (Required)
     *     }
     * }
     * }</pre>
     *
     * @param oncoPhenotypeData The body of the Onco Phenotype request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of the response for the Onco Phenotype request.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<OncoPhenotypeResult, OncoPhenotypeResult> beginInferCancerProfileWithModel(
            BinaryData oncoPhenotypeData, RequestOptions requestOptions) {
        return this.beginInferCancerProfileWithModelAsync(oncoPhenotypeData, requestOptions).getSyncPoller();
    }
}
