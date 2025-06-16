package com.welab.k8s_backend_post.domain.event;

import com.welab.k8s_backend_post.domain.PostComment;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostCommentCreateEvent {
    public static final String Topic = "comment";

    private String action;

    private Long postId;

    private String comment;

    private LocalDateTime eventTime;

    public static PostCommentCreateEvent fromEntity(String action, PostComment postComment) {
        PostCommentCreateEvent message = new PostCommentCreateEvent();

        message.action = action;
        message.postId = postComment.getId();
        message.comment = postComment.getComment();
        message.eventTime = LocalDateTime.now();

        return message;
    }
}
