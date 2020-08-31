package com.util;

import com.model.Employee;
import com.model.Permission;
import com.service.EmployeeService;
import com.service.PermissionService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Edo
 */
@Component("myRealm")
public class MyRealm extends AuthorizingRealm {

    @Resource(name = "employeeServiceImpl")
    private EmployeeService employeeService;

    @Resource(name = "permissionServiceImpl")
    private PermissionService permissionService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Employee employee = (Employee)SecurityUtils.getSubject().getPrincipal();
        System.out.println("myRealm授权获得的当前emp="+employee);
        System.out.println("myRealm授权获得的当前RoleInfo="+employee.getRoleInfo());
        //添加角色信息
        authorizationInfo.addRole(employee.getRoleInfo());
        System.out.println("我完成了角色信息的添加");
        //添加角色权限
        List<Permission> ps = permissionService.getPsByRoleId(employee.getRoleId());
        for (Permission p: ps) {
            System.out.println("myRealm pInfo="+p);
            if (p.getpInfo()!=null&&!"".equals(p.getpInfo())){
                authorizationInfo.addStringPermission(p.getpInfo());
            }
        }
        return authorizationInfo;
    }

    /**
     * 认证登录
     * */

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken up = (UsernamePasswordToken) token;
        String loginName = up.getUsername();
        //通过用户名查找用户
        System.out.println("****************MyRealm loginName="+loginName);
        Employee emp = employeeService.getByUserName(loginName);
        System.out.println("****************MyRealm emp="+emp);
        if (emp==null){
            return null;
        }else {
            //比对查到的密码和登录页的密码
            return new SimpleAuthenticationInfo(emp,emp.getUserPassword(),this.getName());
        }
    }

}
