package com.konfigthis.client;

import com.konfigthis.client.api.AgentApi;
import com.konfigthis.client.api.CallApi;
import com.konfigthis.client.api.PhoneNumberApi;
import com.konfigthis.client.api.RetellApi;
import com.konfigthis.client.api.RetellLlmApi;

public class RetellAi {
    private ApiClient apiClient;
    public final AgentApi agent;
    public final CallApi call;
    public final PhoneNumberApi phoneNumber;
    public final RetellApi retell;
    public final RetellLlmApi retellLlm;

    public RetellAi() {
        this(null);
    }

    public RetellAi(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.agent = new AgentApi(this.apiClient);
        this.call = new CallApi(this.apiClient);
        this.phoneNumber = new PhoneNumberApi(this.apiClient);
        this.retell = new RetellApi(this.apiClient);
        this.retellLlm = new RetellLlmApi(this.apiClient);
    }

}
