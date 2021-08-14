package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.AfishaItem;

@NoArgsConstructor
public class AfishaManager {
    int limitLength = 10;

    private AfishaItem[] items = new AfishaItem[0];

    public AfishaManager(int limitLength) {
        this.limitLength = limitLength;
    }

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
        if (items.length < limitLength) {
            resultLength = items.length;
        } else {
            resultLength = limitLength;
        }
        AfishaItem[] result = new AfishaItem[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}

