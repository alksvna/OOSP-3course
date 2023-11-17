public abstract class TypesOfCourses {
    public void type() {
        onlineCourse();
        offlineCourse();
        webinar();
    }

    protected abstract void onlineCourse();

    protected abstract void offlineCourse();

    protected abstract void webinar();
}
