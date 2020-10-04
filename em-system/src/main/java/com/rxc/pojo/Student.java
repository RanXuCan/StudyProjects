package com.rxc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/9/29 23:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    String sno;
    String sname;
    String sidentityNum;
    String ssex;
    String classno;
    String sphone;
    double stotalcredit;
    String spassword;
}
