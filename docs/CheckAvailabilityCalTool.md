

# CheckAvailabilityCalTool


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Describes when to check availability. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** | Name of the tool. Must be unique within all tools available to LLM at any given time (general tools + state tools + state transitions). |  |
|**calApiKey** | **String** | Cal.com Api key that have access to the cal.com event you want to check availability for. |  |
|**eventTypeId** | **Double** | Cal.com event type id number for the cal.com event you want to check availability for. |  |
|**timezone** | **String** | Timezone to be used when checking availability, must be in [IANA timezone database](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If not specified, will check if user specified timezone in call, and if not, will use the timezone of the Retell servers. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHECK_AVAILABILITY_CAL | &quot;check_availability_cal&quot; |



