package com.gift.infrastructure.repository;

import com.gift.infrastructure.gatewayimpl.rpc.AppMetricMapper;
import com.gift.infrastructure.gatewayimpl.rpc.dataobject.AppMetricDO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class AppMetricRepository {

    @Resource
    private AppMetricMapper appMetricMapper;


}
