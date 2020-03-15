package com.leiax00.jctec.mapper;

import com.leiax00.jctec.bean.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM jc_user where username=#{username}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(column = "id", property = "authorities",
                    many = @Many(
                            select = "com.leiax00.jctec.mapper.RoleMapper.selectRolesByUserId",
                            fetchType = FetchType.EAGER
                    ))
    })
    User loadUserByUsername(@Param("username") String username);

}
