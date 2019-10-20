package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"01234567890", "John", "Smith"},
            {"01234567890", "John", "Travolta"},
            {"01234567890", "Conan", "Barbarian"},
            {"01234567890", "John", "Wick"},
            {"01234567890", "John", "McClain"}
    };
    private double salaries[] = {
            4500.00,
            3750.00,
            5000.00,
            4250.00,
            3600.00
    };

    public String getWorker(int n) {
        if(n > workers.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
