package org.blog;

public class RemoteService {
    private final String url;

    public RemoteService(String url) {
        this.url = url;
    }

    public String getUrl() {
        return getBaseUrl() + "/" + url;
    }

    private String getBaseUrl() {
        //load base url from config file
    }
}
