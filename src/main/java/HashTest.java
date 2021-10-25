import org.mindrot.jbcrypt.BCrypt;

public class HashTest {
    public static void main(String[] args) {
        String salt = BCrypt.gensalt();

//        System.out.println(salt);

        String password = "password123";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());

//        System.out.println(hash);

        String hashedPassword = "$2a$10$nRWz/bvY34U9371H31Yd6.V4EuMranKXClVSC6DyhqXg1DAVJyh0.";
        boolean passwordsMatch = BCrypt.checkpw(password, hashedPassword);

        System.out.println(passwordsMatch);
    }
}
