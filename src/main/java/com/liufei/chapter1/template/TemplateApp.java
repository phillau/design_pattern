package com.liufei.chapter1.template;

import com.liufei.chapter1.template.concrete.Coffee;
import com.liufei.chapter1.template.concrete.Tea;

public class TemplateApp {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(false);
        Tea tea = new Tea();
        coffee.prepareReceipe();
        System.out.println("--------------------");
        tea.prepareReceipe();
    }
}
