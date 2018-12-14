package com.spitball.spitball_20.model.schools

import javax.persistence._

import scala.collection.mutable

class School {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long = _;

  @Column(name = "schoolName")
  var schoolName: String = _;

  @Column(name = "schoolDistrict")
  var districtName: String = _;

  @Column(name = "location")
  var location: String = _;

  @Column(name = "bulletinBoard")
  var bulletinBoard = new mutable.MutableList();

  @Column(name = "teachers")
  @ManyToOne
  var teachers = new mutable.MutableList();

}
