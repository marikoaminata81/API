package com.ami.Apigestion.repository;
import com.ami.Apigestion.Entity.region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface regionDAO extends JpaRepository<region,Integer> {

}
