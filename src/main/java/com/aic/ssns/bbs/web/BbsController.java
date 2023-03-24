/**
 * 파일명           : BbsController.java
 * 기능             : 클라이언트의 요청을 받아 게시판 기능을 담당하는 BbsService 파일을 호출.
 * 작성자           : 홍현기 사원
 * 최종 작성일      : 2023.03.24

 * 개정이력
 * 작성일자           작성자           개정내용
 * 2023.03.24        홍현기 사원       내용
*/

package com.aic.ssns.bbs.web;

import com.aic.ssns.bbs.model.BbsVO;
import com.aic.ssns.bbs.service.BbsService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BbsController {

    private final BbsService bbsService;

    // 게시판 페이지 이동
    @GetMapping("/bbs/bbsList")
    @ResponseBody
    public List<BbsVO> bbsList(Model model, BbsVO bbsVO) {
        return bbsService.bbsList(bbsVO);
        }

    @PostMapping("/bbs/bbsDelete/")
    public String bbsDelete(@RequestParam("bbsId") String bbsId, RedirectAttributes delete) {
        delete.addFlashAttribute("result");

        return "redirect:/bbs/bbsList";
    }

//    @PostMapping("/bbs/bbsWrite")
//    public String bbsWrite() {
//        return "bbs/bbsWrite";
//    }



    }

    // 타임리프 fragment 를 이용한 view 매핑
//    @PostMapping("/bbs/selectBbsList")
//    @ResponseBody
//    public List<BbsVO> selectBbsList(Model model, BbsVO bbsVO) {
//        return bbsService.selectBbsList(bbsVO);
//    }

    // 타임리프 fragment 를 이용한 view 매핑(toast ui grid)
//    @PostMapping("/bbs/selectBbsList_fragment")
//    public ResponseEntity<?> selectBbsList_fragment(Model model, BbsVO bbsVO) {
//        List<BbsVO> bbsList = bbsService.selectBbsList(bbsVO);
//        return new ResponseEntity<>(bbsList, HttpStatus.OK);
//    }

    // 타임리프 fragment 를 이용한 view 매핑
/**    @PostMapping("/bbs/selectBbsList_fragment")
    public String selectBbsList_fragment(Model model, BbsVO bbsVO) {
        model.addAttribute("bbsList", bbsService.selectBbsList(bbsVO));
        return "/bbs/bbsList :: #bbsTable";
    }
*/


//  게시판 작성글 상세페이지 이동
//    @GetMapping("/bbs/selectBbsDetail")
//    public String selectBbsDetail(@RequestParam("BBS_ID") String BBS_ID, Model model) {
//        model.addAttribute("detail", bbsService.selectBbsDetail(BBS_ID));
//        return "bbs/selectBbsDetail";
//    }

//  게시글 작성 화면
//    @GetMapping("/bbs/bbsWrite")
//    public String save() {
//        return "bbs/bbsWrite";
//    }


