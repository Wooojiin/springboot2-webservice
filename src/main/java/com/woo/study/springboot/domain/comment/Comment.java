package com.woo.study.springboot.domain.comment;

import com.woo.study.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Comment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long postsId;

    private String content;

    private String author;

    @Builder
    public Comment(Long postsId, String content, String author){
        this.postsId = postsId;
        this.content = content;
        this.author = author;
    }
}
