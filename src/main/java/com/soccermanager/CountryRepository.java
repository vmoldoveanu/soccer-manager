package com.soccermanager;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {

    List<Country> findByName(String name);

    Country findById(int id);
}
