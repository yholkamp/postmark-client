/*
 * Postmark API
 * Postmark makes sending and receiving email incredibly easy. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.nextpulse.postmarkapp.api.server;

import com.sun.jersey.api.client.GenericType;

import net.nextpulse.postmarkapp.api.ApiException;
import net.nextpulse.postmarkapp.api.ApiClient;
import net.nextpulse.postmarkapp.api.Configuration;
import net.nextpulse.postmarkapp.models.server.*;
import net.nextpulse.postmarkapp.api.Pair;

import net.nextpulse.postmarkapp.models.server.StandardPostmarkResponse;
import net.nextpulse.postmarkapp.models.server.InboundMessageFullDetailsResponse;
import net.nextpulse.postmarkapp.models.server.MessageOpenSearchResponse;
import net.nextpulse.postmarkapp.models.server.OutboundMessageDetailsResponse;
import net.nextpulse.postmarkapp.models.server.OutboundMessageDumpResponse;
import net.nextpulse.postmarkapp.models.server.InboundSearchResponse;
import java.util.Date;
import net.nextpulse.postmarkapp.models.server.OutboundSearchResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class MessagesAPIApi {
  private ApiClient apiClient;

  public MessagesAPIApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagesAPIApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Bypass rules for a blocked inbound message
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param messageid The ID of the message which should bypass inbound rules. (required)
   * @return StandardPostmarkResponse
   * @throws ApiException if fails to make API call
   */
  public StandardPostmarkResponse bypassRulesForInboundMessage(String xPostmarkServerToken, String messageid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling bypassRulesForInboundMessage");
    }
    
    // verify the required parameter 'messageid' is set
    if (messageid == null) {
      throw new ApiException(400, "Missing the required parameter 'messageid' when calling bypassRulesForInboundMessage");
    }
    
    // create path and map variables
    String localVarPath = "/messages/inbound/{messageid}/bypass".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageid" + "\\}", apiClient.escapeString(messageid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xPostmarkServerToken != null)
      localVarHeaderParams.put("X-Postmark-Server-Token", apiClient.parameterToString(xPostmarkServerToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<StandardPostmarkResponse> localVarReturnType = new GenericType<StandardPostmarkResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Inbound message details
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param messageid The ID of the message for which to details will be retrieved. (required)
   * @return InboundMessageFullDetailsResponse
   * @throws ApiException if fails to make API call
   */
  public InboundMessageFullDetailsResponse getInboundMessageDetails(String xPostmarkServerToken, String messageid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling getInboundMessageDetails");
    }
    
    // verify the required parameter 'messageid' is set
    if (messageid == null) {
      throw new ApiException(400, "Missing the required parameter 'messageid' when calling getInboundMessageDetails");
    }
    
    // create path and map variables
    String localVarPath = "/messages/inbound/{messageid}/details".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageid" + "\\}", apiClient.escapeString(messageid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xPostmarkServerToken != null)
      localVarHeaderParams.put("X-Postmark-Server-Token", apiClient.parameterToString(xPostmarkServerToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InboundMessageFullDetailsResponse> localVarReturnType = new GenericType<InboundMessageFullDetailsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve Message Opens
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param messageid The ID of the Outbound Message for which open statistics should be retrieved. (required)
   * @param count Number of message opens to return per request. Max 500. (required)
   * @param offset Number of messages to skip. (required)
   * @return MessageOpenSearchResponse
   * @throws ApiException if fails to make API call
   */
  public MessageOpenSearchResponse getOpensForSingleOutboundMessage(String xPostmarkServerToken, String messageid, Integer count, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling getOpensForSingleOutboundMessage");
    }
    
    // verify the required parameter 'messageid' is set
    if (messageid == null) {
      throw new ApiException(400, "Missing the required parameter 'messageid' when calling getOpensForSingleOutboundMessage");
    }
    
    // verify the required parameter 'count' is set
    if (count == null) {
      throw new ApiException(400, "Missing the required parameter 'count' when calling getOpensForSingleOutboundMessage");
    }
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
      throw new ApiException(400, "Missing the required parameter 'offset' when calling getOpensForSingleOutboundMessage");
    }
    
    // create path and map variables
    String localVarPath = "/messages/outbound/opens/{messageid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageid" + "\\}", apiClient.escapeString(messageid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    if (xPostmarkServerToken != null)
      localVarHeaderParams.put("X-Postmark-Server-Token", apiClient.parameterToString(xPostmarkServerToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MessageOpenSearchResponse> localVarReturnType = new GenericType<MessageOpenSearchResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Outbound message details
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param messageid The ID of the message for which to retrieve details. (required)
   * @return OutboundMessageDetailsResponse
   * @throws ApiException if fails to make API call
   */
  public OutboundMessageDetailsResponse getOutboundMessageDetails(String xPostmarkServerToken, String messageid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling getOutboundMessageDetails");
    }
    
    // verify the required parameter 'messageid' is set
    if (messageid == null) {
      throw new ApiException(400, "Missing the required parameter 'messageid' when calling getOutboundMessageDetails");
    }
    
    // create path and map variables
    String localVarPath = "/messages/outbound/{messageid}/details".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageid" + "\\}", apiClient.escapeString(messageid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xPostmarkServerToken != null)
      localVarHeaderParams.put("X-Postmark-Server-Token", apiClient.parameterToString(xPostmarkServerToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OutboundMessageDetailsResponse> localVarReturnType = new GenericType<OutboundMessageDetailsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Outbound message dump
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param messageid The ID of the message for which to retrieve a dump. (required)
   * @return OutboundMessageDumpResponse
   * @throws ApiException if fails to make API call
   */
  public OutboundMessageDumpResponse getOutboundMessageDump(String xPostmarkServerToken, String messageid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling getOutboundMessageDump");
    }
    
    // verify the required parameter 'messageid' is set
    if (messageid == null) {
      throw new ApiException(400, "Missing the required parameter 'messageid' when calling getOutboundMessageDump");
    }
    
    // create path and map variables
    String localVarPath = "/messages/outbound/{messageid}/dump".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageid" + "\\}", apiClient.escapeString(messageid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xPostmarkServerToken != null)
      localVarHeaderParams.put("X-Postmark-Server-Token", apiClient.parameterToString(xPostmarkServerToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OutboundMessageDumpResponse> localVarReturnType = new GenericType<OutboundMessageDumpResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retry a failed inbound message for processing
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param messageid The ID of the inbound message on which we should retry processing. (required)
   * @return StandardPostmarkResponse
   * @throws ApiException if fails to make API call
   */
  public StandardPostmarkResponse retryInboundMessageProcessing(String xPostmarkServerToken, String messageid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling retryInboundMessageProcessing");
    }
    
    // verify the required parameter 'messageid' is set
    if (messageid == null) {
      throw new ApiException(400, "Missing the required parameter 'messageid' when calling retryInboundMessageProcessing");
    }
    
    // create path and map variables
    String localVarPath = "/messages/inbound/{messageid}/retry".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "messageid" + "\\}", apiClient.escapeString(messageid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xPostmarkServerToken != null)
      localVarHeaderParams.put("X-Postmark-Server-Token", apiClient.parameterToString(xPostmarkServerToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<StandardPostmarkResponse> localVarReturnType = new GenericType<StandardPostmarkResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Inbound message search
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param count Number of messages to return per request. Max 500. (required)
   * @param offset Number of messages to skip (required)
   * @param recipient Filter by the user who was receiving the email (optional)
   * @param fromemail Filter by the sender email address (optional)
   * @param subject Filter by email subject (optional)
   * @param mailboxhash Filter by mailboxhash (optional)
   * @param tag Filter by tag (optional)
   * @param status Filter by status (&#x60;blocked&#x60;, &#x60;processed&#x60;, &#x60;queued&#x60;, &#x60;failed&#x60;, &#x60;scheduled&#x60;) (optional)
   * @param todate Filter messages up to the date specified. e.g. &#x60;2014-02-01&#x60; (optional)
   * @param fromdate Filter messages starting from the date specified. e.g. &#x60;2014-02-01&#x60; (optional)
   * @return InboundSearchResponse
   * @throws ApiException if fails to make API call
   */
  public InboundSearchResponse searchInboundMessages(String xPostmarkServerToken, Integer count, Integer offset, String recipient, String fromemail, String subject, String mailboxhash, String tag, String status, Date todate, Date fromdate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling searchInboundMessages");
    }
    
    // verify the required parameter 'count' is set
    if (count == null) {
      throw new ApiException(400, "Missing the required parameter 'count' when calling searchInboundMessages");
    }
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
      throw new ApiException(400, "Missing the required parameter 'offset' when calling searchInboundMessages");
    }
    
    // create path and map variables
    String localVarPath = "/messages/inbound".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipient", recipient));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromemail", fromemail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subject", subject));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mailboxhash", mailboxhash));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "todate", todate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromdate", fromdate));

    if (xPostmarkServerToken != null)
      localVarHeaderParams.put("X-Postmark-Server-Token", apiClient.parameterToString(xPostmarkServerToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InboundSearchResponse> localVarReturnType = new GenericType<InboundSearchResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Opens for a single message
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param count Number of message opens to return per request. Max 500. (required)
   * @param offset Number of messages to skip (required)
   * @param recipient Filter by To, Cc, Bcc (optional)
   * @param tag Filter by tag (optional)
   * @param clientName Filter by client name, i.e. Outlook, Gmail (optional)
   * @param clientCompany Filter by company, i.e. Microsoft, Apple, Google (optional)
   * @param clientFamily Filter by client family, i.e. OS X, Chrome (optional)
   * @param osName Filter by full OS name and specific version, i.e. OS X 10.9 Mavericks, Windows 7 (optional)
   * @param osFamily Filter by kind of OS used without specific version, i.e. OS X, Windows (optional)
   * @param osCompany Filter by company which produced the OS, i.e. Apple Computer, Inc., Microsoft Corporation (optional)
   * @param platform Filter by platform, i.e. webmail, desktop, mobile (optional)
   * @param country Filter by country messages were opened in, i.e. Denmark, Russia (optional)
   * @param region Filter by full name of region messages were opened in, i.e. Moscow, New York (optional)
   * @param city Filter by full name of region messages were opened in, i.e. Moscow, New York (optional)
   * @return MessageOpenSearchResponse
   * @throws ApiException if fails to make API call
   */
  public MessageOpenSearchResponse searchOpensForOutboundMessages(String xPostmarkServerToken, Integer count, Integer offset, String recipient, String tag, String clientName, String clientCompany, String clientFamily, String osName, String osFamily, String osCompany, String platform, String country, String region, String city) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling searchOpensForOutboundMessages");
    }
    
    // verify the required parameter 'count' is set
    if (count == null) {
      throw new ApiException(400, "Missing the required parameter 'count' when calling searchOpensForOutboundMessages");
    }
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
      throw new ApiException(400, "Missing the required parameter 'offset' when calling searchOpensForOutboundMessages");
    }
    
    // create path and map variables
    String localVarPath = "/messages/outbound/opens".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipient", recipient));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_name", clientName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_company", clientCompany));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "client_family", clientFamily));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "os_name", osName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "os_family", osFamily));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "os_company", osCompany));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "platform", platform));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "region", region));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));

    if (xPostmarkServerToken != null)
      localVarHeaderParams.put("X-Postmark-Server-Token", apiClient.parameterToString(xPostmarkServerToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MessageOpenSearchResponse> localVarReturnType = new GenericType<MessageOpenSearchResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Outbound message search
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param count Number of messages to return per request. Max 500. (required)
   * @param offset Number of messages to skip (required)
   * @param recipient Filter by the user who was receiving the email (optional)
   * @param fromemail Filter by the sender email address (optional)
   * @param tag Filter by tag (optional)
   * @param status Filter by status (&#x60;queued&#x60; or &#x60;sent&#x60;) (optional)
   * @param todate Filter messages up to the date specified. e.g. &#x60;2014-02-01&#x60; (optional)
   * @param fromdate Filter messages starting from the date specified. e.g. &#x60;2014-02-01&#x60; (optional)
   * @return OutboundSearchResponse
   * @throws ApiException if fails to make API call
   */
  public OutboundSearchResponse searchOutboundMessages(String xPostmarkServerToken, Integer count, Integer offset, String recipient, String fromemail, String tag, String status, Date todate, Date fromdate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling searchOutboundMessages");
    }
    
    // verify the required parameter 'count' is set
    if (count == null) {
      throw new ApiException(400, "Missing the required parameter 'count' when calling searchOutboundMessages");
    }
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
      throw new ApiException(400, "Missing the required parameter 'offset' when calling searchOutboundMessages");
    }
    
    // create path and map variables
    String localVarPath = "/messages/outbound".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipient", recipient));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromemail", fromemail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "todate", todate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromdate", fromdate));

    if (xPostmarkServerToken != null)
      localVarHeaderParams.put("X-Postmark-Server-Token", apiClient.parameterToString(xPostmarkServerToken));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<OutboundSearchResponse> localVarReturnType = new GenericType<OutboundSearchResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
