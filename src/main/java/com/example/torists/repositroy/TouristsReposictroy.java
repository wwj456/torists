package com.example.torists.repositroy;

import com.example.torists.bean.Tourists;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TouristsReposictroy {

    /**
     * 查询全部客户
     * @return
     */
    List<Tourists> findAlltourists();

    /**
     * 添加客户
     * @param tourists
     * @return
     */
    int addTourists(Tourists tourists);

    /**
     * 修改客户
     * @param tourists
     * @return
     */
    int updateTourists(Tourists tourists);

    /**
     * 删除客户
     * @param t_id
     * @return
     */
    int deleteTourists(int t_id);
}
