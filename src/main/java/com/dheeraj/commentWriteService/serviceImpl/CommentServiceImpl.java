package com.dheeraj.commentWriteService.serviceImpl;

import com.dheeraj.commentWriteService.model.Comment;
import com.dheeraj.commentWriteService.producer.CommentProducer;
import com.dheeraj.commentWriteService.service.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentProducer producer;

    @Override
    public Comment insertComment(Comment comment) {
        this.producer.sendComment(comment);
        return comment;
    }

    @Override
    public Comment updateComment(Comment comment) {
        comment.setEdited(true);
        this.producer.sendComment(comment);
        return comment;
    }
    
}
