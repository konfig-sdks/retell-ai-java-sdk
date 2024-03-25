

# BookAppointmentCalTool


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Describes when to book the appointment. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** | Name of the tool. Must be unique within all tools available to LLM at any given time (general tools + state tools + state transitions). |  |
|**calApiKey** | **String** | Cal.com Api key that have access to the cal.com event you want to book appointment. |  |
|**eventTypeId** | **Double** | Cal.com event type id number for the cal.com event you want to book appointment. |  |
|**timezone** | **String** | Timezone to be used when booking appointment, must be in [IANA timezone database](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If not specified, will check if user specified timezone in call, and if not, will use the timezone of the Retell servers. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BOOK_APPOINTMENT_CAL | &quot;book_appointment_cal&quot; |



