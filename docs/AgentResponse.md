

# AgentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **String** | Unique id of agent. |  |
|**llmWebsocketUrl** | **String** | The URL we will establish LLM websocket for getting response, usually your server. Check out [LLM WebSocket](https://raw.githubusercontent.com) for more about request format (sent from us) and response format (send to us). |  |
|**voiceId** | **String** | Unique voice id used for the agent. Find list of available voices and their preview in Dashboard. |  |
|**voiceTemperature** | **Double** | Controls how stable the voice is. Value ranging from [0,2]. Lower value means more stable, and higher value means more variant speech generation. Currently this setting only applies to &#x60;11labs&#x60; voices. If unset, default value 1 will apply. |  [optional] |
|**voiceSpeed** | **Double** | Controls speed of voice. Value ranging from [0.5,2]. Lower value means slower speech, while higher value means faster speech rate. If unset, default value 1 will apply. |  [optional] |
|**responsiveness** | **Double** | Controls how responsive is the agent. Value ranging from [0,1]. Lower value means less responsive agent (wait more, respond slower), while higher value means faster exchanges (respond when it can). If unset, default value 1 will apply. |  [optional] |
|**enableBackchannel** | **Boolean** | Controls whether the agent would backchannel (agent interjects the speaker with phrases like \&quot;yeah\&quot;, \&quot;uh-huh\&quot; to signify interest and engagement). Backchannel when enabled tends to show up more in longer user utterances. If not set, agent will not backchannel. |  [optional] |
|**ambientSound** | [**AmbientSoundEnum**](#AmbientSoundEnum) | If set, will add ambient environment sound to the call to make experience more realistic. Currently supports the following options:  - &#x60;coffee-shop&#x60;: Coffee shop ambience with people chatting in background. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/coffee-shop.wav)  - &#x60;convention-hall&#x60;: Convention hall ambience, with some echo and people chatting in background. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/convention-hall.wav)  - &#x60;summer-outdoor&#x60;: Summer outdoor ambience with cicada chirping. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/summer-outdoor.wav)  - &#x60;mountain-outdoor&#x60;: Mountain outdoor ambience with birds singing. [Listen to Ambience](https://retell-utils-public.s3.us-west-2.amazonaws.com/mountain-outdoor.wav)   Set to string &#x60;null&#x60; to remove ambient sound from this agent.  |  [optional] |
|**agentName** | **String** | The name of the agent. Only used for your own reference. |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) | &#x60;Beta feature, use with caution.&#x60;   This setting specifies the agent&#39;s operational language, including base language and dialect. Speech recognition considers both elements, but text-to-speech currently only recognizes the base language.    For instance, selecting &#x60;en-GB&#x60; optimizes speech recognition for British English, yet text-to-speech output will be in standard English. If dialect-specific text-to-speech is required, please contact us for support.   - &#x60;11lab voices&#x60;: supports English(en), German(de), Spanish(es), Hindi(hi), Portuguese(pt)   - &#x60;openAI voices&#x60;: supports English(en), German(de), Spanish(es), Hindi(hi), Portuguese(pt), Japanese(ja)   - &#x60;deepgram voices&#x60;: supports English(en)  |  [optional] |
|**webhookUrl** | **String** | The webhook for agent to listen to call events. See what events it would get at [webhook doc](https://raw.githubusercontent.com). If set, will binds webhook events for this agent to the specified url, and will ignore the account level webhook for this agent. Set to string &#x60;null&#x60; to remove webhook url from this agent. |  [optional] |
|**boostedKeywords** | **List&lt;String&gt;** | Provide a customized list of keywords to bias the transcriber model, so that these words are more likely to get transcribed. Commonly used for names, brands, street, etc. |  [optional] |
|**formatText** | **Boolean** | Whether to format the transcribed text with inverse text normalization. It transforms the spoken form of text into written form for entities like phone number, email address, street address, etc. For example, \&quot;february fourth twenty twenty two\&quot; can be converted into \&quot;february 4th 2022\&quot;. If not set, the default is true. |  [optional] |
|**optOutSensitiveDataStorage** | **Boolean** | Disable transcripts and recordings storage for enhanced privacy. Access transcripts securely via webhooks. |  [optional] |
|**lastModificationTimestamp** | **Integer** | Last modification timestamp (milliseconds since epoch). Either the time of last update or creation if no updates available. |  |



## Enum: AmbientSoundEnum

| Name | Value |
|---- | -----|
| COFFEE_SHOP | &quot;coffee-shop&quot; |
| CONVENTION_HALL | &quot;convention-hall&quot; |
| SUMMER_OUTDOOR | &quot;summer-outdoor&quot; |
| MOUNTAIN_OUTDOOR | &quot;mountain-outdoor&quot; |
| NULL | &quot;null&quot; |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| EN_US | &quot;en-US&quot; |
| EN_IN | &quot;en-IN&quot; |
| EN_GB | &quot;en-GB&quot; |
| DE_DE | &quot;de-DE&quot; |
| ES_ES | &quot;es-ES&quot; |
| ES_419 | &quot;es-419&quot; |
| HI_IN | &quot;hi-IN&quot; |
| JA_JP | &quot;ja-JP&quot; |
| PT_PT | &quot;pt-PT&quot; |
| PT_BR | &quot;pt-BR&quot; |



