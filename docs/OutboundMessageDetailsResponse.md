
# OutboundMessageDetailsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**textBody** | **String** |  |  [optional]
**htmlBody** | **String** |  |  [optional]
**body** | **String** |  |  [optional]
**tag** | **String** |  |  [optional]
**messageID** | **String** |  |  [optional]
**to** | [**List&lt;EmailNameAddressPair&gt;**](EmailNameAddressPair.md) |  |  [optional]
**cc** | [**List&lt;EmailNameAddressPair&gt;**](EmailNameAddressPair.md) |  |  [optional]
**bcc** | [**List&lt;EmailNameAddressPair&gt;**](EmailNameAddressPair.md) |  |  [optional]
**recipients** | **List&lt;String&gt;** |  |  [optional]
**receivedAt** | [**Date**](Date.md) |  |  [optional]
**from** | **String** |  |  [optional]
**subject** | **String** |  |  [optional]
**attachments** | [**AttachmentCollection**](AttachmentCollection.md) |  |  [optional]
**status** | **String** |  |  [optional]
**trackOpens** | **Boolean** |  |  [optional]
**trackLinks** | [**TrackLinksEnum**](#TrackLinksEnum) |  |  [optional]
**messageEvents** | [**List&lt;MessageEventDetails&gt;**](MessageEventDetails.md) |  |  [optional]


<a name="TrackLinksEnum"></a>
## Enum: TrackLinksEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
HTMLANDTEXT | &quot;HtmlAndText&quot;
HTMLONLY | &quot;HtmlOnly&quot;
TEXTONLY | &quot;TextOnly&quot;



