package Poranki.Kolekcje;

import java.util.*;

public class Kolekcje_2 {

//    Rozwiązania zadania 2.1
    public static class Student implements Comparable<Student>{
        private String name;
        private double avgGrades;

        public Student(String name, double avgGrades) {
            this.name = name;
            this.avgGrades = avgGrades;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getAvgGrades() {
            return avgGrades;
        }

        public void setAvgGrades(double avgGrades) {
            this.avgGrades = avgGrades;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name)
                    && Double.compare(student.avgGrades, avgGrades) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, avgGrades);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", avarage grade=" + avgGrades +
                    '}';
        }

        // Porównanie studentów po średniej ocen od najwyzszej do najnizszej
        @Override
        public int compareTo(Student student) {
            if (this.getAvgGrades() > student.getAvgGrades()) {
                return -1;
            } else if (this.getAvgGrades() < student.getAvgGrades()) {
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
            studentPriorityQueue.add(new Student("Piotr", 4.5));
            studentPriorityQueue.add(new Student("Paweł", 5.5));
            studentPriorityQueue.add(new Student("Iza", 3.2));
            studentPriorityQueue.add(new Student("Ewa", 3.7));
            studentPriorityQueue.add(new Student("Tomek", 4.7));
            studentPriorityQueue.add(new Student("Wojtek", 2.7));
            studentPriorityQueue.add(new Student("Iwona", 3.0));
            /*
            The compareTo() method implemented in the Employee class is used to determine
            in what order the objects should be dequeued.
            */
            while (!studentPriorityQueue.isEmpty()) {
                System.out.println(studentPriorityQueue.remove());
            }
        }
    }


// Przykład z sieci 2
//    Creating a Priority Queue
    public static class CreatePriorityQueueExample {
        public static void main(String[] arg) {
            // Create a Priority Queue
            PriorityQueue numbers = new PriorityQueue();
            // Add items to a Priority Queue (ENQUEUE)
            numbers.add(1000);
            numbers.add(600);
            numbers.add(30);
            numbers.add(100);
            numbers.add(500);
            // Remove items from the Priority Queue (DEQUEUE)
            while (!numbers.isEmpty()) {
                System.out.println(numbers.remove());
            }
        }
    }

    public static class CreatePriorityQueueStringExample {
        public static void main(String[] args) {
            // Create a Priority Queue
            PriorityQueue<String> names = new PriorityQueue<>();

            // Add items to a Priority Queue (ENQUEUE)
            names.add("Paweł");
            names.add("Robert");
            names.add("Jan");
            names.add("Krystyna");
            names.add("Andżelika");
            names.add("Józef");

            // Remove items from the Priority Queue (DEQUEUE)
            while (!names.isEmpty()) {
                System.out.println(names.remove());
            }
        }
    }

    //    Creating a Priority Queue with a custom Comparator
    public static class PriorityQueueCustomComparatorExample {
        public static void main(String[] args) {
            // A custom comparator that compares two Strings by their length.
            Comparator<String> stringLengthComparator = new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.length() - s2.length();
                }
            };

        /*
        The above Comparator can also be created using lambda expression like this =>
        Comparator<String> stringLengthComparator = (s1, s2) -> {
            return s1.length() - s2.length();
        };

        Which can be shortened even further like this =>
        Comparator<String> stringLengthComparator = Comparator.comparingInt(String::length);
        */

            // Create a Priority Queue with a custom Comparator
            PriorityQueue<String> names = new PriorityQueue<>(stringLengthComparator);

            // Add items to a Priority Queue (ENQUEUE)
            names.add("Paweł");
            names.add("Robert");
            names.add("Jan");
            names.add("Krystyna");
            names.add("Andżelika");
            names.add("Józef");

            // Remove items from the Priority Queue (DEQUEUE)
            while (!names.isEmpty()) {
                System.out.println(names.remove());
            }
        }
    }


    // Przykład z sieci 2
// Test.java
    public static class Test {
        public static void main(String[] args) {
            Comparator<String> comparator = new StringLengthComparator();
            PriorityQueue<String> queue = new PriorityQueue<String>(10, comparator);
            queue.add("short");
            queue.add("very long indeed");
            queue.add("medium");
            while (queue.size() != 0) {
                System.out.println(queue.remove());
            }
        }
    }

    // StringLengthComparator.java
    public static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String x, String y) {
            // Assume neither string is null. Real code should
            // probably be more robust
            // You could also just return x.length() - y.length(),
            // which would be more efficient.
            if (x.length() < y.length()) {
                return -1;
            }
            if (x.length() > y.length()) {
                return 1;
            }
            return 0;
        }
    }
}
