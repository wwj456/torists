package service;

import com.example.torists.bean.Scenicspot;

import java.util.List;

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
