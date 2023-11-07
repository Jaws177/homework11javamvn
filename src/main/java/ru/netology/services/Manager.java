package ru.netology.services;

public class Manager {
    private String[] films = new String[0];
    private final int limit;

    public Manager() {
        this.limit = 5;
    }

    public Manager(int newLimit) {
        this.limit = newLimit;
    }

    public String[] findAllFilms() {
        return films;
    }

    public void addNewFilm(String newFilm) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }

    public String[] findLast() {
        int arrayLength = films.length;

        if (films.length > limit) {
            arrayLength = limit;
        }

        String[] lastAddFilms = new String[arrayLength];
        for (int i = 0; i < lastAddFilms.length; i++) {
            lastAddFilms[i] = films[films.length - 1 - i];
        }
        return lastAddFilms;
    }
}
