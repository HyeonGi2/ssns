package com.aic.ssns.bbs.web;

import com.aic.ssns.bbs.model.BbsVO;
import com.aic.ssns.bbs.service.BbsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BbsController {

    private final BbsService bbsService;

    // 게시판 페이지 이동
    @GetMapping("/bbs/bbsList")
    public String bbsList() {
        return "/bbs/bbsList";
    }

    // 타임리프 fragment 를 이용한 view 매핑
    @PostMapping("/bbs/selectBbsList")
    @ResponseBody
    public List<BbsVO> selectBbsList(Model model, BbsVO bbsVO) {
        return bbsService.selectBbsList(bbsVO);
    }

    // 타임리프 fragment 를 이용한 view 매핑
    @PostMapping("/bbs/selectBbsList_fragment")
    public String selectBbsList_fragment(Model model, BbsVO bbsVO) {
        model.addAttribute("bbsList", bbsService.selectBbsList(bbsVO));
        return "/bbs/bbsList :: #bbsTable";
    }

}
