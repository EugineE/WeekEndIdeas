//$Id$
package com.wi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
