package com.js.apibo.goods.service;

import com.js.apibo.goods.dto.request.GoodsDetailRequest;
import com.js.apibo.goods.dto.response.GoodsDetailResponse;
import com.js.apibo.goods.entity.GoodsBase;
import com.js.apibo.goods.mapper.GoodsBaseMapper;
import com.js.apibo.goods.mapper.GoodsBaseTrxMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GoodsService {
    private final GoodsBaseMapper goodsBaseMapper;
    private final GoodsBaseTrxMapper goodsBaseTrxMapper;

    public List<GoodsDetailResponse> getGoodsList() {
        return goodsBaseMapper.getGoodsList();
    }

    public GoodsDetailResponse getGoodsDetail(String goodsNo) {
        return goodsBaseMapper.getGoodsDetail(goodsNo);
    }

    public Integer registerGoods(GoodsDetailRequest request) {
        GoodsBase entity = GoodsBase.builder()
                .goodsName(request.getGoodsName())
                .goodsDesc(request.getGoodsDesc())
                .sysRegId("admin")
                .build();

        return goodsBaseTrxMapper.insertGoodsBase(entity);
    }
}
