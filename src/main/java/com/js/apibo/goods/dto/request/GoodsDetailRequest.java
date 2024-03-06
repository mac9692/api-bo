package com.js.apibo.goods.dto.request;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class GoodsDetailRequest {
    private String goodsNo;
    private String goodsName;
    private String goodsDesc;
    private Timestamp sysRegDtm;
    private String sysRegId;

    private GoodsDetailRequest() {}
}
