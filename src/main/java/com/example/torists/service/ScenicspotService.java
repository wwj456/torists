package com.example.torists.service;

import com.example.torists.bean.Scenicspot;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ScenicspotService {
    /**
     * 查询全部景点
     * @return
     */
    List<Scenicspot> findAllScenicspot();

    /**
     * 添加景点
     * @param scenicspot
     * @return
     */
    int addScenicspot(Scenicspot scenicspot);

    /**
     * 修改景点
     * @param scenicspot
     * @return
     */
    int updateScenicspot(Scenicspot scenicspot);

    /**
     * 删除景点
     * @param scenicspot_id
     * @return
     */
    int deleteScenicspot(int scenicspot_id);

}
