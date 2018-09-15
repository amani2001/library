package com.hniu.controller;

import com.hniu.constan.StateCode;
import com.hniu.entity.BookTypes;
import com.hniu.exception.SystemErrorException;
import com.hniu.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookTypeController extends Base {

    @Autowired
    BookTypeService bs;

    @GetMapping("/books_type")
    public Object selectAll(Integer pageNum, Integer pageSize) {
        return packaging(StateCode.SUCCESS, bs.selectAll(pageNum, pageSize));
    }

    @GetMapping("/books_type_menu")
    public Object selectAll() {
        return packaging(StateCode.SUCCESS, bs.selectMenus());
    }


    @GetMapping("/books_type/{id}")
    public Object selectByPrimaryKey(@PathVariable("id") Integer id) {
        return packaging(StateCode.SUCCESS, bs.selectByPrimaryKey(id));
    }

    @PostMapping("/books_type")
    public Object insert(@RequestBody BookTypes bookTypes) {
        try {
            return packaging(StateCode.SUCCESS, bs.insert(bookTypes));
        } catch (SystemErrorException e) {
            return packaging(StateCode.FAIL, bookTypes);
        }
    }

    @PutMapping("books_type/{id}")
    public Object update(@PathVariable("id") Integer id, @RequestBody BookTypes bookTypes) {
        bookTypes.setBookTypeId(id);
        if (bs.update(bookTypes) > 0)
            return packaging(StateCode.SUCCESS, bookTypes);
        else
            return packaging(StateCode.FAIL, bookTypes);
    }

    @DeleteMapping("/books_type/{id}")
    public Object delete(@PathVariable("id") Integer id) {
        if (bs.delete(id) > 0)
            return packaging(StateCode.SUCCESS, null);
        else
            return packaging(StateCode.FAIL, null);
    }


}
