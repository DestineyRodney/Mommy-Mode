package com.example.newlywed;

import com.example.newlywed.models.User;
import com.example.newlywed.repositories.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTest {
    @Autowired private UserRepository repo;

    @Test
    public void testAddNew() {
        User user = new User();
        user.setEmail("rae.r01@gmail.com");
        user.setUsername("Rae12");
        user.setFirstName("raven");
        user.setLastName("simon");
        user.setAddress("1122 thousand Oak");
        user.setCity("San Antonio");
        user.setState("TX");
        user.setZipcode(72832);
        user.setDateOfBirth("08-03-1998");

//        puts object into database and returns to
        User savedUser = repo.save(user);

        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()
        ).isGreaterThan(0);
    }
    @Test
    public void testListAll() {
        Iterable<User> users = repo.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);

        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testUpdate() {
        Integer userid = 1;
        Optional<User> optionalUser = Optional.ofNullable(repo.findById(userid));
        User user = optionalUser.get();
        user.setUsername("new");

    }

}
