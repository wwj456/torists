package com.example.torists.service.Impl;

import com.example.torists.bean.Line_ding;
import com.example.torists.repositroy.Line_dingReposictroy;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.torists.service.Line_dingService;

import java.util.List;

public class Line_dingServiceImpl implements Line_dingService {

    @Autowired
    Line_dingReposictroy line_dingReposictroy;
    @Override
    public List<Line_ding> findAllLine_ding() {
        return line_dingReposictroy.findAllLine_ding();
    }

    @Override
    public int addLine_ding(Line_ding line_ding) {
        return line_dingReposictroy.addLine_ding(line_ding);
    }

    @Override
    public int updateLine_ding(Line_ding line_ding) {
        return line_dingReposictroy.updateLine_ding(line_ding);
    }

    @Override
    public int deleteLine_ding(int lined_id) {
        return line_dingReposictroy.deleteLine_ding(lined_id);
    }
}
