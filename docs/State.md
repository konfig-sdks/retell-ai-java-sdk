

# State


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the state, must be unique for each state. |  |
|**statePrompt** | **String** | Prompt of the state, will be appended to the system prompt of LLM.    - System prompt &#x3D; general prompt + state prompt. |  [optional] |
|**edges** | [**List&lt;StateEdge&gt;**](StateEdge.md) | Edges of the state define how and what state can be reached from this state. |  [optional] |
|**tools** | **List&lt;Object&gt;** | A list of tools specific to this state the model may call (to get external knowledge, call API, etc). You can select from some common predefined tools like end call, transfer call, etc; or you can create your own custom tool (last option) for the LLM to use.   - Tools of LLM &#x3D; general tools + state tools + state transitions |  [optional] |



