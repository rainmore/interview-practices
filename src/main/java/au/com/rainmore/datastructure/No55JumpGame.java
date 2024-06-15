package au.com.rainmore.datastructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150">
 * 55. Jump Game</a>
 *
 * https://www.google.com/search?client=firefox-b-d&q=leetcode+jump+game+explain#fpstate=ive&vld=cid:cc3a1c4d,vid:Yan0cv2cLy8,st:0
 */
public class No55JumpGame {

    private Logger logger = LoggerFactory.getLogger(No55JumpGame.class);

    private int c = 0;

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        logger.info("nums: {}, goal: {}", nums, goal);
        return goal == 0;
    }

}
