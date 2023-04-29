package com.lizcal.springapi.repository;

import com.lizcal.springapi.entity.ThemeParkRide;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : iyeong-gyo
 * @package : com.lizcal.springapi.repository
 * @since : 2023/04/29
 */
@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {

  List<ThemeParkRide> findByName(String name);
}
