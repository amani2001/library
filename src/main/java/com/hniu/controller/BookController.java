package com.hniu.controller;

import com.hniu.constan.StateCode;
import com.hniu.entity.Books;
import com.hniu.entity.wrap.PageWrap;
import com.hniu.exception.SystemErrorException;
import com.hniu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController extends Base {

    @Autowired
    BookService bs;

    @GetMapping("/books")
    public Object selectAll(Integer pageNum, Integer pageSize) {
        PageWrap data = bs.selectAll(pageNum, pageSize);
        return packaging(StateCode.SUCCESS, data);
    }

    @GetMapping("/books/{id}")
    public Object selectByPrimaryKey(@PathVariable("id") Integer id) {
        return packaging(StateCode.SUCCESS, bs.selectByPrimaryKeyVo(id));
    }

    @PostMapping("/books")
    public Object insert(@RequestBody Books books) {
        try {
            return packaging(StateCode.SUCCESS, bs.insert(books));
        } catch (SystemErrorException e) {
            return packaging(StateCode.FAIL, books);
        }
    }

    @PutMapping("books/{id}")
    public Object update(@PathVariable("id") Integer id, @RequestBody Books books) {
        books.setBookId(id);
        if (bs.update(books) > 0)
            return packaging(StateCode.SUCCESS, books);
        else
            return packaging(StateCode.FAIL, books);
    }

    @DeleteMapping("/books/{id}")
    public Object delete(@PathVariable("id") Integer id) {
        int i = bs.delete(id);
        if (i > 0)
            return packaging(StateCode.SUCCESS, null);
        else
            return packaging(StateCode.FAIL, null);

    }


}
