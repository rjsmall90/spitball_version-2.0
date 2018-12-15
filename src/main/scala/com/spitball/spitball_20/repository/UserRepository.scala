package com.spitball.spitball_20.repository

import com.spitball.spitball_20.model.users.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait UserRepository extends JpaRepository[User, Long] {

}
