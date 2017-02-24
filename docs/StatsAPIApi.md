# StatsAPIApi

All URIs are relative to *https://api.postmarkapp.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBounceCounts**](StatsAPIApi.md#getBounceCounts) | **GET** /stats/outbound/bounces | Get bounce counts
[**getOutboundClickCounts**](StatsAPIApi.md#getOutboundClickCounts) | **GET** /stats/outbound/clicks | Get click counts
[**getOutboundClickCountsByBrowserFamily**](StatsAPIApi.md#getOutboundClickCountsByBrowserFamily) | **GET** /stats/outbound/clicks/browserfamilies | Get browser usage by family
[**getOutboundClickCountsByLocation**](StatsAPIApi.md#getOutboundClickCountsByLocation) | **GET** /stats/outbound/clicks/location | Get clicks by body location
[**getOutboundClickCountsByPlatform**](StatsAPIApi.md#getOutboundClickCountsByPlatform) | **GET** /stats/outbound/clicks/platforms | Get browser plaform usage
[**getOutboundOpenCounts**](StatsAPIApi.md#getOutboundOpenCounts) | **GET** /stats/outbound/opens | Get email open counts
[**getOutboundOpenCountsByEmailClient**](StatsAPIApi.md#getOutboundOpenCountsByEmailClient) | **GET** /stats/outbound/opens/emailclients | Get email client usage
[**getOutboundOpenCountsByPlatform**](StatsAPIApi.md#getOutboundOpenCountsByPlatform) | **GET** /stats/outbound/opens/platforms | Get email platform usage
[**getOutboundOpenCountsByReadingTime**](StatsAPIApi.md#getOutboundOpenCountsByReadingTime) | **GET** /stats/outbound/opens/readtimes | Get email read times
[**getOutboundOverviewStatistics**](StatsAPIApi.md#getOutboundOverviewStatistics) | **GET** /stats/outbound | Get outbound overview
[**getSentCounts**](StatsAPIApi.md#getSentCounts) | **GET** /stats/outbound/sends | Get sent counts
[**getSpamComplaints**](StatsAPIApi.md#getSpamComplaints) | **GET** /stats/outbound/spam | Get spam complaints
[**getTrackedEmailCounts**](StatsAPIApi.md#getTrackedEmailCounts) | **GET** /stats/outbound/tracked | Get tracked email counts


<a name="getBounceCounts"></a>
# **getBounceCounts**
> InlineResponse200 getBounceCounts(xPostmarkServerToken, tag, fromdate, todate)

Get bounce counts

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    InlineResponse200 result = apiInstance.getBounceCounts(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getBounceCounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutboundClickCounts"></a>
# **getOutboundClickCounts**
> DynamicResponse getOutboundClickCounts(xPostmarkServerToken, tag, fromdate, todate)

Get click counts

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    DynamicResponse result = apiInstance.getOutboundClickCounts(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getOutboundClickCounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**DynamicResponse**](DynamicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutboundClickCountsByBrowserFamily"></a>
# **getOutboundClickCountsByBrowserFamily**
> Object getOutboundClickCountsByBrowserFamily(xPostmarkServerToken, tag, fromdate, todate)

Get browser usage by family

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    Object result = apiInstance.getOutboundClickCountsByBrowserFamily(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getOutboundClickCountsByBrowserFamily");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutboundClickCountsByLocation"></a>
# **getOutboundClickCountsByLocation**
> DynamicResponse getOutboundClickCountsByLocation(xPostmarkServerToken, tag, fromdate, todate)

Get clicks by body location

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    DynamicResponse result = apiInstance.getOutboundClickCountsByLocation(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getOutboundClickCountsByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**DynamicResponse**](DynamicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutboundClickCountsByPlatform"></a>
# **getOutboundClickCountsByPlatform**
> DynamicResponse getOutboundClickCountsByPlatform(xPostmarkServerToken, tag, fromdate, todate)

Get browser plaform usage

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    DynamicResponse result = apiInstance.getOutboundClickCountsByPlatform(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getOutboundClickCountsByPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**DynamicResponse**](DynamicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutboundOpenCounts"></a>
# **getOutboundOpenCounts**
> InlineResponse2001 getOutboundOpenCounts(xPostmarkServerToken, tag, fromdate, todate)

Get email open counts

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    InlineResponse2001 result = apiInstance.getOutboundOpenCounts(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getOutboundOpenCounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutboundOpenCountsByEmailClient"></a>
# **getOutboundOpenCountsByEmailClient**
> InlineResponse2002 getOutboundOpenCountsByEmailClient(xPostmarkServerToken, tag, fromdate, todate)

Get email client usage

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    InlineResponse2002 result = apiInstance.getOutboundOpenCountsByEmailClient(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getOutboundOpenCountsByEmailClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutboundOpenCountsByPlatform"></a>
# **getOutboundOpenCountsByPlatform**
> InlineResponse2003 getOutboundOpenCountsByPlatform(xPostmarkServerToken, tag, fromdate, todate)

Get email platform usage

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    InlineResponse2003 result = apiInstance.getOutboundOpenCountsByPlatform(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getOutboundOpenCountsByPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutboundOpenCountsByReadingTime"></a>
# **getOutboundOpenCountsByReadingTime**
> DynamicResponse getOutboundOpenCountsByReadingTime(xPostmarkServerToken, tag, fromdate, todate)

Get email read times

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    DynamicResponse result = apiInstance.getOutboundOpenCountsByReadingTime(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getOutboundOpenCountsByReadingTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**DynamicResponse**](DynamicResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutboundOverviewStatistics"></a>
# **getOutboundOverviewStatistics**
> OutboundOverviewStatsResponse getOutboundOverviewStatistics(xPostmarkServerToken, tag, fromdate, todate)

Get outbound overview

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    OutboundOverviewStatsResponse result = apiInstance.getOutboundOverviewStatistics(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getOutboundOverviewStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**OutboundOverviewStatsResponse**](OutboundOverviewStatsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSentCounts"></a>
# **getSentCounts**
> SentCountsResponse getSentCounts(xPostmarkServerToken, tag, fromdate, todate)

Get sent counts

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    SentCountsResponse result = apiInstance.getSentCounts(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getSentCounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**SentCountsResponse**](SentCountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSpamComplaints"></a>
# **getSpamComplaints**
> InlineResponse2004 getSpamComplaints(xPostmarkServerToken, tag, fromdate, todate)

Get spam complaints

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats up to the date specified. e.g. `2014-02-01`
try {
    InlineResponse2004 result = apiInstance.getSpamComplaints(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getSpamComplaints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats up to the date specified. e.g. &#x60;2014-02-01&#x60; | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTrackedEmailCounts"></a>
# **getTrackedEmailCounts**
> InlineResponse2005 getTrackedEmailCounts(xPostmarkServerToken, tag, fromdate, todate)

Get tracked email counts

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.StatsAPIApi;


StatsAPIApi apiInstance = new StatsAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
String tag = "tag_example"; // String | Filter by tag
Date fromdate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
Date todate = new Date(); // Date | Filter stats starting from the date specified. e.g. `2014-01-01`
try {
    InlineResponse2005 result = apiInstance.getTrackedEmailCounts(xPostmarkServerToken, tag, fromdate, todate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsAPIApi#getTrackedEmailCounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **tag** | **String**| Filter by tag | [optional]
 **fromdate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]
 **todate** | **Date**| Filter stats starting from the date specified. e.g. &#x60;2014-01-01&#x60; | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

