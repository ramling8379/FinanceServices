package com.fs.repos;

import org.springframework.stereotype.Repository;

import com.fs.pojo.LoanGroup;
import com.fs.repos.base.BaseRepo;

@Repository
public interface LoanGroupRepo extends BaseRepo<LoanGroup, Long>{

}
