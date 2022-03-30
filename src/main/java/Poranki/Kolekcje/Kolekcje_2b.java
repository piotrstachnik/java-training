package Poranki.Kolekcje;

import java.util.*;

//Task#1

//public class Student {
//    private final String name;
//    private final List<Integer> grades;
//
//    public Student(String name, Integer ... grades) {
//        this.name = name;
//        this.grades = new ArrayList<>(Arrays.asList(grades));
//    }
//}

//    Przygotuj kolejkę PriorityQueue przechowującą studentów. Przy pobieraniu chcemy, aby studenci byli zwracani od najbardziej pilnego (najwyższa średnia ocen). Można dodawać metody do klasy Student jeśli jest taka potrzeba.
//
//        Task#2
//
//        Przygotuj metodę, która dostaje listę słów i zwraca mapę postaci
//        {ilość_liter=[lista_słów_z_taką_ilością_liter]}
//
//        Przykład:
//        Dane wejściowe:
//        „a”, „b”, „abc”, „c”, „def”
//        Wyjście:
//        {1=[a, b, c], 3=[abc, def]}



public class Kolekcje_2b {

//    Rozwiązania zadania 2.1
    public static class Student implements Comparable<Student>{
        private String name;
        private List <Integer> grades;

        public Student(String name, Integer ... grades ) {
            this.name = name;
            this.grades = new ArrayList<>(Arrays.asList(grades));
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name)
                    && Double.compare(student.getAvg(), getAvg()) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, grades);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", avarage grade=" + getAvg() +
                    '}';
        }

        public double getAvg() {
            double suma = 0.0;
            for (Integer grade : this.grades) {
                suma += grade;
            }
            return suma/grades.size();
        }

        // Porównanie studentów po średniej ocen od najwyzszej do najnizszej
        @Override
        public int compareTo(Student student) {
            if (this.getAvg() > student.getAvg()) {
                return -1;
            } else if (this.getAvg() < student.getAvg()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static class PriorityQueueStudentDefinedAvgGrade {
        public static void main(String[] arg) {
                    /*
           The requirement for a PriorityQueue of user defined objects is that

           1. Either the class should implement the Comparable interface and provide
              the implementation for the compareTo() function.
           2. Or you should provide a custom Comparator while creating the PriorityQueue.
        */

            // Create a PriorityQueue
            PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>();
//            PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); // funkcja odwracajáca kolejnosc

            // Add items to the Priority Queue
            studentPriorityQueue.add(new Student("Piotr", 2,3,1,6,4));
            studentPriorityQueue.add(new Student("Paweł", 5,5,1,2,4));
            studentPriorityQueue.add(new Student("Iza", 3,4,5,6,2));
            studentPriorityQueue.add(new Student("Ewa", 3,3,4,4,1));
            studentPriorityQueue.add(new Student("Tomek", 4,3,3,2,5));
            studentPriorityQueue.add(new Student("Wojtek", 2,3,4,2,1));
            studentPriorityQueue.add(new Student("Iwona", 3,4,5,6,2));
            /*
            The compareTo() method implemented in the Employee class is used to determine
            in what order the objects should be dequeued.
            */
            while (!studentPriorityQueue.isEmpty()) {
                System.out.println(studentPriorityQueue.remove());
            }
        }
    }
}
