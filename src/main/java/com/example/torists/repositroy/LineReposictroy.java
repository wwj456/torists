package com.example.torists.repositroy;

import com.example.torists.bean.Line;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface LineReposictroy {
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
    int addLine(@Param("l") Line line);

    /**
     * 修改路线
     * @param line
     * @return
     */
    int updateLine(@Param("l") Line line);

    /**
     * 删除路线
     * @param line_id
     * @return
     */
    int deleteLine(int line_id);
}
