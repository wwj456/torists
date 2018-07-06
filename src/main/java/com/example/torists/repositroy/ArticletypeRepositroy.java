package com.example.torists.repositroy;

import com.example.torists.bean.Articletype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ArticletypeRepositroy {

    /**
     * 查询全部新闻类型
     * @return
     */
    List<Articletype> findAllArticletype();
}
