package com.taotao.mapper;

import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemDao {
    int countByExample(TbItemQuery example);

    int deleteByExample(TbItemQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    List<TbItem> selectByExampleWithBLOBs(TbItemQuery example);

    List<TbItem> selectByExample(TbItemQuery example);

    TbItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemQuery example);

    int updateByExampleWithBLOBs(@Param("record") TbItem record, @Param("example") TbItemQuery example);

    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemQuery example);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKeyWithBLOBs(TbItem record);

    int updateByPrimaryKey(TbItem record);
}