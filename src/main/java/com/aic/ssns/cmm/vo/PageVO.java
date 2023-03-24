//package com.aic.ssns.cmm.vo;
//
//import com.aic.ssns.cmm.util.PageUtil;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//
//import java.time.LocalDate;
//
//@Data
//@EqualsAndHashCode(callSuper=false)
//public class PageVO {
//    private String use_yn;
//    private String del_yn;
//    private String frst_reg_dt;
//    private String frst_rgtr;
//    private String last_mdfcn_dt;
//    private String last_mdfr;
//
//    private String error;
//
//    // 검색조건
//    private String startDate;	// 시작일
//    private String startTime;	// 시작시간
//    private String endDate;		// 종료일
//    private String endTime;		// 종료시간
//    private String startDt;		// 시작일시(특수문자제거)
//    private String endDt;		// 종료일시(특수문자제거)
//    private String searchType;	// 검색유형
//    private String searchType1;	// 검색유형1
//    private String searchType2;	// 검색유형2
//    private String searchType3;	// 검색유형3
//    private String searchText;	// 검색어
//    private String searchText1;	// 검색어1
//    private String searchText2;	// 검색어2
//    private String searchText3;	// 검색어3
//
//
//    // 페이징
//    private int pagePer;    // 화면당 보여줄 게시물의 수
//    private int pageNavi;	// 하단 네비게이션의 수
//    private int totalNo;	// 총 게시물의 수
//    private int startNo;	// 조회 시작 번호
//    private int pageTotal;	// 총 페이지의 수
//    private int pageNo;		// 현재 페이지의 번호
//    private int pageStart;	// 하단 네비게이션 시작 페이지 번호
//    private int pageEnd;	// 하단 네비게이션 끝 페이지 번호
//
//    public PageVO() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if(authentication != null && !authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ANONYMOUS"))) {
//            UserVO user = (UserVO) authentication.getPrincipal();
//            this.frst_rgtr = user.getUser_id();
//            this.last_mdfr = user.getUser_id();
//        }
//
//        // 검색조건 기본값 설정
//        this.startDate   = PageUtil.ifNull(this.startDate,String.valueOf(LocalDate.now().minusDays(7)));
//        this.startTime   = PageUtil.ifNull(this.startTime, "00:00");
//        this.endDate     = PageUtil.ifNull(this.endDate,  String.valueOf(LocalDate.now()));
//        this.endTime     = PageUtil.ifNull(this.endTime,   "23:59");
//        this.pagePer     = PageUtil.ifNull(this.pagePer,   50);
//        this.pageNavi    = PageUtil.ifNull(this.pageNavi,  5);
//        this.pageNo      = PageUtil.ifNull(this.pageNo,    1);
//    }
//
//    public void searchDate() {
//        // 시작종료일시 병합 및 특수문자 제거
//        if(this.startDate != null && this.startTime != null) 	this.startDt = (this.startDate + "" + this.startTime).replaceAll("\\D", "");
//        if(this.endDate != null && this.endTime != null) 		this.endDt = (this.endDate + "" + this.endTime).replaceAll("\\D", "");
//    }
//
//    public void pagination(int totalNo) {
//        this.totalNo     = totalNo;
//        this.startNo     = (this.pageNo - 1) * this.pagePer;
//        this.pageTotal   = (int) Math.ceil((double)totalNo / this.pagePer);
//        this.pageStart   = (((this.pageNo - 1) / this.pageNavi) * this.pageNavi) + 1;
//        this.pageEnd     = this.pageStart + this.pageNavi -1;
//    }
//}
