package com.hniu.controller;

import com.hniu.constan.StateCode;
import com.hniu.entity.Admin;
import com.hniu.entity.wrap.PageWrap;
import com.hniu.exception.NotLoginException;
import com.hniu.exception.PassWordErrorException;
import com.hniu.exception.SystemErrorException;
import com.hniu.exception.UserNameExistException;
import com.hniu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController extends Base{

    @Autowired
    BookService bs;

    @GetMapping("/books")
    public Object selectAll(@RequestBody Integer pageNum, @RequestBody Integer pageSize) {
        PageWrap data = bs.selectAllVo(pageNum, pageSize);
        return packaging(StateCode.SUCCESS, data);
    }

    @GetMapping("/books/{id}")
    public Object selectByPrimaryKey(@PathVariable("id") Integer id) {
        return packaging(StateCode.SUCCESS, bs.selectByPrimaryKeyVo(id));
    }

    @PostMapping("/books")
    public Object insert(@RequestBody Admin admin) {
            return packaging(StateCode.SUCCESS, bs.insert(admin));
    }

    @PutMapping("books/{id}")
    public Object update(@PathVariable("id") Integer id, @RequestBody Admin admin) {
        admin.setAdminId(id);
        return packaging(StateCode.SUCCESS, bs.update(admin));
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
