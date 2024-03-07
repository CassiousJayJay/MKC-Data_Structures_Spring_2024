package org.github.CasiousJayJay.library;

public class Main {
    private static int bookcounter;
    private static int counter;
    public static void main(String[] args) {

        System.out.println("hello world");

    }
    public Main(){
        bookcounter++;
    }
    public int sum(int x, int y){
        return x + y;

    }

    public String helloJames() {
        return "Hello James";
    }

    public static int numberofBooks() {
        return bookcounter;
    }

    public String returnHelloJames(String james) {
        return "Hello James";
    }

    public int devideNumber(int a, int b) {
        return a / b;
    }

    public int subtraction() {
        return 50;
    }

    public int demostraringArrays() {
        return counter;
    }
}
