package asa;
// inspired by song storage example by nicolas.lankes
public class CloudStorage {

    private String fileType;
    private double fileSize;
    private String fileName;

    public void setFileType(String fileType){
        this.fileType = fileType;
    }

    public void setFileSize(double fileSize){
        this.fileSize = fileSize;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public double getFileSize() {
        return fileSize;
    }

    public String getFileName() {
        return fileName;
    }



    public void getFileDetails(){
        System.out.println("-- File Details --");
        System.out.println("File Name: " + getFileName());
        System.out.println("File Type: " + getFileType());
        System.out.println("File Size: " + getFileSize() + " MB");
    }

    public void uploadFile() { // Used to streamline the console output of the uploading process
        System.out.println();
        System.out.println("Uploading " + getFileName());
        System.out.println("Please wait..");
        System.out.println(getFileName() + " was uploaded!");
        System.out.println();
        getFileDetails();
        System.out.println();
    }


}
