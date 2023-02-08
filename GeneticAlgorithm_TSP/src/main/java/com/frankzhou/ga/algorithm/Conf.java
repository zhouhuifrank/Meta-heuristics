package com.frankzhou.ga.algorithm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author This.FrankZhou
 * @version 1.0
 * @description
 * @date 2023-02-08
 */
public class Conf {
    static int N; // 顾客数
    static int Cap; // 容量约束
    static String instance_name;
    static double[][] dis_matriax;//距离矩阵
    static Customer [] customers;//顾客

    public static void readInstance() throws IOException
    {
        File file_to_read = new File("C101.txt");
        Scanner cin = new Scanner(file_to_read);
        instance_name = cin.nextLine();
        N = cin.nextInt();
        Cap = cin.nextInt();
        customers = new Customer[N+1];
        dis_matriax = new double[N+1][N+1];
        // 读入算例
        while(cin.hasNext())
        {
            int i = cin.nextInt();
            customers[i] = new Customer();
            customers[i].x = cin.nextInt();
            customers[i].y = cin.nextInt();
            customers[i].demand = cin.nextInt();
            customers[i].r_time = cin.nextInt();
            customers[i].d_time = cin.nextInt();
            customers[i].s_time = cin.nextInt();
        }
        // 初始化举例矩阵
        for (int i=0;i<=N;i++) {
            for (int j = i; j <= N; j++) {
                if (i == j) {
                    dis_matriax[i][j] = 0;
                } else {
                    dis_matriax[i][j] = CustomerStrategy.dis(customers[i], customers[j]);
                    dis_matriax[j][i] = dis_matriax[i][j];
                }
            }
        }
    }
}
