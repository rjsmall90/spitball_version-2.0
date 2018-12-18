package com.spitball.spitball_20.service.users

import com.spitball.spitball_20.model.users.{Student_Parent, User}
import com.spitball.spitball_20.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
@Service
class Student_ParentService(@Autowired private val userRepository: UserRepository) {

  def getAllUsers(): java.util.List[User] = {
    userRepository.findAll()
  }


  def getUserByFirstName(name: String): User = {
  userRepository.findUserByFirstName(name)

  }

  def createUser(student_parent: Student_Parent): String = {
    userRepository.saveAndFlush(student_parent)
    student_parent.getEmail
  }

  def deleteUser(id: Long): Unit = {
    userRepository.deleteById(id)
  }

  def updateUser(student_parent: Student_Parent): Long ={
    userRepository.saveAndFlush(student_parent)
    student_parent.getId
  }
}
