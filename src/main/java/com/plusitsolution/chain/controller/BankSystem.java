package com.plusitsolution.chain.controller;
import java.util.Scanner;
public class BankSystem {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("++ป้อนจำนวนผู้ที่ขอเปิดบัญชี จำนวนคน++ ");
        int n = sc.nextInt();
        PersonsDetails C[] = new PersonsDetails[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new PersonsDetails();
            C[i].openAccount();
        }
        int ch;
        do {
            System.out.println("\n ***เลือกรายการ***");
            System.out.println("1.ดูบัญชีทั้งหทด");
            System.out.println("2.ค้นหาด้วยหมายเลขบัญชี");
            System.out.println("3.ฝากเงิน");
            System.out.println("4.ถอนเงิน");
            System.out.println("5.เปิดบัญชีใหม่");
            System.out.println("6.ออก");
            System.out.println("ใส่ตัวเลือก1-6: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("ใส่หมายเลขบัญชี เพื่อค้นหา: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("ไม่มีหมายเลขบัญชี!!!");
                    }
                    break;
                case 3:
                    System.out.print("ใส่หมายเลขบัญชี : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("ไม่มีหมายเลขบัญชีนี้!!!");
                    }
                    break;
                case 4:
                    System.out.print("ใส่หมายเลขบัญชี");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("ไม่มีหมายเลขบัญชีนี้!!!");
                    }
                    break;
               case 5:
                    for (int i = 0; i < C.length; i++) {
                        C[i].openAccount();
                    }
                    break;
               case 6:
                   System.out.println("ออกจากระบบ ขอบคุณที่ใช้บริการ");
                   break;
                    }
        }
        while (ch != 6);
    }
}
