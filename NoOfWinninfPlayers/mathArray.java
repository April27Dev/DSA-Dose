class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int winners=0; 
        int[][] players=new int[n][11];//players,colours
        boolean seen[]=new boolean[n];
        for(int i[]:pick){
            if(++players[i[0]][i[1]]>i[0] && !seen[i[0]]){
                winners++;
                seen[i[0]]=true;
            }
        }
        return winners;
    }
}
