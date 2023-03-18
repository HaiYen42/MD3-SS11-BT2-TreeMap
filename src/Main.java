import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character, Integer>treeMap= new TreeMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String str= input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char character= str.toUpperCase().charAt(i);
            Integer checkValue= treeMap.get(character);
            if (checkValue == null) {
                treeMap.put(character, 1);
                continue;
            }
            treeMap.put(character,++checkValue);
        }
        System.out.println("Chuỗi ban đầu là "+ str);
        System.out.println("Số lần lặp lại của ký tự là "+ treeMap);
    }
}