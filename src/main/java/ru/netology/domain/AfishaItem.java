package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AfishaItem {
    private int movieId;
    private String movieName;
    private String genre;
    private boolean premiereTomorrow;

}