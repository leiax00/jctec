package com.leiax00.jctec.mapper;

import com.leiax00.jctec.bean.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface RoleMapper {
    @Select("SELECT * FROM jc_role WHERE id IN (SELECT role_id FROM jc_user_role WHERE user_id=#{userId})")
    List<Role> selectRolesByUserId(Long userId);
}
