package com.lizcal.springapi.controller;

import com.lizcal.springapi.entity.ThemeParkRide;
import com.lizcal.springapi.repository.ThemeParkRideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 * @author : iyeong-gyo
 * @package : com.lizcal.springapi.controller
 * @since : 2023/04/29
 */
@RequiredArgsConstructor
@RestController
public class ThemeParkRideController {

  private final ThemeParkRideRepository themeParkRideRepository;

  @GetMapping(value = "/ride", produces = MediaType.APPLICATION_JSON_VALUE)
  public Iterable<ThemeParkRide> getRides() {
    return themeParkRideRepository.findAll();
  }

  @GetMapping(value = "/ride/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ThemeParkRide getRide(@PathVariable long id) {
    return themeParkRideRepository.findById(id).orElseThrow(
        () -> new ResponseStatusException(HttpStatus.NOT_FOUND,
            String.format("Invalid ride id %s", id)));
  }

  @PostMapping(value = "/ride", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ThemeParkRide createRide(@RequestBody ThemeParkRide themeParkRide) {
    return themeParkRideRepository.save(themeParkRide);
  }
}
