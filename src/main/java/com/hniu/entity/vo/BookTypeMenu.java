package com.hniu.entity.vo;

import com.hniu.entity.BookTypes;

import java.util.List;

public class BookTypeMenu extends BookTypes {
    private List<BookTypeMenu> bookTypes;

    public List<BookTypeMenu> getBookTypes() {
        return bookTypes;
    }

    public void setBookTypes(List<BookTypeMenu> bookTypes) {
        this.bookTypes = bookTypes;
    }

}
