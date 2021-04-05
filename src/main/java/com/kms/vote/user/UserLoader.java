package com.kms.vote.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Component // <1>
public class UserLoader implements CommandLineRunner { // <2>

    private final UserRepository repository;

    @Autowired // <3>
    public UserLoader(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception { // <4>
        this.repository.save(new User("nickname", 10, User.Gender.M, "kk@kk.com"));
    }
}
// end::code[]