package com.spitball.spitball_20.controller.users

import com.spitball.spitball_20.model.users.{Student_Parent, Teacher, User}
import com.spitball.spitball_20.service.users.{TeacherService}
import javax.sql.DataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpHeaders, HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(path = Array("/tea"))
class TeacherController(@Autowired val teacherService: TeacherService, @Autowired val dataSource: DataSource) {

  @GetMapping(path = Array("/all"))
  def getAllUsers(): java.util.List[User] = {
    teacherService.getAllUsers()
  }

  @GetMapping(path = Array("/{name}"))
  def getUser(@PathVariable name: String): User = {
    teacherService.getUserByFirstName(name)
  }

  @PostMapping(path = Array("/"))
  def createUser(@RequestBody tea: Teacher): ResponseEntity[String] = {
    val email = teacherService.createUser(tea)
    new ResponseEntity(email, new HttpHeaders, HttpStatus.CREATED)
  }

  @DeleteMapping(path = Array("/{id}"))
  def deleteUser(@PathVariable id: Long): Unit = {
    teacherService.deleteUser(id)
  }

  @PutMapping(path = Array("/{id}"))
  def updateUser(@RequestBody tea: Teacher, @PathVariable id: Long): Unit = {
    deleteUser(id)
    val newId = teacherService.updateUser(tea)
  }

}
