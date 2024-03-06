package com.js.apibo.goods.entity;

import lombok.Builder;

import java.sql.Timestamp;

@Builder
public class GoodsBase {
    private String goodsNo;
    private String goodsName;
    private String goodsDesc;
    private Timestamp sysRegDtm;
    private String sysRegId;
}
