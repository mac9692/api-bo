package com.js.apibo.goods.mapper;

import com.js.apibo.goods.dto.response.GoodsDetailResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {

    List<GoodsDetailResponse> getGoodsList();

    GoodsDetailResponse getGoodsDetail(String goodsNo);
}
