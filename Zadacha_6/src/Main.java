public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите тип занятий:");

        TypesOfCourses onlineCourse = new OnlineCourses();
        onlineCourse.type();

        TypesOfCourses offlineCourse = new OfflineCourses();
        offlineCourse.type();

        TypesOfCourses webinar = new Webinar();
        webinar.type();
    }
}