package com.js.apibo.goods.entity;

import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@Builder
public class GoodsBase {
    private String goodsNo;
    private String goodsName;
    private String goodsDesc;
    private Timestamp sysRegDtm;
    private String sysRegId;
}
