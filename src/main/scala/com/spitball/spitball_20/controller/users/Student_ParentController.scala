package com.spitball.spitball_20.controller.users

import com.spitball.spitball_20.service.Student_ParentService
import javax.sql.DataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
@RequestMapping(path = Array("/other_users"))
class Student_ParentController(@Autowired val student_parentService: Student_ParentService, @Autowired val dataSource: DataSource) {



}
