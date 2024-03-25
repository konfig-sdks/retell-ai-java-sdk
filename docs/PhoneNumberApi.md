# PhoneNumberApi

All URIs are relative to *https://api.retellai.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllNumbers**](PhoneNumberApi.md#getAllNumbers) | **GET** /list-phone-numbers |  |
| [**getDetails**](PhoneNumberApi.md#getDetails) | **GET** /get-phone-number/{phone_number} |  |
| [**purchaseNumberAndBindAgent**](PhoneNumberApi.md#purchaseNumberAndBindAgent) | **POST** /create-phone-number |  |
| [**removePhoneNumber**](PhoneNumberApi.md#removePhoneNumber) | **DELETE** /delete-phone-number/{phone_number} |  |
| [**updateRetellLlm**](PhoneNumberApi.md#updateRetellLlm) | **PATCH** /update-phone-number/{phone_number} |  |


<a name="getAllNumbers"></a>
# **getAllNumbers**
> List&lt;PhoneNumberResponse&gt; getAllNumbers().execute();



List all phone numbers

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PhoneNumberApi;
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
      List<PhoneNumberResponse> result = client
              .phoneNumber
              .getAllNumbers()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberApi#getAllNumbers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PhoneNumberResponse>> response = client
              .phoneNumber
              .getAllNumbers()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberApi#getAllNumbers");
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

[**List&lt;PhoneNumberResponse&gt;**](PhoneNumberResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved all phone numbers. |  -  |

<a name="getDetails"></a>
# **getDetails**
> PhoneNumberResponse getDetails(phoneNumber).execute();



Retrieve details of a specific phone number

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PhoneNumberApi;
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
    String phoneNumber = "14157774444"; // BCP 47 format of the number (+country code, then number with no space, no special characters), used as the unique identifier for phone number APIs.
    try {
      PhoneNumberResponse result = client
              .phoneNumber
              .getDetails(phoneNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getPhoneNumberPretty());
      System.out.println(result.getAgentId());
      System.out.println(result.getAreaCode());
      System.out.println(result.getLastModificationTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneNumberResponse> response = client
              .phoneNumber
              .getDetails(phoneNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberApi#getDetails");
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
| **phoneNumber** | **String**| BCP 47 format of the number (+country code, then number with no space, no special characters), used as the unique identifier for phone number APIs. | |

### Return type

[**PhoneNumberResponse**](PhoneNumberResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved an Retell LLM. |  -  |

<a name="purchaseNumberAndBindAgent"></a>
# **purchaseNumberAndBindAgent**
> PhoneNumberResponse purchaseNumberAndBindAgent(phoneNumberPurchaseNumberAndBindAgentRequest).execute();



Buy a new phone number &amp; Bind an agent

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PhoneNumberApi;
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
    String agentId = "agentId_example"; // Unique id of agent to bind to newly obtained number. The number will automatically use the agent when doing inbound / outbound calls.
    Integer areaCode = 56; // Area code of the number to obtain. Format is a 3 digit integer. Currently only supports US area code.
    try {
      PhoneNumberResponse result = client
              .phoneNumber
              .purchaseNumberAndBindAgent(agentId)
              .areaCode(areaCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getPhoneNumberPretty());
      System.out.println(result.getAgentId());
      System.out.println(result.getAreaCode());
      System.out.println(result.getLastModificationTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberApi#purchaseNumberAndBindAgent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneNumberResponse> response = client
              .phoneNumber
              .purchaseNumberAndBindAgent(agentId)
              .areaCode(areaCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberApi#purchaseNumberAndBindAgent");
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
| **phoneNumberPurchaseNumberAndBindAgentRequest** | [**PhoneNumberPurchaseNumberAndBindAgentRequest**](PhoneNumberPurchaseNumberAndBindAgentRequest.md)|  | |

### Return type

[**PhoneNumberResponse**](PhoneNumberResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a new number. |  -  |

<a name="removePhoneNumber"></a>
# **removePhoneNumber**
> removePhoneNumber(phoneNumber).execute();



Delete an existing phone number

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.RetellAi;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PhoneNumberApi;
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
    String phoneNumber = "14157774444"; // BCP 47 format of the number (+country code, then number with no space, no special characters), used as the unique identifier for phone number APIs.
    try {
      client
              .phoneNumber
              .removePhoneNumber(phoneNumber)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberApi#removePhoneNumber");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .phoneNumber
              .removePhoneNumber(phoneNumber)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberApi#removePhoneNumber");
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
| **phoneNumber** | **String**| BCP 47 format of the number (+country code, then number with no space, no special characters), used as the unique identifier for phone number APIs. | |

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

<a name="updateRetellLlm"></a>
# **updateRetellLlm**
> PhoneNumberResponse updateRetellLlm(phoneNumber, phoneNumberUpdateRetellLlmRequest).execute();



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
import com.konfigthis.client.api.PhoneNumberApi;
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
    String agentId = "agentId_example"; // Unique id of agent to bind to number. The number will automatically use the agent when doing inbound / outbound calls.
    String phoneNumber = "14157774444"; // BCP 47 format of the number (+country code, then number with no space, no special characters), used as the unique identifier for phone number APIs.
    try {
      PhoneNumberResponse result = client
              .phoneNumber
              .updateRetellLlm(agentId, phoneNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getPhoneNumberPretty());
      System.out.println(result.getAgentId());
      System.out.println(result.getAreaCode());
      System.out.println(result.getLastModificationTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberApi#updateRetellLlm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PhoneNumberResponse> response = client
              .phoneNumber
              .updateRetellLlm(agentId, phoneNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneNumberApi#updateRetellLlm");
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
| **phoneNumber** | **String**| BCP 47 format of the number (+country code, then number with no space, no special characters), used as the unique identifier for phone number APIs. | |
| **phoneNumberUpdateRetellLlmRequest** | [**PhoneNumberUpdateRetellLlmRequest**](PhoneNumberUpdateRetellLlmRequest.md)|  | |

### Return type

[**PhoneNumberResponse**](PhoneNumberResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated an phone number object. |  -  |

