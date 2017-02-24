# SenderSignaturesAPIApi

All URIs are relative to *https://api.postmarkapp.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSenderSignature**](SenderSignaturesAPIApi.md#createSenderSignature) | **POST** /senders | Create a Sender Signature
[**deleteSenderSignature**](SenderSignaturesAPIApi.md#deleteSenderSignature) | **DELETE** /senders/{signatureid} | Delete a Sender Signature
[**editSenderSignature**](SenderSignaturesAPIApi.md#editSenderSignature) | **PUT** /senders/{signatureid} | Update a Sender Signature
[**getSenderSignature**](SenderSignaturesAPIApi.md#getSenderSignature) | **GET** /senders/{signatureid} | Get a Sender Signature
[**listSenderSignatures**](SenderSignaturesAPIApi.md#listSenderSignatures) | **GET** /senders | List Sender Signatures
[**requestNewDKIMKeyForSenderSignature**](SenderSignaturesAPIApi.md#requestNewDKIMKeyForSenderSignature) | **POST** /senders/{signatureid}/requestnewdkim | Request a new DKIM Key
[**requestSPFVerificationForSenderSignature**](SenderSignaturesAPIApi.md#requestSPFVerificationForSenderSignature) | **POST** /senders/{signatureid}/verifyspf | Request DNS Verification for SPF
[**resendSenderSignatureConfirmationEmail**](SenderSignaturesAPIApi.md#resendSenderSignatureConfirmationEmail) | **POST** /senders/{signatureid}/resend | Resend Signature Confirmation Email


<a name="createSenderSignature"></a>
# **createSenderSignature**
> SenderSignatureExtendedInformation createSenderSignature(xPostmarkAccountToken, body)

Create a Sender Signature

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.SenderSignaturesAPIApi;


SenderSignaturesAPIApi apiInstance = new SenderSignaturesAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
SenderSignatureCreationModel body = new SenderSignatureCreationModel(); // SenderSignatureCreationModel | 
try {
    SenderSignatureExtendedInformation result = apiInstance.createSenderSignature(xPostmarkAccountToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SenderSignaturesAPIApi#createSenderSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **body** | [**SenderSignatureCreationModel**](SenderSignatureCreationModel.md)|  | [optional]

### Return type

[**SenderSignatureExtendedInformation**](SenderSignatureExtendedInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSenderSignature"></a>
# **deleteSenderSignature**
> StandardPostmarkResponse deleteSenderSignature(xPostmarkAccountToken, signatureid)

Delete a Sender Signature

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.SenderSignaturesAPIApi;


SenderSignaturesAPIApi apiInstance = new SenderSignaturesAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer signatureid = 56; // Integer | The ID for the Sender Signature that should be deleted by the request.
try {
    StandardPostmarkResponse result = apiInstance.deleteSenderSignature(xPostmarkAccountToken, signatureid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SenderSignaturesAPIApi#deleteSenderSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **signatureid** | **Integer**| The ID for the Sender Signature that should be deleted by the request. |

### Return type

[**StandardPostmarkResponse**](StandardPostmarkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editSenderSignature"></a>
# **editSenderSignature**
> SenderSignatureExtendedInformation editSenderSignature(xPostmarkAccountToken, signatureid, body)

Update a Sender Signature

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.SenderSignaturesAPIApi;


SenderSignaturesAPIApi apiInstance = new SenderSignaturesAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer signatureid = 56; // Integer | The ID for the Sender Signature that should be modified by the request.
SenderSignatureEditingModel body = new SenderSignatureEditingModel(); // SenderSignatureEditingModel | 
try {
    SenderSignatureExtendedInformation result = apiInstance.editSenderSignature(xPostmarkAccountToken, signatureid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SenderSignaturesAPIApi#editSenderSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **signatureid** | **Integer**| The ID for the Sender Signature that should be modified by the request. |
 **body** | [**SenderSignatureEditingModel**](SenderSignatureEditingModel.md)|  | [optional]

### Return type

[**SenderSignatureExtendedInformation**](SenderSignatureExtendedInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSenderSignature"></a>
# **getSenderSignature**
> SenderSignatureExtendedInformation getSenderSignature(xPostmarkAccountToken, signatureid)

Get a Sender Signature

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.SenderSignaturesAPIApi;


SenderSignaturesAPIApi apiInstance = new SenderSignaturesAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer signatureid = 56; // Integer | The ID for the Sender Signature that should be retrieved.
try {
    SenderSignatureExtendedInformation result = apiInstance.getSenderSignature(xPostmarkAccountToken, signatureid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SenderSignaturesAPIApi#getSenderSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **signatureid** | **Integer**| The ID for the Sender Signature that should be retrieved. |

### Return type

[**SenderSignatureExtendedInformation**](SenderSignatureExtendedInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSenderSignatures"></a>
# **listSenderSignatures**
> SenderListingResults listSenderSignatures(xPostmarkAccountToken, count, offset)

List Sender Signatures

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.SenderSignaturesAPIApi;


SenderSignaturesAPIApi apiInstance = new SenderSignaturesAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer count = 56; // Integer | Number of records to return per request. Max 500.
Integer offset = 56; // Integer | Number of records to skip
try {
    SenderListingResults result = apiInstance.listSenderSignatures(xPostmarkAccountToken, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SenderSignaturesAPIApi#listSenderSignatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **count** | **Integer**| Number of records to return per request. Max 500. |
 **offset** | **Integer**| Number of records to skip |

### Return type

[**SenderListingResults**](SenderListingResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestNewDKIMKeyForSenderSignature"></a>
# **requestNewDKIMKeyForSenderSignature**
> StandardPostmarkResponse requestNewDKIMKeyForSenderSignature(xPostmarkAccountToken, signatureid)

Request a new DKIM Key

Requests a new DKIM key to be created. Until the DNS entries are confirmed,  the new values will be in the &#x60;DKIMPendingHost&#x60; and &#x60;DKIMPendingTextValue&#x60; fields.  After the new DKIM value is verified in DNS, the pending values will migrate to  &#x60;DKIMTextValue&#x60; and &#x60;DKIMPendingTextValue&#x60; and Postmark will begin to sign emails  with the new DKIM key. 

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.SenderSignaturesAPIApi;


SenderSignaturesAPIApi apiInstance = new SenderSignaturesAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer signatureid = 56; // Integer | The ID for the Sender Signature for which a new DKIM Key should be generated.
try {
    StandardPostmarkResponse result = apiInstance.requestNewDKIMKeyForSenderSignature(xPostmarkAccountToken, signatureid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SenderSignaturesAPIApi#requestNewDKIMKeyForSenderSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **signatureid** | **Integer**| The ID for the Sender Signature for which a new DKIM Key should be generated. |

### Return type

[**StandardPostmarkResponse**](StandardPostmarkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestSPFVerificationForSenderSignature"></a>
# **requestSPFVerificationForSenderSignature**
> SenderSignatureExtendedInformation requestSPFVerificationForSenderSignature(xPostmarkAccountToken, signatureid)

Request DNS Verification for SPF

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.SenderSignaturesAPIApi;


SenderSignaturesAPIApi apiInstance = new SenderSignaturesAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer signatureid = 56; // Integer | The ID for the Sender Signature for which SPF DNS records should be verified.
try {
    SenderSignatureExtendedInformation result = apiInstance.requestSPFVerificationForSenderSignature(xPostmarkAccountToken, signatureid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SenderSignaturesAPIApi#requestSPFVerificationForSenderSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **signatureid** | **Integer**| The ID for the Sender Signature for which SPF DNS records should be verified. |

### Return type

[**SenderSignatureExtendedInformation**](SenderSignatureExtendedInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resendSenderSignatureConfirmationEmail"></a>
# **resendSenderSignatureConfirmationEmail**
> StandardPostmarkResponse resendSenderSignatureConfirmationEmail(xPostmarkAccountToken, signatureid)

Resend Signature Confirmation Email

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.SenderSignaturesAPIApi;


SenderSignaturesAPIApi apiInstance = new SenderSignaturesAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer signatureid = 56; // Integer | The ID for the Sender Signature that should have its confirmation email resent.
try {
    StandardPostmarkResponse result = apiInstance.resendSenderSignatureConfirmationEmail(xPostmarkAccountToken, signatureid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SenderSignaturesAPIApi#resendSenderSignatureConfirmationEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **signatureid** | **Integer**| The ID for the Sender Signature that should have its confirmation email resent. |

### Return type

[**StandardPostmarkResponse**](StandardPostmarkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

