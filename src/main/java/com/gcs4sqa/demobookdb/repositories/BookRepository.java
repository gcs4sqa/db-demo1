package com.gcs4sqa.demobookdb.repositories;

import com.gcs4sqa.demobookdb.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<
    Book, Long>{}

