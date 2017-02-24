# BouncesAPIApi

All URIs are relative to *https://api.postmarkapp.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateBounce**](BouncesAPIApi.md#activateBounce) | **PUT** /bounces/{bounceid}/activate | Activate a bounce
[**bouncesBounceidDumpGet**](BouncesAPIApi.md#bouncesBounceidDumpGet) | **GET** /bounces/{bounceid}/dump | Get bounce dump
[**getBouncedTags**](BouncesAPIApi.md#getBouncedTags) | **GET** /bounces/tags | Get bounced tags
[**getBounces**](BouncesAPIApi.md#getBounces) | **GET** /bounces | Get bounces
[**getDeliveryStats**](BouncesAPIApi.md#getDeliveryStats) | **GET** /deliverystats | Get delivery stats
[**getSingleBounce**](BouncesAPIApi.md#getSingleBounce) | **GET** /bounces/{bounceid} | Get a single bounce


<a name="activateBounce"></a>
# **activateBounce**
> BounceActivationResponse activateBounce(xPostmarkServerToken, bounceid)

Activate a bounce

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.BouncesAPIApi;


BouncesAPIApi apiInstance = new BouncesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Long bounceid = 789L; // Long | The ID of the Bounce to activate.
try {
    BounceActivationResponse result = apiInstance.activateBounce(xPostmarkServerToken, bounceid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BouncesAPIApi#activateBounce");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **bounceid** | **Long**| The ID of the Bounce to activate. |

### Return type

[**BounceActivationResponse**](BounceActivationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bouncesBounceidDumpGet"></a>
# **bouncesBounceidDumpGet**
> BounceDumpResponse bouncesBounceidDumpGet(xPostmarkServerToken, bounceid)

Get bounce dump

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.BouncesAPIApi;


BouncesAPIApi apiInstance = new BouncesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Long bounceid = 789L; // Long | The ID for the bounce dump to retrieve.
try {
    BounceDumpResponse result = apiInstance.bouncesBounceidDumpGet(xPostmarkServerToken, bounceid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BouncesAPIApi#bouncesBounceidDumpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **bounceid** | **Long**| The ID for the bounce dump to retrieve. |

### Return type

[**BounceDumpResponse**](BounceDumpResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBouncedTags"></a>
# **getBouncedTags**
> List&lt;String&gt; getBouncedTags(xPostmarkServerToken)

Get bounced tags

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.BouncesAPIApi;


BouncesAPIApi apiInstance = new BouncesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
try {
    List<String> result = apiInstance.getBouncedTags(xPostmarkServerToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BouncesAPIApi#getBouncedTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBounces"></a>
# **getBounces**
> BounceSearchResponse getBounces(xPostmarkServerToken, count, offset, type, inactive, emailFilter, messageID, tag, todate, fromdate)

Get bounces

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.BouncesAPIApi;


BouncesAPIApi apiInstance = new BouncesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Integer count = 56; // Integer | Number of bounces to return per request. Max 500.
Integer offset = 56; // Integer | Number of bounces to skip.
String type = "type_example"; // String | Filter by type of bounce
Boolean inactive = true; // Boolean | Filter by emails that were deactivated by Postmark due to the bounce. Set to true or false. If this isn't specified it will return both active and inactive.
String emailFilter = "emailFilter_example"; // String | Filter by email address
String messageID = "messageID_example"; // String | Filter by messageID
String tag = "tag_example"; // String | Filter by tag
Date todate = new Date(); // Date | Filter messages up to the date specified. e.g. `2014-02-01`
Date fromdate = new Date(); // Date | Filter messages starting from the date specified. e.g. `2014-02-01`
try {
    BounceSearchResponse result = apiInstance.getBounces(xPostmarkServerToken, count, offset, type, inactive, emailFilter, messageID, tag, todate, fromdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BouncesAPIApi#getBounces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **count** | **Integer**| Number of bounces to return per request. Max 500. |
 **offset** | **Integer**| Number of bounces to skip. |
 **type** | **String**| Filter by type of bounce | [optional] [enum: HardBounce, Transient, Unsubscribe, Subscribe, AutoResponder, AddressChange, DnsError, SpamNotification, OpenRelayTest, Unknown, SoftBounce, VirusNotification, MailFrontier Matador., BadEmailAddress, SpamComplaint, ManuallyDeactivated, Unconfirmed, Blocked, SMTPApiError, InboundError, DMARCPolicy, TemplateRenderingFailed]
 **inactive** | **Boolean**| Filter by emails that were deactivated by Postmark due to the bounce. Set to true or false. If this isn&#39;t specified it will return both active and inactive. | [optional]
 **emailFilter** | **String**| Filter by email address | [optional]
 **messageID** | **String**| Filter by messageID | [optional]
 **tag** | **String**| Filter by tag | [optional]
 **todate** | **Date**| Filter messages up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]
 **fromdate** | **Date**| Filter messages starting from the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**BounceSearchResponse**](BounceSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeliveryStats"></a>
# **getDeliveryStats**
> DeliveryStatsResponse getDeliveryStats(xPostmarkServerToken)

Get delivery stats

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.BouncesAPIApi;


BouncesAPIApi apiInstance = new BouncesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
try {
    DeliveryStatsResponse result = apiInstance.getDeliveryStats(xPostmarkServerToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BouncesAPIApi#getDeliveryStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |

### Return type

[**DeliveryStatsResponse**](DeliveryStatsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSingleBounce"></a>
# **getSingleBounce**
> BounceInfoResponse getSingleBounce(xPostmarkServerToken, bounceid)

Get a single bounce

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.BouncesAPIApi;


BouncesAPIApi apiInstance = new BouncesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Long bounceid = 789L; // Long | The ID of the bounce to retrieve.
try {
    BounceInfoResponse result = apiInstance.getSingleBounce(xPostmarkServerToken, bounceid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BouncesAPIApi#getSingleBounce");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **bounceid** | **Long**| The ID of the bounce to retrieve. |

### Return type

[**BounceInfoResponse**](BounceInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

