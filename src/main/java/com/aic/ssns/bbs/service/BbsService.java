package com.aic.ssns.bbs.service;

import com.aic.ssns.bbs.mapper.BbsMapper;
import com.aic.ssns.bbs.model.BbsVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BbsService {

    private final BbsMapper bbsMapper;

    public List<BbsVO> selectBbsList(BbsVO bbsVO) {
        return bbsMapper.selectBbsList(bbsVO);
    }

}
