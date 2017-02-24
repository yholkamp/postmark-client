# InboundRulesAPIApi

All URIs are relative to *https://api.postmarkapp.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInboundRule**](InboundRulesAPIApi.md#createInboundRule) | **POST** /triggers/inboundrules | Create an inbound rule trigger
[**deleteInboundRule**](InboundRulesAPIApi.md#deleteInboundRule) | **DELETE** /triggers/inboundrules/{triggerid} | Delete a single trigger
[**listInboundRules**](InboundRulesAPIApi.md#listInboundRules) | **GET** /triggers/inboundrules | List inbound rule triggers


<a name="createInboundRule"></a>
# **createInboundRule**
> InlineResponse2007 createInboundRule(xPostmarkServerToken, body)

Create an inbound rule trigger

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.InboundRulesAPIApi;


InboundRulesAPIApi apiInstance = new InboundRulesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
CreateInboundRuleRequest body = new CreateInboundRuleRequest(); // CreateInboundRuleRequest | 
try {
    InlineResponse2007 result = apiInstance.createInboundRule(xPostmarkServerToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundRulesAPIApi#createInboundRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **body** | [**CreateInboundRuleRequest**](CreateInboundRuleRequest.md)|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInboundRule"></a>
# **deleteInboundRule**
> StandardPostmarkResponse deleteInboundRule(xPostmarkServerToken, triggerid)

Delete a single trigger

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.InboundRulesAPIApi;


InboundRulesAPIApi apiInstance = new InboundRulesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Integer triggerid = 56; // Integer | The ID of the Inbound Rule that should be deleted.
try {
    StandardPostmarkResponse result = apiInstance.deleteInboundRule(xPostmarkServerToken, triggerid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundRulesAPIApi#deleteInboundRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **triggerid** | **Integer**| The ID of the Inbound Rule that should be deleted. |

### Return type

[**StandardPostmarkResponse**](StandardPostmarkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listInboundRules"></a>
# **listInboundRules**
> InlineResponse2006 listInboundRules(xPostmarkServerToken, count, offset)

List inbound rule triggers

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.InboundRulesAPIApi;


InboundRulesAPIApi apiInstance = new InboundRulesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Integer count = 56; // Integer | Number of records to return per request.
Integer offset = 56; // Integer | Number of records to skip.
try {
    InlineResponse2006 result = apiInstance.listInboundRules(xPostmarkServerToken, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InboundRulesAPIApi#listInboundRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **count** | **Integer**| Number of records to return per request. |
 **offset** | **Integer**| Number of records to skip. |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

