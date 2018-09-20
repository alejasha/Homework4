package com.zborovskiy.javastruct;

public class LinkIteratorApp {


    public static void main(String[] args) {
        LinkedList2way list = new LinkedList2way();
        list.insert("Oleg", 12);
        list.insert("Misha", 11);
        list.insert("Petr", 11);
        list.insert("Lesha", 10);
        list.insertLast("Petya", 13);
        list.insertLast("Kostia", 14);

        list.display();
        System.out.println("Удаление элементов списка");

        list.delete("Misha");
        list.display();


        System.out.println("");
        //проверка работы методов итератора
        Iterator.LinkIterator itrtr = new Iterator.LinkIterator(list);
        list.display();
        System.out.println();
        itrtr.insertAfter("Последыш", 99);
        itrtr.insertBefore("Предыдушич", 5);
        System.out.println(itrtr.getCurrent());
        itrtr.deleteCurrent();
        System.out.println(itrtr.getCurrent());
        System.out.println(itrtr.atEnd());

        list.display();
    }


}
