package com.spitball.spitball_20.service

import com.spitball.spitball_20.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired

class Student_ParentService(@Autowired private val userRepository: UserRepository) {

}
