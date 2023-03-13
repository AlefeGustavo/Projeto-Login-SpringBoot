package com.login.tela_login.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.login.tela_login.Model.user;

@Repository
public interface UserRepository extends CrudRepository<user,Long>{
    
}
