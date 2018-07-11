package com.example.torists.service.Impl;

import com.example.torists.bean.Hotel;
import com.example.torists.repositroy.HotelRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.torists.service.HotelService;

import java.util.List;

public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepositroy hotelRepositroy;
    @Override
    public List<Hotel> findAllHotel() {
        return hotelRepositroy.findAllHotel();
    }

    @Override
    public int addHotel(Hotel hotel) {
        return hotelRepositroy.addHotel(hotel);
    }

    @Override
    public int updateHptel(Hotel hotel) {
        return hotelRepositroy.updateHptel(hotel);
    }

    @Override
    public int deleteHotel(int hotel_id) {
        return hotelRepositroy.deleteHotel(hotel_id);
    }
}
