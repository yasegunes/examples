import java.util.Optional;
public class Main {

        public static void main(String[] args) {
            kullanıcı userWithEmail = new kullanıcı("Ahmet", "ahmet@example.com");
            kullanıcı userWithoutEmail = new kullanıcı("Mehmet", null);

            printEmail(userWithEmail); // Kullanıcının e-posta adresi: ahmet@example.com
            printEmail(userWithoutEmail); // E-posta adresi bulunamadı.
        }

    public static void printEmail(kullanıcı kullanıcı) {
        kullanıcı.getEmail()
                .ifPresentOrElse(
                        email -> System.out.println("Kullanıcının e-posta adresi: " + email),
                        () -> System.out.println("E-posta adresi bulunamadı.")
                );
        }

}