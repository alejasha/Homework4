package com.zborovskiy.javastruct;

public class LinkList {
    class Link {
        private String name;
        private int age;

        private Link next;

        public Link(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Name: " + this.name + ", age: " + this.age);
        }
    }


    class LinkedList {
        private Link first;

        public LinkedList() {
            first = null;
        }

        public boolean isEmpty() {
            return (first == null);
        }


        public void insert(String name, int age) {
            Link newLink = new Link(name, age);
            newLink.next = first;
            first = newLink;
        }

        public Link delete() {

            Link temp = first;
            first = first.next;
            return temp;

        }

        public void display() {
            Link current = first;
            while (current != null) {
                current.display();
                current = current.next;
            }
        }


    }
}