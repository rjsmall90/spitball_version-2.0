package com.spitball.spitball_20.service.users

import java.util

import com.spitball.spitball_20.model.users.{Teacher, User}
import com.spitball.spitball_20.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TeacherService(@Autowired private val userRepository: UserRepository) {

  def getAllTeachers(): util.List[Teacher] = {
    userRepository.findAll
  }

  def getTeacher(id: Long): Teacher = {
    userRepository.findOne(id)
  }

  def createTeacher(teacher: Teacher): String = {
    userRepository.save(teacher)
    teacher.getEmail
  }

  def deleteTeacher(teacher: Teacher) = {
    userRepository.delete(teacher)
  }

}
