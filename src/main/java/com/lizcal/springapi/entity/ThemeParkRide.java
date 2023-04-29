package com.lizcal.springapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : iyeong-gyo
 * @package : com.lizcal.springapi.entity
 * @since : 2023/04/29
 */
@Entity
@Getter
@ToString
@NoArgsConstructor
public class ThemeParkRide {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;
  private String name;
  private String description;
  private int thrillFactor;
  private int vomitFactor;

  public ThemeParkRide(String name, String description, int thrillFactor, int vomitFactor) {
    this.name = name;
    this.description = description;
    this.thrillFactor = thrillFactor;
    this.vomitFactor = vomitFactor;
  }

}