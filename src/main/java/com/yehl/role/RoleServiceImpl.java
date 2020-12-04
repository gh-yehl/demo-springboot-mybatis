package com.yehl.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findRoleById(long roleId) {
        return roleDao.findRoleById(roleId);
    }

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

    @Override
    public int updateUser() {
        return roleDao.updateUser();
    }
}
