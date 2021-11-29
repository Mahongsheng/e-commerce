package com.ecommerce.admin.controller;

import com.ecommerce.admin.config.GitAutoRefreshConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GitController {

    @Autowired
    private GitAutoRefreshConfig gitAutoRefreshConfig;

    @GetMapping(value = "autoShow")
    public Object autoShow() {
        return gitAutoRefreshConfig;
    }
}
