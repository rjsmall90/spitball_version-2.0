package com.spitball.spitball_20.service

import java.util

import com.spitball.spitball_20.model.users.Student_Parent
import com.spitball.spitball_20.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class Student_ParentService(@Autowired private val userRepository: UserRepository) {

  def getAllUsers(): util.List[Student_Parent] = {
    userRepository.findAll
  }

  def getUsers(id: Long): Student_Parent = {
    userRepository.findOne(id)
  }

  def createUsers(student_parent: Student_Parent): String = {
    userRepository.save(student_parent)
    student_parent.getEmail
  }

  def deleteUsers(student_parent: Student_Parent) = {
    userRepository.delete(student_parent)
  }
}
