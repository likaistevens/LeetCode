/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaili
 */

    public class Demo1 {

        public static void main(String[] args) {
            StringBuffer buffer = new StringBuffer("123456");
            System.out.println(buffer.toString());//输出123456
            buffer.replace(0, 1, "a");
            System.out.println(buffer.toString());//输出a23456
        }
    }
