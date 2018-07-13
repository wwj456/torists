package com.example.torists.service;

import com.example.torists.bean.Line;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LineService {
    /**
     * 查询全部路线
     * @return
     */
    List<Line> findAllLine();

    /**
     * 添加路线
     * @param line
     * @return
     */
    int addLine(Line line);

    /**
     * 修改路线
     * @param line
     * @return
     */
    int updateLine(Line line);

    /**
     * 删除路线
     * @param line_id
     * @return
     */
    int deleteLine(int line_id);
}
