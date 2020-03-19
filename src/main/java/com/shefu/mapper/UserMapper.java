package com.shefu.mapper;
import com.shefu.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User Sel(int id);
    List<User> SelAll();
}
