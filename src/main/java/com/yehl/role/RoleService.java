package com.yehl.role;

import java.util.List;

public interface RoleService {
    public Role findRoleById(long roleId);
    public List<Role> findAll();
    public int updateUser();
}
