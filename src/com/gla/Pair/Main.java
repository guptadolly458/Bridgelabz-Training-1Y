package com.gla.Pair;

class Main {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Amol", 20);
        System.out.println(student.getFirst() + " " + student.getSecond());
    }
}
