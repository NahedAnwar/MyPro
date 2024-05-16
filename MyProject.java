
package MyProject;
import java.util.Scanner;

public class MyProject {
    public static Scanner in = new Scanner(System.in);

    public static class Book {
        String type;
        String place;
        String author;
        int version;
        String name;
        double payment;
        String personalCard;
    }

    public static void displayBook(Book book) {
        System.out.println("Type: " + book.type);
        System.out.println("Place: " + book.place);
        System.out.println("Author: " + book.author);
        System.out.println("Version: " + book.version);
        System.out.println("Name: " + book.name);
        System.out.println("Payment: " + book.payment);
        System.out.println("Personal Card: " + book.personalCard);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gaza Library");

        System.out.println("1 - Cultural books");
        System.out.println("2 - Educational books");
        System.out.println("3 - Books for children");
boolean you=true;
        int choice = in.nextInt();
        do{

        switch (choice) {
            case 1:
                System.out.println("Cultural books");
                System.out.println("How many book do you want");
                int culturalSize = in.nextInt();
                Book[] culturalBooks = new Book[culturalSize];

                for (int i = 0; i < culturalBooks.length; i++) {
                    culturalBooks[i] = new Book();
                    System.out.println("Enter book " + (i + 1) + " type:");
                    culturalBooks[i].type = in.next();
                    System.out.println("Enter book " + (i + 1) + " place:");
                    culturalBooks[i].place = in.next();
                    System.out.println("Enter book " + (i + 1) + " author:");
                    culturalBooks[i].author = in.next();
                    System.out.println("Enter book " + (i + 1) + " version:");
                    culturalBooks[i].version = in.nextInt();
                    System.out.println("Enter book " + (i + 1) + " name:");
                    culturalBooks[i].name = in.next();
                    culturalBooks[i].payment = 1000;
                    System.out.println("Enter book " + (i + 1) + " personal card:");
                    culturalBooks[i].personalCard = in.next();
                }

                for (Book culturalBook : culturalBooks) {
                    displayBook(culturalBook);
                }
                break;

            case 2:
                System.out.println("Educational books");
                System.out.println("How many book do you want");
                int educationalSize = in.nextInt();
                Book[] educationalBooks = new Book[educationalSize];

                for (int i = 0; i < educationalBooks.length; i++) {
                    educationalBooks[i] = new Book();
                    System.out.println("Enter book " + (i + 1) + " type:");
                    educationalBooks[i].type = in.next();
                    System.out.println("Enter book " + (i + 1) + " place:");
                    educationalBooks[i].place = in.next();
                    System.out.println("Enter book " + (i + 1) + " author:");
                    educationalBooks[i].author = in.next();
                    System.out.println("Enter book " + (i + 1) + " version:");
                    educationalBooks[i].version = in.nextInt();
                    System.out.println("Enter book " + (i + 1) + " name:");
                    educationalBooks[i].name = in.next();
                    educationalBooks[i].payment = 1000;
                    System.out.println("Enter book " + (i + 1) + " personal card:");
                    educationalBooks[i].personalCard = in.next();
                }

                for (Book educationalBook : educationalBooks) {
                    displayBook(educationalBook);
                }
                break;

            case 3:
                System.out.println("Books for children");
                System.out.println("How many book do you want");
                int childrenSize = in.nextInt();
                Book[] childrenBooks = new Book[childrenSize];

                for (int i = 0; i < childrenBooks.length; i++) {
                    childrenBooks[i] = new Book();
                    System.out.println("Enter book " + (i + 1) + " type:");
                    childrenBooks[i].type = in.next();
                    System.out.println("Enter book " + (i + 1) + " place:");
                    childrenBooks[i].place = in.next();
                    System.out.println("Enter book " + (i + 1) + " author:");
                    childrenBooks[i].author = in.next();
                    System.out.println("Enter book " + (i + 1) + " version:");
                    System.out.println("Enter book " + (i + 1) + " version:");
                    childrenBooks[i].version = in.nextInt();
                    System.out.println("Enter book " + (i + 1) + " name:");
                    childrenBooks[i].name = in.next();
                    childrenBooks[i].payment = 1000;
                    System.out.println("Enter book " + (i + 1) + " personal card:");
                    childrenBooks[i].personalCard = in.next();
                }

                for (Book childrenBook : childrenBooks) {
                    displayBook(childrenBook);
                }
                break;

            default:
                System.out.println("Invalid choice");
                break;
        } System.out.println("Do you want anther thing,  write ture or false");
        you=in.nextBoolean();
    }while (you);
}}

