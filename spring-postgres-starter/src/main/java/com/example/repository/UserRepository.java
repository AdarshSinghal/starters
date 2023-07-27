package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

//    @Cacheable(value = "users", key = "#email")
    Optional<User> findByEmail(String email);

    @Query(value = "UPDATE public.user SET email=?2, name=?3, verified=?4, enabled=?5 WHERE id=?1", nativeQuery = true)
    @Modifying
    @Transactional
    void update(Integer id, String email, String name, boolean verified, boolean enabled);
}
