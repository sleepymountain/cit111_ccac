package asa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FileUploader {
    public static int fileCount = 0;

    public static void main(String[] args) throws InterruptedException {
        // introduce the user to the system
        menu();

    }

    public static void menu(){
        System.out.println("[i] Welcome to javaFiles!");
        System.out.println("--- MENU ---");
        System.out.println("[1] Upload a file.");
        // tried to implement a file directory but got stumped after a few hours
        System.out.println("[2] Exit");
        System.out.println("------------");

        Scanner Menu = new Scanner(System.in);
        System.out.println("Please select an option (1-2): ");
        int option = Menu.nextInt();

        if(option == 1) {
            uploader();

        } else if(option == 2){
            System.out.println("Goodbye.");
        }
    }

    public static void firstFile(){
        System.out.println("Welcome to javaFiles! Let's upload your first file.");
        // create a new file using the CloudStorage object
        CloudStorage fileOne = new CloudStorage();

        // set the file type by scanning for a string
        Scanner FileType = new Scanner(System.in);
        System.out.println("File Type: ");
        fileOne.setFileType(FileType.next());

        // set the file size by scanning for a double
        Scanner FileSize = new Scanner(System.in);
        System.out.println("File Size (MB): ");
        fileOne.setFileSize(FileSize.nextDouble());

        // set the file name by scanning for another string
        System.out.println("File Name: ");
        Scanner FileName = new Scanner(System.in);
        fileOne.setFileName(FileName.next());

        // call the uploadFile() function, simulates uploading and then calls the getFileDetails() function
        fileOne.uploadFile();
        fileCount = fileCount + 1;

        // menu prompt
        menuPrompt();

    }

    public static void menuPrompt(){
        System.out.println();
        System.out.println("Would you like to return to the menu? (yes=1/no=0)");
        Scanner menuPrompt = new Scanner(System.in);
        int menuYN = menuPrompt.nextInt();
        if (menuYN == 1){
            menu();
        } else {
            System.out.println("Goodbye.");
        }
    }

    public static void uploader(){
            if(fileCount == 1) {
                CloudStorage fileTwo = new CloudStorage();
                Scanner FileType = new Scanner(System.in);
                System.out.println("File Type: ");
                fileTwo.setFileType(FileType.next());
                Scanner FileSize = new Scanner(System.in);
                System.out.println("File Size (MB): ");
                fileTwo.setFileSize(FileSize.nextDouble());
                System.out.println("File Name: ");
                Scanner FileName = new Scanner(System.in);
                fileTwo.setFileName(FileName.next());
                fileTwo.uploadFile();
                fileCount = fileCount + 1;
                menuPrompt();
            } else if(fileCount == 2){
                CloudStorage fileThree = new CloudStorage();
                Scanner FileType = new Scanner(System.in);
                System.out.println("File Type: ");
                fileThree.setFileType(FileType.next());
                Scanner FileSize = new Scanner(System.in);
                System.out.println("File Size (MB): ");
                fileThree.setFileSize(FileSize.nextDouble());
                System.out.println("File Name: ");
                Scanner FileName = new Scanner(System.in);
                fileThree.setFileName(FileName.next());
                fileThree.uploadFile();
                fileCount = fileCount + 1;
                menuPrompt();
            } else if(fileCount == 3){
                CloudStorage fileFour = new CloudStorage();
                Scanner FileType = new Scanner(System.in);
                System.out.println("File Type: ");
                fileFour.setFileType(FileType.next());
                Scanner FileSize = new Scanner(System.in);
                System.out.println("File Size (MB): ");
                fileFour.setFileSize(FileSize.nextDouble());
                System.out.println("File Name: ");
                Scanner FileName = new Scanner(System.in);
                fileFour.setFileName(FileName.next());
                fileFour.uploadFile();
                fileCount = fileCount + 1;
                menuPrompt();
            } else if(fileCount == 4){
                CloudStorage fileFive = new CloudStorage();
                Scanner FileType = new Scanner(System.in);
                System.out.println("File Type: ");
                fileFive.setFileType(FileType.next());
                Scanner FileSize = new Scanner(System.in);
                System.out.println("File Size (MB): ");
                fileFive.setFileSize(FileSize.nextDouble());
                System.out.println("File Name: ");
                Scanner FileName = new Scanner(System.in);
                fileFive.setFileName(FileName.next());
                fileFive.uploadFile();
                fileCount = fileCount + 1;
                menuPrompt();
            } else if(fileCount == 0){
                firstFile();
            } else {
                System.out.println("[!] You have reached the maximum amount of files for the day.");
                menuPrompt();
            }
        }
    }
