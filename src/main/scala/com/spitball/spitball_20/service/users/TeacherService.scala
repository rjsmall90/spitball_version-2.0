package com.spitball.spitball_20.service.users

import com.spitball.spitball_20.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired

class TeacherService(@Autowired private val userRepository: UserRepository) {

}
