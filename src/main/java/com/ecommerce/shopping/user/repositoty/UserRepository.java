package com.ecommerce.shopping.user.repositoty;

import com.ecommerce.shopping.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
