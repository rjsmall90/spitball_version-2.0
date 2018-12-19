package com.spitball.spitball_20.service.schools

import com.spitball.spitball_20.model.schools.School
import com.spitball.spitball_20.repositories.SchoolRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SchoolService(@Autowired private val schoolRepository: SchoolRepository) {

  def getAllSchools(): java.util.List[School] = {
    schoolRepository.findAll()
  }


  def getSchoolByFirstName(name: String): School = {
    schoolRepository.findBySchoolName(name)

  }

  def createSchool(school: School): String = {
    schoolRepository.saveAndFlush(school)
    school.getSchoolName
  }

  def deleteSchool(id: Long): Unit = {
    schoolRepository.deleteById(id)
  }

  def updateSchool(school: School): Long ={
    schoolRepository.saveAndFlush(school)
    school.getId
  }
}
