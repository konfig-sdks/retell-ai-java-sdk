

# TransferCallTool


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Describes when to transfer the call. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** | Name of the tool. Must be unique within all tools available to LLM at any given time (general tools + state tools + state edges). |  |
|**number** | **String** | The number to transfer to in E.164 format (a + and country code, then the phone number with no space or other special characters). For example, +16175551212. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TRANSFER_CALL | &quot;transfer_call&quot; |



