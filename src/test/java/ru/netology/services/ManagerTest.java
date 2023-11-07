package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Manager manager = new Manager();

    @Test
    public void addNewFilm2Test() {

        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперёд");

        String[] actual = manager.findAllFilms();
        String[] expected = {"Бладшот",
                            "Вперёд"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewFilms3Test() {

        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперёд");
        manager.addNewFilm("Отель Белград");

        String[] actual = manager.findAllFilms();
        String[] expected = {"Бладшот",
                            "Вперёд",
                            "Отель Белград"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewFilm7Test() {

        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперёд");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентльмены");
        manager.addNewFilm("Человек-невидимка");
        manager.addNewFilm("Тролли. Мировой тур");
        manager.addNewFilm("Номер один");

        String[] actual = manager.findAllFilms();
        String[] expected = {"Бладшот", "Вперёд", "Отель Белград",
                            "Джентльмены", "Человек-невидимка",
                            "Тролли. Мировой тур", "Номер один"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewFilm8Test() {

        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперёд");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентльмены");
        manager.addNewFilm("Человек-невидимка");
        manager.addNewFilm("Тролли. Мировой тур");
        manager.addNewFilm("Номер один");
        manager.addNewFilm("Восьмой фильм");


        String[] actual = manager.findAllFilms();
        String[] expected = {"Бладшот", "Вперёд", "Отель Белград",
                            "Джентльмены", "Человек-невидимка",
                            "Тролли. Мировой тур", "Номер один",
                            "Восьмой фильм"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewFilm0Test() {

        manager.addNewFilm("");

        String[] actual = manager.findAllFilms();
        String[] expected = {""};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLast5FilmsTest() {

        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперёд");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентльмены");
        manager.addNewFilm("Человек-невидимка");
        manager.addNewFilm("Тролли. Мировой тур");
        manager.addNewFilm("Номер один");

        String[] actual = manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур",
                            "Человек-невидимка", "Джентльмены",
                            "Отель Белград"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLast3FilmsTest() {

        Manager manager = new Manager(3);

        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперёд");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентльмены");
        manager.addNewFilm("Человек-невидимка");
        manager.addNewFilm("Тролли. Мировой тур");
        manager.addNewFilm("Номер один");

        String[] actual = manager.findLast();
        String[] expected = {"Номер один",
                            "Тролли. Мировой тур",
                            "Человек-невидимка"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLast7FilmsTest() {

        Manager manager = new Manager(7);

        manager.addNewFilm("Бладшот");
        manager.addNewFilm("Вперёд");
        manager.addNewFilm("Отель Белград");
        manager.addNewFilm("Джентльмены");
        manager.addNewFilm("Человек-невидимка");
        manager.addNewFilm("Тролли. Мировой тур");
        manager.addNewFilm("Номер один");

        String[] actual = manager.findLast();
        String[] expected = {"Номер один", "Тролли. Мировой тур",
                            "Человек-невидимка", "Джентльмены",
                            "Отель Белград", "Вперёд", "Бладшот"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
