package com.project.questify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questify.entities.RefreshToken;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long>{

	RefreshToken findByUserId(Long userId);

}
