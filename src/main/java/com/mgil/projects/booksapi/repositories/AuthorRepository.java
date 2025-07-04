package com.mgil.projects.booksapi.repositories;

import com.mgil.projects.booksapi.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
