import java.util.Scanner;

public class timgiatritrongomang {
    public static void main(String[] args) {
        String[] students = {"Hoàng", "Minh", "Khánh", "Tâm", "Chí Anh", "Sâm", "Nhân", "Dân", "Huy", "Duy"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Tên Học Sinh:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị Trí Của Học Sinh Trong Danh Sách " + input_name + " là : " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy" + input_name + " Trong danh sách.");
        }

    }
}
