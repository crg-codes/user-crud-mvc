package org.test.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.test.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
