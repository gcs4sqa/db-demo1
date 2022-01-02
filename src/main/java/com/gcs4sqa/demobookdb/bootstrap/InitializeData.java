package com.gcs4sqa.demobookdb.bootstrap;


import com.gcs4sqa.demobookdb.domain.Book;
import com.gcs4sqa.demobookdb.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.goldbuild.javafaker.Faker;

@Component
public class InitializeData implements CommandLineRunner {

    private final BookRepository bookRepository;
    static Faker faker = new Faker();


    public InitializeData(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        for (int x = 0; x < 10; x++) {
            Book bookFaker = new Book(faker.animal().name(), faker.finance().iban(), faker.name().fullName());
            Book savedFakerDDD = bookRepository.save(bookFaker);
        }

//        Book bookDDD = new Book("how to test", "1234", "cliff books");
//        Book savedBookDDD = bookRepository.save(bookDDD);
//        Book bookPPP = new Book("tik tok for beginners", "4567", "Phoebes Books");
//        Book savedBookPPP = bookRepository.save(bookPPP);

    }
}
