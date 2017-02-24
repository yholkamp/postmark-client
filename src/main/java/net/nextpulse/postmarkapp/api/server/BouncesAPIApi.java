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

import net.nextpulse.postmarkapp.models.server.BounceActivationResponse;
import net.nextpulse.postmarkapp.models.server.StandardPostmarkResponse;
import net.nextpulse.postmarkapp.models.server.BounceDumpResponse;
import net.nextpulse.postmarkapp.models.server.BounceSearchResponse;
import java.util.Date;
import net.nextpulse.postmarkapp.models.server.DeliveryStatsResponse;
import net.nextpulse.postmarkapp.models.server.BounceInfoResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class BouncesAPIApi {
  private ApiClient apiClient;

  public BouncesAPIApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BouncesAPIApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Activate a bounce
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param bounceid The ID of the Bounce to activate. (required)
   * @return BounceActivationResponse
   * @throws ApiException if fails to make API call
   */
  public BounceActivationResponse activateBounce(String xPostmarkServerToken, Long bounceid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling activateBounce");
    }
    
    // verify the required parameter 'bounceid' is set
    if (bounceid == null) {
      throw new ApiException(400, "Missing the required parameter 'bounceid' when calling activateBounce");
    }
    
    // create path and map variables
    String localVarPath = "/bounces/{bounceid}/activate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bounceid" + "\\}", apiClient.escapeString(bounceid.toString()));

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

    GenericType<BounceActivationResponse> localVarReturnType = new GenericType<BounceActivationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get bounce dump
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param bounceid The ID for the bounce dump to retrieve. (required)
   * @return BounceDumpResponse
   * @throws ApiException if fails to make API call
   */
  public BounceDumpResponse bouncesBounceidDumpGet(String xPostmarkServerToken, Long bounceid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling bouncesBounceidDumpGet");
    }
    
    // verify the required parameter 'bounceid' is set
    if (bounceid == null) {
      throw new ApiException(400, "Missing the required parameter 'bounceid' when calling bouncesBounceidDumpGet");
    }
    
    // create path and map variables
    String localVarPath = "/bounces/{bounceid}/dump".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bounceid" + "\\}", apiClient.escapeString(bounceid.toString()));

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

    GenericType<BounceDumpResponse> localVarReturnType = new GenericType<BounceDumpResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get bounced tags
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public List<String> getBouncedTags(String xPostmarkServerToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling getBouncedTags");
    }
    
    // create path and map variables
    String localVarPath = "/bounces/tags".replaceAll("\\{format\\}","json");

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

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get bounces
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param count Number of bounces to return per request. Max 500. (required)
   * @param offset Number of bounces to skip. (required)
   * @param type Filter by type of bounce (optional)
   * @param inactive Filter by emails that were deactivated by Postmark due to the bounce. Set to true or false. If this isn&#39;t specified it will return both active and inactive. (optional)
   * @param emailFilter Filter by email address (optional)
   * @param messageID Filter by messageID (optional)
   * @param tag Filter by tag (optional)
   * @param todate Filter messages up to the date specified. e.g. &#x60;2014-02-01&#x60; (optional)
   * @param fromdate Filter messages starting from the date specified. e.g. &#x60;2014-02-01&#x60; (optional)
   * @return BounceSearchResponse
   * @throws ApiException if fails to make API call
   */
  public BounceSearchResponse getBounces(String xPostmarkServerToken, Integer count, Integer offset, String type, Boolean inactive, String emailFilter, String messageID, String tag, Date todate, Date fromdate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling getBounces");
    }
    
    // verify the required parameter 'count' is set
    if (count == null) {
      throw new ApiException(400, "Missing the required parameter 'count' when calling getBounces");
    }
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
      throw new ApiException(400, "Missing the required parameter 'offset' when calling getBounces");
    }
    
    // create path and map variables
    String localVarPath = "/bounces".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "inactive", inactive));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "emailFilter", emailFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "messageID", messageID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
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

    GenericType<BounceSearchResponse> localVarReturnType = new GenericType<BounceSearchResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get delivery stats
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @return DeliveryStatsResponse
   * @throws ApiException if fails to make API call
   */
  public DeliveryStatsResponse getDeliveryStats(String xPostmarkServerToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling getDeliveryStats");
    }
    
    // create path and map variables
    String localVarPath = "/deliverystats".replaceAll("\\{format\\}","json");

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

    GenericType<DeliveryStatsResponse> localVarReturnType = new GenericType<DeliveryStatsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single bounce
   * 
   * @param xPostmarkServerToken The token associated with the Server on which this request will operate. (required)
   * @param bounceid The ID of the bounce to retrieve. (required)
   * @return BounceInfoResponse
   * @throws ApiException if fails to make API call
   */
  public BounceInfoResponse getSingleBounce(String xPostmarkServerToken, Long bounceid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xPostmarkServerToken' is set
    if (xPostmarkServerToken == null) {
      throw new ApiException(400, "Missing the required parameter 'xPostmarkServerToken' when calling getSingleBounce");
    }
    
    // verify the required parameter 'bounceid' is set
    if (bounceid == null) {
      throw new ApiException(400, "Missing the required parameter 'bounceid' when calling getSingleBounce");
    }
    
    // create path and map variables
    String localVarPath = "/bounces/{bounceid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bounceid" + "\\}", apiClient.escapeString(bounceid.toString()));

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

    GenericType<BounceInfoResponse> localVarReturnType = new GenericType<BounceInfoResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}