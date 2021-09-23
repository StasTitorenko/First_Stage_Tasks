package Java_Classes.Main_Task;

import java.time.LocalDate;

public class Runner {
    /*
     * Создать массив объектов. Вывести:

     * a) список студентов заданного факультета;

     * b) списки студентов для каждого факультета и курса;

     * c) список студентов, родившихся после заданного года;

     * d) список учебной группы.
     */
    public static void main(String[] args) {
        Student[] students = {
                new Student(001,"Иванов","Иван","Иванович", LocalDate.of(1990,01,01),
                        "2200701 РБ г.Ивановск, ул.Ивановская д.1","+375 22 232323","Архитектура",
                        1,"Арх-2021"),
                new Student(002,"Иванов", "Семен","Семенович",LocalDate.of(1990,02,02),
                        "2202475 РФ г.Копейск, ул.Революционная д.15", "+375 10 7 78965478", "Архитектура",
                        1,"Арх-2021"),
                new Student(003,"Петров", "Пётр", "Петрович", LocalDate.of(1992,03,03),
                        "2147856 РБ г.Копыль, ул.Мира д.1", "+375 17 245874", "Информационные технологии",
                        2,"ИТ-2020"),
                new Student(004,"Петров", "Вадим", "Вадимович",LocalDate.of(1994,04,04),
                        "2154789 РБ г.Могилев, ул.Октября д.7","+375 25 254875", "Информационные технологии",
                        2,"ИТ-2020"),
                new Student(005,"Сидоров", "Аркадий", "Аркадиевич",LocalDate.of(1995,05,05),
                        "2145862 РБ г.Гомель, ул.Интернациональная д.15","+375 232 254785","Информационные технологии",
                        3,"ИТ-2019"),
                new Student(006,"Зайцев", "Анатолий", "Сергеевич",LocalDate.of(1996,06,06),
                        "2145862 РБ г.Гомель, ул.Интернациональная д.16","+375 232 254786","Информационные технологии",
                        3,"ИТ-2019")
        };
        showStudentsSortedByGivenFaculty(students,"Архитектура");
        showStudentsSortedByGivenFacultyAndCourse(students,"Информационные технологии",2);
        showStudentsBornAfterGivenYear(students,1992);
        showStudentsGivenGroup(students,"ИТ-2019");
    }
    private static void showStudentsSortedByGivenFaculty(Student[] students, String faculty){
        System.out.println("Список студентов факультета "+faculty+":");
        for (Student student : students){
            if (student.getFaculty().equals(faculty)) System.out.println(student);
        }
    }
    private static void showStudentsSortedByGivenFacultyAndCourse(Student[] students, String faculty, int course){
        System.out.println("Список студентов факультета "+faculty+" "+course+"го курса:");
        for (Student student : students){
            if ((student.getFaculty().equals(faculty))&&(student.getCourse()==course)) System.out.println(student);
        }
    }
    private static void showStudentsBornAfterGivenYear(Student[] students, int dateOfBirth){
        System.out.println("Список студентов рожденных после "+dateOfBirth+"го года:");
        for (Student student:students){
            if (student.getDateOfBirth().getYear()>dateOfBirth) System.out.println(student);
        }
    }
    private static void showStudentsGivenGroup(Student[] students,String group){
        System.out.println("Список студентов группы "+group+":");
        for (Student student:students){
            if (student.getGroup().equals(group)) System.out.println(student);
        }
    }
}
