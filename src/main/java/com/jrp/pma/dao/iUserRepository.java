package com.jrp.pma.dao;
import org.springframework.data.repository.CrudRepository;
import com.jrp.pma.entities.User;
import java.util.List;

public interface iUserRepository extends CrudRepository<User, Long> {

	@Override
	public List<User>findAll();

}
