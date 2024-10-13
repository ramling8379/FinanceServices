package com.fs.repos;

import org.springframework.stereotype.Repository;

import com.fs.pojo.ExpenseType;
import com.fs.repos.base.BaseRepo;

@Repository
public interface ExpenseTypeRepo extends BaseRepo<ExpenseType, Long>{

}
