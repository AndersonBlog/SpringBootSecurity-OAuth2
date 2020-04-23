package com.wu.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * 描述:
 *
 * @author WUAN4
 * @create 2020-04-20 9:25 AM
 */
@Configuration
public class AccessTokenConfig {

    private String SIGNING_KEY = "Anderson";

    @Bean
    TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }
}
