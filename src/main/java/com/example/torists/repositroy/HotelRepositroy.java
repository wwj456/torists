package com.example.torists.repositroy;

import com.example.torists.bean.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HotelRepositroy {
    /**
     * 查询全部酒店
     * @return
     */
    List<Hotel> findAllHotel();

    /**
     * 添加酒店
     * @param hotel
     * @return
     */
    int addHotel(@Param("h") Hotel hotel);

    /**
     * 修改酒店信息
     * @param hotel
     * @return
     */
    int updateHptel(@Param("h")Hotel hotel);

    /**
     * 删除酒店信息
     * @param hotel_id
     * @return
     */
    int deleteHotel(@Param("h")int hotel_id);
}
