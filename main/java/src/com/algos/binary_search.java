package com.algos;

class BinarySearch {
    private int k;
    public int bns(int[] nums, int target) {
    
        int i = 0;
        int j = nums.length - 1;

        while(i<=j){
            int mid = i + ((j - i)/2);

            if(nums[mid] == target) return mid;
            else if(nums[mid]<target) i = mid + 1;
            else j = mid - 1;

        }
        return -1;
    }

    public int useSearch(){
        int[] list  = new int[5];
        list[0] = 2;
        list[1] = 5;
        list[2] = -6;
        list[3] = 10;
        list[4] = 3;
        setNum(5);
        return bns(list, getNum());
    }
    public void setNum(int k){
        this.k = k;
    }

    public int getNum(){
        return k;
    }
}

