import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class AfishaTest {


        @Test
        public void numberOfFilmsIsEqualToTheLimit() {
            AfishaManager afisha = new AfishaManager();
            afisha.addFilms("film1");
            afisha.addFilms("film2");
            afisha.addFilms("film3");

            String[] expected = {"film1", "film2", "film3"};
            String[] actual = afisha.findAll();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void findLastTest() {
            AfishaManager afisha = new AfishaManager(3);

            afisha.addFilms("film1");
            afisha.addFilms("film2");
            afisha.addFilms("film3");


            String[] expected = {"film3", "film2", "film1"};
            String[] actual = afisha.findLast();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void findLastTest2() {
            AfishaManager afisha = new AfishaManager();

            afisha.addFilms("film1");
            afisha.addFilms("film2");
            afisha.addFilms("film3");
            afisha.addFilms("film4");
            afisha.addFilms("film5");
            afisha.addFilms("film6");
            afisha.addFilms("film7");
            afisha.addFilms("film8");
            afisha.addFilms("film9");
            afisha.addFilms("film10");


            String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};
            String[] actual = afisha.findAll();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void findAllTest() {
            AfishaManager afisha = new AfishaManager();

            afisha.addFilms("film1");
            afisha.addFilms("film2");
            afisha.addFilms("film3");
            afisha.addFilms("film4");
            afisha.addFilms("film5");
            afisha.addFilms("film6");
            afisha.addFilms("film7");
            afisha.addFilms("film8");
            afisha.addFilms("film9");


            String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9"};
            String[] actual = afisha.findAll();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void findAllTest1() {
            AfishaManager afisha = new AfishaManager();

            afisha.addFilms("film1");
            afisha.addFilms("film2");
            afisha.addFilms("film3");
            afisha.addFilms("film4");
            afisha.addFilms("film5");
            afisha.addFilms("film6");
            afisha.addFilms("film7");
            afisha.addFilms("film8");
            afisha.addFilms("film9");
            afisha.addFilms("film10");
            afisha.addFilms("film11");


            String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10", "film11"};
            String[] actual = afisha.findAll();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void numberOfFilmsIsMoreThanTheLimit() {
            AfishaManager afisha = new AfishaManager(3);

            afisha.addFilms("film1");
            afisha.addFilms("film2");
            afisha.addFilms("film3");
            afisha.addFilms("film4");
            afisha.addFilms("film5");
            afisha.addFilms("film6");


            String[] expected = {"film6", "film5", "film4"};
            String[] actual = afisha.findLast();
            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void numberOfFilmsIsLessThanTheLimit() {
            AfishaManager afisha = new AfishaManager(5);

            afisha.addFilms("film1");
            afisha.addFilms("film2");
            afisha.addFilms("film3");
            afisha.addFilms("film4");


            String[] expected = {"film4", "film3", "film2", "film1"};
            String[] actual = afisha.findLast();
            Assertions.assertArrayEquals(expected, actual);
        }
    }


