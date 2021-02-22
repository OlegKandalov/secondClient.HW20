package com.example.client2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.stream.Stream;

@Component
public class BookDAO implements CommandLineRunner {

    private static Long increment = 1L;
    private final BookRepository bookRepository;
    private final Random random = new Random();

    @Autowired
    public BookDAO(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Anna Karenina, author - Leo Tolstoy, year - 1877",
                "Robinson Crusoe, author - Daniel Defoe, year - 1719",
                "Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future, author - Ashlee Vance, year - 2017",
                "Brave New World, author - Aldous Huxley, year - 1932",
                "Guys Hi, author - Deil Carnegi, year - 1988",
                "7 habits of highly effective, author - Stephen R Covey, year - 1989")
                .forEach(s -> bookRepository.save(new Book(increment++, s, random.nextInt(5) + 6)));
    }
}
