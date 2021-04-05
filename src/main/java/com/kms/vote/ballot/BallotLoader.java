package com.kms.vote.ballot;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Component // <1>
public class BallotLoader implements CommandLineRunner { // <2>

    private final BallotRepository repository;

    @Autowired // <3>
    public BallotLoader(BallotRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception { // <4>
        this.repository.save(new Ballot(new Date(), new Date(), "투표하자"));
    }
}
// end::code[]