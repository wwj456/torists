package com.example.torists.repositroy;

import com.example.torists.bean.Hotel_ding;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Hotel_dingRepositroy {
    /**
     * 查询酒店订单
     * @return
     */
    List<Hotel_ding> findAllHotel_ding();

    /**
     * 添加订单
     * @param hotel_ding
     * @return
     */
    int addHootel_ding(Hotel_ding hotel_ding);

    /**
     * 修改订单
     * @param hotel_ding
     * @return
     */
    int updateHotel_ding(Hotel_ding hotel_ding);

    /**
     * 删除订单
     * @param hoteldd_id
     * @return
     */
    int deleteHotel_ding(int hoteldd_id);
}
