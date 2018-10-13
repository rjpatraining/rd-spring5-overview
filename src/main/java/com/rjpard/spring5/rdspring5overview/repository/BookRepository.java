package com.rjpard.spring5.rdspring5overview.repository;

import org.springframework.data.repository.CrudRepository;

import com.rjpard.spring5.rdspring5overview.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
