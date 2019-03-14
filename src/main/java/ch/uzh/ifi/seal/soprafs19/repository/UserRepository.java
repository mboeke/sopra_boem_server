package ch.uzh.ifi.seal.soprafs19.repository;

import ch.uzh.ifi.seal.soprafs19.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface UserRepository extends CrudRepository<User, Long> {
	User findByPassword(String password);
	User findByUsername(String username);
	User findByToken(String token);
	User findById(long id);
	Boolean existsById(long id);
	Boolean existsByUsername(String username);
	Boolean existsByToken(String token);
}