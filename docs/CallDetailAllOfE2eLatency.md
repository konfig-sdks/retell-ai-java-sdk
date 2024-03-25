

# CallDetailAllOfE2eLatency

End to end latency (from user stops talking to agent start talking) tracking of the call, available after call ends. This latency does not account for the network trip time from Retell server to user frontend.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**p50** | **Double** | 50 percentile of end to end latency. |  [optional] |
|**p90** | **Double** | 90 percentile of end to end latency. |  [optional] |
|**p95** | **Double** | 95 percentile of end to end latency. |  [optional] |
|**p99** | **Double** | 99 percentile of end to end latency. |  [optional] |
|**max** | **Double** | Maximum end to end latency in the call. |  [optional] |
|**min** | **Double** | Minimum end to end latency in the call. |  [optional] |
|**num** | **Double** | Number of turn change. We track latency every time turn change between user and agent. |  [optional] |



