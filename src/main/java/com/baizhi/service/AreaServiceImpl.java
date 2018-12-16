package com.baizhi.service;

import com.baizhi.entity.Area;
import com.baizhi.mapper.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> getAllArea() {
        return areaMapper.selectAll();
    }
}
