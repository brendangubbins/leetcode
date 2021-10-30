class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, Queue<Integer>> scores = new HashMap<>(); 
        
        for (int[] item : items) {
            int id = item[0];
            int score = item[1];
            
            if (scores.containsKey(id)) {
                scores.get(id).add(score);    
            } 
            else {
                scores.put(id, new PriorityQueue<>((a, b) -> b - a));
                scores.get(id).add(score);
            }
        }
        
        LinkedList<int[]> list = new LinkedList<>(); 
        
        for (int key : scores.keySet()) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += scores.get(key).poll();
            }
            list.add(new int[] {key, sum / 5});
        }
        
        return list.toArray(new int[list.size()][]);
    }
}
