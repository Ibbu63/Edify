package com.campus.services;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final List<String> students = new ArrayList<>();

    public StudentService() {
        students.add("101 - Cristiano Ronaldo - JAVA");
        students.add("102 - Lionel Messi - C++");
        students.add("103 - Neymar Jr - Python");
        students.add("104 - Kylian Mbappe - JavaScript");
        students.add("105 - Mohamed Salah - C#");
        students.add("106 - Kevin De Bruyne - Ruby");
        students.add("107 - Virgil van Dijk - PHP");
        students.add("108 - Robert Lewandowski - Swift");
        students.add("109 - Erling Haaland - Kotlin");
        students.add("110 - Luka Modric - TypeScript");
        students.add("111 - Sadio Mane - Go");
        students.add("112 - Karim Benzema - R");
        students.add("113 - Harry Kane - Dart");
        students.add("114 - Paulo Dybala - Scala");
        students.add("115 - Romelu Lukaku - Perl");
        students.add("116 - Son Heung-min - Haskell");
        students.add("117 - Raheem Sterling - Lua");
        students.add("118 - Bruno Fernandes - Julia");
        students.add("119 - Jadon Sancho - Clojure");
        students.add("120 - Bernardo Silva - Elixir");
        students.add("121 - Thomas Muller - F#");
        students.add("122 - Joshua Kimmich - Crystal");
        students.add("123 - Frenkie de Jong - Nim");
        students.add("124 - Riyad Mahrez - OCaml");
        students.add("125 - Christian Pulisic - Fortran");
        students.add("126 - Angel Di Maria - COBOL");
        students.add("127 - Gerard Pique - Assembly");
        students.add("128 - Sergio Ramos - Prolog");
        students.add("129 - Zlatan Ibrahimovic - Lisp");
    }

    public List<String> getStudents() {
        return students;
    }

    public void addStudent(String name, String course) {
        students.add(String.valueOf(students.size() + 101) + " - " + name + " - " + course);
    }
}