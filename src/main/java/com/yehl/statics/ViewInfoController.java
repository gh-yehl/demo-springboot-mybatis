package com.yehl.statics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ViewInfoController {

    @Autowired
    ViewInfoService viewInfoService;

    @RequestMapping("/allView")
    public List<ViewInfo> findAllViewInfo() {
        return viewInfoService.findAllViewInfo();
    }
}
