package com.service;

import com.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public interface RoleService {

    List<Role> findAll();
}
