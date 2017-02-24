# postmarkapp

A Java API client for the APIs offered by [Postmark](https://postmarkapp.com/api-explorer), allowing you to send and receive e-mail from your Java application using the Server API.
Furthermore, you can configure your Postmark account using the Account API.

The code in this repository is generated using [Swagger Codegen](https://github.com/swagger-api/swagger-codegen).

## Installation

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>net.nextpulse</groupId>
    <artifactId>postmarkapp</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Example usage

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import net.nextpulse.postmarkapp.api.*;
import net.nextpulse.postmarkapp.api.auth.*;
import net.nextpulse.postmarkapp.models.server.*;
import net.nextpulse.postmarkapp.api.server.BouncesAPIApi;

import java.io.File;
import java.util.*;

public class BouncesAPIApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.postmarkapp.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BouncesAPIApi* | [**activateBounce**](docs/BouncesAPIApi.md#activateBounce) | **PUT** /bounces/{bounceid}/activate | Activate a bounce
*BouncesAPIApi* | [**bouncesBounceidDumpGet**](docs/BouncesAPIApi.md#bouncesBounceidDumpGet) | **GET** /bounces/{bounceid}/dump | Get bounce dump
*BouncesAPIApi* | [**getBouncedTags**](docs/BouncesAPIApi.md#getBouncedTags) | **GET** /bounces/tags | Get bounced tags
*BouncesAPIApi* | [**getBounces**](docs/BouncesAPIApi.md#getBounces) | **GET** /bounces | Get bounces
*BouncesAPIApi* | [**getDeliveryStats**](docs/BouncesAPIApi.md#getDeliveryStats) | **GET** /deliverystats | Get delivery stats
*BouncesAPIApi* | [**getSingleBounce**](docs/BouncesAPIApi.md#getSingleBounce) | **GET** /bounces/{bounceid} | Get a single bounce
*InboundRulesAPIApi* | [**createInboundRule**](docs/InboundRulesAPIApi.md#createInboundRule) | **POST** /triggers/inboundrules | Create an inbound rule trigger
*InboundRulesAPIApi* | [**deleteInboundRule**](docs/InboundRulesAPIApi.md#deleteInboundRule) | **DELETE** /triggers/inboundrules/{triggerid} | Delete a single trigger
*InboundRulesAPIApi* | [**listInboundRules**](docs/InboundRulesAPIApi.md#listInboundRules) | **GET** /triggers/inboundrules | List inbound rule triggers
*MessagesAPIApi* | [**bypassRulesForInboundMessage**](docs/MessagesAPIApi.md#bypassRulesForInboundMessage) | **PUT** /messages/inbound/{messageid}/bypass | Bypass rules for a blocked inbound message
*MessagesAPIApi* | [**getInboundMessageDetails**](docs/MessagesAPIApi.md#getInboundMessageDetails) | **GET** /messages/inbound/{messageid}/details | Inbound message details
*MessagesAPIApi* | [**getOpensForSingleOutboundMessage**](docs/MessagesAPIApi.md#getOpensForSingleOutboundMessage) | **GET** /messages/outbound/opens/{messageid} | Retrieve Message Opens
*MessagesAPIApi* | [**getOutboundMessageDetails**](docs/MessagesAPIApi.md#getOutboundMessageDetails) | **GET** /messages/outbound/{messageid}/details | Outbound message details
*MessagesAPIApi* | [**getOutboundMessageDump**](docs/MessagesAPIApi.md#getOutboundMessageDump) | **GET** /messages/outbound/{messageid}/dump | Outbound message dump
*MessagesAPIApi* | [**retryInboundMessageProcessing**](docs/MessagesAPIApi.md#retryInboundMessageProcessing) | **PUT** /messages/inbound/{messageid}/retry | Retry a failed inbound message for processing
*MessagesAPIApi* | [**searchInboundMessages**](docs/MessagesAPIApi.md#searchInboundMessages) | **GET** /messages/inbound | Inbound message search
*MessagesAPIApi* | [**searchOpensForOutboundMessages**](docs/MessagesAPIApi.md#searchOpensForOutboundMessages) | **GET** /messages/outbound/opens | Opens for a single message
*MessagesAPIApi* | [**searchOutboundMessages**](docs/MessagesAPIApi.md#searchOutboundMessages) | **GET** /messages/outbound | Outbound message search
*SendingAPIApi* | [**sendEmail**](docs/SendingAPIApi.md#sendEmail) | **POST** /email | Send a single email
*SendingAPIApi* | [**sendEmailBatch**](docs/SendingAPIApi.md#sendEmailBatch) | **POST** /email/batch | Send a batch of emails
*SendingAPIApi* | [**sendEmailWithTemplate**](docs/SendingAPIApi.md#sendEmailWithTemplate) | **POST** /email/withTemplate | Send an email using a Template
*ServerConfigurationAPIApi* | [**editCurrentServerConfiguration**](docs/ServerConfigurationAPIApi.md#editCurrentServerConfiguration) | **PUT** /server | Edit Server Configuration
*ServerConfigurationAPIApi* | [**getCurrentServerConfiguration**](docs/ServerConfigurationAPIApi.md#getCurrentServerConfiguration) | **GET** /server | Get Server Configuration
*StatsAPIApi* | [**getBounceCounts**](docs/StatsAPIApi.md#getBounceCounts) | **GET** /stats/outbound/bounces | Get bounce counts
*StatsAPIApi* | [**getOutboundClickCounts**](docs/StatsAPIApi.md#getOutboundClickCounts) | **GET** /stats/outbound/clicks | Get click counts
*StatsAPIApi* | [**getOutboundClickCountsByBrowserFamily**](docs/StatsAPIApi.md#getOutboundClickCountsByBrowserFamily) | **GET** /stats/outbound/clicks/browserfamilies | Get browser usage by family
*StatsAPIApi* | [**getOutboundClickCountsByLocation**](docs/StatsAPIApi.md#getOutboundClickCountsByLocation) | **GET** /stats/outbound/clicks/location | Get clicks by body location
*StatsAPIApi* | [**getOutboundClickCountsByPlatform**](docs/StatsAPIApi.md#getOutboundClickCountsByPlatform) | **GET** /stats/outbound/clicks/platforms | Get browser plaform usage
*StatsAPIApi* | [**getOutboundOpenCounts**](docs/StatsAPIApi.md#getOutboundOpenCounts) | **GET** /stats/outbound/opens | Get email open counts
*StatsAPIApi* | [**getOutboundOpenCountsByEmailClient**](docs/StatsAPIApi.md#getOutboundOpenCountsByEmailClient) | **GET** /stats/outbound/opens/emailclients | Get email client usage
*StatsAPIApi* | [**getOutboundOpenCountsByPlatform**](docs/StatsAPIApi.md#getOutboundOpenCountsByPlatform) | **GET** /stats/outbound/opens/platforms | Get email platform usage
*StatsAPIApi* | [**getOutboundOpenCountsByReadingTime**](docs/StatsAPIApi.md#getOutboundOpenCountsByReadingTime) | **GET** /stats/outbound/opens/readtimes | Get email read times
*StatsAPIApi* | [**getOutboundOverviewStatistics**](docs/StatsAPIApi.md#getOutboundOverviewStatistics) | **GET** /stats/outbound | Get outbound overview
*StatsAPIApi* | [**getSentCounts**](docs/StatsAPIApi.md#getSentCounts) | **GET** /stats/outbound/sends | Get sent counts
*StatsAPIApi* | [**getSpamComplaints**](docs/StatsAPIApi.md#getSpamComplaints) | **GET** /stats/outbound/spam | Get spam complaints
*StatsAPIApi* | [**getTrackedEmailCounts**](docs/StatsAPIApi.md#getTrackedEmailCounts) | **GET** /stats/outbound/tracked | Get tracked email counts
*TagTriggersAPIApi* | [**createTagTrigger**](docs/TagTriggersAPIApi.md#createTagTrigger) | **POST** /triggers/tags | Create a trigger for a tag
*TagTriggersAPIApi* | [**deleteTagTrigger**](docs/TagTriggersAPIApi.md#deleteTagTrigger) | **DELETE** /triggers/tags/{triggerid} | Delete a single trigger
*TagTriggersAPIApi* | [**editTagTrigger**](docs/TagTriggersAPIApi.md#editTagTrigger) | **PUT** /triggers/tags/{triggerid} | Edit a single trigger
*TagTriggersAPIApi* | [**getSingleTagTrigger**](docs/TagTriggersAPIApi.md#getSingleTagTrigger) | **GET** /triggers/tags/{triggerid} | Get a single trigger
*TagTriggersAPIApi* | [**searcgTagTriggers**](docs/TagTriggersAPIApi.md#searcgTagTriggers) | **GET** /triggers/tags | Search triggers
*TemplatesAPIApi* | [**deleteTemplate**](docs/TemplatesAPIApi.md#deleteTemplate) | **DELETE** /templates/{templateid} | Delete a Template
*TemplatesAPIApi* | [**getSingleTemplate**](docs/TemplatesAPIApi.md#getSingleTemplate) | **GET** /templates/{templateid} | Get a Template
*TemplatesAPIApi* | [**listTemplates**](docs/TemplatesAPIApi.md#listTemplates) | **GET** /templates | Get the Templates associated with this Server
*TemplatesAPIApi* | [**sendEmailWithTemplate**](docs/TemplatesAPIApi.md#sendEmailWithTemplate) | **POST** /email/withTemplate | Send an email using a Template
*TemplatesAPIApi* | [**templatesPost**](docs/TemplatesAPIApi.md#templatesPost) | **POST** /templates | Create a Template
*TemplatesAPIApi* | [**testTemplateContent**](docs/TemplatesAPIApi.md#testTemplateContent) | **POST** /templates/validate | Test Template Content
*TemplatesAPIApi* | [**updateTemplate**](docs/TemplatesAPIApi.md#updateTemplate) | **PUT** /templates/{templateid} | Update a Template


## Documentation for Models

 - [Attachment](docs/Attachment.md)
 - [AttachmentCollection](docs/AttachmentCollection.md)
 - [BounceActivationResponse](docs/BounceActivationResponse.md)
 - [BounceCountElement](docs/BounceCountElement.md)
 - [BounceDumpResponse](docs/BounceDumpResponse.md)
 - [BounceInfoResponse](docs/BounceInfoResponse.md)
 - [BounceSearchResponse](docs/BounceSearchResponse.md)
 - [CreateInboundRuleRequest](docs/CreateInboundRuleRequest.md)
 - [CreateTemplateRequest](docs/CreateTemplateRequest.md)
 - [DeliveryStatsResponse](docs/DeliveryStatsResponse.md)
 - [EditServerConfigurationRequest](docs/EditServerConfigurationRequest.md)
 - [EditTagTriggerRequest](docs/EditTagTriggerRequest.md)
 - [EditTemplateRequest](docs/EditTemplateRequest.md)
 - [EmailNameAddressPair](docs/EmailNameAddressPair.md)
 - [EmailWithTemplateRequest](docs/EmailWithTemplateRequest.md)
 - [ExtendedMessageOpenEventInformation](docs/ExtendedMessageOpenEventInformation.md)
 - [ExtendedMessageOpenEventInformationClient](docs/ExtendedMessageOpenEventInformationClient.md)
 - [ExtendedMessageOpenEventInformationGeo](docs/ExtendedMessageOpenEventInformationGeo.md)
 - [ExtendedMessageOpenEventInformationOS](docs/ExtendedMessageOpenEventInformationOS.md)
 - [HeaderCollection](docs/HeaderCollection.md)
 - [InboundMessageDetail](docs/InboundMessageDetail.md)
 - [InboundMessageFullDetailsResponse](docs/InboundMessageFullDetailsResponse.md)
 - [InboundMessageFullDetailsResponseFromFull](docs/InboundMessageFullDetailsResponseFromFull.md)
 - [InboundSearchResponse](docs/InboundSearchResponse.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2001Days](docs/InlineResponse2001Days.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2003Days](docs/InlineResponse2003Days.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2004Days](docs/InlineResponse2004Days.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2005Days](docs/InlineResponse2005Days.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2006InboundRules](docs/InlineResponse2006InboundRules.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2008Tags](docs/InlineResponse2008Tags.md)
 - [InlineResponse200Days](docs/InlineResponse200Days.md)
 - [MessageEventDetails](docs/MessageEventDetails.md)
 - [MessageEventDetailsDetails](docs/MessageEventDetailsDetails.md)
 - [MessageHeader](docs/MessageHeader.md)
 - [MessageOpenSearchResponse](docs/MessageOpenSearchResponse.md)
 - [OutboundMessageDetail](docs/OutboundMessageDetail.md)
 - [OutboundMessageDetailsResponse](docs/OutboundMessageDetailsResponse.md)
 - [OutboundMessageDumpResponse](docs/OutboundMessageDumpResponse.md)
 - [OutboundOverviewStatsResponse](docs/OutboundOverviewStatsResponse.md)
 - [OutboundSearchResponse](docs/OutboundSearchResponse.md)
 - [SendEmailBatchRequest](docs/SendEmailBatchRequest.md)
 - [SendEmailBatchResponse](docs/SendEmailBatchResponse.md)
 - [SendEmailRequest](docs/SendEmailRequest.md)
 - [SendEmailResponse](docs/SendEmailResponse.md)
 - [SentCountsResponse](docs/SentCountsResponse.md)
 - [SentCountsResponseDays](docs/SentCountsResponseDays.md)
 - [ServerConfigurationResponse](docs/ServerConfigurationResponse.md)
 - [StandardPostmarkResponse](docs/StandardPostmarkResponse.md)
 - [TemplateDetailResponse](docs/TemplateDetailResponse.md)
 - [TemplateListingResponse](docs/TemplateListingResponse.md)
 - [TemplateRecordResponse](docs/TemplateRecordResponse.md)
 - [TemplateValidationError](docs/TemplateValidationError.md)
 - [TemplateValidationRequest](docs/TemplateValidationRequest.md)
 - [TemplateValidationResponse](docs/TemplateValidationResponse.md)
 - [TemplateValidationResult](docs/TemplateValidationResult.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.




## Development

Building the API client library requires [Maven](https://maven.apache.org/) to be installed as well as at least Java 7.
