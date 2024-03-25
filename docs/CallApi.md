# CallApi

All URIs are relative to *https://api.retellai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**establishConnection**](CallApi.md#establishConnection) | **POST** /register-call |  |
| [**getDetails**](CallApi.md#getDetails) | **GET** /get-call/{call_id} |  |
| [**getDetails_0**](CallApi.md#getDetails_0) | **GET** /list-calls |  |
| [**makeConnection**](CallApi.md#makeConnection) | **POST** /create-phone-call |  |


<a name="establishConnection"></a>
# **establishConnection**
> CallBase establishConnection(callEstablishConnectionRequest).execute();



Register Call To Get CallId To Establish Connection

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallApi;
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
    String agentId = "agentId_example"; // Unique id of agent used for the call. Your agent would contain the LLM Websocket url used for this call.
    String audioWebsocketProtocol = "web"; // Where the audio websocket would connect from would determine the format / protocol of websocket messages, and would determine how our server read audio bytes and send audio bytes.:  - `web`: The protocol defined by Retell, commonly used for connecting from web frontend. Also useful for those who want to manipulate audio bytes directly.  - `twilio`: The [websocket protocol](https://www.twilio.com/docs/voice/twiml/stream#message-media) defined by Twilio, used when your system uses Twilio, and supplies Retell audio websocket url to Twilio.
    String audioEncoding = "s16le"; // The audio encoding of the call. The following formats are supported:   - `s16le` 16 bit linear PCM audio, the native format for web audio capture and playback.  - `mulaw` non-linear audio encoding technique used in telephony. Commonly used by Twilio.
    Integer sampleRate = 56; // Sample rate of the conversation, the input and output audio bytes will all conform to this rate. Check the audio source, audio format, and voice used for the agent to select one that works. supports value ranging from [8000, 48000]. Note for Twilio `mulaw` encoding, the sample rate has to be 8000.  - `s16le` sample rate recommendation (natively supported, lowest latency):    - elevenlabs voices: 16000, 22050, 24000, 44100.   - openai voices: 24000.    - deepgram voices: 8000, 16000, 24000, 32000, 48000.
    Integer endCallAfterSilenceMs = 56; // If users stay silent for a period, end the call. By default, it is set to 600,000 ms (10 min). The minimum value allowed is 10,000 ms (10 s).
    String fromNumber = "fromNumber_example"; // The caller number. This field is storage purpose only, set this if you want the call object to contain it so that it's easier to reference it. Not used for processing, when we connect to your LLM websocket server, you can then get it from the call object.
    String toNumber = "toNumber_example"; // The callee number. This field is storage purpose only, set this if you want the call object to contain it so that it's easier to reference it. Not used for processing, when we connect to your LLM websocket server, you can then get it from the call object.
    Object metadata = null; // An abtriary object for storage purpose only. You can put anything here like your own id for the call, twilio SID, internal customer id. Not used for processing, when we connect to your LLM websocket server, you can then get it from the call object.
    Map<String, Object> retellLlmDynamicVariables = new HashMap(); // Add optional dynamic variables in key value pairs of string that injects into your Retell LLM prompt and tool description. Only applicable for Retell LLM.
    try {
      CallBase result = client
              .call
              .establishConnection(agentId, audioWebsocketProtocol, audioEncoding, sampleRate)
              .endCallAfterSilenceMs(endCallAfterSilenceMs)
              .fromNumber(fromNumber)
              .toNumber(toNumber)
              .metadata(metadata)
              .retellLlmDynamicVariables(retellLlmDynamicVariables)
              .execute();
      System.out.println(result);
      System.out.println(result.getCallId());
      System.out.println(result.getAgentId());
      System.out.println(result.getAudioWebsocketProtocol());
      System.out.println(result.getAudioEncoding());
      System.out.println(result.getSampleRate());
      System.out.println(result.getCallStatus());
      System.out.println(result.getStartTimestamp());
      System.out.println(result.getEndCallAfterSilenceMs());
      System.out.println(result.getFromNumber());
      System.out.println(result.getToNumber());
      System.out.println(result.getMetadata());
      System.out.println(result.getRetellLlmDynamicVariables());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallApi#establishConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallBase> response = client
              .call
              .establishConnection(agentId, audioWebsocketProtocol, audioEncoding, sampleRate)
              .endCallAfterSilenceMs(endCallAfterSilenceMs)
              .fromNumber(fromNumber)
              .toNumber(toNumber)
              .metadata(metadata)
              .retellLlmDynamicVariables(retellLlmDynamicVariables)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallApi#establishConnection");
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
| **callEstablishConnectionRequest** | [**CallEstablishConnectionRequest**](CallEstablishConnectionRequest.md)|  | |

### Return type

[**CallBase**](CallBase.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully registered a call. |  -  |

<a name="getDetails"></a>
# **getDetails**
> CallDetail getDetails(callId).execute();



Retrieve details of a specific call

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallApi;
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
    String callId = "119c3f8e47135a29e65947eeb34cf12d"; // The call id to retrieve call history for.
    try {
      CallDetail result = client
              .call
              .getDetails(callId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCallId());
      System.out.println(result.getAgentId());
      System.out.println(result.getAudioWebsocketProtocol());
      System.out.println(result.getAudioEncoding());
      System.out.println(result.getSampleRate());
      System.out.println(result.getCallStatus());
      System.out.println(result.getStartTimestamp());
      System.out.println(result.getEndCallAfterSilenceMs());
      System.out.println(result.getFromNumber());
      System.out.println(result.getToNumber());
      System.out.println(result.getMetadata());
      System.out.println(result.getRetellLlmDynamicVariables());
      System.out.println(result.getEndTimestamp());
      System.out.println(result.getTranscript());
      System.out.println(result.getTranscriptObject());
      System.out.println(result.getRecordingUrl());
      System.out.println(result.getPublicLogUrl());
      System.out.println(result.getE2eLatency());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallDetail> response = client
              .call
              .getDetails(callId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallApi#getDetails");
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
| **callId** | **String**| The call id to retrieve call history for. | |

### Return type

[**CallDetail**](CallDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an agent. |  -  |

<a name="getDetails_0"></a>
# **getDetails_0**
> List&lt;CallDetail&gt; getDetails_0().filterCriteria(filterCriteria).sortOrder(sortOrder).limit(limit).execute();



Retrieve call details

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallApi;
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
    CallGetDetailsFilterCriteriaParameter filterCriteria = new HashMap();
    String sortOrder = "ascending"; // The calls will be sorted by `start_timestamp`, whether to return the calls in ascending or descending order.
    Integer limit = 1000; // Limit the number of calls returned.
    try {
      List<CallDetail> result = client
              .call
              .getDetails_0()
              .filterCriteria(filterCriteria)
              .sortOrder(sortOrder)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallApi#getDetails_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<CallDetail>> response = client
              .call
              .getDetails_0()
              .filterCriteria(filterCriteria)
              .sortOrder(sortOrder)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallApi#getDetails_0");
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
| **filterCriteria** | [**CallGetDetailsFilterCriteriaParameter**](.md)|  | [optional] |
| **sortOrder** | **String**| The calls will be sorted by &#x60;start_timestamp&#x60;, whether to return the calls in ascending or descending order. | [optional] [default to descending] [enum: ascending, descending] |
| **limit** | **Integer**| Limit the number of calls returned. | [optional] [default to 1000] |

### Return type

[**List&lt;CallDetail&gt;**](CallDetail.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved all agents. |  -  |

<a name="makeConnection"></a>
# **makeConnection**
> CallBase makeConnection(callMakeConnectionRequest).execute();



Create a new phone call

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallApi;
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
    CallMakeConnectionRequestPhoneNumber phoneNumber = new CallMakeConnectionRequestPhoneNumber();
    String overrideAgentId = "overrideAgentId_example"; // For this particular call, override the agent used with this agent id. This does not bind the agent to this number, this is for one time override.
    Map<String, Object> retellLlmDynamicVariables = new HashMap(); // Add optional dynamic variables in key value pairs of string that injects into your Retell LLM prompt and tool description. Only applicable for Retell LLM.
    try {
      CallBase result = client
              .call
              .makeConnection(phoneNumber)
              .overrideAgentId(overrideAgentId)
              .retellLlmDynamicVariables(retellLlmDynamicVariables)
              .execute();
      System.out.println(result);
      System.out.println(result.getCallId());
      System.out.println(result.getAgentId());
      System.out.println(result.getAudioWebsocketProtocol());
      System.out.println(result.getAudioEncoding());
      System.out.println(result.getSampleRate());
      System.out.println(result.getCallStatus());
      System.out.println(result.getStartTimestamp());
      System.out.println(result.getEndCallAfterSilenceMs());
      System.out.println(result.getFromNumber());
      System.out.println(result.getToNumber());
      System.out.println(result.getMetadata());
      System.out.println(result.getRetellLlmDynamicVariables());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallApi#makeConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallBase> response = client
              .call
              .makeConnection(phoneNumber)
              .overrideAgentId(overrideAgentId)
              .retellLlmDynamicVariables(retellLlmDynamicVariables)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallApi#makeConnection");
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
| **callMakeConnectionRequest** | [**CallMakeConnectionRequest**](CallMakeConnectionRequest.md)|  | |

### Return type

[**CallBase**](CallBase.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully made an outbound call. |  -  |

