package com.plusitsolution.chain.controller;
import java.util.Scanner;
public class PersonsDetails {
    private String account;
    private String name;
    private long balance;
    Scanner sc = new Scanner(System.in);
    public void openAccount() {
        System.out.print("ป้อนรหัสบัญชี: ");
        account = sc.next();
        System.out.print("ป้อนชื่อเจ้าของบัญชี: ");
        name = sc.next();
        System.out.print("ใส่จำนวนเงินฝาก: ");
        balance = sc.nextLong();
        System.out.println("-----------------------");
    }
    public void showAccount() {
        System.out.println("ชื่อ เจ้าของบัญชี: " + name);
        System.out.println("หมายเลขบัญชี: " + account);
        System.out.println("ยอกเงินคงเหลือ: " + balance);
        System.out.println("-----------------------");
    }
    //ฝากเงิน
    public void deposit() {
        long atm;
        System.out.println("ใส่จำนวนเงินที่ต้องการฝาก: ");
        atm = sc.nextLong();
        balance = balance + atm;
        System.out.println("ฝากเงินสำเร็จ ยอดคงเหลือ คือ: " + balance);
    }
    //ถอนเงิน
    public void withdrawal() {
        long atm;
        System.out.println("ใส่จำนวนเงินที่ต้องการถอน: ");
        atm = sc.nextLong();
        if (balance >= atm) {
            balance = balance - atm;
            System.out.println("ยอกเงินคงเหลือ: " + balance);
        } else {
            System.out.println("ยอกเงินน้อยกว่า " + atm + "\tTไม่สามารถถอนเงินได้...!!" );
        }
    }
    public boolean search(String id) {
        if (account.equals(id)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}
