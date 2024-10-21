import java.io.File;
import java.util.Scanner;

public class Zookeeper {
    public static void main(String[] args) {
        String animalType = "Camel";
        String time = "4:37PM";
        double habitatTemp = 59.66;

        System.out.println("Animal type: " + animalType);
        System.out.println("Current time: " + time);
        System.out.println("Habitat temperature: " + habitatTemp+"F");

        String camel = """
            Look at our camel
            
             ___.-''''-.
            /___  @    |
            ',,,,.     |         _.'''''''._
                 '     |        /           \\
                 |     \\    _.-'             \\
                 |      '.-'                  '-.
                 |                               ',
                 |                                '',
                  ',,-,                           ':;
                       ',,| ;,,                 ,' ;;
                          ! ; !'',,,',',,,,'!  ;   ;:
                         : ;  ! !       ! ! ;  ;   :;
                         ; ;   ! !      ! !  ; ;   ;,
                        ; ;    ! !     ! !   ; ;     
                        ; ;    ! !    ! !     ; ;
                       ;,,      !,!   !,!     ;,;
                       /_I      L_I   L_I     /_I
        
                """;
        System.out.println(camel);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of the habitat you would like to view:\n" +
                "1 - Camel\n" +
                "2 - Hippo\n" +
                "3 - Koala\n" +
                "4 - Spider\n" +
                "\n" +
                "> ");
        int habitatNumber = scanner.nextInt();

        File file = new File("Zookeeper/animals/hippo.txt");
        try{
            Scanner fr = new Scanner(file);
            while(fr.hasNextLine()){
                String i = fr.nextLine();
                System.out.println(i);
            }
        } catch (Exception e){
            System.out.println("No file");
        }


    }
}
