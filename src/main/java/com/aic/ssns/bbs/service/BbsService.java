/**
 * 파일명           : BbsService.java
 * 기능             : BbsController에서 요청을 받아 BbsMapper를 이용하여, 게시판 기능 클래스들의 비즈니스 로직을 수행.
 * 작성자           : 홍현기 사원
 * 최종 작성일      : 2023.03.24

 * 개정이력
 * 작성일자           작성자           개정내용
 * 2023.03.24        홍현기 사원       내용
*/

package com.aic.ssns.bbs.service;

import com.aic.ssns.bbs.mapper.BbsMapper;
import com.aic.ssns.bbs.model.BbsVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 비즈니스 로직을 수행하기 위한 서비스 어노테이션, 생성하지 않으면 Service의 기능 상실
@RequiredArgsConstructor
public class BbsService {

    private final BbsMapper bbsMapper;

    /** 게시글 리스트 출력을 위한 비즈니스 로직 */
    public List<BbsVO> selectBbsList(BbsVO bbsVO) {
        return bbsMapper.selectBbsList(bbsVO);
    }
    public List<BbsVO> bbsList(BbsVO bbsVO) {
        return bbsMapper.bbsList(bbsVO);
    }

    public String deleteBbs(String bbsId) {
        return bbsMapper.deleteBbs(bbsId);
    }

    /** 게시글 상세페이지 출력을 위한 비즈니스 로직 */

//    public BbsVO selectBbsDetail(BbsVO bbsVO) {
//        return bbsMapper.selectBbsDetail(bbsVO);
//    }


}
