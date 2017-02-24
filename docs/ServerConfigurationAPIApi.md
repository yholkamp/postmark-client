# ServerConfigurationAPIApi

All URIs are relative to *https://api.postmarkapp.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editCurrentServerConfiguration**](ServerConfigurationAPIApi.md#editCurrentServerConfiguration) | **PUT** /server | Edit Server Configuration
[**getCurrentServerConfiguration**](ServerConfigurationAPIApi.md#getCurrentServerConfiguration) | **GET** /server | Get Server Configuration


<a name="editCurrentServerConfiguration"></a>
# **editCurrentServerConfiguration**
> ServerConfigurationResponse editCurrentServerConfiguration(xPostmarkServerToken, body)

Edit Server Configuration

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.ServerConfigurationAPIApi;


ServerConfigurationAPIApi apiInstance = new ServerConfigurationAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
EditServerConfigurationRequest body = new EditServerConfigurationRequest(); // EditServerConfigurationRequest | The settings that should be modified for the current server.
try {
    ServerConfigurationResponse result = apiInstance.editCurrentServerConfiguration(xPostmarkServerToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerConfigurationAPIApi#editCurrentServerConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **body** | [**EditServerConfigurationRequest**](EditServerConfigurationRequest.md)| The settings that should be modified for the current server. | [optional]

### Return type

[**ServerConfigurationResponse**](ServerConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrentServerConfiguration"></a>
# **getCurrentServerConfiguration**
> ServerConfigurationResponse getCurrentServerConfiguration(xPostmarkServerToken)

Get Server Configuration

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.ServerConfigurationAPIApi;


ServerConfigurationAPIApi apiInstance = new ServerConfigurationAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
try {
    ServerConfigurationResponse result = apiInstance.getCurrentServerConfiguration(xPostmarkServerToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerConfigurationAPIApi#getCurrentServerConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |

### Return type

[**ServerConfigurationResponse**](ServerConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

