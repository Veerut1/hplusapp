package com.hplus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hplus.beans.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
