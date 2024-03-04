package com.js.apibo.goods.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class GoodsDetailResponse {
    private String goodsNo;
    private String goodsName;
    private String goodsDesc;
    private Timestamp sysRegDtm;
    private String sysRegId;
}
