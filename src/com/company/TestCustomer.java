package com.company;

import java.util.Scanner;

public class TestCustomer {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("\t欢迎进入白云工商银行管理系统");
        System.out.println("*****************请先开卡******************");
        System.out.print("请输入姓名:");
        String name = sca.next();
        System.out.print("请输入卡号:");
        int card = sca.nextInt();
        System.out.print("请输入电话号码:");
        String phone = sca.next();
        System.out.print("请输入初始存款金额:");
        double money = sca.nextDouble();
        System.out.println("开卡成功,请选择操作。");
        System.out.println("***********************************");
        Customer customer = new Customer(name,card,phone,money);
        while (true) {
            System.out.println("请输入操作:1.存钱 2.取钱 3.充值话费 4.查询 5.退出系统");
            int choice = sca.nextInt();
            switch (choice) {
                case 1:     //存钱
                    while (true) {
                        System.out.print("请输入存入金额:");
                        double money2 = sca.nextDouble();
                        customer.save(money2);
                        System.out.print("继续存钱吗(y/n):");
                        String continues = sca.next();
                        if (!continues.equals("y")){
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.print("请输入取款金额:");
                        double amount = sca.nextDouble();
                        customer.draw(amount);
                        System.out.print("继续取钱吗(y/n):");
                        String continues = sca.next();
                        if (!continues.equals("y")){
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("请输入充值号码:");
                    String number = sca.next();
                    System.out.print("请输入充值金额");
                    double amount2 = sca.nextInt();
                    if (customer.recharge(number,amount2) == false){
                        System.out.println("请输入正确的充值号码!");
                    }
                    break;
                case 4:     //查询
                    System.out.println("您的信息为:");
                    System.out.println(customer.toString());
                    break;
                case 5:
                    System.out.println("欢迎使用,请取好您的卡!");
                    return;
            }
        }
    }
}
