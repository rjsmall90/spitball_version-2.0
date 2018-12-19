package com.spitball.spitball_20.repositories

import com.spitball.spitball_20.model.schools.School
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait SchoolRepository extends JpaRepository[School, Long] {
 def findBySchoolName(name : String): School
}
