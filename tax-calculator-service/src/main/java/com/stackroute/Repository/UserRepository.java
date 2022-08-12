package com.stackroute.Repository;

import com.stackroute.TaxModel.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<Tax,Long> {
    Optional<Tax> findTaxById(Long id);
}
