package com.aic.ssns.bbs.mapper;

import com.aic.ssns.bbs.model.BbsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BbsMapper {

    List<BbsVO> selectBbsList(BbsVO bbsVO);

}
