package com.rv.resources;

import com.rv.api.v1.resource.UsersApiDelegate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component("getForUsers")
public class ApiGetUserListDelegate implements UsersApiDelegate {
    @Override
    public ResponseEntity<List<String>> getUserList() {
        List<String> result = Arrays.asList("Pong");
        return ResponseEntity.of(Optional.of(result));
    }
}
