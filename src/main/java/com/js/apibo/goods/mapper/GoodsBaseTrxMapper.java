package com.js.apibo.goods.mapper;

import com.js.apibo.goods.entity.GoodsBase;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsBaseTrxMapper {
    Integer insertGoodsBase(GoodsBase request);
}
