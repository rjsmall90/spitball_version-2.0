package com.spitball.spitball_20.model.users

import javax.persistence.{Column, Entity, OneToMany}

@Entity
class Teacher extends User {

  @Column(name = "username")
  var username: String = _;

  @Column(name = "schoolId")
  var schoolId: Long = _ ;

  //@Column
  //var comments = new Messages();

}
