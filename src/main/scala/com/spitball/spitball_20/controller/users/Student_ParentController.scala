package com.spitball.spitball_20.controller.users

import com.spitball.spitball_20.model.users.{Student_Parent, User}
import com.spitball.spitball_20.service.users.Student_ParentService
import javax.sql.DataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpHeaders, HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(path = Array("/sp"))
class Student_ParentController(@Autowired val student_parentService: Student_ParentService, @Autowired val dataSource: DataSource) {

  @GetMapping(path = Array("/all"))
  def getAllUsers(): java.util.List[User] = {
    student_parentService.getAllUsers()
  }

  @GetMapping(path = Array("/{name}"))
  def getUser(@PathVariable name: String): User = {
    student_parentService.getUserByFirstName(name)
  }

  @PostMapping(path = Array("/"))
  def createUser(@RequestBody sp: Student_Parent): ResponseEntity[String] = {
    val email = student_parentService.createUser(sp)
    new ResponseEntity(email, new HttpHeaders, HttpStatus.CREATED)
  }

  @DeleteMapping(path = Array("/{id}"))
  def deleteUser(@PathVariable id: Long): Unit = {
    student_parentService.deleteUser(id)
  }

  @PutMapping(path = Array("/{id}"))
  def updateUser(@RequestBody sp: Student_Parent): Unit = {
    val id = student_parentService.updateUser(sp)
  }

}
