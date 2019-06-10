public class foreachloop{
    public static void main(String[] args){
        int[] marks = {120, 130, 140, 150, 95, 100};
        int highestmarks = maximum(marks);
        //sorts through marks array for highest mark - public class function

        System.out.println(highestmarks);
    }
    public static int maximum(int[] numbers){
        int maxSoFar = numbers[0];

        for(int num: numbers){
            //num iterates for numbers.length amount of times
            if (num > maxSoFar){
                //if the number is > the current max filter it 
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
    
}
