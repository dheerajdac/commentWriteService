package com.dheeraj.commentWriteService.controller;

import com.dheeraj.commentWriteService.model.Comment;
import com.dheeraj.commentWriteService.service.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class CommentWriteController {
    
    @Autowired
    CommentService commentService;

    @GetMapping
    public String get(){
        return "hello world";
    }

    @PostMapping
    public Comment insertComment(@RequestBody Comment comment){
        return this.commentService.insertComment(comment);
    }

    @PatchMapping
    public Comment updaComment(@RequestBody Comment comment){
        return this.commentService.updateComment(comment);
    }
}
