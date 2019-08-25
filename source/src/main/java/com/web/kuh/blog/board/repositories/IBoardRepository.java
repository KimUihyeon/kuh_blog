package com.web.kuh.blog.board.repositories;

import com.web.kuh.blog.board.vo.BoardVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("boardRepository")
public interface IBoardRepository extends CrudRepository<BoardVO, Integer> {
}
