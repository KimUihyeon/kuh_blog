package com.web.kuh.blog.board.service;


import com.web.kuh.blog.board.repositories.IBoardRepository;
import com.web.kuh.blog.board.vo.BoardVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service("boardService")
public class BoardService {

    @Resource(name = "boardRepository")
    private IBoardRepository boardRepository;


    public BoardVO read(int pk){
        List<Integer> ids = new ArrayList<>();
        ids.add(pk);

        Iterable<BoardVO> searchData = boardRepository.findAllById(ids);
        List<BoardVO> aa = new ArrayList();
        searchData.forEach(aa::add); // 이거 공부하기
        return aa.get(0);
    }

    public BoardVO insert(Map<String,Object> reqMap){
        BoardVO vo = new BoardVO(reqMap.get("blog_title").toString()
                                ,reqMap.get("blog_context_md").toString()
                                ,reqMap.get("blog_context_html").toString());
        return boardRepository.save(vo);
    }


    public BoardVO update(Map<String, Object> req) {

        BoardVO vo = new BoardVO(req.get("blog_title").toString()
                                ,req.get("blog_context_md").toString()
                                ,req.get("blog_context_html").toString());
        vo.setId(Integer.parseInt(req.get("blog_id").toString()));
        return boardRepository.save(vo);
    }

    public List<BoardVO> list( Map<String, Object> req){
        List<BoardVO> datas = new ArrayList<>();

        Iterable<BoardVO> iter =  boardRepository.findAll();
        iter.forEach(datas::add);

        return datas;
    }
}
