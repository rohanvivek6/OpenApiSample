package com.rv.resources;

import com.rv.api.v1.resource.UsersApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class DefaultApiDelegate implements UsersApiDelegate {

    @Autowired
    private ApiGetUserListDelegate getUserListDelegate;

    @Override
    public ResponseEntity<List<String>> getUserList() {
        return getUserListDelegate.getUserList();
    }
}
