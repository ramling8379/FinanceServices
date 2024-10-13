package com.fs.repos;

import org.springframework.stereotype.Repository;

import com.fs.pojo.Account;
import com.fs.repos.base.BaseRepo;

@Repository
public interface AccountRepo extends BaseRepo<Account, Long>{

}
