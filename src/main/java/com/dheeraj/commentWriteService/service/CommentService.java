package com.dheeraj.commentWriteService.service;

import com.dheeraj.commentWriteService.model.Comment;

public interface CommentService {

    public Comment insertComment(Comment comment);

    public Comment updateComment(Comment comment);
}
