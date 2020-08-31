package com.util;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



/**
 * Component("roleOrFilter")
 *
 * @author Edo*/

public class RoleFilter extends AuthorizationFilter {
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse,
                                      Object obt) throws Exception {

        Subject subject = getSubject(servletRequest, servletResponse);
        String roles[] = (String[]) obt;
        if (roles == null || roles.length == 0) { //没有角色限制，有权限访问
            return true;
        }
        for (int i = 0; i < roles.length; i++) {
            if (subject.hasRole(roles[i])) { //若当前用户是rolesArray中的任何一个，则有权限访问
                return true;
            }
        }

        return false;

    }
}
