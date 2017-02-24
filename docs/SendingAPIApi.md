# SendingAPIApi

All URIs are relative to *https://api.postmarkapp.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendEmail**](SendingAPIApi.md#sendEmail) | **POST** /email | Send a single email
[**sendEmailBatch**](SendingAPIApi.md#sendEmailBatch) | **POST** /email/batch | Send a batch of emails
[**sendEmailWithTemplate**](SendingAPIApi.md#sendEmailWithTemplate) | **POST** /email/withTemplate | Send an email using a Template


<a name="sendEmail"></a>
# **sendEmail**
> SendEmailResponse sendEmail(xPostmarkServerToken, body)

Send a single email

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.SendingAPIApi;


SendingAPIApi apiInstance = new SendingAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
SendEmailRequest body = new SendEmailRequest(); // SendEmailRequest | 
try {
    SendEmailResponse result = apiInstance.sendEmail(xPostmarkServerToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendingAPIApi#sendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **body** | [**SendEmailRequest**](SendEmailRequest.md)|  | [optional]

### Return type

[**SendEmailResponse**](SendEmailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendEmailBatch"></a>
# **sendEmailBatch**
> SendEmailBatchResponse sendEmailBatch(xPostmarkServerToken, body)

Send a batch of emails

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.server.SendingAPIApi;


SendingAPIApi apiInstance = new SendingAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
SendEmailBatchRequest body = new SendEmailBatchRequest(); // SendEmailBatchRequest | 
try {
    SendEmailBatchResponse result = apiInstance.sendEmailBatch(xPostmarkServerToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendingAPIApi#sendEmailBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkServerToken** | **String**| The token associated with the Server on which this request will operate. |
 **body** | [**SendEmailBatchRequest**](SendEmailBatchRequest.md)|  | [optional]

### Return type

[**SendEmailBatchResponse**](SendEmailBatchResponse.md)

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
//import net.nextpulse.postmarkapp.api.server.SendingAPIApi;


SendingAPIApi apiInstance = new SendingAPIApi();
String xPostmarkServerToken = "xPostmarkServerToken_example"; // String | The token associated with the Server on which this request will operate.
EmailWithTemplateRequest body = new EmailWithTemplateRequest(); // EmailWithTemplateRequest | 
try {
    SendEmailResponse result = apiInstance.sendEmailWithTemplate(xPostmarkServerToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendingAPIApi#sendEmailWithTemplate");
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

