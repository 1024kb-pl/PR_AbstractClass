package org.blog;

import java.util.List;

public class FacebookUserService extends RemoteService{

    public FacebookUserService(String url) {
        super(url);
    }

    public List<User> getUsers() {
        // get users from facebook rest api
    }
}
