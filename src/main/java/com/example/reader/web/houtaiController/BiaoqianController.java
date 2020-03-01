package com.example.reader.web.houtaiController;

import com.example.reader.entity.Biaoqian;
import com.example.reader.web.service.BiaoqianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/28 14:16 标签管理页面
 */
@RestController
@RequestMapping(value = "/biaoqian")
public class BiaoqianController {

    @Autowired
    private BiaoqianService biaoqianService;

    @GetMapping("/select")
    public List<Biaoqian> selectAll(){
        return biaoqianService.selectAll();
    }
    //
    @GetMapping("/delete/{id}")
    public void Delete(@PathVariable int id){
        biaoqianService.deleteId(id);
    }

    // 增加
    @PostMapping("/add")
    public void add(@RequestBody Biaoqian biaoqian){
        biaoqian.setCreateTime(new Date());
        biaoqianService.add(biaoqian);
    }

    // 修改
    @PostMapping("/UpdateOrid")
    public void updateOrId(@RequestBody Biaoqian biaoqian){
        biaoqianService.updateOrId(biaoqian);
    }

}
