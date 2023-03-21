package com.aic.ssns.bbs.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class BbsVO {

    private String bbsId;
    private String bbsTitle;
    private String bbsContent;
    private String regDt;
    private String regId;
    private String updDt;
    private String updId;

}
