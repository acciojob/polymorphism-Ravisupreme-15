package com.driver;

public class Main {


    static class Product{


        public int product(int a, int b){

            return a*b;

        }

        public int product(int a, int b, int c){

            return a*b*c;
        }


        public double product(double x,double y){

            return x*y;
        }


    }
    public static void main(String args[]){



        Product product = new Product();



        // int a , int b
        System.out.println( "product of 5 and 6 is "+product.product(5,6));

        // int a, int b, int c
        System.out.println("product of 9,8 and 8 is "+ product.product(9,8,7));

        // double a, double b
        System.out.println("product of 100.00 and 399.00 is "+ product.product(100.00,399.00));




    }
}