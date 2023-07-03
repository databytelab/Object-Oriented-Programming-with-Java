/* 
------------------
Week Days
------------------
1. Monday
2. Tuesday
3. Wednesday
4. Thursday
5. Friday
6. Saturday
7. Sunday
-----------------------
*/
public class WeekDay {
    public static void main(String[] args) {
       
        int day = (2 + 100) % 7;
        System.out.println("The day after 100 days will be: " + day);
    }
}