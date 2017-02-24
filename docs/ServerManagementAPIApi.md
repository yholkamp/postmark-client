# ServerManagementAPIApi

All URIs are relative to *https://api.postmarkapp.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServer**](ServerManagementAPIApi.md#createServer) | **POST** /servers | Create a Server
[**deleteServer**](ServerManagementAPIApi.md#deleteServer) | **DELETE** /servers/{serverid} | Delete a Server
[**editServerInformation**](ServerManagementAPIApi.md#editServerInformation) | **PUT** /servers/{serverid} | Edit a Server
[**getServerInformation**](ServerManagementAPIApi.md#getServerInformation) | **GET** /servers/{serverid} | Get a Server
[**listServers**](ServerManagementAPIApi.md#listServers) | **GET** /servers | List servers


<a name="createServer"></a>
# **createServer**
> ExtendedServerInfo createServer(xPostmarkAccountToken, body)

Create a Server

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.ServerManagementAPIApi;


ServerManagementAPIApi apiInstance = new ServerManagementAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
CreateServerPayload body = new CreateServerPayload(); // CreateServerPayload | 
try {
    ExtendedServerInfo result = apiInstance.createServer(xPostmarkAccountToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerManagementAPIApi#createServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **body** | [**CreateServerPayload**](CreateServerPayload.md)|  | [optional]

### Return type

[**ExtendedServerInfo**](ExtendedServerInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteServer"></a>
# **deleteServer**
> deleteServer(xPostmarkAccountToken, serverid)

Delete a Server

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.ServerManagementAPIApi;


ServerManagementAPIApi apiInstance = new ServerManagementAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer serverid = 56; // Integer | The ID of the Server that should be deleted.
try {
    apiInstance.deleteServer(xPostmarkAccountToken, serverid);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerManagementAPIApi#deleteServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **serverid** | **Integer**| The ID of the Server that should be deleted. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editServerInformation"></a>
# **editServerInformation**
> ExtendedServerInfo editServerInformation(xPostmarkAccountToken, serverid, body)

Edit a Server

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.ServerManagementAPIApi;


ServerManagementAPIApi apiInstance = new ServerManagementAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer serverid = 56; // Integer | The ID of the Server to update.
EditServerPayload body = new EditServerPayload(); // EditServerPayload | 
try {
    ExtendedServerInfo result = apiInstance.editServerInformation(xPostmarkAccountToken, serverid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerManagementAPIApi#editServerInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **serverid** | **Integer**| The ID of the Server to update. |
 **body** | [**EditServerPayload**](EditServerPayload.md)|  | [optional]

### Return type

[**ExtendedServerInfo**](ExtendedServerInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getServerInformation"></a>
# **getServerInformation**
> ExtendedServerInfo getServerInformation(xPostmarkAccountToken, serverid)

Get a Server

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.ServerManagementAPIApi;


ServerManagementAPIApi apiInstance = new ServerManagementAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer serverid = 56; // Integer | The ID of the Server to get.
try {
    ExtendedServerInfo result = apiInstance.getServerInformation(xPostmarkAccountToken, serverid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerManagementAPIApi#getServerInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **serverid** | **Integer**| The ID of the Server to get. |

### Return type

[**ExtendedServerInfo**](ExtendedServerInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listServers"></a>
# **listServers**
> ServerListingResponse listServers(xPostmarkAccountToken, count, offset, name)

List servers

### Example
```java
// Import classes:
//import net.nextpulse.postmarkapp.api.ApiException;
//import net.nextpulse.postmarkapp.api.account.ServerManagementAPIApi;


ServerManagementAPIApi apiInstance = new ServerManagementAPIApi();
String xPostmarkAccountToken = "xPostmarkAccountToken_example"; // String | The token associated with the Account on which this request will operate.
Integer count = 56; // Integer | Number of servers to return per request.
Integer offset = 56; // Integer | Number of servers to skip.
String name = "name_example"; // String | Filter by a specific server name
try {
    ServerListingResponse result = apiInstance.listServers(xPostmarkAccountToken, count, offset, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServerManagementAPIApi#listServers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xPostmarkAccountToken** | **String**| The token associated with the Account on which this request will operate. |
 **count** | **Integer**| Number of servers to return per request. |
 **offset** | **Integer**| Number of servers to skip. |
 **name** | **String**| Filter by a specific server name | [optional]

### Return type

[**ServerListingResponse**](ServerListingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

