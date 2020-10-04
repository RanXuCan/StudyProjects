package com.rxc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/9/30 0:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    String cno;
    String cname;
    String cterm;
    double ccredit;
    int chours;
}
