package service;

import com.example.torists.bean.scenicspotpic;

import java.util.List;

public interface ScenicspotpicService {
    /**
     * 根据景点查询景点图片
     * @return
     */
    List<scenicspotpic> findAllScenicspotpic(int scenicspot_id);

    /**
     * 添加图片
     * @param scenicspotpic
     * @return
     */
    int addScenicspotpic(scenicspotpic scenicspotpic);

    /**
     * 修改图片
     * @param scenicspotpic
     * @return
     */
    int updateScenicspotpic(scenicspotpic scenicspotpic);

    /**
     * 删除图片
     * @param pic_id
     * @return
     */
    int deleteScenicspotpic(int pic_id);
}
