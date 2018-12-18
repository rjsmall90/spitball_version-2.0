package com.spitball.spitball_20.model.users

import javax.persistence.Entity

import scala.beans.BeanProperty

@Entity
class
Student_Parent extends User {

  @BeanProperty
  var username: String = _;

}
