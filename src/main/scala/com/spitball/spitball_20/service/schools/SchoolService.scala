package com.spitball.spitball_20.service.schools

import com.spitball.spitball_20.model.schools.School
import com.spitball.spitball_20.repositories.SchoolRepository
import org.springframework.beans.factory.annotation.Autowired

class SchoolService(@Autowired private val schoolRepository: SchoolRepository ) {

  def getAllSchools(): java.util.List[School] = {
    schoolRepository.findAll()
  }


  def getSchoolByFirstName(name: String): School = {
    schoolRepository.findUserByFirstName(name)

  }

  def createUser(school: School): String = {
    schoolRepository.saveAndFlush(school)
    school.getSchoolName()
  }

  def deleteSchool(id: Long): Unit = {
    schoolRepository.deleteById(id)
  }

  def updateSchool(school: School): Long ={
    schoolRepository.saveAndFlush(teacher)
    teacher.getId
  }
}
