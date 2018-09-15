package com.hniu.mapper;

import com.hniu.entity.Books;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface BooksMapper extends Mapper<Books> {
}