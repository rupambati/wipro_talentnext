package MiniProjects;

public class Project {

    public static void main(String[] args) {
  
        Object[][] students = new Object[5][2];

        students[0][0] = "John";
        students[0][1] = new int[]{80, 90, 85};

        students[1][0] = null;
        students[1][1] = new int[]{50, 55, 60};

        students[2][0] = null;
        students[2][1] = null;

        students[3][0] = "Ava";
        students[3][1] = null;

        students[4][0] = "Eli";
        students[4][1] = new int[]{30, 40, 35};

        int nullNameCount = 0, nullMarksCount = 0, nullObjectCount = 0;

        for (int i = 0; i < students.length; i++) {
            try {
                if (students[i][0] == null && students[i][1] == null) {
                    nullObjectCount++;
                    throw new Exception("NullStudentException occurred");
                }

                if (students[i][0] == null) {
                    nullNameCount++;
                    throw new Exception("NullNameException occurred");
                }

                if (students[i][1] == null) {
                    nullMarksCount++;
                    throw new Exception("NullMarksArrayException occurred");
                }

                int[] marks = (int[]) students[i][1];
                int total = 0;
                for (int mark : marks) {
                    total += mark;
                }

                int avg = total / marks.length;
                String grade = "";

                if (avg >= 80) grade = "A";
                else if (avg >= 65) grade = "B";
                else if (avg >= 50) grade = "C";
                else if (avg >= 35) grade = "D";
                else grade = "F";

                System.out.println("Student " + (i + 1) + " (" + students[i][0] + ") Grade: " + grade);

            } catch (Exception e) {
                System.out.println("Student " + (i + 1) + ": " + e.getMessage());
            }
        }

        System.out.println("\n Null Data Summary");
        System.out.println("Number of Students with Null Name: " + nullNameCount);
        System.out.println("Number of Students with Null Marks: " + nullMarksCount);
        System.out.println("Number of Null Student Objects: " + nullObjectCount);
    }
}