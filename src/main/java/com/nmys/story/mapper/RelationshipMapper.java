package com.nmys.story.mapper;

import com.nmys.story.model.entity.Relationships;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RelationshipMapper {

    /**
     * Description:根据mid来查询relationship
     * Author:70kg
     * Param [mid]
     * Return java.util.List<com.nmys.story.model.entity.Relationships>
     * Date 2018/5/14 16:45
     */
    List<Relationships> getRelationshipByMid(@Param("mid") Integer mid);

    /**
     * Description:根据主键删除关系
     * Author:70kg
     * Param [cid, mid]
     * Return void
     * Date 2018/5/14 16:49
     */
    void delRelationshipById(@Param("cid") Integer cid, @Param("mid") Integer mid);
}
