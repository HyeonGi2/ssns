/**
 * 파일명           : BbsMapper.java
 * 기능             : 실제 게시판 SQL 쿼리가 저장 되어있는 BbsMapper.xml을 호출하기 위한 인터페이스 역할.
 * 작성자           : 홍현기 사원
 * 최종 작성일      : 2023.03.24

 * 개정이력
 * 작성일자           작성자           개정내용
 * 2023.03.24        홍현기 사원       내용
*/

package com.aic.ssns.bbs.mapper;

import com.aic.ssns.bbs.model.BbsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BbsMapper {
//  게시글 리스트 출력
    List<BbsVO> selectBbsList(BbsVO bbsVO);
    List<BbsVO> bbsList(BbsVO bbsVO);


//  BbsVO selectBbsDetail(String bbsId); 게시글 상세페이지 출력

//  게시글 작성 페이지 출력
//    List<BbsVO> bbsWrite(BbsVO bbsVO);

    int selectBbsListCount(BbsVO bbsVO);

    BbsVO selectBbsDetail(BbsVO bbsVO);

    List<BbsVO> selectBbsLnkList(BbsVO bbsVO);

    int insertBbs(BbsVO bbsVO);

    int updateBbs(BbsVO bbsVO);

    String deleteBbs(String bbsId);

    int insertBbsLnk(BbsVO bbsVO);

    int deleteBbsLnk(BbsVO bbsVO);

}
/**
    List<ComComboVO> selectQnaClaCombo(ComComboVO comComboVO);

    int refactMoveBbs(BbsVO bbsVO);

    int refactCopyBbs(BbsVO bbsVO);

    int refactCopyBbsLnk(BbsVO bbsVO);

    int revisionBbs(BbsVO bbsVO);

    int revisionBbsLnk(BbsVO bbsVO);
*/

