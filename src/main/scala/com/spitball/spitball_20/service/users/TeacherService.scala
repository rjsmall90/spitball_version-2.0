package com.spitball.spitball_20.service.users

import com.spitball.spitball_20.model.users.{Teacher, User}
import com.spitball.spitball_20.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
@Service
class TeacherService(@Autowired private val userRepository: UserRepository) {

  def getAllUsers(): java.util.List[User] = {
    userRepository.findAll()
  }


  def getUserByFirstName(name: String): User = {
    userRepository.findUserByFirstName(name)

  }

  def createUser(teacher: Teacher): String = {
    userRepository.saveAndFlush(teacher)
    teacher.getEmail
  }

  def deleteUser(id: Long): Unit = {
    userRepository.deleteById(id)
  }

  def updateUser(teacher: Teacher): Long ={
    userRepository.saveAndFlush(teacher)
    teacher.getId
  }
}
