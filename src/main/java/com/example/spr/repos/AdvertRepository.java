package com.example.spr.repos;

import com.example.spr.models.AdvertModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdvertRepository extends CrudRepository<AdvertModel,Long>
{

}
