package com.example.bookstoremanagement.repository;
import com.example.bookstoremanagement.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolesRepository extends JpaRepository<Roles,Long> {
}
