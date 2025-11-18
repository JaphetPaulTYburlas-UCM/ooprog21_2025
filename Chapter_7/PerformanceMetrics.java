public class PerformanceMetrics {

    public static void main (String [] args) {
        int[] measurementValues = {100, 200, 150, 300}; 
        System.out.println(countAbovePreviousAverage(measurementValues));
    }

    public static int countAbovePreviousAverage (int[] dataArray) {
        int countOfAboveAverage = 0;
        double cumulativeSum = dataArray[0]; 

        for (int i = 1; i < dataArray.length; i++) {
            double previousAverage = cumulativeSum / i;

            if (dataArray[i] > previousAverage) {
                countOfAboveAverage++;
            }
            
            cumulativeSum = cumulativeSum + dataArray[i];
        }

        return countOfAboveAverage;
    }
}
