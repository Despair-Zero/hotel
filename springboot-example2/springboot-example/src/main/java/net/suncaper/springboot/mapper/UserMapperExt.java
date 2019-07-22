package net.suncaper.springboot.mapper;

import net.suncaper.springboot.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapperExt {
    List<User> search(@Param("keyword") String keyword, @Param("age") Integer age);
}
