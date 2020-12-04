package com.yehl.statics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewInfoServiceImpl implements ViewInfoService{

    @Autowired
    ViewInfoMapper viewInfoMapper;

    @Override
    public List<ViewInfo> findAllViewInfo() {
        return viewInfoMapper.findAllViewInfo();
    }
}
