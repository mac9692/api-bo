package com.js.apibo.goods.controller;

import com.js.apibo.goods.dto.response.GoodsDetailResponse;
import com.js.apibo.goods.service.GoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("goods")
@RequiredArgsConstructor
public class GoodsController {

    private final GoodsService goodsService;

    @GetMapping("list")
    public List<GoodsDetailResponse> getGoodsList() {
        return goodsService.getGoodsList();
    }

    @GetMapping("{goodsNo}")
    public GoodsDetailResponse getGoodsDetail(@PathVariable("goodsNo") String goodsNo) {
        return goodsService.getGoodsDetail(goodsNo);
    }
}
