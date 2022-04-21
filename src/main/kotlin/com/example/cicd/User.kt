package com.example.cicd

//import org.springframework.data.annotation.CreatedDate
//import org.springframework.data.annotation.LastModifiedDate
//import org.springframework.data.jpa.domain.support.AuditingEntityListener
//import java.time.LocalDateTime
//import javax.persistence.*
//
//@MappedSuperclass
//@EntityListeners(value = [AuditingEntityListener::class])
//class TimeBase {
//
//    @CreatedDate
//    @Column(name = "created_datetime", insertable = false, updatable = false)
//    lateinit var createdDateTime: LocalDateTime
//
//    @LastModifiedDate
//    @Column(name = "updated_datetime", insertable = false, updatable = false)
//    lateinit var updatedDateTime: LocalDateTime
//}
//
//@Entity
//class User(username: String) {
//    @Id
//    @GeneratedValue
//    val id: Long? = null
//    val username: String = username
//}
