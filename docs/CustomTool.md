

# CustomTool


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Describes what this tool does and when to call this tool. |  |
|**parameters** | [**ToolParameter**](ToolParameter.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** | Name of the tool. Must be unique within all tools available to LLM at any given time (general tools + state tools + state edges). |  |
|**url** | **String** | The URL we will post the function name and arguments to get a result for the function. Usually this is your server. |  |
|**speakDuringExecution** | **Boolean** | Determines whether the agent would say sentence like \&quot;One moment, let me check that.\&quot; when executing the function. Recommend to turn on if your function call takes over 1s (including network) to complete, so that your agent remains responsive. |  |
|**speakAfterExecution** | **Boolean** | Determines whether the agent would call LLM another time and speak when the result of function is obtained. Usually this needs to get turned on so user can get update for the function call. |  |
|**executionMessageDescription** | **String** | The description for the sentence agent say during execution. Only applicable when speak_during_execution is true. Can write what to say or even provide examples. The default is \&quot;The message you will say to callee when calling this tool. Make sure it fits into the conversation smoothly.\&quot;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;custom&quot; |



