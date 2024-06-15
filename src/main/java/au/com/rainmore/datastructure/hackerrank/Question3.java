package au.com.rainmore.datastructure.hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/discuss/interview-question/699973/goldman-sachs-oa-turnstile
 */
public class Question3 {
    public List<Integer> getTimes1(List<Integer> time, List<Integer> direction) {
        Queue<Integer> iners = new LinkedList<>();
        Queue<Integer> outers = new LinkedList<>();

        for (int i = 0; i < time.size(); i++) {
            if (direction.get(i) == 1) outers.offer(i);
            else iners.offer(i);
        }

        List<Integer> result = new ArrayList<>(time.size());

        int prevIdx = -2;
        Queue<Integer> previousQueue = outers;
        while (!iners.isEmpty() && !outers.isEmpty()) {
            int curr = prevIdx + 1;
            int inerP = time.get(iners.peek());
            int outerP = time.get(outers.peek());
            Queue<Integer> tmp;

            if (curr < inerP && curr < outerP) {
                tmp = (inerP < outerP) ? iners : outers;
                int idx = tmp.poll() - 1;
                result.set(idx, time.get(idx));
                prevIdx = time.get(idx);
                previousQueue = tmp;
            }
            else {
                if (curr >= inerP && curr >= outerP) {
                    tmp = previousQueue;
                }
                else {
                    tmp = curr >= inerP ? iners : outers;
                }
                int idx = tmp.poll();
                result.set(idx, curr);
                prevIdx = curr;
                previousQueue = tmp;
            }


        }

        //if (prev == 1 || prev == null) // exit first if previous second was exit

        //if (prev == 0) // enter first if previous seound was enter

        Queue<Integer> q = iners.isEmpty() ? outers : iners;
        while(!q.isEmpty()) {
            int curr = prevIdx + 1;
            int idx = q.poll();
            if (curr < time.get(idx)) {
                curr = time.get(idx);
            }
            result.set(idx, curr);
            prevIdx = curr;
        }

        return result;
    }


    public List<Integer> getTimes(List<Integer> time, List<Integer> direction) {
        if (time.isEmpty()) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();

        int index = 0;
        int newPassingTime = 0;
        int currentDirection = 1;
        while (index < time.size()) {
            currentDirection = index == 0 || (time.get(index) > newPassingTime + 1) ? 1 : currentDirection; // exit if not use in the last second
            newPassingTime = Math.max(newPassingTime, time.get(index)); // new passing time has to be >= the arriving time

            int newIndex = index;
            boolean holding = false;
            int lastPassIndex = index;
            while (newIndex < time.size() && time.get(newIndex) <= newPassingTime) {
                if (direction.get(newIndex) == currentDirection) {
                    result.add(newPassingTime++);
                    lastPassIndex = newIndex;
                } else {
                    holding = true; //some people are held due to reversed direction
                }
                newIndex++;
            }


            if (holding) {
                newIndex = index;
                currentDirection = 1 - currentDirection; //reverse the direction
                while (newIndex < time.size() && time.get(newIndex) <= newPassingTime) {
                    if (direction.get(newIndex) == currentDirection) {
                        result.add(newPassingTime++);
                        lastPassIndex = Math.max(lastPassIndex, newIndex);
                    }
                    newIndex++;
                }
            }

            index = lastPassIndex + 1; // starting after the last pass index
        }

        return result;
    }
}
