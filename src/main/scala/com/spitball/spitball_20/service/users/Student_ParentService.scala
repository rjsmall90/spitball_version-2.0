package com.spitball.spitball_20.service

import com.spitball.spitball_20.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class Student_ParentService(@Autowired private val userRepository: UserRepository) {

}
