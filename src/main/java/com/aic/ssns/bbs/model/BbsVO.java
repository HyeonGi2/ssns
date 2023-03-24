/**
 * 파일명           : BbsVO.java
 * 기능             : 게시판 기능 클래스들이 정보를 공유하기 위한 데이터 값을 저장하고 공유.
 * 작성자           : 홍현기 사원
 * 최종 작성일      : 2023.03.24

 * 개정이력
 * 작성일자           작성자           개정내용
 * 2023.03.24        홍현기 사원       내용
*/

package com.aic.ssns.bbs.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper=false)
public class BbsVO {

    private String bbsId;  // 게시판 ID
    private String bbsTitle; // 게시판 글제목
    private String bbsContent; // 게시판 글내용
    private String regDt; // 작성 시간
    private String regId; // 작성 ID
    private String updDt; // 업데이트 시간
    private String updId; // 업데이트 ID



}
