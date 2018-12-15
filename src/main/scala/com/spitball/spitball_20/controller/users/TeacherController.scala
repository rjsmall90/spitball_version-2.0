package com.spitball.spitball_20.controller.users

import com.spitball.spitball_20.service.users.TeacherService
import javax.sql.DataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
@RequestMapping(path = Array("/teacher"))
class TeacherController(@Autowired val teacherService: TeacherService, @Autowired val dataSource: DataSource) {

}
