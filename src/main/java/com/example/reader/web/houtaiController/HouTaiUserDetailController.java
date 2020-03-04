package com.example.reader.web.houtaiController;

import com.example.reader.entity.UserDetailed;
import com.example.reader.entity.UserRole;
import com.example.reader.web.service.RoleService;
import com.example.reader.web.service.UserDetailedService;
import com.example.reader.web.service.UserRoleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/3/3 13:28
 */
@RestController
@RequestMapping(value = "/houtai/userdetails")
public class HouTaiUserDetailController {
    @Autowired
    private UserDetailedService userDetailedService;

    @Autowired
    private UserRoleService userRoleService;

    @GetMapping(value = "/select/{pagenum}")
    public PageInfo<UserDetailed> selectAll(@PathVariable int pagenum){
        return userDetailedService.selectAlss(pagenum);
    }
    // sousuo
    @GetMapping(value = "/selects/{username}")
    public List<UserDetailed> selectUsername(@PathVariable String username){
        return userDetailedService.findOrUsername(username);
    }

    // 修改用户权限
    @PostMapping(value = "/update")
    public void updateOrUid(@RequestBody UserRole userRole){
       userRoleService.updateOrRid(userRole);
    }
    // 删除多表联动
    @GetMapping(value = "/delete/{uid}")
    public void deleteUid(@PathVariable int uid){
        userDetailedService.deleteUid(uid);
    }

}
