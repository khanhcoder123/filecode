/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dijkstraalgorithm.java;

import java.util.Arrays;

/**
 *
 * @author khanh
 */
public class DijkstraAlgorithmJava {

    private static final int INFINITY = Integer.MAX_VALUE;

    /**
     * Thuật toán Dijkstra để tìm đường đi ngắn nhất từ đỉnh nguồn tới các đỉnh khác trong đồ thị.
     * @param graph    Đồ thị đầu vào được biểu diễn dưới dạng ma trận kề.
     * @param source   Đỉnh nguồn để tìm đường đi ngắn nhất.
     */
    public static void dijkstra(int[][] graph, int source) {
        int n = graph.length;
        int[] distance = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(distance, INFINITY);    // Khởi tạo tất cả khoảng cách ban đầu là vô cùng
        distance[source] = 0;    // Đặt khoảng cách của đỉnh nguồn là 0

        for (int i = 0; i < n - 1; i++) {
            int minDistance = INFINITY;
            int minIndex = -1;

            // Tìm đỉnh có khoảng cách nhỏ nhất trong các đỉnh chưa được duyệt
            for (int j = 0; j < n; j++) {
                if (!visited[j] && distance[j] < minDistance) {
                    minDistance = distance[j];
                    minIndex = j;
                }
            }

            // Nếu không tìm thấy đỉnh, thoát khỏi vòng lặp
            if (minIndex == -1) {
                break;
            }

            visited[minIndex] = true;    // Đánh dấu đỉnh đã được duyệt

            // Cập nhật khoảng cách của các đỉnh kề với đỉnh đã duyệt
            for (int j = 0; j < n; j++) {
                if (!visited[j] && graph[minIndex][j] != 0 && distance[minIndex] != INFINITY
                        && distance[minIndex] + graph[minIndex][j] < distance[j]) {
                    distance[j] = distance[minIndex] + graph[minIndex][j];
                }
            }
        }

        // In ra khoảng cách ngắn nhất từ đỉnh nguồn tới các đỉnh khác
        System.out.println("Khoảng cách ngắn nhất từ đỉnh nguồn " + source + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("Đỉnh " + i + ": " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
            { 0, 0, 2, 0, 0, 0, 6, 7, 0 }
        };

        int source = 0;
        dijkstra(graph, source);
    }
}
