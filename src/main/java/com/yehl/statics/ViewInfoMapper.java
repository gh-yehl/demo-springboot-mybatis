package com.yehl.statics;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ViewInfoMapper {

    @Select("select r.id as roleId, r.role_name as roleName, u.user_name as userName, u.gender, u.age  from role r , user u " +
            "where r.id = u.role_id")
    public List<ViewInfo> findAllViewInfo();
}
