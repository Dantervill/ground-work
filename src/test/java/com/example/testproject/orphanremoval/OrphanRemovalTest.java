package com.example.testproject.orphanremoval;

import com.example.testproject.exception.EntityNotFoundException;
import com.example.testproject.model.orphanremoval.Topic;
import com.example.testproject.repository.CommentRepository;
import com.example.testproject.repository.TopicRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = OrphanRemovalTest.class)
class OrphanRemovalTest {

//    @Autowired
//    private TopicRepository topicRepository;
//
//    @Autowired
//    private CommentRepository commentRepository;
//
//    @Test
//    @Transactional
//    @DisplayName("Если orphanRemoval = true, то при удалении комментария из топика он удаляется из базы")
//    void givenOrphanRemovalTrue_whenRemoveCommentFromTopic_thenItRemovedFromDatabase() {
//        Topic topic = topicRepository.findById(-1L).orElseThrow(() -> {
//            String msg = String.format("Entity with id %d not found", -1L);
//            return new EntityNotFoundException(msg);
//        });
//        topic.removeComment(topic.getComments().get(0));
//
//        Assertions.assertEquals(2, commentRepository.count());
//
//    }
//
//    @Test
//    @Transactional
//    @DisplayName("если orphanRomoval = false, то при удалении комментария из топика остается в базе")
//    void givenOrphanRomovalFalse_whenRemoveCommentFromTopic_thenItRemovedFromDatabase() {
//        Topic topic = topicRepository.findById(-1L).orElseThrow(() -> {
//            String msg = String.format("Entity with id %d not found", -1L);
//            return new EntityNotFoundException(msg);
//        });
//        topic.removeComment(topic.getComments().get(0));
//
//        Assertions.assertEquals(3, commentRepository.count());
//    }
//
//    @Test
//    @Transactional
//    @DisplayName("если CascadeType=REMOVE, то при удалении из базы топика удаляются его комментарии")
//    void givenCascadeTypeIsRemove_whenRemoveTopic_thenCommentsRemoved() {
//        Topic topic = topicRepository.findById(-1L).orElseThrow(() -> {
//            String msg = String.format("Entity with id %d not found", -1L);
//            return new EntityNotFoundException(msg);
//        });
//        topicRepository.delete(topic);
//
//        Assertions.assertEquals(0, commentRepository.count());
//    }
}
