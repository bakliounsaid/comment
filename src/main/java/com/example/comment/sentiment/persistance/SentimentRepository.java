package com.example.comment.sentiment.persistance;

import com.example.comment.sentiment.models.SentimentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SentimentRepository extends JpaRepository<SentimentEntity, Integer> {


}
