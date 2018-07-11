package com.example.torists.service;

import com.example.torists.bean.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface HotelService {

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
        int addHotel(Hotel hotel);

        /**
         * 修改酒店信息
         * @param hotel
         * @return
         */
        int updateHptel(Hotel hotel);

        /**
         * 删除酒店信息
         * @param hotel_id
         * @return
         */
        int deleteHotel(int hotel_id);
}
