package com.example.reader.web.service;

import com.example.reader.entity.Biaoqian;
import com.example.reader.mapper.BiaoqianMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/28 14:16
 */
@Service
public class BiaoqianService {
    @Autowired
    private BiaoqianMapper biaoqianMapper;

    // 查询所有
    public List<Biaoqian> selectAll(){
        List<Biaoqian> biaoqians = biaoqianMapper.selectAll();
        return biaoqians;
    }

    // 删除
    public Integer deleteId(int id){
        return biaoqianMapper.deleteId(id);
    }

    //add
    public void add(Biaoqian biaoqian){
        biaoqianMapper.add(biaoqian);
    }

    // 通过id查找
    public void updateOrId(Biaoqian biaoqian){
        biaoqianMapper.updateOrId(biaoqian);
    }
}
