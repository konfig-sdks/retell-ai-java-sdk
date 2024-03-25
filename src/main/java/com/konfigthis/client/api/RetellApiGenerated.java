/*
 * Retell SDK
 * API for voice AI. Effortlessly integrate human-like Voice AI into your product. | We are building an API that enables your product to provide an intuitive and engaging way for user interaction - through voice.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: founders@retellai.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.RetellLLMBase;
import com.konfigthis.client.model.RetellLLMResponse;
import com.konfigthis.client.model.State;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RetellApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RetellApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public RetellApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call deleteLlmCall(String llmId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/delete-retell-llm/{llm_id}"
            .replace("{" + "llm_id" + "}", localVarApiClient.escapeString(llmId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteLlmValidateBeforeCall(String llmId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'llmId' is set
        if (llmId == null) {
            throw new ApiException("Missing the required parameter 'llmId' when calling deleteLlm(Async)");
        }

        return deleteLlmCall(llmId, _callback);

    }


    private ApiResponse<Void> deleteLlmWithHttpInfo(String llmId) throws ApiException {
        okhttp3.Call localVarCall = deleteLlmValidateBeforeCall(llmId, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteLlmAsync(String llmId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteLlmValidateBeforeCall(llmId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DeleteLlmRequestBuilder {
        private final String llmId;

        private DeleteLlmRequestBuilder(String llmId) {
            this.llmId = llmId;
        }

        /**
         * Build call for deleteLlm
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteLlmCall(llmId, _callback);
        }


        /**
         * Execute deleteLlm request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteLlmWithHttpInfo(llmId);
        }

        /**
         * Execute deleteLlm request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteLlmWithHttpInfo(llmId);
        }

        /**
         * Execute deleteLlm request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteLlmAsync(llmId, _callback);
        }
    }

    /**
     * 
     * Delete an existing Retell LLM
     * @param llmId Unique id of the Retell LLM to be deleted. (required)
     * @return DeleteLlmRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public DeleteLlmRequestBuilder deleteLlm(String llmId) throws IllegalArgumentException {
        if (llmId == null) throw new IllegalArgumentException("\"llmId\" is required but got null");
            

        return new DeleteLlmRequestBuilder(llmId);
    }
    private okhttp3.Call getLlmDetailsCall(String llmId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/get-retell-llm/{llm_id}"
            .replace("{" + "llm_id" + "}", localVarApiClient.escapeString(llmId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getLlmDetailsValidateBeforeCall(String llmId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'llmId' is set
        if (llmId == null) {
            throw new ApiException("Missing the required parameter 'llmId' when calling getLlmDetails(Async)");
        }

        return getLlmDetailsCall(llmId, _callback);

    }


    private ApiResponse<RetellLLMResponse> getLlmDetailsWithHttpInfo(String llmId) throws ApiException {
        okhttp3.Call localVarCall = getLlmDetailsValidateBeforeCall(llmId, null);
        Type localVarReturnType = new TypeToken<RetellLLMResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getLlmDetailsAsync(String llmId, final ApiCallback<RetellLLMResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getLlmDetailsValidateBeforeCall(llmId, _callback);
        Type localVarReturnType = new TypeToken<RetellLLMResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetLlmDetailsRequestBuilder {
        private final String llmId;

        private GetLlmDetailsRequestBuilder(String llmId) {
            this.llmId = llmId;
        }

        /**
         * Build call for getLlmDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved an Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getLlmDetailsCall(llmId, _callback);
        }


        /**
         * Execute getLlmDetails request
         * @return RetellLLMResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved an Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public RetellLLMResponse execute() throws ApiException {
            ApiResponse<RetellLLMResponse> localVarResp = getLlmDetailsWithHttpInfo(llmId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getLlmDetails request with HTTP info returned
         * @return ApiResponse&lt;RetellLLMResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved an Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<RetellLLMResponse> executeWithHttpInfo() throws ApiException {
            return getLlmDetailsWithHttpInfo(llmId);
        }

        /**
         * Execute getLlmDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully retrieved an Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<RetellLLMResponse> _callback) throws ApiException {
            return getLlmDetailsAsync(llmId, _callback);
        }
    }

    /**
     * 
     * Retrieve details of a specific Retell LLM
     * @param llmId Unique id of the Retell LLM to be retrieved. (required)
     * @return GetLlmDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved an Retell LLM. </td><td>  -  </td></tr>
     </table>
     */
    public GetLlmDetailsRequestBuilder getLlmDetails(String llmId) throws IllegalArgumentException {
        if (llmId == null) throw new IllegalArgumentException("\"llmId\" is required but got null");
            

        return new GetLlmDetailsRequestBuilder(llmId);
    }
    private okhttp3.Call newLlmCall(RetellLLMBase retellLLMBase, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = retellLLMBase;

        // create path and map variables
        String localVarPath = "/create-retell-llm";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call newLlmValidateBeforeCall(RetellLLMBase retellLLMBase, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'retellLLMBase' is set
        if (retellLLMBase == null) {
            throw new ApiException("Missing the required parameter 'retellLLMBase' when calling newLlm(Async)");
        }

        return newLlmCall(retellLLMBase, _callback);

    }


    private ApiResponse<RetellLLMResponse> newLlmWithHttpInfo(RetellLLMBase retellLLMBase) throws ApiException {
        okhttp3.Call localVarCall = newLlmValidateBeforeCall(retellLLMBase, null);
        Type localVarReturnType = new TypeToken<RetellLLMResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call newLlmAsync(RetellLLMBase retellLLMBase, final ApiCallback<RetellLLMResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = newLlmValidateBeforeCall(retellLLMBase, _callback);
        Type localVarReturnType = new TypeToken<RetellLLMResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class NewLlmRequestBuilder {
        private String generalPrompt;
        private List<Object> generalTools;
        private List<State> states;
        private String startingState;
        private String beginMessage;

        private NewLlmRequestBuilder() {
        }

        /**
         * Set generalPrompt
         * @param generalPrompt General prompt that&#39;s appended to system prompt no matter what state the agent is in.   - System prompt (with state) &#x3D; general prompt + state prompt.  - System prompt (no state) &#x3D; general prompt. (optional)
         * @return NewLlmRequestBuilder
         */
        public NewLlmRequestBuilder generalPrompt(String generalPrompt) {
            this.generalPrompt = generalPrompt;
            return this;
        }
        
        /**
         * Set generalTools
         * @param generalTools A list of tools the model may call (to get external knowledge, call API, etc). You can select from some common predefined tools like end call, transfer call, etc; or you can create your own custom tool (last option) for the LLM to use.   - Tools of LLM (with state) &#x3D; general tools + state tools + state transitions  - Tools of LLM (no state) &#x3D; general tools (optional)
         * @return NewLlmRequestBuilder
         */
        public NewLlmRequestBuilder generalTools(List<Object> generalTools) {
            this.generalTools = generalTools;
            return this;
        }
        
        /**
         * Set states
         * @param states States of the LLM. This is to help reduce prompt length and tool choices when the call can be broken into distinct states. With shorter prompts and less tools, the LLM can better focus and follow the rules, minimizing hallucination. If this field is not set, the agent would only have general prompt and general tools (essentially one state). (optional)
         * @return NewLlmRequestBuilder
         */
        public NewLlmRequestBuilder states(List<State> states) {
            this.states = states;
            return this;
        }
        
        /**
         * Set startingState
         * @param startingState Name of the starting state. Required if states is not empty. (optional)
         * @return NewLlmRequestBuilder
         */
        public NewLlmRequestBuilder startingState(String startingState) {
            this.startingState = startingState;
            return this;
        }
        
        /**
         * Set beginMessage
         * @param beginMessage First utterance said by the agent in the call. If not set, LLM will dynamically generate a message. If set to \\\&quot;\\\&quot;, agent will wait for user to speak first. (optional)
         * @return NewLlmRequestBuilder
         */
        public NewLlmRequestBuilder beginMessage(String beginMessage) {
            this.beginMessage = beginMessage;
            return this;
        }
        
        /**
         * Build call for newLlm
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully created a new Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            RetellLLMBase retellLLMBase = buildBodyParams();
            return newLlmCall(retellLLMBase, _callback);
        }

        private RetellLLMBase buildBodyParams() {
            RetellLLMBase retellLLMBase = new RetellLLMBase();
            retellLLMBase.generalPrompt(this.generalPrompt);
            retellLLMBase.generalTools(this.generalTools);
            retellLLMBase.states(this.states);
            retellLLMBase.startingState(this.startingState);
            retellLLMBase.beginMessage(this.beginMessage);
            return retellLLMBase;
        }

        /**
         * Execute newLlm request
         * @return RetellLLMResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully created a new Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public RetellLLMResponse execute() throws ApiException {
            RetellLLMBase retellLLMBase = buildBodyParams();
            ApiResponse<RetellLLMResponse> localVarResp = newLlmWithHttpInfo(retellLLMBase);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute newLlm request with HTTP info returned
         * @return ApiResponse&lt;RetellLLMResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully created a new Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<RetellLLMResponse> executeWithHttpInfo() throws ApiException {
            RetellLLMBase retellLLMBase = buildBodyParams();
            return newLlmWithHttpInfo(retellLLMBase);
        }

        /**
         * Execute newLlm request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully created a new Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<RetellLLMResponse> _callback) throws ApiException {
            RetellLLMBase retellLLMBase = buildBodyParams();
            return newLlmAsync(retellLLMBase, _callback);
        }
    }

    /**
     * 
     * Create a new Retell LLM
     * @param retellLLMBase  (required)
     * @return NewLlmRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully created a new Retell LLM. </td><td>  -  </td></tr>
     </table>
     */
    public NewLlmRequestBuilder newLlm() throws IllegalArgumentException {
        return new NewLlmRequestBuilder();
    }
    private okhttp3.Call updateLlmCall(String llmId, RetellLLMBase retellLLMBase, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = retellLLMBase;

        // create path and map variables
        String localVarPath = "/update-retell-llm/{llm_id}"
            .replace("{" + "llm_id" + "}", localVarApiClient.escapeString(llmId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateLlmValidateBeforeCall(String llmId, RetellLLMBase retellLLMBase, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'llmId' is set
        if (llmId == null) {
            throw new ApiException("Missing the required parameter 'llmId' when calling updateLlm(Async)");
        }

        // verify the required parameter 'retellLLMBase' is set
        if (retellLLMBase == null) {
            throw new ApiException("Missing the required parameter 'retellLLMBase' when calling updateLlm(Async)");
        }

        return updateLlmCall(llmId, retellLLMBase, _callback);

    }


    private ApiResponse<RetellLLMResponse> updateLlmWithHttpInfo(String llmId, RetellLLMBase retellLLMBase) throws ApiException {
        okhttp3.Call localVarCall = updateLlmValidateBeforeCall(llmId, retellLLMBase, null);
        Type localVarReturnType = new TypeToken<RetellLLMResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateLlmAsync(String llmId, RetellLLMBase retellLLMBase, final ApiCallback<RetellLLMResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateLlmValidateBeforeCall(llmId, retellLLMBase, _callback);
        Type localVarReturnType = new TypeToken<RetellLLMResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateLlmRequestBuilder {
        private final String llmId;
        private String generalPrompt;
        private List<Object> generalTools;
        private List<State> states;
        private String startingState;
        private String beginMessage;

        private UpdateLlmRequestBuilder(String llmId) {
            this.llmId = llmId;
        }

        /**
         * Set generalPrompt
         * @param generalPrompt General prompt that&#39;s appended to system prompt no matter what state the agent is in.   - System prompt (with state) &#x3D; general prompt + state prompt.  - System prompt (no state) &#x3D; general prompt. (optional)
         * @return UpdateLlmRequestBuilder
         */
        public UpdateLlmRequestBuilder generalPrompt(String generalPrompt) {
            this.generalPrompt = generalPrompt;
            return this;
        }
        
        /**
         * Set generalTools
         * @param generalTools A list of tools the model may call (to get external knowledge, call API, etc). You can select from some common predefined tools like end call, transfer call, etc; or you can create your own custom tool (last option) for the LLM to use.   - Tools of LLM (with state) &#x3D; general tools + state tools + state transitions  - Tools of LLM (no state) &#x3D; general tools (optional)
         * @return UpdateLlmRequestBuilder
         */
        public UpdateLlmRequestBuilder generalTools(List<Object> generalTools) {
            this.generalTools = generalTools;
            return this;
        }
        
        /**
         * Set states
         * @param states States of the LLM. This is to help reduce prompt length and tool choices when the call can be broken into distinct states. With shorter prompts and less tools, the LLM can better focus and follow the rules, minimizing hallucination. If this field is not set, the agent would only have general prompt and general tools (essentially one state). (optional)
         * @return UpdateLlmRequestBuilder
         */
        public UpdateLlmRequestBuilder states(List<State> states) {
            this.states = states;
            return this;
        }
        
        /**
         * Set startingState
         * @param startingState Name of the starting state. Required if states is not empty. (optional)
         * @return UpdateLlmRequestBuilder
         */
        public UpdateLlmRequestBuilder startingState(String startingState) {
            this.startingState = startingState;
            return this;
        }
        
        /**
         * Set beginMessage
         * @param beginMessage First utterance said by the agent in the call. If not set, LLM will dynamically generate a message. If set to \\\&quot;\\\&quot;, agent will wait for user to speak first. (optional)
         * @return UpdateLlmRequestBuilder
         */
        public UpdateLlmRequestBuilder beginMessage(String beginMessage) {
            this.beginMessage = beginMessage;
            return this;
        }
        
        /**
         * Build call for updateLlm
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully updated an Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            RetellLLMBase retellLLMBase = buildBodyParams();
            return updateLlmCall(llmId, retellLLMBase, _callback);
        }

        private RetellLLMBase buildBodyParams() {
            RetellLLMBase retellLLMBase = new RetellLLMBase();
            retellLLMBase.generalPrompt(this.generalPrompt);
            retellLLMBase.generalTools(this.generalTools);
            retellLLMBase.states(this.states);
            retellLLMBase.startingState(this.startingState);
            retellLLMBase.beginMessage(this.beginMessage);
            return retellLLMBase;
        }

        /**
         * Execute updateLlm request
         * @return RetellLLMResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully updated an Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public RetellLLMResponse execute() throws ApiException {
            RetellLLMBase retellLLMBase = buildBodyParams();
            ApiResponse<RetellLLMResponse> localVarResp = updateLlmWithHttpInfo(llmId, retellLLMBase);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateLlm request with HTTP info returned
         * @return ApiResponse&lt;RetellLLMResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully updated an Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<RetellLLMResponse> executeWithHttpInfo() throws ApiException {
            RetellLLMBase retellLLMBase = buildBodyParams();
            return updateLlmWithHttpInfo(llmId, retellLLMBase);
        }

        /**
         * Execute updateLlm request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully updated an Retell LLM. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<RetellLLMResponse> _callback) throws ApiException {
            RetellLLMBase retellLLMBase = buildBodyParams();
            return updateLlmAsync(llmId, retellLLMBase, _callback);
        }
    }

    /**
     * 
     * Update an existing Retell LLM
     * @param llmId Unique id of the Retell LLM to be updated. (required)
     * @param retellLLMBase  (required)
     * @return UpdateLlmRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully updated an Retell LLM. </td><td>  -  </td></tr>
     </table>
     */
    public UpdateLlmRequestBuilder updateLlm(String llmId) throws IllegalArgumentException {
        if (llmId == null) throw new IllegalArgumentException("\"llmId\" is required but got null");
            

        return new UpdateLlmRequestBuilder(llmId);
    }
}
