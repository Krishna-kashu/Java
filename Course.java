class Course{
    public static void courseInfo(CourseName course) {
        if (course == CourseName.JAVA) {
            System.out.println("Course: JAVA, Training Cost: 15,000 Rupees");
        } else if (course == CourseName.PYTHON) {
            System.out.println("Course: PYTHON, Training Cost: 12,000 Rupees");
        } else if (course == CourseName.DATA_SCIENCE) {
            System.out.println("Course: DATA SCIENCE, Training Cost: 25,000 Rupees");
        } else if (course == CourseName.CYBER_SECURITY) {
            System.out.println("Course: CYBER SECURITY, Training Cost: 20,000 Rupees");
        } else if (course == CourseName.CLOUD_COMPUTING) {
            System.out.println("Course: CLOUD COMPUTING, Training Cost: 18,000 Rupees");
        } else {
            System.out.println("Course not found.");
        }
    }
}