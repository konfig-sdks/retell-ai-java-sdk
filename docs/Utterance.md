

# Utterance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**role** | [**RoleEnum**](#RoleEnum) | Documents whether this utterance is spoken by agent or user. |  |
|**content** | **String** | Transcript of the utterances. |  |
|**words** | [**List&lt;UtteranceWordsInner&gt;**](UtteranceWordsInner.md) | Array of words in the utternace with the word timestamp. Useful for understanding what word was spoken at what time. Note that the word timestamp is not guranteed to be accurate, it&#39;s more like an approximation. |  |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| AGENT | &quot;agent&quot; |
| USER | &quot;user&quot; |



