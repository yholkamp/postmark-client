# DomainsAPIApi

All URIs are relative to *https://api.postmarkapp.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDomain**](DomainsAPIApi.md#createDomain) | **POST** /domains | Create a Domain
[**deleteDomain**](DomainsAPIApi.md#deleteDomain) | **DELETE** /domains/{domainid} | Delete a Domain
[**editDomain**](DomainsAPIApi.md#editDomain) | **PUT** /domains/{domainid} | Update a Domain
[**getDomain**](DomainsAPIApi.md#getDomain) | **GET** /domains/{domainid} | Get a Domain
[**listDomains**](DomainsAPIApi.md#listDomains) | **GET** /domains | List Domains
[**requestSPFVerificationForDomain**](DomainsAPIApi.md#requestSPFVerificationForDomain) | **POST** /domains/{domainid}/verifyspf | Request DNS Verification for SPF
[**rotateDKIMKeyForDomain**](DomainsAPIApi.md#rotateDKIMKeyForDomain) | **POST** /domains/{domainid}/rotatedkim | Rotate DKIM Key


<a name="createDomain"></a>
# **createDomain**
> DomainExtendedInformation createDomain(xPostmarkAccountToken, body)

Create a Domain

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.DomainsAPIApi;


DomainsAPIApi apiInstance = new DomainsAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
DomainCreationModel body = new DomainCreationModel(); // DomainCreationModel | 
try {
    DomainExtendedInformation result = apiInstance.createDomain(xPostmarkAccountToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsAPIApi#createDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **body** | [**DomainCreationModel**](DomainCreationModel.md)|  | [optional]

### Return type

[**DomainExtendedInformation**](DomainExtendedInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDomain"></a>
# **deleteDomain**
> StandardPostmarkResponse deleteDomain(xPostmarkAccountToken, domainid)

Delete a Domain

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.DomainsAPIApi;


DomainsAPIApi apiInstance = new DomainsAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer domainid = 56; // Integer | The ID for the Domain that should be deleted by the request.
try {
    StandardPostmarkResponse result = apiInstance.deleteDomain(xPostmarkAccountToken, domainid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsAPIApi#deleteDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **domainid** | **Integer**| The ID for the Domain that should be deleted by the request. |

### Return type

[**StandardPostmarkResponse**](StandardPostmarkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editDomain"></a>
# **editDomain**
> DomainExtendedInformation editDomain(xPostmarkAccountToken, domainid, body)

Update a Domain

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.DomainsAPIApi;


DomainsAPIApi apiInstance = new DomainsAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer domainid = 56; // Integer | The ID for the Domain that should be modified by the request.
DomainEditingModel body = new DomainEditingModel(); // DomainEditingModel | 
try {
    DomainExtendedInformation result = apiInstance.editDomain(xPostmarkAccountToken, domainid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsAPIApi#editDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **domainid** | **Integer**| The ID for the Domain that should be modified by the request. |
 **body** | [**DomainEditingModel**](DomainEditingModel.md)|  | [optional]

### Return type

[**DomainExtendedInformation**](DomainExtendedInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDomain"></a>
# **getDomain**
> DomainExtendedInformation getDomain(xPostmarkAccountToken, domainid)

Get a Domain

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.DomainsAPIApi;


DomainsAPIApi apiInstance = new DomainsAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer domainid = 56; // Integer | The ID for the Domain that should be retrieved.
try {
    DomainExtendedInformation result = apiInstance.getDomain(xPostmarkAccountToken, domainid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsAPIApi#getDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **domainid** | **Integer**| The ID for the Domain that should be retrieved. |

### Return type

[**DomainExtendedInformation**](DomainExtendedInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDomains"></a>
# **listDomains**
> DomainListingResults listDomains(xPostmarkAccountToken, count, offset)

List Domains

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.DomainsAPIApi;


DomainsAPIApi apiInstance = new DomainsAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer count = 56; // Integer | Number of records to return per request. Max 500.
Integer offset = 56; // Integer | Number of records to skip
try {
    DomainListingResults result = apiInstance.listDomains(xPostmarkAccountToken, count, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsAPIApi#listDomains");
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

[**DomainListingResults**](DomainListingResults.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestSPFVerificationForDomain"></a>
# **requestSPFVerificationForDomain**
> DomainSPFResult requestSPFVerificationForDomain(xPostmarkAccountToken, domainid)

Request DNS Verification for SPF

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.DomainsAPIApi;


DomainsAPIApi apiInstance = new DomainsAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer domainid = 56; // Integer | The ID for the Domain for which SPF DNS records should be verified.
try {
    DomainSPFResult result = apiInstance.requestSPFVerificationForDomain(xPostmarkAccountToken, domainid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsAPIApi#requestSPFVerificationForDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **domainid** | **Integer**| The ID for the Domain for which SPF DNS records should be verified. |

### Return type

[**DomainSPFResult**](DomainSPFResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rotateDKIMKeyForDomain"></a>
# **rotateDKIMKeyForDomain**
> DKIMRotationResponse rotateDKIMKeyForDomain(xPostmarkAccountToken, domainid)

Rotate DKIM Key

Creates a new DKIM key to replace your current key. Until the DNS entries are confirmed,  the new values will be in the &#x60;DKIMPendingHost&#x60; and &#x60;DKIMPendingTextValue&#x60; fields.  After the new DKIM value is verified in DNS, the pending values will migrate to  &#x60;DKIMTextValue&#x60; and &#x60;DKIMPendingTextValue&#x60; and Postmark will begin to sign emails  with the new DKIM key. 

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.DomainsAPIApi;


DomainsAPIApi apiInstance = new DomainsAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer domainid = 56; // Integer | The ID for the Sender Signature for which a new DKIM Key should be generated.
try {
    DKIMRotationResponse result = apiInstance.rotateDKIMKeyForDomain(xPostmarkAccountToken, domainid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsAPIApi#rotateDKIMKeyForDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **domainid** | **Integer**| The ID for the Sender Signature for which a new DKIM Key should be generated. |

### Return type

[**DKIMRotationResponse**](DKIMRotationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

