package app.redditClone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.redditClone.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
