package com.fs.repos;

import org.springframework.stereotype.Repository;

import com.fs.pojo.BankAccount;
import com.fs.repos.base.BaseRepo;

@Repository
public interface BankAccountRepo extends BaseRepo<BankAccount, Long>{

}
