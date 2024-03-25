<div align="left">

[![Visit Retell ai](./header.png)](https://retellai.com)

# [Retell ai](https://retellai.com)

API for voice AI. Effortlessly integrate human-like Voice AI into your product. | We are building an API that enables your product to provide an intuitive and engaging way for user interaction - through voice.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Retell%20AI&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>retell-ai-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:retell-ai-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/retell-ai-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.retellai.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AgentApi* | [**createNewAgent**](docs/AgentApi.md#createNewAgent) | **POST** /create-agent | 
*AgentApi* | [**deleteExistingAgent**](docs/AgentApi.md#deleteExistingAgent) | **DELETE** /delete-agent/{agent_id} | 
*AgentApi* | [**getAll**](docs/AgentApi.md#getAll) | **GET** /list-agents | 
*AgentApi* | [**getDetails**](docs/AgentApi.md#getDetails) | **GET** /get-agent/{agent_id} | 
*AgentApi* | [**updateExistingAgent**](docs/AgentApi.md#updateExistingAgent) | **PATCH** /update-agent/{agent_id} | 
*CallApi* | [**establishConnection**](docs/CallApi.md#establishConnection) | **POST** /register-call | 
*CallApi* | [**getDetails**](docs/CallApi.md#getDetails) | **GET** /get-call/{call_id} | 
*CallApi* | [**getDetails_0**](docs/CallApi.md#getDetails_0) | **GET** /list-calls | 
*CallApi* | [**makeConnection**](docs/CallApi.md#makeConnection) | **POST** /create-phone-call | 
*PhoneNumberApi* | [**getAllNumbers**](docs/PhoneNumberApi.md#getAllNumbers) | **GET** /list-phone-numbers | 
*PhoneNumberApi* | [**getDetails**](docs/PhoneNumberApi.md#getDetails) | **GET** /get-phone-number/{phone_number} | 
*PhoneNumberApi* | [**purchaseNumberAndBindAgent**](docs/PhoneNumberApi.md#purchaseNumberAndBindAgent) | **POST** /create-phone-number | 
*PhoneNumberApi* | [**removePhoneNumber**](docs/PhoneNumberApi.md#removePhoneNumber) | **DELETE** /delete-phone-number/{phone_number} | 
*PhoneNumberApi* | [**updateRetellLlm**](docs/PhoneNumberApi.md#updateRetellLlm) | **PATCH** /update-phone-number/{phone_number} | 
*RetellApi* | [**deleteLlm**](docs/RetellApi.md#deleteLlm) | **DELETE** /delete-retell-llm/{llm_id} | 
*RetellApi* | [**getLlmDetails**](docs/RetellApi.md#getLlmDetails) | **GET** /get-retell-llm/{llm_id} | 
*RetellApi* | [**newLlm**](docs/RetellApi.md#newLlm) | **POST** /create-retell-llm | 
*RetellApi* | [**updateLlm**](docs/RetellApi.md#updateLlm) | **PATCH** /update-retell-llm/{llm_id} | 
*RetellLlmApi* | [**listAll**](docs/RetellLlmApi.md#listAll) | **GET** /list-retell-llms | 


## Documentation for Models

 - [AgentCreateNewAgentRequest](docs/AgentCreateNewAgentRequest.md)
 - [AgentResponse](docs/AgentResponse.md)
 - [AgentResponseAllOf](docs/AgentResponseAllOf.md)
 - [AgentResponseAllOf1](docs/AgentResponseAllOf1.md)
 - [BaseAgent](docs/BaseAgent.md)
 - [BookAppointmentCalTool](docs/BookAppointmentCalTool.md)
 - [CallBase](docs/CallBase.md)
 - [CallDetail](docs/CallDetail.md)
 - [CallDetailAllOf](docs/CallDetailAllOf.md)
 - [CallDetailAllOfE2eLatency](docs/CallDetailAllOfE2eLatency.md)
 - [CallEstablishConnectionRequest](docs/CallEstablishConnectionRequest.md)
 - [CallGetDetailsFilterCriteriaParameter](docs/CallGetDetailsFilterCriteriaParameter.md)
 - [CallMakeConnectionRequest](docs/CallMakeConnectionRequest.md)
 - [CallMakeConnectionRequestPhoneNumber](docs/CallMakeConnectionRequestPhoneNumber.md)
 - [CheckAvailabilityCalTool](docs/CheckAvailabilityCalTool.md)
 - [CustomTool](docs/CustomTool.md)
 - [EndCallTool](docs/EndCallTool.md)
 - [PhoneNumberPurchaseNumberAndBindAgentRequest](docs/PhoneNumberPurchaseNumberAndBindAgentRequest.md)
 - [PhoneNumberResponse](docs/PhoneNumberResponse.md)
 - [PhoneNumberUpdateRetellLlmRequest](docs/PhoneNumberUpdateRetellLlmRequest.md)
 - [RetellLLMBase](docs/RetellLLMBase.md)
 - [RetellLLMResponse](docs/RetellLLMResponse.md)
 - [RetellLLMResponseAllOf](docs/RetellLLMResponseAllOf.md)
 - [RetellLLMResponseAllOf1](docs/RetellLLMResponseAllOf1.md)
 - [State](docs/State.md)
 - [StateEdge](docs/StateEdge.md)
 - [ToolParameter](docs/ToolParameter.md)
 - [TransferCallTool](docs/TransferCallTool.md)
 - [Utterance](docs/Utterance.md)
 - [UtteranceWordsInner](docs/UtteranceWordsInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
