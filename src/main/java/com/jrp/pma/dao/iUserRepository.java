package com.jrp.pma.dao;
import org.springframework.data.repository.CrudRepository;

import com.jrp.pma.entities.User;

public interface iUserRepository extends CrudRepository<User, Long> {

}
