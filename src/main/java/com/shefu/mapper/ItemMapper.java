package com.shefu.mapper;

import com.shefu.entity.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    Item Sel(Long id);
    List<Item> SelAll();
}
