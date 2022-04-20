package com.dheeraj.commentWriteService.model;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

@Data
public class Comment {

    private String id;

    private String text;

    private String parentId;

    private String commentParentId;

    private String imageURL;

    private boolean isImage = false;

    private boolean isDeleted = false;

    private String createdBy;

    private LocalDateTime createdOn;

    private boolean isEdited = false;

    private LocalDateTime lastModified;
    
}
