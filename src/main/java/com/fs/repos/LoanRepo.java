package com.fs.repos;

import org.springframework.stereotype.Repository;

import com.fs.pojo.Loan;
import com.fs.repos.base.BaseRepo;

@Repository
public interface LoanRepo extends BaseRepo<Loan, Long>{

}
