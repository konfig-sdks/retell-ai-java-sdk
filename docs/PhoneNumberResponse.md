

# PhoneNumberResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | BCP 47 format of the number (+country code, then number with no space, no special characters), used as the unique identifier for phone number APIs. |  |
|**phoneNumberPretty** | **String** | Pretty printed phone number, provided for your reference. |  |
|**agentId** | **String** | Unique id of agent to bind to newly obtained number. The number will automatically use the agent when doing inbound / outbound calls. |  |
|**areaCode** | **Integer** | Area code of the number to obtain. Format is a 3 digit integer. Currently only supports US area code. |  |
|**lastModificationTimestamp** | **Integer** | Last modification timestamp (milliseconds since epoch). Either the time of last update or creation if no updates available. |  |



