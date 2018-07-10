package service;

import com.example.torists.bean.Line_ding;

import java.util.List;

public interface Line_dingService {
    /**
     * 查询全部路线订单
     * @return
     */
    List<Line_ding> findAllLine_ding();

    /**
     * 添加路线订单
     * @param line_ding
     * @return
     */
    int addLine_ding(Line_ding line_ding);

    /**
     * 修改路线订单
     * @param line_ding
     * @return
     */
    int updateLine_ding(Line_ding line_ding);

    /**
     * 删除路线订单
     * @param lined_id
     * @return
     */
    int deleteLine_ding(int lined_id);
}
