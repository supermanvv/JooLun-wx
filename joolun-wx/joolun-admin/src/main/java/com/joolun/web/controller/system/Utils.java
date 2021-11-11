package com.joolun.web.controller.system;

import org.springframework.stereotype.Component;

@Component
public class Utils {

    public int add(int i, int j) {
        return i + j;
    }

    public int multiplication(int i, int j) {
        return i * j;
    }

    public void shuixianhuashu() {
        for (int i = 100; i < 1000; i++) {
            int BaiNum = i / 100;//分解出百位
            int ShiNum = i / 10 % 10;//分解出十位
            int GeNum = i % 10;//分解出个位
            // 判断是否为水仙花数，即百位的三次方+十位的三次方+个位的三次方=数字本身
            if (BaiNum * BaiNum * BaiNum + ShiNum * ShiNum * ShiNum + GeNum * GeNum * GeNum == i) {
                System.out.println(i + "为水仙花数");
            }
        }
    }
}

