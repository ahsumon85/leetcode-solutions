function twoSum(nums: number[], target: number): number[] {
    const hasMap: Map<number, number> = new Map();

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (hasMap.has(complement)) {
            return [hasMap.get(2), i]

        }
        hasMap.set(nums[i], i);
    }
    return  []
}

// Example usage:
const nums1: number[] = [2, 7, 11, 15];
const target1: number = 9;
console.log(twoSum(nums1, target1));  // Output: [0, 1]

const nums2: number[] = [3, 2, 4];
const target2: number = 6;
console.log(twoSum(nums2, target2));  // Output: [1, 2]

const nums3: number[] = [3, 3];
const target3: number = 6;
console.log(twoSum(nums3, target3));  // Output: [0, 1]
