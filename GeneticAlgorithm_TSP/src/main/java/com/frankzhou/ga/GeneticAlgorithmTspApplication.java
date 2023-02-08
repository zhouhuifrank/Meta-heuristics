package com.frankzhou.ga;

import com.frankzhou.ga.algorithm.Conf;
import com.frankzhou.ga.algorithm.GaStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class GeneticAlgorithmTspApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(GeneticAlgorithmTspApplication.class, args);
        Conf.readInstance();
        System.out.println("运行中");
        GaStrategy.genetic_algoritm().toSolution().print();
    }

}
