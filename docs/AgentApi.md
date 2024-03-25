# AgentApi

All URIs are relative to *https://api.retellai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewAgent**](AgentApi.md#createNewAgent) | **POST** /create-agent |  |
| [**deleteExistingAgent**](AgentApi.md#deleteExistingAgent) | **DELETE** /delete-agent/{agent_id} |  |
| [**getAll**](AgentApi.md#getAll) | **GET** /list-agents |  |
| [**getDetails**](AgentApi.md#getDetails) | **GET** /get-agent/{agent_id} |  |
| [**updateExistingAgent**](AgentApi.md#updateExistingAgent) | **PATCH** /update-agent/{agent_id} |  |


<a name="createNewAgent"></a>
# **createNewAgent**
> AgentResponse createNewAgent(agentCreateNewAgentRequest).execute();



Create a new agent

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AgentApi;
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
    String llmWebsocketUrl = "llmWebsocketUrl_example"; // The URL we will establish LLM websocket for getting response, usually your server. Check out [LLM WebSocket](https://raw.githubusercontent.com) for more about request format (sent from us) and response format (send to us).
    String voiceId = "voiceId_example"; // Unique voice id used for the agent. Find list of available voices and their preview in Dashboard.
    Double voiceTemperature = 3.4D; // Controls how stable the voice is. Value ranging from [0,2]. Lower value means more stable, and higher value means more variant speech generation. Currently this setting only applies to `11labs` voices. If unset, default value 1 will apply.
    Double voiceSpeed = 3.4D; // Controls speed of voice. Value ranging from [0.5,2]. Lower value means slower speech, while higher value means faster speech rate. If unset, default value 1 will apply.
    Double responsiveness = 3.4D; // Controls how responsive is the agent. Value ranging from [0,1]. Lower value means less responsive agent (wait more, respond slower), while higher value means faster exchanges (respond when it can). If unset, default value 1 will apply.
    Boolean enableBackchannel = true; // Controls whether the agent would backchannel (agent interjects the speaker with phrases like \\\"yeah\\\", \\\"uh-huh\\\" to signify interest and engagement). Backchannel when enabled tends to show up more in longer user utterances. If not set, agent will not backchannel.
    String ambientSound = "coffee-shop"; // If set, will add ambient environment sound to the call to make experience more realistic. Currently supports the following options:  - `coffee-shop`: Coffee shop ambience with people chatting in background. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/coffee-shop.wav)  - `convention-hall`: Convention hall ambience, with some echo and people chatting in background. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/convention-hall.wav)  - `summer-outdoor`: Summer outdoor ambience with cicada chirping. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/summer-outdoor.wav)  - `mountain-outdoor`: Mountain outdoor ambience with birds singing. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/mountain-outdoor.wav)   Set to string `null` to remove ambient sound from this agent. 
    String agentName = "agentName_example"; // The name of the agent. Only used for your own reference.
    String language = "en-US"; // `Beta feature, use with caution.`   This setting specifies the agent's operational language, including base language and dialect. Speech recognition considers both elements, but text-to-speech currently only recognizes the base language.    For instance, selecting `en-GB` optimizes speech recognition for British English, yet text-to-speech output will be in standard English. If dialect-specific text-to-speech is required, please contact us for support.   - `11lab voices`: supports English(en), German(de), Spanish(es), Hindi(hi), Portuguese(pt)   - `openAI voices`: supports English(en), German(de), Spanish(es), Hindi(hi), Portuguese(pt), Japanese(ja)   - `deepgram voices`: supports English(en) 
    String webhookUrl = "webhookUrl_example"; // The webhook for agent to listen to call events. See what events it would get at [webhook doc](https://raw.githubusercontent.com). If set, will binds webhook events for this agent to the specified url, and will ignore the account level webhook for this agent. Set to string `null` to remove webhook url from this agent.
    List<String> boostedKeywords = Arrays.asList(); // Provide a customized list of keywords to bias the transcriber model, so that these words are more likely to get transcribed. Commonly used for names, brands, street, etc.
    Boolean formatText = true; // Whether to format the transcribed text with inverse text normalization. It transforms the spoken form of text into written form for entities like phone number, email address, street address, etc. For example, \\\"february fourth twenty twenty two\\\" can be converted into \\\"february 4th 2022\\\". If not set, the default is true.
    Boolean optOutSensitiveDataStorage = true; // Disable transcripts and recordings storage for enhanced privacy. Access transcripts securely via webhooks.
    try {
      AgentResponse result = client
              .agent
              .createNewAgent()
              .llmWebsocketUrl(llmWebsocketUrl)
              .voiceId(voiceId)
              .voiceTemperature(voiceTemperature)
              .voiceSpeed(voiceSpeed)
              .responsiveness(responsiveness)
              .enableBackchannel(enableBackchannel)
              .ambientSound(ambientSound)
              .agentName(agentName)
              .language(language)
              .webhookUrl(webhookUrl)
              .boostedKeywords(boostedKeywords)
              .formatText(formatText)
              .optOutSensitiveDataStorage(optOutSensitiveDataStorage)
              .execute();
      System.out.println(result);
      System.out.println(result.getAgentId());
      System.out.println(result.getLlmWebsocketUrl());
      System.out.println(result.getVoiceId());
      System.out.println(result.getVoiceTemperature());
      System.out.println(result.getVoiceSpeed());
      System.out.println(result.getResponsiveness());
      System.out.println(result.getEnableBackchannel());
      System.out.println(result.getAmbientSound());
      System.out.println(result.getAgentName());
      System.out.println(result.getLanguage());
      System.out.println(result.getWebhookUrl());
      System.out.println(result.getBoostedKeywords());
      System.out.println(result.getFormatText());
      System.out.println(result.getOptOutSensitiveDataStorage());
      System.out.println(result.getLastModificationTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#createNewAgent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AgentResponse> response = client
              .agent
              .createNewAgent()
              .llmWebsocketUrl(llmWebsocketUrl)
              .voiceId(voiceId)
              .voiceTemperature(voiceTemperature)
              .voiceSpeed(voiceSpeed)
              .responsiveness(responsiveness)
              .enableBackchannel(enableBackchannel)
              .ambientSound(ambientSound)
              .agentName(agentName)
              .language(language)
              .webhookUrl(webhookUrl)
              .boostedKeywords(boostedKeywords)
              .formatText(formatText)
              .optOutSensitiveDataStorage(optOutSensitiveDataStorage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#createNewAgent");
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
| **agentCreateNewAgentRequest** | [**AgentCreateNewAgentRequest**](AgentCreateNewAgentRequest.md)|  | |

### Return type

[**AgentResponse**](AgentResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a new agent. |  -  |

<a name="deleteExistingAgent"></a>
# **deleteExistingAgent**
> deleteExistingAgent(agentId).execute();



Delete an existing agent

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AgentApi;
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
    String agentId = "oBeDLoLOeuAbiuaMFXRtDOLriTJ5tSxD"; // Unique id of the agent to be deleted.
    try {
      client
              .agent
              .deleteExistingAgent(agentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#deleteExistingAgent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .agent
              .deleteExistingAgent(agentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#deleteExistingAgent");
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
| **agentId** | **String**| Unique id of the agent to be deleted. | |

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

<a name="getAll"></a>
# **getAll**
> List&lt;AgentResponse&gt; getAll().execute();



List all agents

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AgentApi;
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
    try {
      List<AgentResponse> result = client
              .agent
              .getAll()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AgentResponse>> response = client
              .agent
              .getAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AgentResponse&gt;**](AgentResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved all agents. |  -  |

<a name="getDetails"></a>
# **getDetails**
> AgentResponse getDetails(agentId).execute();



Retrieve details of a specific agent

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AgentApi;
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
    String agentId = "16b980523634a6dc504898cda492e939"; // Unique id of the agent to be retrieved.
    try {
      AgentResponse result = client
              .agent
              .getDetails(agentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAgentId());
      System.out.println(result.getLlmWebsocketUrl());
      System.out.println(result.getVoiceId());
      System.out.println(result.getVoiceTemperature());
      System.out.println(result.getVoiceSpeed());
      System.out.println(result.getResponsiveness());
      System.out.println(result.getEnableBackchannel());
      System.out.println(result.getAmbientSound());
      System.out.println(result.getAgentName());
      System.out.println(result.getLanguage());
      System.out.println(result.getWebhookUrl());
      System.out.println(result.getBoostedKeywords());
      System.out.println(result.getFormatText());
      System.out.println(result.getOptOutSensitiveDataStorage());
      System.out.println(result.getLastModificationTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AgentResponse> response = client
              .agent
              .getDetails(agentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#getDetails");
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
| **agentId** | **String**| Unique id of the agent to be retrieved. | |

### Return type

[**AgentResponse**](AgentResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an agent. |  -  |

<a name="updateExistingAgent"></a>
# **updateExistingAgent**
> AgentResponse updateExistingAgent(agentId, baseAgent).execute();



Update an existing agent

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AgentApi;
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
    String agentId = "16b980523634a6dc504898cda492e939"; // Unique id of the agent to be updated.
    String llmWebsocketUrl = "llmWebsocketUrl_example"; // The URL we will establish LLM websocket for getting response, usually your server. Check out [LLM WebSocket](https://raw.githubusercontent.com) for more about request format (sent from us) and response format (send to us).
    String voiceId = "voiceId_example"; // Unique voice id used for the agent. Find list of available voices and their preview in Dashboard.
    Double voiceTemperature = 3.4D; // Controls how stable the voice is. Value ranging from [0,2]. Lower value means more stable, and higher value means more variant speech generation. Currently this setting only applies to `11labs` voices. If unset, default value 1 will apply.
    Double voiceSpeed = 3.4D; // Controls speed of voice. Value ranging from [0.5,2]. Lower value means slower speech, while higher value means faster speech rate. If unset, default value 1 will apply.
    Double responsiveness = 3.4D; // Controls how responsive is the agent. Value ranging from [0,1]. Lower value means less responsive agent (wait more, respond slower), while higher value means faster exchanges (respond when it can). If unset, default value 1 will apply.
    Boolean enableBackchannel = true; // Controls whether the agent would backchannel (agent interjects the speaker with phrases like \\\"yeah\\\", \\\"uh-huh\\\" to signify interest and engagement). Backchannel when enabled tends to show up more in longer user utterances. If not set, agent will not backchannel.
    String ambientSound = "coffee-shop"; // If set, will add ambient environment sound to the call to make experience more realistic. Currently supports the following options:  - `coffee-shop`: Coffee shop ambience with people chatting in background. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/coffee-shop.wav)  - `convention-hall`: Convention hall ambience, with some echo and people chatting in background. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/convention-hall.wav)  - `summer-outdoor`: Summer outdoor ambience with cicada chirping. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/summer-outdoor.wav)  - `mountain-outdoor`: Mountain outdoor ambience with birds singing. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/mountain-outdoor.wav)   Set to string `null` to remove ambient sound from this agent. 
    String agentName = "agentName_example"; // The name of the agent. Only used for your own reference.
    String language = "en-US"; // `Beta feature, use with caution.`   This setting specifies the agent's operational language, including base language and dialect. Speech recognition considers both elements, but text-to-speech currently only recognizes the base language.    For instance, selecting `en-GB` optimizes speech recognition for British English, yet text-to-speech output will be in standard English. If dialect-specific text-to-speech is required, please contact us for support.   - `11lab voices`: supports English(en), German(de), Spanish(es), Hindi(hi), Portuguese(pt)   - `openAI voices`: supports English(en), German(de), Spanish(es), Hindi(hi), Portuguese(pt), Japanese(ja)   - `deepgram voices`: supports English(en) 
    String webhookUrl = "webhookUrl_example"; // The webhook for agent to listen to call events. See what events it would get at [webhook doc](https://raw.githubusercontent.com). If set, will binds webhook events for this agent to the specified url, and will ignore the account level webhook for this agent. Set to string `null` to remove webhook url from this agent.
    List<String> boostedKeywords = Arrays.asList(); // Provide a customized list of keywords to bias the transcriber model, so that these words are more likely to get transcribed. Commonly used for names, brands, street, etc.
    Boolean formatText = true; // Whether to format the transcribed text with inverse text normalization. It transforms the spoken form of text into written form for entities like phone number, email address, street address, etc. For example, \\\"february fourth twenty twenty two\\\" can be converted into \\\"february 4th 2022\\\". If not set, the default is true.
    Boolean optOutSensitiveDataStorage = true; // Disable transcripts and recordings storage for enhanced privacy. Access transcripts securely via webhooks.
    try {
      AgentResponse result = client
              .agent
              .updateExistingAgent(agentId)
              .llmWebsocketUrl(llmWebsocketUrl)
              .voiceId(voiceId)
              .voiceTemperature(voiceTemperature)
              .voiceSpeed(voiceSpeed)
              .responsiveness(responsiveness)
              .enableBackchannel(enableBackchannel)
              .ambientSound(ambientSound)
              .agentName(agentName)
              .language(language)
              .webhookUrl(webhookUrl)
              .boostedKeywords(boostedKeywords)
              .formatText(formatText)
              .optOutSensitiveDataStorage(optOutSensitiveDataStorage)
              .execute();
      System.out.println(result);
      System.out.println(result.getAgentId());
      System.out.println(result.getLlmWebsocketUrl());
      System.out.println(result.getVoiceId());
      System.out.println(result.getVoiceTemperature());
      System.out.println(result.getVoiceSpeed());
      System.out.println(result.getResponsiveness());
      System.out.println(result.getEnableBackchannel());
      System.out.println(result.getAmbientSound());
      System.out.println(result.getAgentName());
      System.out.println(result.getLanguage());
      System.out.println(result.getWebhookUrl());
      System.out.println(result.getBoostedKeywords());
      System.out.println(result.getFormatText());
      System.out.println(result.getOptOutSensitiveDataStorage());
      System.out.println(result.getLastModificationTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#updateExistingAgent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AgentResponse> response = client
              .agent
              .updateExistingAgent(agentId)
              .llmWebsocketUrl(llmWebsocketUrl)
              .voiceId(voiceId)
              .voiceTemperature(voiceTemperature)
              .voiceSpeed(voiceSpeed)
              .responsiveness(responsiveness)
              .enableBackchannel(enableBackchannel)
              .ambientSound(ambientSound)
              .agentName(agentName)
              .language(language)
              .webhookUrl(webhookUrl)
              .boostedKeywords(boostedKeywords)
              .formatText(formatText)
              .optOutSensitiveDataStorage(optOutSensitiveDataStorage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#updateExistingAgent");
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
| **agentId** | **String**| Unique id of the agent to be updated. | |
| **baseAgent** | [**BaseAgent**](BaseAgent.md)|  | |

### Return type

[**AgentResponse**](AgentResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated an agent. |  -  |

