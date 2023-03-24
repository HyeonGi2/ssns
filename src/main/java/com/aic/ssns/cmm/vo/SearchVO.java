//package com.aic.ssns.cmm.vo;
//
//import lombok.Data;
//
//import java.time.LocalDate;
//
//@Data
//public class SearchVO {
//
//    private String startDate;	// 조회 시작 날짜
//    private String startTime;	// 조회 시작 시간
//    private String endDate;		// 조회 끝 날짜
//    private String endTime;		// 조회 끝 시간
//
//    private String startDt;
//    private String endDt;
//
//    private String searchType;
//    private String searchType1;
//    private String searchType2;
//    private String searchType3;
//    private String searchType4;
//    private String searchType5;
//
//    private String searchText;
//    private String searchText1;
//    private String searchText2;
//    private String searchText3;
//    private String searchText4;
//    private String searchText5;
//
//    private int pagePer;        // 화면당 보여줄 게시물의 수
//    private int pageNavi;		// 하단 네비게이션의 수
//    private int totalNo;		// 총 게시물의 수
//    private int startNo;		// 조회 시작 번호
//    private int pageTotal;		// 총 페이지의 수
//    private int pageNo;			// 현재 페이지의 번호
//    private int pageStart;		// 하단 네비게이션 시작 페이지 번호
//    private int pageEnd;		// 하단 네비게이션 끝 페이지 번호
//
//    // 기본 값 설정
//    public SearchVO() {
//        this.startDate   = ComUtil.ifNull(this.startDate,String.valueOf(LocalDate.now().minusDays(7)));
//        this.startTime   = ComUtil.ifNull(this.startTime, "00:00");
//        this.endDate     = ComUtil.ifNull(this.endDate,  String.valueOf(LocalDate.now()));
//        this.endTime     = ComUtil.ifNull(this.endTime,   "23:59");
//        this.pagePer     = ComUtil.ifNull(this.pagePer,   50);
//        this.pageNavi    = ComUtil.ifNull(this.pageNavi,  5);
//        this.pageNo      = ComUtil.ifNull(this.pageNo,    1);
//
//        if(this.startDate != null) {
//            this.startDt = (this.startDate + "" + this.startTime).replaceAll("\\D", "");
//        }
//
//        if(this.endDate != null) {
//            this.endDt = (this.endDate + "" + this.endTime).replaceAll("\\D", "");
//        }
//    }
//
//    public SearchVO(int totalNo) {
//        this();
//        this.compute(totalNo);
//    }
//
//    // 페이지 네비게이션 설정
//    public void compute(int totalNo) {
//        this.totalNo     = totalNo;
//        this.startNo     = (this.pageNo - 1) * this.pagePer;
//        this.pageTotal   = (int) Math.ceil((double)totalNo / this.pagePer);
//        this.pageStart   = (((this.pageNo - 1) / this.pageNavi) * this.pageNavi) + 1;
//        this.pageEnd     = this.pageStart + this.pageNavi -1;
//    }
//}
