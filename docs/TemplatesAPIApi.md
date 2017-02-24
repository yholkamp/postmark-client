# TemplatesAPIApi

All URIs are relative to *https://api.postmarkapp.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTemplate**](TemplatesAPIApi.md#deleteTemplate) | **DELETE** /templates/{templateid} | Delete a Template
[**getSingleTemplate**](TemplatesAPIApi.md#getSingleTemplate) | **GET** /templates/{templateid} | Get a Template
[**listTemplates**](TemplatesAPIApi.md#listTemplates) | **GET** /templates | Get the Templates associated with this Server
[**sendEmailWithTemplate**](TemplatesAPIApi.md#sendEmailWithTemplate) | **POST** /email/withTemplate | Send an email using a Template
[**templatesPost**](TemplatesAPIApi.md#templatesPost) | **POST** /templates | Create a Template
[**testTemplateContent**](TemplatesAPIApi.md#testTemplateContent) | **POST** /templates/validate | Test Template Content
[**updateTemplate**](TemplatesAPIApi.md#updateTemplate) | **PUT** /templates/{templateid} | Update a Template


<a name="deleteTemplate"></a>
# **deleteTemplate**
> TemplateDetailResponse deleteTemplate(xPostmarkServerToken, templateid)

Delete a Template

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TemplatesAPIApi;


TemplatesAPIApi apiInstance = new TemplatesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Integer templateid = 56; // Integer | The ID for the Template you wish to delete.
try {
    TemplateDetailResponse result = apiInstance.deleteTemplate(xPostmarkServerToken, templateid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesAPIApi#deleteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **templateid** | **Integer**| The ID for the Template you wish to delete. |

### Return type

[**TemplateDetailResponse**](TemplateDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSingleTemplate"></a>
# **getSingleTemplate**
> TemplateDetailResponse getSingleTemplate(xPostmarkServerToken, templateid)

Get a Template

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TemplatesAPIApi;


TemplatesAPIApi apiInstance = new TemplatesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Integer templateid = 56; // Integer | The ID for the Template you wish to retrieve.
try {
    TemplateDetailResponse result = apiInstance.getSingleTemplate(xPostmarkServerToken, templateid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesAPIApi#getSingleTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **templateid** | **Integer**| The ID for the Template you wish to retrieve. |

### Return type

[**TemplateDetailResponse**](TemplateDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTemplates"></a>
# **listTemplates**
> TemplateListingResponse listTemplates(xPostmarkServerToken, count, offset)

Get the Templates associated with this Server

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TemplatesAPIApi;


TemplatesAPIApi apiInstance = new TemplatesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
BigDecimal count = new BigDecimal(); // BigDecimal | The number of Templates to return
BigDecimal offset = new BigDecimal(); // BigDecimal | The number of Templates to \"skip\" before returning results.
try {
    TemplateListingResponse result = apiInstance.listTemplates(xPostmarkServerToken, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesAPIApi#listTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **count** | **BigDecimal**| The number of Templates to return |
 **offset** | **BigDecimal**| The number of Templates to \&quot;skip\&quot; before returning results. |

### Return type

[**TemplateListingResponse**](TemplateListingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendEmailWithTemplate"></a>
# **sendEmailWithTemplate**
> SendEmailResponse sendEmailWithTemplate(xPostmarkServerToken, body)

Send an email using a Template

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TemplatesAPIApi;


TemplatesAPIApi apiInstance = new TemplatesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
EmailWithTemplateRequest body = new EmailWithTemplateRequest(); // EmailWithTemplateRequest | 
try {
    SendEmailResponse result = apiInstance.sendEmailWithTemplate(xPostmarkServerToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesAPIApi#sendEmailWithTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **body** | [**EmailWithTemplateRequest**](EmailWithTemplateRequest.md)|  |

### Return type

[**SendEmailResponse**](SendEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templatesPost"></a>
# **templatesPost**
> TemplateRecordResponse templatesPost(xPostmarkServerToken, body)

Create a Template

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TemplatesAPIApi;


TemplatesAPIApi apiInstance = new TemplatesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
CreateTemplateRequest body = new CreateTemplateRequest(); // CreateTemplateRequest | 
try {
    TemplateRecordResponse result = apiInstance.templatesPost(xPostmarkServerToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesAPIApi#templatesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **body** | [**CreateTemplateRequest**](CreateTemplateRequest.md)|  |

### Return type

[**TemplateRecordResponse**](TemplateRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testTemplateContent"></a>
# **testTemplateContent**
> TemplateValidationResponse testTemplateContent(xPostmarkServerToken, body)

Test Template Content

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TemplatesAPIApi;


TemplatesAPIApi apiInstance = new TemplatesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
TemplateValidationRequest body = new TemplateValidationRequest(); // TemplateValidationRequest | 
try {
    TemplateValidationResponse result = apiInstance.testTemplateContent(xPostmarkServerToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesAPIApi#testTemplateContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **body** | [**TemplateValidationRequest**](TemplateValidationRequest.md)|  | [optional]

### Return type

[**TemplateValidationResponse**](TemplateValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTemplate"></a>
# **updateTemplate**
> TemplateRecordResponse updateTemplate(xPostmarkServerToken, templateid, body)

Update a Template

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.TemplatesAPIApi;


TemplatesAPIApi apiInstance = new TemplatesAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
Integer templateid = 56; // Integer | The ID for the Template you wish to update.
EditTemplateRequest body = new EditTemplateRequest(); // EditTemplateRequest | 
try {
    TemplateRecordResponse result = apiInstance.updateTemplate(xPostmarkServerToken, templateid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesAPIApi#updateTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **templateid** | **Integer**| The ID for the Template you wish to update. |
 **body** | [**EditTemplateRequest**](EditTemplateRequest.md)|  |

### Return type

[**TemplateRecordResponse**](TemplateRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

