package com.example.gongbu;


import org.springframework.data.jpa.repository.JpaRepository;

//레포지토리
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
