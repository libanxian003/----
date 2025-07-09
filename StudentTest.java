import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        loop: while(true){
            printMessage();
            String choice = scanner.nextLine();
            switch(choice){
                case "1":
                    addStudent(students, scanner);
                    break;
                case "2":
                    deleteStudent(students, scanner);
                    break;
                case "3":
                    updateStudent(students, scanner);
                    break;
                case "4":
                    viewStudent(students);
                    break;
                case "5":
                    System.out.println("退出成功");
                    break loop;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
        scanner.close();
    }
    public static void printMessage(){
        System.out.println("欢迎来到学生管理系统");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看学生");
        System.out.println("5.退出");
    }
    public static void addStudent(ArrayList<Student> students, Scanner scanner){
        System.out.println("请输入学生姓名");
        String name = scanner.nextLine();
        System.out.println("请输入学生学号");
        String numberStr = scanner.nextLine();
        long number;
        try {
            number = Long.parseLong(numberStr);
        } catch (NumberFormatException e) {
            System.out.println("学号格式错误");
            return;
        }
        for(Student s : students){
            if(s.getNumber() == number){
                System.out.println("学号已存在");
                return;
            }
        }
        Student student = new Student(name, number);
        students.add(student);
        System.out.println("添加成功");
    }
    public static void deleteStudent(ArrayList<Student> students, Scanner scanner){
        System.out.println("请输入要删除的学生学号");
        String numberStr = scanner.nextLine();
        long number;
        try {
            number = Long.parseLong(numberStr);
        } catch (NumberFormatException e) {
            System.out.println("学号格式错误");
            return;
        }
        boolean flag = false;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getNumber() == number){
                students.remove(i);
                System.out.println("删除成功");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("学号不存在");
        }
    }
    public static void viewStudent(ArrayList<Student> students){
        for(Student s : students){
            System.out.println(s.getName() + " " + s.getNumber());
        }
    }
    public static void updateStudent(ArrayList<Student> students, Scanner scanner){
        System.out.println("请输入要修改的学生学号");
        String numberStr = scanner.nextLine();
        long number;
        try {
            number = Long.parseLong(numberStr);
        } catch (NumberFormatException e) {
            System.out.println("学号格式错误");
            return;
        }
        boolean flag = false;
        for(Student s : students){
            if(s.getNumber() == number){
                System.out.println("请输入新的学生姓名");
                String name = scanner.nextLine();
                s.setName(name);
                System.out.println("修改成功");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("学号不存在");
        }
    }
}
