
# TemplateValidationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **String** | The subject content to validate. Must be specified if HtmlBody or TextBody are not. See our template language documentation for more information on the syntax for this field.  |  [optional]
**htmlBody** | **String** | The html body content to validate. Must be specified if Subject or TextBody are not. See our template language documentation for more information on the syntax for this field.  |  [optional]
**textBody** | **String** | The text body content to validate. Must be specified if HtmlBody or Subject are not. See our template language documentation for more information on the syntax for this field.  |  [optional]
**textRenderModel** | **Object** | The model to be used when rendering test content. |  [optional]
**inlineCssForHtmlTestRender** | **Boolean** | When HtmlBody is specified, the test render will have style blocks inlined as style attributes on matching html elements. You may disable the css inlining behavior by passing false for this parameter.  |  [optional]



