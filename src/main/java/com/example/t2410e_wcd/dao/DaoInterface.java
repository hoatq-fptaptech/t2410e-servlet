package com.example.t2410e_wcd.dao;

import java.util.List;

public interface DaoInterface <S,T>{
    List<S> getAll();
    S create(S s);
    S update(S s);
    Boolean delete(T id);
    S findById(T id);
}
