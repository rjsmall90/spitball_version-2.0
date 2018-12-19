package com.spitball.spitball_20.controller.users

import com.spitball.spitball_20.model.schools.School
import com.spitball.spitball_20.service.schools.SchoolService
import javax.sql.DataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpHeaders, HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation._


@RestController
@RequestMapping(path = Array("/sch"))
class SchoolController(@Autowired val schoolService: SchoolService, @Autowired val dataSource: DataSource) {

  @GetMapping(path = Array("/all"))
  def getAllUsers(): java.util.List[School] = {
    schoolService.getAllSchools()
  }

  @GetMapping(path = Array("/{name}"))
  def getUser(@PathVariable name: String): School = {
    schoolService.getSchoolByFirstName(name)
  }

  @PostMapping(path = Array("/"))
  def createUser(@RequestBody school: School): ResponseEntity[String] = {
    val email = schoolService.createSchool(school)
    new ResponseEntity(email, new HttpHeaders, HttpStatus.CREATED)
  }

  @DeleteMapping(path = Array("/{id}"))
  def deleteUser(@PathVariable id: Long): Unit = {
    schoolService.deleteSchool(id)
  }

  @PutMapping(path = Array("/{id}"))
  def updateUser(@RequestBody school: School, @PathVariable id: Long): Unit = {
    deleteUser(id)
    val newId = schoolService.updateSchool(school)


  }

}

