package com.suger.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author suger
 * @date 2018/12/14 19:22
 * 引入SendCloud的配置
 */
@Component("sendCloudBean")
@Scope("singleton")
public class SendCloudBean {

    @Value("#{sendCloud.url}")
    private String url;

    @Value("#{sendCloud.apiUser}")
    private String apiUser;

    @Value("#{sendCloud.apiKey}")
    private String apiKey;

    @Value("#{sendCloud.from}")
    private String from;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getApiUser() {
        return apiUser;
    }
    public void setApiUser(String apiUser) {
        this.apiUser = apiUser;
    }
    public String getApiKey() {
        return apiKey;
    }
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
}
