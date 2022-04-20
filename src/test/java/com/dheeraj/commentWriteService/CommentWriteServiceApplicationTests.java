package com.dheeraj.commentWriteService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.dheeraj.commentWriteService.model.Comment;
import com.dheeraj.commentWriteService.service.CommentService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommentWriteServiceApplicationTests {

	@Autowired
	CommentService commentService;

	@Test
	void contextLoads() {
	}

	@Test
	void testWriteComment() {
		Comment comment = new Comment();
		comment.setText("hello world");
		comment.setParentId("1234");
		assertNotNull(this.commentService.insertComment(comment));
	}

}
