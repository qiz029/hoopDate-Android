package com.hoop.date.hoopdate.implementation;

import com.hoop.date.hoopdate.model.credential;

public interface authLogicImpl {
    public boolean validateCredentials(credential cred);
    public boolean register(credential cred);
}
