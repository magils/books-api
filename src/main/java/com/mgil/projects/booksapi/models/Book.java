package com.mgil.projects.booksapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private long id;
}
