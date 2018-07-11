package com.example.torists.service.Impl;

import com.example.torists.bean.Line;
import com.example.torists.repositroy.LineReposictroy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LineServiceImpl implements LineReposictroy {

    @Autowired
    LineReposictroy lineReposictroy;
    @Override
    public List<Line> findAllLine() {
        return lineReposictroy.findAllLine();
    }

    @Override
    public int addLine(Line line) {
        return lineReposictroy.addLine(line);
    }

    @Override
    public int updateLine(Line line) {
        return lineReposictroy.updateLine(line);
    }

    @Override
    public int deleteLine(int line_id) {
        return lineReposictroy.deleteLine(line_id);
    }
}
