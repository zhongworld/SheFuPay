package com.shefu.controller;

import com.shefu.entity.Item;
import com.shefu.entity.User;
import com.shefu.service.ItemService;
import com.shefu.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private ItemService itemService;

    @RequestMapping("/getUser")
    public User getUser(){
        return userService.getUser(1);
    }

    @RequestMapping("getUserAll")
    public List<User> getUserAll(){
        return  userService.getUserAll();
    }

    @RequestMapping("/getItemAll")
    public  List<Item> getItemAll(){
        return itemService.getItemAll();
    }

    @GetMapping("/getModel/{id}")
    public Item getModel(@PathVariable("id") Long id){
        return itemService.getItem(id);
    }
}
