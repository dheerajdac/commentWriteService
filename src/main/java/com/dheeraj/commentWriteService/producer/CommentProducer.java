package com.dheeraj.commentWriteService.producer;

import com.dheeraj.commentWriteService.model.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CommentProducer {
    
    @Autowired
    KafkaTemplate<String, Comment> template;

    public void sendComment(Comment comment){
        this.template.send("comment_CUD", comment);
    }
}
