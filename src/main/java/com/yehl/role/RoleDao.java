package com.yehl.role;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface RoleDao {

    @Select("SELECT id,role_name as roleName,note FROM role WHERE id = #{id}")
    Role findRoleById(@Param("id") long id);

    @Select("select * from role")
    List<Role> findAll();

    @Update("update user set gender='male' where role_id > 111")
    int updateUser();
}
