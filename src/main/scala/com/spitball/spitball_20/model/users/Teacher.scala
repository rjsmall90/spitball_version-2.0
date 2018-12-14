package com.spitball.spitball_20.model.users

import javax.persistence._

import scala.beans.BeanProperty

@Entity
@Table
class Teacher extends User {

  @BeanProperty
  var username: String = _;

  @BeanProperty
  var schoolId: Long = _;

  //@Column
  //var comments = new Messages();

}
