package lambda_functional_programming01;

public class Courses {

    //constructer obje yi olustrdugumuz sey di class ismi ile ayni return type yok
    private String Season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;

    public Courses() {    //constructer obje yi olustrdugumuz sey di class ismi ile ayni return type yok
//neden bu var parametresiz bir obje olustrmak icin bu bos constructer olustrduk
        //int ==0 Integer ==null
    }

    public Courses(String season, String courseName, int averageScore, int numberOfStudents) {
        Season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    @Override
    public String toString() {
        return "Course: Season=" + Season + ", courseName=" + courseName + ", averageScore=" + averageScore
                + ", numberOfStudents=" + numberOfStudents;
    }



}
