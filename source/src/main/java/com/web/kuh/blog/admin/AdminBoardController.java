package com.web.kuh.blog.admin;

import com.web.kuh.blog.board.service.BoardService;
import com.web.kuh.blog.board.vo.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping(value = "/admin/board")
public class AdminBoardController {

    @Resource(name = "boardService")
    private BoardService boardService;

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String inserPage(@RequestParam Map<String, Object> req, Model model){

        model.addAttribute("pageType", "new");
        return "board/form";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public @ResponseBody BoardVO  insert(@RequestParam Map<String, Object> req){
        BoardVO vo =boardService.insert(req);
        return vo;
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String editPage(@RequestParam Map<String, Object> req, Model model){

        model.addAttribute("pageType", "edit");
        model.addAttribute("blog_id",req.get("id"));
        return "board/form";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody BoardVO edit(@RequestParam Map<String, Object> req){

        return boardService.update(req);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String dlete(@RequestParam Map<String, Object> req){

        return "redirect:/admin/";
    }


}
