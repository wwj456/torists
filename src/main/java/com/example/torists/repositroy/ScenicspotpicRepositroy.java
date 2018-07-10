package com.example.torists.repositroy;

import com.example.torists.bean.Scenicspotpic;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ScenicspotpicRepositroy {

    /**
     * 根据景点查询景点图片
     * @return
     */
    List<Scenicspotpic> findAllScenicspotpic(@Param("sp") int scenicspot_id);

    /**
     * 添加图片
     * @param scenicspotpic
     * @return
     */
    int addScenicspotpic(@Param("sp")Scenicspotpic scenicspotpic);

    /**
     * 修改图片
     * @param scenicspotpic
     * @return
     */
    int updateScenicspotpic(@Param("sp")Scenicspotpic scenicspotpic);

    /**
     * 删除图片
     * @param pic_id
     * @return
     */
    int deleteScenicspotpic(@Param("sp")int pic_id);
}
