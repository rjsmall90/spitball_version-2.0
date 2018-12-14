package com.spitball.spitball_20.model.schools

import com.spitball.spitball_20.model.users.Teacher
import javax.persistence._

import scala.beans.BeanProperty
import scala.collection.mutable

@Entity
class School {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: Long = _;

  @BeanProperty
  var schoolName: String = _;

  @BeanProperty
  var districtName: String = _;

  @BeanProperty
  var location: String = _;
  @BeanProperty
  var bulletinBoard = new mutable.MutableList();
//
//@BeanProperty
//  @OneToMany(targetEntity = Class[Teacher], mappedBy = "schoolId", fetch = FetchType.LAZY)
//  var teachers = new mutable.MutableList();

}
