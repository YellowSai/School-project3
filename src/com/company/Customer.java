package com.company;

public class Customer {
    private String name;    //-//顾客姓名，默认值是null
    private int card;       //顾客银行卡号
    private String phone;   //顾客电话号码，默认值是null
    private double money;   //顾客存款，默认值是0.0

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCard() {
        return card;
    }
    public void setCard(int card) {
        this.card = card;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    public boolean save(double money){  //存钱，给定参数：存多少钱
            if (getName() != null){
                setMoney(money+getMoney());
                return true;
            }
            return false;
    }

    public void draw(double money){     //取钱，给定参数：取多少钱
        if (getName() != null){
            if (money<=getMoney()) {
                setMoney(getMoney() - money);
            }else {
                System.out.println("您没有这么多钱!");
            }
        }
    }
    public boolean recharge(String phoneNum,double money){      //电话充值，给定参数：电话号码和充值金额
        if (getName() != null){
            if (phone.equals(phoneNum)){
                setMoney(money+getMoney());
                return true;
            }else {
                return false;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", card=" + card +
                ", phone='" + phone + '\'' +
                ", money=" + money +
                '}';
    }

    public Customer(String name, int card, String phone, double money) {
        this.name = name;
        this.card = card;
        this.phone = phone;
        this.money = money;
    }

    public Customer(){

    }
}
