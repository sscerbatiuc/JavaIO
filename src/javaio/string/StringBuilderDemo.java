/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.string;

/**
 *
 * @author sscerbatiuc
 */
public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi ");
        sb.append(" my name is Java aiosdkasdmaklsmd klll")
                .append("lllllllllllllllllllllllllllllllllllllllllllllllllll")
                .append("llllllllllllllllllllll")
                .append("Nice to meet you")
                .append("How are you");
//        sb.delete(2, 3);
        sb.insert(2, "A");
        System.out.println(sb);
    }
}
