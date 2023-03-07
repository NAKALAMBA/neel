package Tut2;

class T1 {
    public static void main(String args[])
    {
        int marks[] = {  92 , 87 , 91 , 98 , 80  };
        int max_marks = marks.length * 100;
        int total = 0;
        char grade = 'F';
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        double percentage
            = ((double)(total) / max_marks) * 100;
        if (percentage >= 80) {
            grade = 'A';
        }
        else {
            if (percentage >= 73 && percentage < 80) {
                grade = 'B';
            }
            else {
                if (percentage >= 65 && percentage < 73) {
                    grade = 'C';
                }
                else {
                    if (percentage >= 55 && percentage <= 65) {
                        grade = 'D';
                    }
                    else {
                        grade = 'F';
                    }
                }
            }
        }
        System.out.println(grade);
    }
}