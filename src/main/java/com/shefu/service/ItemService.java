package com.shefu.service;

import com.shefu.entity.Item;
import com.shefu.mapper.ItemMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItemService {
    @Resource
    private ItemMapper itemMapper;

    public Item getItem(Long id){
        return itemMapper.Sel(id);
    }

    public List<Item> getItemAll(){
        return itemMapper.SelAll();
    }
}
