package ru.netology.sqr;

public class SQRService {
    public int calcNumberOfSqr(int lowerBoundary, int upperBoundary) {

        int x = 0;

        for (int i = 10; i <= 99; i++) {
            if ((i * i >= lowerBoundary) & (i * i <= upperBoundary)) {
                x = x + 1;
            }
        }
        return x;
    }
}
