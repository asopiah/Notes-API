package repository;


import model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //This tells Spring to bootstrap the repository during component scan.
public interface NoteRepository extends JpaRepository<Note, Long> {
/*
*
* NB: I'll now be able to use JpaRepository’s methods like save(), findOne(), findAll(), count(), delete() etc
* I don’t need to implement these methods. They are already implemented by Spring Data JPA’s SimpleJpaRepository.
* This implementation is plugged in by Spring automatically at runtime
*
* All the implimeted method can be checked out 0n the below link
*  http://docs.spring.io/autorepo/docs/spring-data-jpa/current/api/org/springframework/data/jpa/repository/support/SimpleJpaRepository.html
* */
}
