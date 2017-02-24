# TagTriggersAPIApi

All URIs are relative to *https://api.postmarkapp.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTagTrigger**](TagTriggersAPIApi.md#createTagTrigger) | **POST** /triggers/tags | Create a trigger for a tag
[**deleteTagTrigger**](TagTriggersAPIApi.md#deleteTagTrigger) | **DELETE** /triggers/tags/{triggerid} | Delete a single trigger
[**editTagTrigger**](TagTriggersAPIApi.md#editTagTrigger) | **PUT** /triggers/tags/{triggerid} | Edit a single trigger
[**getSingleTagTrigger**](TagTriggersAPIApi.md#getSingleTagTrigger) | **GET** /triggers/tags/{triggerid} | Get a single trigger
[**searcgTagTriggers**](TagTriggersAPIApi.md#searcgTagTriggers) | **GET** /triggers/tags | Search triggers


<a name="createTagTrigger"></a>
# **createTagTrigger**
> InlineResponse2008Tags createTagTrigger(xPostmarkServerToken, body)

Create a trigger for a tag

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TagTriggersAPIApi;


TagTriggersAPIApi apiInstance = new TagTriggersAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
EditTagTriggerRequest body = new EditTagTriggerRequest(); // EditTagTriggerRequest | 
try {
    InlineResponse2008Tags result = apiInstance.createTagTrigger(xPostmarkServerToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagTriggersAPIApi#createTagTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **body** | [**EditTagTriggerRequest**](EditTagTriggerRequest.md)|  | [optional]

### Return type

[**InlineResponse2008Tags**](InlineResponse2008Tags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTagTrigger"></a>
# **deleteTagTrigger**
> StandardPostmarkResponse deleteTagTrigger(xPostmarkServerToken, triggerid)

Delete a single trigger

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TagTriggersAPIApi;


TagTriggersAPIApi apiInstance = new TagTriggersAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Integer triggerid = 56; // Integer | The ID for the Tag Trigger that should be deleted.
try {
    StandardPostmarkResponse result = apiInstance.deleteTagTrigger(xPostmarkServerToken, triggerid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagTriggersAPIApi#deleteTagTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **triggerid** | **Integer**| The ID for the Tag Trigger that should be deleted. |

### Return type

[**StandardPostmarkResponse**](StandardPostmarkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editTagTrigger"></a>
# **editTagTrigger**
> InlineResponse2008Tags editTagTrigger(xPostmarkServerToken, triggerid, body)

Edit a single trigger

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TagTriggersAPIApi;


TagTriggersAPIApi apiInstance = new TagTriggersAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Integer triggerid = 56; // Integer | The ID of the Tag Trigger that should be modified by this request.
EditTagTriggerRequest body = new EditTagTriggerRequest(); // EditTagTriggerRequest | 
try {
    InlineResponse2008Tags result = apiInstance.editTagTrigger(xPostmarkServerToken, triggerid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagTriggersAPIApi#editTagTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **triggerid** | **Integer**| The ID of the Tag Trigger that should be modified by this request. |
 **body** | [**EditTagTriggerRequest**](EditTagTriggerRequest.md)|  | [optional]

### Return type

[**InlineResponse2008Tags**](InlineResponse2008Tags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSingleTagTrigger"></a>
# **getSingleTagTrigger**
> InlineResponse2008Tags getSingleTagTrigger(xPostmarkServerToken, triggerid)

Get a single trigger

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TagTriggersAPIApi;


TagTriggersAPIApi apiInstance = new TagTriggersAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Integer triggerid = 56; // Integer | The ID for the Tag Trigger for which data should be retrieved.
try {
    InlineResponse2008Tags result = apiInstance.getSingleTagTrigger(xPostmarkServerToken, triggerid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagTriggersAPIApi#getSingleTagTrigger");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **triggerid** | **Integer**| The ID for the Tag Trigger for which data should be retrieved. |

### Return type

[**InlineResponse2008Tags**](InlineResponse2008Tags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searcgTagTriggers"></a>
# **searcgTagTriggers**
> InlineResponse2008 searcgTagTriggers(xPostmarkServerToken, count, offset, matchName)

Search triggers

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TagTriggersAPIApi;


TagTriggersAPIApi apiInstance = new TagTriggersAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Integer count = 56; // Integer | Number of records to return per request.
Integer offset = 56; // Integer | Number of records to skip.
String matchName = "matchName_example"; // String | Filter by delivery tag
try {
    InlineResponse2008 result = apiInstance.searcgTagTriggers(xPostmarkServerToken, count, offset, matchName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagTriggersAPIApi#searcgTagTriggers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **count** | **Integer**| Number of records to return per request. |
 **offset** | **Integer**| Number of records to skip. |
 **matchName** | **String**| Filter by delivery tag | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

