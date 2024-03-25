

# ToolParameter

The parameters the functions accepts, described as a JSON Schema object. See [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. Omitting parameters defines a function with an empty parameter list.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type must be \&quot;object\&quot; for a JSON Schema object. |  |
|**properties** | **Map&lt;String, Object&gt;** | The value of properties is an object, where each key is the name of a property and each value is a schema used to validate that property. |  |
|**required** | **List&lt;String&gt;** | List of names of required property when generating this parameter. LLM will do its best to generate the required properties in its function arguments. Property must exist in properties. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| OBJECT | &quot;object&quot; |



