package com.yehl.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/role")
    public Role getRole(long id) {
        return roleService.findRoleById(id);
    }

    @RequestMapping("/all")
    public List<Role> findAll() {
        return roleService.findAll();
    }

    @RequestMapping("/updateUser")
    public int updateUser() {
        return roleService.updateUser();
    }

}
