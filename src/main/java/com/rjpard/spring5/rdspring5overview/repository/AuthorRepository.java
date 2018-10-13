package com.rjpard.spring5.rdspring5overview.repository;


import org.springframework.data.repository.CrudRepository;

import com.rjpard.spring5.rdspring5overview.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
