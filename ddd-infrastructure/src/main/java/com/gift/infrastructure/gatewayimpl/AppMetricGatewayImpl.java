package com.gift.infrastructure.gatewayimpl;

import com.gift.infrastructure.repository.AppMetricRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class AppMetricGatewayImpl {

    @Resource
    private AppMetricRepository appMetricRepository;


}
