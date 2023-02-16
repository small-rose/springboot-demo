package com.small.o2o.comp.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

public class CustomDatasource extends DruidDataSource {
    private final DataSourceProperties properties;

    //private final boolean unEncrypt;

    public CustomDatasource(DataSourceProperties properties) {
        this.properties = properties;
        String url = this.properties.getUrl();
    }

   /* @Override
    public void setPassword(String password) {
        super.setPassword(unEncrypt ? password : AESCoderUtil.decode(password));
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(unEncrypt ? username : AESCoderUtil.decode(username));
    }

    @Override
    public synchronized void setUrl(String url) {
        super.setUrl(unEncrypt ? url : AESCoderUtil.decode(url));
    }*/
}
