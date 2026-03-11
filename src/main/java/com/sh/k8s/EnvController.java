package com.sh.k8s;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {

    @Value("${MY_ACCOUNT:default_account}")
    private String myAccount;

    @Value("${MY_PASSWORD:default_password}")
    private String myPassword;

    @GetMapping("/env")
    public String getEnv() {
        return "myAccount: " + myAccount + ", myPassword: " + myPassword;
    }
}
