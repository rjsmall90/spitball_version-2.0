package com.spitball.spitball_20.model.users

import com.spitball.spitball_20.model.schools.School
import javax.persistence._

import scala.beans.BeanProperty

@Entity
class Teacher extends User {

  @BeanProperty
  var username: String = _;

  @BeanProperty
  @ManyToOne
  @JoinColumn(name="schAndTea", nullable = true)
  var schoolId: School = _;


  //var school: School = _;


}
