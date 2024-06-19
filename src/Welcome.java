import java.util.LinkedList;
import java.util.Scanner;

public class Welcome {
    private static LinkedList<User> userList = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int Select_menu = -1;

        inputUser();
        printMenu();
        System.out.print("메뉴 번호를 선택해주세요 : ");
        Select_menu = sc.nextInt();
        System.out.printf("%d 번을 선택하셨습니다.",Select_menu);
    }
    public static void printMenu(){
        System.out.println("************************************************");
        System.out.println("\t\tWelcome to Shopping Mall");
        System.out.println("\t\tWelcome to Book Market!");
        System.out.println("************************************************");
        System.out.print("1. 고객 정보 확인하기      ");
        System.out.println("4. 바구니에 항목 추가하기");
        System.out.print("2. 장바구니 상품 목록 보기  ");
        System.out.println("5. 장바구니의 항목 수량 줄이기");
        System.out.print("3. 장바구니 비우기         ");
        System.out.println("6. 장바구니의 항목 삭제하기");
        System.out.print("7. 영수증 표시하기         ");
        System.out.println("8. 종료");
        System.out.println("************************************************");
    }
    public static void inputUser(){
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String phone = sc.nextLine();

        //예외처리부분 나중에

        userList.add(new User(name,phone));
    }
}
