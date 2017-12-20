package com.taotao.service.impl;

import com.taotao.mapper.TbItemDao;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品管理服务
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
   private TbItemDao tbItemDao;
    @Override
    public TbItem getItemById(Integer itemId) {

        return tbItemDao.selectByPrimaryKey(itemId);
    }
}
