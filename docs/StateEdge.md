

# StateEdge


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Describes what&#39;s the transition and at what time / criteria should this transition happen. |  |
|**parameters** | [**ToolParameter**](ToolParameter.md) |  |  [optional] |
|**destinationStateName** | **String** | The destination state name when going through transition of state via this edge. State transition internally is implemented as a tool call of LLM, and a tool call with name \&quot;transition_to_{destination_state_name}\&quot; will get created. Feel free to reference it inside the prompt. |  |
|**speakDuringTransition** | **Boolean** | After the state transitions, the agent would speak based on the new prompt and tools in the new state. This bit here controls whether to speak a transition sentence during the transition (so agent would say sentences like \&quot;Let&#39;s move on to the next section to help you set up an acount.\&quot;, and state transitions, and agent continue to speak.). Usually this is not necessary, and is recommended to set to false to avoid LLM repeating itself during and after transition. |  |



