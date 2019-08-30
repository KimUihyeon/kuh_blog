package com.web.kuh.blog.board;


import com.web.kuh.blog.board.service.BoardService;
import com.web.kuh.blog.board.vo.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/board")
public class BoardController {


    @Resource(name = "boardService")
    private BoardService boardService;


    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public String detailPage(@RequestParam Map<String, Object> req, Model model){
        int pk =Integer.parseInt(req.get("id").toString());

        model.addAttribute("id",pk);
        return "board/read";
    }


    @RequestMapping(value = "/read", method = RequestMethod.POST)
    public @ResponseBody BoardVO boardDetail(@RequestParam Map<String, Object> req){
        int pk =Integer.parseInt(req.get("id").toString());

        return boardService.read(pk);
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.POST)
    public @ResponseBody List<BoardVO> boardList(@RequestParam Map<String, Object> req){
        return boardService.list(req);
    }
}
