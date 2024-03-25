

# CallDetailAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endTimestamp** | **Integer** | End timestamp (milliseconds since epoch) of the call. Available after call ends. |  [optional] |
|**transcript** | **String** | Transcription of the call. Available after call ends. |  [optional] |
|**transcriptObject** | [**List&lt;Utterance&gt;**](Utterance.md) | Transcript of the call in the format of a list of utterance, with timestamp. Available after call ends. |  [optional] |
|**recordingUrl** | **String** | Recording of the call. Available after call ends. |  [optional] |
|**publicLogUrl** | **String** | Public log of the call, containing details about all the requests and responses received in LLM WebSocket, latency tracking for each turntaking, helpful for debugging and tracing. Available after call ends. |  [optional] |
|**e2eLatency** | [**CallDetailAllOfE2eLatency**](CallDetailAllOfE2eLatency.md) |  |  [optional] |



