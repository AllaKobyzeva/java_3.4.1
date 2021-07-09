package ru.netology.manager;

import ru.netology.domain.AfishaItem;

public class AfishaManager {

    private AfishaItem[] items = new AfishaItem[0];

    public void add(AfishaItem item) {
        int length = items.length + 1;
        AfishaItem[] tmp = new AfishaItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public AfishaItem[] getAll() {
        int resultLength;
        if (items.length < 10) {
            resultLength = items.length;
        } else {
            resultLength = 10;
        }
        AfishaItem[] result = new AfishaItem[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}