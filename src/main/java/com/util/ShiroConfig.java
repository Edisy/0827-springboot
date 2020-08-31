package com.util;

import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;


import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Edo
 */
@Configuration
public class ShiroConfig {

//    @Autowired(required = false)
//    MyRealm myRealm;

    /**
     * shiro过滤器工厂
     * */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean fac = new ShiroFilterFactoryBean();
        //安全管理器
        fac.setSecurityManager(securityManager);
        //起始登录页
        fac.setLoginUrl("/login.html");
        fac.setUnauthorizedUrl("/unauth.html");
        //设置授权或关系
        Map<String, Filter> filter = new LinkedHashMap<>();
        filter.put("roleOrFilter",new RoleFilter());
        fac.setFilters(filter);
        //过滤器
        Map<String,String> map = new HashMap();
        map.put("/login.html*","anon");
        map.put("/employee/login*","anon");
        map.put("/js/**","anon");
        map.put("/img/**","anon");
        map.put("/css/**","anon");

        map.put("/admin/emp.html","roleOrFilter[admin,manager]");




        //其它都要认证
        map.put("/**","authc");
        fac.setFilterChainDefinitionMap(map);
        return fac;
    }

    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(MyRealm myRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();

        //设置登录认证
        securityManager.setRealm(myRealm);
        return securityManager;
    }


    /**
     * 生命周期
     * */
    @Bean
    public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor(){
        return  new LifecycleBeanPostProcessor();
    }

    /**
     * 开启shiro注解
     * */
    @Bean
    public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator(){
        return new DefaultAdvisorAutoProxyCreator();
    }

    /**
     * 安全管理器
     * */
    @Bean
    public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor(DefaultWebSecurityManager defaultWebSecurityManager){
        AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
        aasa.setSecurityManager(defaultWebSecurityManager);
        return aasa;
    }

    /**
     * 异常跳转
     * */
    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver simpleMappingExceptionResolver = new SimpleMappingExceptionResolver();
        Properties props = new Properties();
        props.put("org.apache.shiro.authz.UnauthorizedException","/unauth.html");

        simpleMappingExceptionResolver.setExceptionMappings(props);

        return simpleMappingExceptionResolver;
    }
}
