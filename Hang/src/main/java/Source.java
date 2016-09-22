import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Minh Hang on 09/20/2016.
 */
public class Source {

    private int Menu() {
        System.out.println("##################_Menu_###############");
        System.out.println("1. Add a student");
        System.out.println("2. Display the list");
        System.out.println("3. Delete a student");
        System.out.println("4. Fix formation");
        System.out.println("5. Search a student");
        System.out.println("6. Arrange the list");
        System.out.println("7. Statistic");
        System.out.println("8. Exit");
        System.out.print("=>Enter the number: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void MainMenu() throws IOException {
        int menu = Menu();
        while (true) {
            switch (menu) {
                case 1:
                    AddStudent ad = new AddStudent();
                    ad.InsertSt();
                    break;
                case 2:
                    DisplayList dl=new DisplayList();
                    dl.Display();
                    break;
                case 3:
                    DeleteStudent ds=new DeleteStudent();
                    ds.DeleteSt();
                    break;
                case 4:
                    FixStudent fs=new FixStudent();
                    fs.FixSt();
                    break;
                case 5:
                    SearchStudent ss=new SearchStudent();
                    ss.SearchSt();
                    break;
                case 6:
                    SortStudent sst=new SortStudent();
                    sst.SortSt();
                    break;
                case 7:
                    StatisticList sl=new StatisticList();
                    sl.StatisticSt();
                    break;
                case 8:
                    System.exit(1);
                    break;
            }
            menu = Menu();
        }
    }

    public static void main(String[] args) throws IOException {

        Source sc = new Source();
        sc.MainMenu();

    }
}
