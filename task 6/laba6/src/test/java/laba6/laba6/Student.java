package laba6.laba6;

public class Student {

    double iDNumber;

    public Student() {
        this.iDNumber = 0 + (int) (Math.random() * ((1000 - 0) + 1));
        // System.out.println("9. Student -> iDNumber = " + iDNumber);
    }

    public int compareTo(Student student) {
        if (student.iDNumber < iDNumber)
            return -1;
        else if (student.iDNumber > iDNumber)
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "" + iDNumber;
    }

}
