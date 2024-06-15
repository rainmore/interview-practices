package au.com.rainmore.datastructure.graphs;


import java.util.*;

/**
 * <a href="https://leetcode.com/problems/course-schedule/description/">
 * 133. Clone Graph</a>
 *
 * Time O(n ^ m)
 * Space O(n * m)
 *
 */
public class No207CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> adj = new HashMap<>(numCourses);

        for (int i = 0; i < numCourses; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (isCyclic(adj, visited, i)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isCyclic(Map<Integer, List<Integer>> adj, int[] visited, int curr) {
        if (visited[curr] == 2) {
            return true;
        }

        visited[curr] = 2;
        for (int i = 0; i < adj.get(curr).size(); i++) {
            if (visited[adj.get(curr).get(i)] != 1) {
                if (isCyclic(adj, visited, adj.get(curr).get(i))) {
                    return true;
                }
            }
        }
        visited[curr] = 1;
        return false;
    }

}
