package com.spitball.spitball_20.model.users

import javax.persistence._

import scala.beans.BeanProperty

@Entity
@Table (name = "`Users`")
abstract class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var id: Long = _;

  @BeanProperty
  var firstName: String = _;

  @BeanProperty
  var lastName: String = _;

  @BeanProperty
  var email: String = _;

  @BeanProperty
  var password: String = _;

}

