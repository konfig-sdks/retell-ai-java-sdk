

# RetellLLMResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**llmId** | **String** | Unique id of Retell LLM. |  |
|**llmWebsocketUrl** | **String** | The LLM Websocket URL constructed from unique id of Retell LLM. Used in agent API to create / update agent. |  |
|**generalPrompt** | **String** | General prompt that&#39;s appended to system prompt no matter what state the agent is in.   - System prompt (with state) &#x3D; general prompt + state prompt.  - System prompt (no state) &#x3D; general prompt. |  [optional] |
|**generalTools** | **List&lt;Object&gt;** | A list of tools the model may call (to get external knowledge, call API, etc). You can select from some common predefined tools like end call, transfer call, etc; or you can create your own custom tool (last option) for the LLM to use.   - Tools of LLM (with state) &#x3D; general tools + state tools + state transitions  - Tools of LLM (no state) &#x3D; general tools |  [optional] |
|**states** | [**List&lt;State&gt;**](State.md) | States of the LLM. This is to help reduce prompt length and tool choices when the call can be broken into distinct states. With shorter prompts and less tools, the LLM can better focus and follow the rules, minimizing hallucination. If this field is not set, the agent would only have general prompt and general tools (essentially one state). |  [optional] |
|**startingState** | **String** | Name of the starting state. Required if states is not empty. |  [optional] |
|**beginMessage** | **String** | First utterance said by the agent in the call. If not set, LLM will dynamically generate a message. If set to \&quot;\&quot;, agent will wait for user to speak first. |  [optional] |
|**lastModificationTimestamp** | **Integer** | Last modification timestamp (milliseconds since epoch). Either the time of last update or creation if no updates available. |  |



