package Solution;

import java.util.*;

public class Solution346 {
    public class MovingAverage {
        private Queue<Integer> window;
        private int maxSize;
        private double preSum = 0.0;

        /** Initialize your data structure here. */
        public MovingAverage(int size) {
            window = new LinkedList<Integer>(  );
            maxSize = size;
        }

        public double next(int val) {
            if(window.size() == maxSize){
                preSum -= window.poll();
            }
            window.add(val);
            preSum += val;
            return preSum/window.size();
        }
    }
}
