package com.codewars.viniciussrezende.kyu_6.fun_graph;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunGraph {
    public static void main(String[] args) {
        int[] arr = {10,5,3,1,4};
        System.out.print(graph(arr));;
    }


    public static String graph(int[] arr) {

        if (arr.length == 0)
            return "";

        int maxValue = Arrays.stream(arr).max().orElse(0);
        StringBuilder barGraph = new StringBuilder();
        List<String[]> barList = new ArrayList<>();
        String[] verticalAxis = verticalAxis(maxValue);

        for(int i : arr)
            barList.add(bar(i, maxValue));

        for (int length = 0; length <= maxValue; length++){
            for (int width = 0; width < arr.length; width++){
                String[] partOfBar = barList.get(width);
                barGraph.append(partOfBar[length]);
            }
            if (length != maxValue)
                barGraph.append(verticalAxis[length]).append("\n");
            else
                barGraph.append(verticalAxis[length]);
        }


        return barGraph.toString();
    }

    public static String[] verticalAxis(int length){


        StringBuilder verticalAxis = new StringBuilder(" ^ " + length + "\n");

        for (int c = length - 1; c >= 0; c--)
            if (c > 0)
                verticalAxis.append(" | ").append(c).append("\n");
            else
                verticalAxis.append(" | ").append(c);

        return verticalAxis.toString().split("\n");
    }

    public static String[] bar(int length, int max){
        final int WIDTH = 6;
        StringBuilder bar = new StringBuilder();


        for (int c = max; c >= 0; c--){
            if (c > length)
                bar.append(".".repeat(6)).append("\n");
            else if (c == length) {
                bar.append(" ").append("_".repeat(WIDTH - 2)).append(" ").append("\n");
            }
            else if (c != 0 )
                bar.append("|").append(" ".repeat(WIDTH - 2)).append("|").append("\n");
            else
                bar.append("|").append(" ".repeat(WIDTH - 2)).append("|");

        }

        return bar.toString().split("\n");
    }

}
