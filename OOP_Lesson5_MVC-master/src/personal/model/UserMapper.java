package personal.model;

import java.util.Scanner;

public class UserMapper {
    public String map(User user) {
        return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(seporatorChoice());
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }

    public String seporatorChoice(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Выберите разделитель(1 - запятая, 2 - точка с запятой, 3 - пробел)");
        int x = iScanner.nextInt();
        iScanner.close();
        switch (x) {
            case 1:
                return ",";
            case 2:
                return ";";
            case 3:
                return " ";
            default:
                return ",";
        }
    }
}
