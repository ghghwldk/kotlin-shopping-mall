package com.example.portfolio.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Configuration
public class AuditConfig implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor(){
        HttpServletRequest request =
                ((ServletRequestAttributes)
                        RequestContextHolder.currentRequestAttributes()).getRequest();
        String userId = request.getHeader("userId");
        return Optional.of(userId);
    }
}
