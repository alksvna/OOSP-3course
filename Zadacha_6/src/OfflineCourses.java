public class OfflineCourses extends TypesOfCourses{
    @Override
    protected void onlineCourse() {
    }

    @Override
    protected void offlineCourse() {
        System.out.println("Офлайн занятие");
    }

    @Override
    protected void webinar() {
    }
}
