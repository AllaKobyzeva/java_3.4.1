package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.AfishaItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestAfishaManager {
    @Test
    public void shouldGetMovie() {
        AfishaManager manager = new AfishaManager();
        AfishaItem first = new AfishaItem(1, "первый", "комедия", false);
        AfishaItem second = new AfishaItem(2, "второй", "ужасы", true);
        AfishaItem third = new AfishaItem(3, "третий", "боевик", true);
        manager.add(first);
        manager.add(second);
        manager.add(third);


        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{third, second, first};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldGetMovieOverMax() {
        AfishaManager manager = new AfishaManager();
        AfishaItem first = new AfishaItem(1, "первый", "комедия", false);
        AfishaItem second = new AfishaItem(2, "второй", "ужасы", true);
        AfishaItem third = new AfishaItem(3, "третий", "боевик", true);
        AfishaItem four = new AfishaItem(4, "четветый", "комедия", false);
        AfishaItem five = new AfishaItem(5, "пятый", "ужасы", true);
        AfishaItem six = new AfishaItem(6, "шестой", "боевик", true);
        AfishaItem seven = new AfishaItem(7, "седьмой", "комедия", false);
        AfishaItem eight = new AfishaItem(8, "восьмой", "ужасы", true);
        AfishaItem nine = new AfishaItem(9, "девятый", "боевик", true);
        AfishaItem ten = new AfishaItem(10, "десятый", "комедия", false);
        AfishaItem eleven = new AfishaItem(11, "одиннадцатый", "ужасы", true);
        AfishaItem twelve = new AfishaItem(12, "двенадцатый", "боевик", true);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        manager.add(twelve);

        AfishaItem[] actual = manager.getAll();
        AfishaItem[] expected = new AfishaItem[]{twelve, eleven, ten, nine, eight, seven, six, five, four, third};

        assertArrayEquals(expected, actual);
    }
}
