package com.web.kuh.blog.board.vo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "board")
public class BoardVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private @Column(name = "title") String title;
    private @Column(name = "context_md") String contextMarkdown;
    private @Column(name = "context_html") String contextHTML;
    private @Column(name = "regDate") Date regDate;
    private @Column(name = "updDate") Date updDate;
    private @Column(name = "clickCount") int clickCount;


    public BoardVO(){}

    public BoardVO(String title, String contextMarkdown, String contextHTML) {
        this.title = title;
        this.contextMarkdown = contextMarkdown;
        this.contextHTML = contextHTML;
    }
}
