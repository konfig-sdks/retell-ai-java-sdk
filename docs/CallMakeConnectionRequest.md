

# CallMakeConnectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | [**CallMakeConnectionRequestPhoneNumber**](CallMakeConnectionRequestPhoneNumber.md) |  |  |
|**overrideAgentId** | **String** | For this particular call, override the agent used with this agent id. This does not bind the agent to this number, this is for one time override. |  [optional] |
|**retellLlmDynamicVariables** | **Map&lt;String, Object&gt;** | Add optional dynamic variables in key value pairs of string that injects into your Retell LLM prompt and tool description. Only applicable for Retell LLM. |  [optional] |



