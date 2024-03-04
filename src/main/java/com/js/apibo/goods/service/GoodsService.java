package com.js.apibo.goods.service;

import com.js.apibo.goods.dto.response.GoodsDetailResponse;
import com.js.apibo.goods.mapper.GoodsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GoodsService {

    private final GoodsMapper goodsMapper;

    public List<GoodsDetailResponse> getGoodsList() {
        return goodsMapper.getGoodsList();
    }

    public GoodsDetailResponse getGoodsDetail(String goodsNo) {
        return goodsMapper.getGoodsDetail(goodsNo);
    }
}
