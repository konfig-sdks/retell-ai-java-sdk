# RetellLlmApi

All URIs are relative to *https://api.retellai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAll**](RetellLlmApi.md#listAll) | **GET** /list-retell-llms |  |


<a name="listAll"></a>
# **listAll**
> List&lt;RetellLLMResponse&gt; listAll().execute();



List all retell LLM

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RetellLlmApi;
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
      List<RetellLLMResponse> result = client
              .retellLlm
              .listAll()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetellLlmApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<RetellLLMResponse>> response = client
              .retellLlm
              .listAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RetellLlmApi#listAll");
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

[**List&lt;RetellLLMResponse&gt;**](RetellLLMResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved all Retell LLM. |  -  |

