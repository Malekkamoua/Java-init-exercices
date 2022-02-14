package com.tutorial.java.OOP;

     interface Drawable{
         void draw();
     }

     class Rectangle implements Drawable{
         public void draw(){
             System.out.println("drawing rectangle");
         }
     }
     class Circle implements Drawable{
        public void draw(){
                System.out.println("drawing circle");
            }
    }

    class InterfaceOop{
        public static void main(String args[]){

            Circle c=new Circle();
            Rectangle r = new Rectangle();

            c.draw();
            r.draw();
        }
 }


