
# EmailWithTemplateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templateId** | **Integer** |  |  [optional]
**templateModel** | **Object** |  |  [optional]
**to** | **String** |  |  [optional]
**from** | **String** |  |  [optional]
**bcc** | **String** |  |  [optional]
**replyTo** | **String** |  |  [optional]
**trackLinks** | [**TrackLinksEnum**](#TrackLinksEnum) | Replace links in content to enable \&quot;click tracking\&quot; stats. Default is &#39;null&#39;, which uses the server&#39;s LinkTracking setting&#39;. |  [optional]
**trackOpens** | **Boolean** | Activate open tracking for this email. |  [optional]
**inlineCss** | **Boolean** |  |  [optional]


<a name="TrackLinksEnum"></a>
## Enum: TrackLinksEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
HTMLANDTEXT | &quot;HtmlAndText&quot;
HTMLONLY | &quot;HtmlOnly&quot;
TEXTONLY | &quot;TextOnly&quot;



