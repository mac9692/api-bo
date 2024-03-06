package com.js.apibo.goods.dto.response;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class GoodsDetailResponse {
    private String goodsNo;
    private String goodsName;
    private String goodsDesc;
    private Timestamp sysRegDtm;
    private String sysRegId;

    private GoodsDetailResponse() {}
}
