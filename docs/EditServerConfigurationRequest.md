
# EditServerConfigurationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**color** | [**ColorEnum**](#ColorEnum) |  |  [optional]
**rawEmailEnabled** | **Boolean** |  |  [optional]
**deliveryHookUrl** | **String** |  |  [optional]
**smtpApiActivated** | **Boolean** |  |  [optional]
**inboundHookUrl** | **String** |  |  [optional]
**bounceHookUrl** | **String** |  |  [optional]
**openHookUrl** | **String** |  |  [optional]
**postFirstOpenOnly** | **Boolean** |  |  [optional]
**trackOpens** | **Boolean** |  |  [optional]
**trackLinks** | [**TrackLinksEnum**](#TrackLinksEnum) |  |  [optional]
**inboundDomain** | **String** |  |  [optional]
**inboundSpamThreshold** | **Integer** |  |  [optional]


<a name="ColorEnum"></a>
## Enum: ColorEnum
Name | Value
---- | -----
PURPLE | &quot;purple&quot;
BLUE | &quot;blue&quot;
TURQOISE | &quot;turqoise&quot;
GREEN | &quot;green&quot;
RED | &quot;red&quot;
YELLOW | &quot;yellow&quot;
GREY | &quot;grey&quot;


<a name="TrackLinksEnum"></a>
## Enum: TrackLinksEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
HTMLANDTEXT | &quot;HtmlAndText&quot;
HTMLONLY | &quot;HtmlOnly&quot;
TEXTONLY | &quot;TextOnly&quot;



