package com.spitball.spitball_20.model.users

import com.spitball.spitball_20.model.schools.School
import javax.persistence._

import scala.beans.BeanProperty

@Entity
@Table
class Teacher extends User {

  @BeanProperty
  var username: String = _;

  @BeanProperty
  var schoolId: Long = _;

  @BeanProperty
  @ManyToOne
  @JoinColumn(name="schAndTea", nullable=false)
  var school: School = _;


}
