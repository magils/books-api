package com.mgil.projects.booksapi.repositories;

import com.mgil.projects.booksapi.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
