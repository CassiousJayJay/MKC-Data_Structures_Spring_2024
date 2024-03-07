public class CalculateAverage {
    public static void main(String[] args) {
            // Example usage:
        int math = 85;
        int english = 78;
        int science = 92;

        double average = calculateAverage(math, english, science);
        System.out.println("Average score: " + average);
        }
        public static double calculateAverage(int math, int english, int science) {
            // Calculate the sum of the three subject scores
            // int totalScore = math + english + science;

            // Divide the total score by the number of subjects (which is 3 in this case)
            double average = (double) totalScore / 3;

            return average;
        }
    }

