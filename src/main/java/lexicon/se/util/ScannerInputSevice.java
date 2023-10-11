package lexicon.se.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputSevice  implements UseronputService {
    @Autowired
    private Scanner scanner;

    @Override
    public String getString() {
        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        return scanner.nextInt();
    }
}
