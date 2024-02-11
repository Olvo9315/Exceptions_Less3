import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import My_Exceptions.*;

public class App {

    public static void main(String[] args) throws MyAppException {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println(
                        "Введите данные в формате: Фамилия Имя Отчество датарождения(dd.mm.yyyy) номертелефона пол(f/m)");
                String input = scanner.nextLine();
                String[] inputData = input.split(" ");
                if (inputData.length != 6) {
                    System.err.println("Ошибка: неверное количество данных");
                    continue;
                }

                for (int i = 0; i < 3; i++) {
                    if (!inputData[i].matches("[a-zA-Zа-яА-Я]+")) {
                        throw new InvalidNameFormatException();
                    }
                }

                SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");

                try {
                    format.parse(inputData[3]);
                } catch (ParseException e) {
                    throw new MyDateFormatException();
                }

                try {
                    long phoneNumber = Long.parseLong(inputData[4]);
                    if (phoneNumber < 0) {
                        throw new MyInvalidPhoneNumberException();
                    }
                } catch (NumberFormatException e) {
                    throw new MyInvalidPhoneNumberException();
                }

                if (!inputData[5].matches("[fmFM]")) {
                    throw new MyInvalidGenderException();
                }

                String lastName = inputData[0];
                String firstName = inputData[1];
                String middleName = inputData[2];
                String birthdate = inputData[3];
                long phoneNumber = Long.parseLong(inputData[4]);
                char gender = inputData[5].charAt(0);

                Person person = new Person(lastName, firstName, middleName, birthdate, phoneNumber, gender);

                String fileName = lastName + ".txt";

                MyFileWriter.writeToFile(fileName, person.toString());

                System.out.println("Желаете продолжить? (y/n)");
                String answer = scanner.nextLine().trim().toLowerCase();
                if (!answer.equals("y")) {
                    break;
                }

            }
        } finally {
            scanner.close();
        }
    }
}