package com.spitball.spitball_20.model.users

import javax.persistence._

@Entity
abstract class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long = _;

  @Column(name = "firstName")
  var firstName: String = _;

  @Column(name = "lastName")
  var lastName: String = _;

  @Column(name = "email")
  var email: String = _;

  @Column(name = "password")
  var password: String = _;

}

