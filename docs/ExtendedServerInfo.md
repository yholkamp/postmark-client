
# ExtendedServerInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**apiTokens** | **List&lt;String&gt;** |  |  [optional]
**serverLink** | **String** |  |  [optional]
**color** | **String** |  |  [optional]
**smtpApiActivated** | **Boolean** |  |  [optional]
**rawEmailEnabled** | **Boolean** |  |  [optional]
**deliveryHookUrl** | **String** |  |  [optional]
**inboundAddress** | **String** |  |  [optional]
**inboundHookUrl** | **String** |  |  [optional]
**bounceHookUrl** | **String** |  |  [optional]
**openHookUrl** | **String** |  |  [optional]
**postFirstOpenOnly** | **Boolean** |  |  [optional]
**trackOpens** | **Boolean** |  |  [optional]
**trackLinks** | [**TrackLinksEnum**](#TrackLinksEnum) |  |  [optional]
**inboundDomain** | **String** |  |  [optional]
**inboundHash** | **String** |  |  [optional]
**inboundSpamThreshold** | **Integer** |  |  [optional]


<a name="TrackLinksEnum"></a>
## Enum: TrackLinksEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
HTMLANDTEXTTRACKING | &quot;HtmlAndTextTracking&quot;
HTMLONLYTRACKING | &quot;HtmlOnlyTracking&quot;
TEXTONLYTRACKING | &quot;TextOnlyTracking&quot;



