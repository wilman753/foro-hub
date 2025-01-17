package com.example.foroHub.repository;

import com.example.foroHub.model.topic.Topic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    @Query("SELECT t FROM Topic t WHERE status = 'OPEN'")
    Page<Topic> findOpenTopics(Pageable pageable);
}
