package com.example.reader.mapper;

import com.example.reader.entity.Biaoqian;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BiaoqianMapper {

    public List<Biaoqian> selectAll();

    public Integer deleteId(int id);

    public void add(Biaoqian biaoqian);

    public void updateOrId(Biaoqian biaoqian);
}
