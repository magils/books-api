package com.mgil.projects.booksapi.repositories;

import com.mgil.projects.booksapi.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
