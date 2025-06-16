package com.welab.k8s_backend_post.service.aop;

import com.welab.k8s_backend_post.domain.repository.PostCommentRepository;
import com.welab.k8s_backend_post.event.producer.KafkaMessageProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class PostCommentUpdateEventAop {
    private final PostCommentRepository postCommentRepository;
    private final KafkaMessageProducer kafkaMessageProducer;

//    @AfterReturning(
//            value = "execution(* com.welab.backend_post.service.PostService.*AndNotify(..))",
//            returning = "actionAndId"
//    )
//    public void publishPostCommentUpdateEvent(JoinPoint joinPoint, ActionAndId actionAndId) {
//        publishPostCommentUpdateEvent(actionAndId);
//    }

//    public void publishPostCommentUpdateEvent(ActionAndId actionAndId) {
//        try {
//            PostComment postComment = PostCommentRepository.
//                    .orElse(null);
//            if (siteUser == null) {
//                return;
//            }
//            SiteUserInfoEvent event = SiteUserInfoEvent.fromEntity(actionAndId.getAction(), siteUser);kafkaMessageProducer.send(SiteUserInfoEvent.Topic, event);
//        } catch (Exception e) {
//            log.warn("사용자 정보 업데이트 이벤트를 전송하지 못하였습니다. id={}", actionAndId.getId());
//        }
//    }
}
