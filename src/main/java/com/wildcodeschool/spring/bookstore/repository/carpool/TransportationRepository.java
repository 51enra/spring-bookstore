package com.wildcodeschool.spring.bookstore.repository.carpool;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.spring.bookstore.entity.carpool.Transportation;

@Repository
public interface TransportationRepository extends JpaRepository<Transportation, Long>{

}
