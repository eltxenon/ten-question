import java.util.HashMap;
import java.util.Map;

public class Q08 {
    public static void main(String[] args) {
        // نمونه آرایه
        int[] numbers = {3, 5, 2, 3, 5, 3, 8, 2, 5};

        // استفاده از HashMap برای شمارش تکرارها
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : numbers) {
            // اگر عدد قبلاً در map هست، مقدارش را یک واحد افزایش بده
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // نمایش تعداد تکرار هر عدد
        System.out.println("تعداد تکرار هر عدد:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("عدد " + entry.getKey() + " : " + entry.getValue() + " بار");
        }
    }
}
