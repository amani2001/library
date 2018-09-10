package com.hniu.controller;


import com.hniu.constan.StateCode;
import com.hniu.entity.State;


public class Base<T> {

    /**
     * 状态包装
     */
    public Object packaging(StateCode stateCode, T data) {
        return new State<T>(stateCode.getState(), stateCode.getMessage(), data);
    }
}
