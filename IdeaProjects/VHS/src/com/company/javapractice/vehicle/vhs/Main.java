package com.company.javapractice.vehicle.vhs;

public class Main {

    public static void main(String[] args) {
        VideoLibrary library = new VideoLibrary();
        Video transporter = new Video("The Transporter", "One-day", 16);
        Video matrix = new Video("Matrix", "Two-day", 12);
        EducationVideo anal = new EducationVideo("Anal Attack", "Unlimited");
        library.addVideo(transporter);
        library.addVideo(matrix);
        library.addVideo(anal);
        System.out.println(transporter);
        System.out.println(library.search("Matrix", false));
        System.out.println(library.search("Mission: impossible", false));
    }
}
