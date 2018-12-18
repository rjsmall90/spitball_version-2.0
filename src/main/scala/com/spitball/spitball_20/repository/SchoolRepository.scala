package com.spitball.spitball_20.repositories

import com.spitball.spitball_20.model.schools.School
import org.springframework.data.jpa.repository.JpaRepository

class SchoolRepository  extends JpaRepository[School, Long] {

}
