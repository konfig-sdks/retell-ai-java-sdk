# RetellApi

All URIs are relative to *https://api.retellai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteLlm**](RetellApi.md#deleteLlm) | **DELETE** /delete-retell-llm/{llm_id} |  |
| [**getLlmDetails**](RetellApi.md#getLlmDetails) | **GET** /get-retell-llm/{llm_id} |  |
| [**newLlm**](RetellApi.md#newLlm) | **POST** /create-retell-llm |  |
| [**updateLlm**](RetellApi.md#updateLlm) | **PATCH** /update-retell-llm/{llm_id} |  |


<a name="deleteLlm"></a>
# **deleteLlm**
> deleteLlm(llmId).execute();



Delete an existing Retell LLM

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetellApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.retellai.com";
    
    // Configure HTTP bearer authorization: api_key
    configuration.token = "BEARER TOKEN";
    RetellAi client = new RetellAi(configuration);
    String llmId = "oBeDLoLOeuAbiuaMFXRtDOLriTJ5tSxD"; // Unique id of the Retell LLM to be deleted.
    try {
      client
              .retell
              .deleteLlm(llmId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RetellApi#deleteLlm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .retell
              .deleteLlm(llmId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling RetellApi#deleteLlm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **llmId** | **String**| Unique id of the Retell LLM to be deleted. | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a name="getLlmDetails"></a>
# **getLlmDetails**
> RetellLLMResponse getLlmDetails(llmId).execute();



Retrieve details of a specific Retell LLM

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetellApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.retellai.com";
    
    // Configure HTTP bearer authorization: api_key
    configuration.token = "BEARER TOKEN";
    RetellAi client = new RetellAi(configuration);
    String llmId = "16b980523634a6dc504898cda492e939"; // Unique id of the Retell LLM to be retrieved.
    try {
      RetellLLMResponse result = client
              .retell
              .getLlmDetails(llmId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLlmId());
      System.out.println(result.getLlmWebsocketUrl());
      System.out.println(result.getGeneralPrompt());
      System.out.println(result.getGeneralTools());
      System.out.println(result.getStates());
      System.out.println(result.getStartingState());
      System.out.println(result.getBeginMessage());
      System.out.println(result.getLastModificationTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetellApi#getLlmDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetellLLMResponse> response = client
              .retell
              .getLlmDetails(llmId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetellApi#getLlmDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **llmId** | **String**| Unique id of the Retell LLM to be retrieved. | |

### Return type

[**RetellLLMResponse**](RetellLLMResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an Retell LLM. |  -  |

<a name="newLlm"></a>
# **newLlm**
> RetellLLMResponse newLlm(retellLLMBase).execute();



Create a new Retell LLM

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetellApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.retellai.com";
    
    // Configure HTTP bearer authorization: api_key
    configuration.token = "BEARER TOKEN";
    RetellAi client = new RetellAi(configuration);
    String generalPrompt = "generalPrompt_example"; // General prompt that's appended to system prompt no matter what state the agent is in.   - System prompt (with state) = general prompt + state prompt.  - System prompt (no state) = general prompt.
    List<Object> generalTools = Arrays.asList(null); // A list of tools the model may call (to get external knowledge, call API, etc). You can select from some common predefined tools like end call, transfer call, etc; or you can create your own custom tool (last option) for the LLM to use.   - Tools of LLM (with state) = general tools + state tools + state transitions  - Tools of LLM (no state) = general tools
    List<State> states = Arrays.asList(); // States of the LLM. This is to help reduce prompt length and tool choices when the call can be broken into distinct states. With shorter prompts and less tools, the LLM can better focus and follow the rules, minimizing hallucination. If this field is not set, the agent would only have general prompt and general tools (essentially one state).
    String startingState = "startingState_example"; // Name of the starting state. Required if states is not empty.
    String beginMessage = "beginMessage_example"; // First utterance said by the agent in the call. If not set, LLM will dynamically generate a message. If set to \\\"\\\", agent will wait for user to speak first.
    try {
      RetellLLMResponse result = client
              .retell
              .newLlm()
              .generalPrompt(generalPrompt)
              .generalTools(generalTools)
              .states(states)
              .startingState(startingState)
              .beginMessage(beginMessage)
              .execute();
      System.out.println(result);
      System.out.println(result.getLlmId());
      System.out.println(result.getLlmWebsocketUrl());
      System.out.println(result.getGeneralPrompt());
      System.out.println(result.getGeneralTools());
      System.out.println(result.getStates());
      System.out.println(result.getStartingState());
      System.out.println(result.getBeginMessage());
      System.out.println(result.getLastModificationTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetellApi#newLlm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetellLLMResponse> response = client
              .retell
              .newLlm()
              .generalPrompt(generalPrompt)
              .generalTools(generalTools)
              .states(states)
              .startingState(startingState)
              .beginMessage(beginMessage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetellApi#newLlm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **retellLLMBase** | [**RetellLLMBase**](RetellLLMBase.md)|  | |

### Return type

[**RetellLLMResponse**](RetellLLMResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a new Retell LLM. |  -  |

<a name="updateLlm"></a>
# **updateLlm**
> RetellLLMResponse updateLlm(llmId, retellLLMBase).execute();



Update an existing Retell LLM

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetellApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.retellai.com";
    
    // Configure HTTP bearer authorization: api_key
    configuration.token = "BEARER TOKEN";
    RetellAi client = new RetellAi(configuration);
    String llmId = "16b980523634a6dc504898cda492e939"; // Unique id of the Retell LLM to be updated.
    String generalPrompt = "generalPrompt_example"; // General prompt that's appended to system prompt no matter what state the agent is in.   - System prompt (with state) = general prompt + state prompt.  - System prompt (no state) = general prompt.
    List<Object> generalTools = Arrays.asList(null); // A list of tools the model may call (to get external knowledge, call API, etc). You can select from some common predefined tools like end call, transfer call, etc; or you can create your own custom tool (last option) for the LLM to use.   - Tools of LLM (with state) = general tools + state tools + state transitions  - Tools of LLM (no state) = general tools
    List<State> states = Arrays.asList(); // States of the LLM. This is to help reduce prompt length and tool choices when the call can be broken into distinct states. With shorter prompts and less tools, the LLM can better focus and follow the rules, minimizing hallucination. If this field is not set, the agent would only have general prompt and general tools (essentially one state).
    String startingState = "startingState_example"; // Name of the starting state. Required if states is not empty.
    String beginMessage = "beginMessage_example"; // First utterance said by the agent in the call. If not set, LLM will dynamically generate a message. If set to \\\"\\\", agent will wait for user to speak first.
    try {
      RetellLLMResponse result = client
              .retell
              .updateLlm(llmId)
              .generalPrompt(generalPrompt)
              .generalTools(generalTools)
              .states(states)
              .startingState(startingState)
              .beginMessage(beginMessage)
              .execute();
      System.out.println(result);
      System.out.println(result.getLlmId());
      System.out.println(result.getLlmWebsocketUrl());
      System.out.println(result.getGeneralPrompt());
      System.out.println(result.getGeneralTools());
      System.out.println(result.getStates());
      System.out.println(result.getStartingState());
      System.out.println(result.getBeginMessage());
      System.out.println(result.getLastModificationTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetellApi#updateLlm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetellLLMResponse> response = client
              .retell
              .updateLlm(llmId)
              .generalPrompt(generalPrompt)
              .generalTools(generalTools)
              .states(states)
              .startingState(startingState)
              .beginMessage(beginMessage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetellApi#updateLlm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **llmId** | **String**| Unique id of the Retell LLM to be updated. | |
| **retellLLMBase** | [**RetellLLMBase**](RetellLLMBase.md)|  | |

### Return type

[**RetellLLMResponse**](RetellLLMResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated an Retell LLM. |  -  |

