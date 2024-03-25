

# CallEstablishConnectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **String** | Unique id of agent used for the call. Your agent would contain the LLM Websocket url used for this call. |  |
|**audioWebsocketProtocol** | [**AudioWebsocketProtocolEnum**](#AudioWebsocketProtocolEnum) | Where the audio websocket would connect from would determine the format / protocol of websocket messages, and would determine how our server read audio bytes and send audio bytes.:  - &#x60;web&#x60;: The protocol defined by Retell, commonly used for connecting from web frontend. Also useful for those who want to manipulate audio bytes directly.  - &#x60;twilio&#x60;: The [websocket protocol](https://www.twilio.com/docs/voice/twiml/stream#message-media) defined by Twilio, used when your system uses Twilio, and supplies Retell audio websocket url to Twilio. |  |
|**audioEncoding** | [**AudioEncodingEnum**](#AudioEncodingEnum) | The audio encoding of the call. The following formats are supported:   - &#x60;s16le&#x60; 16 bit linear PCM audio, the native format for web audio capture and playback.  - &#x60;mulaw&#x60; non-linear audio encoding technique used in telephony. Commonly used by Twilio. |  |
|**sampleRate** | **Integer** | Sample rate of the conversation, the input and output audio bytes will all conform to this rate. Check the audio source, audio format, and voice used for the agent to select one that works. supports value ranging from [8000, 48000]. Note for Twilio &#x60;mulaw&#x60; encoding, the sample rate has to be 8000.  - &#x60;s16le&#x60; sample rate recommendation (natively supported, lowest latency):    - elevenlabs voices: 16000, 22050, 24000, 44100.   - openai voices: 24000.    - deepgram voices: 8000, 16000, 24000, 32000, 48000. |  |
|**endCallAfterSilenceMs** | **Integer** | If users stay silent for a period, end the call. By default, it is set to 600,000 ms (10 min). The minimum value allowed is 10,000 ms (10 s). |  [optional] |
|**fromNumber** | **String** | The caller number. This field is storage purpose only, set this if you want the call object to contain it so that it&#39;s easier to reference it. Not used for processing, when we connect to your LLM websocket server, you can then get it from the call object. |  [optional] |
|**toNumber** | **String** | The callee number. This field is storage purpose only, set this if you want the call object to contain it so that it&#39;s easier to reference it. Not used for processing, when we connect to your LLM websocket server, you can then get it from the call object. |  [optional] |
|**metadata** | **Object** | An abtriary object for storage purpose only. You can put anything here like your own id for the call, twilio SID, internal customer id. Not used for processing, when we connect to your LLM websocket server, you can then get it from the call object. |  [optional] |
|**retellLlmDynamicVariables** | **Map&lt;String, Object&gt;** | Add optional dynamic variables in key value pairs of string that injects into your Retell LLM prompt and tool description. Only applicable for Retell LLM. |  [optional] |



## Enum: AudioWebsocketProtocolEnum

| Name | Value |
|---- | -----|
| WEB | &quot;web&quot; |
| TWILIO | &quot;twilio&quot; |



## Enum: AudioEncodingEnum

| Name | Value |
|---- | -----|
| S16LE | &quot;s16le&quot; |
| MULAW | &quot;mulaw&quot; |



