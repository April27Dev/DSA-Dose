class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        //putting values inside map(map)
 //playername-key ,(colour-key,count-value)-value
      Map<Integer,Map<Integer,Integer>> hm=new HashMap<>();
      for(int i=0;i<pick.length;i++){
          int player=pick[i][0],colour=pick[i][1];
          if(!hm.containsKey(player)){
            hm.put(player,new HashMap<>());
          }
          Map<Integer,Integer> countcolor=hm.get(player);
          countcolor.put(colour,countcolor.getOrDefault(colour,0)+1);
      }
     //iterating through the map and keeping the count
     int winners=0;
     for(int i=0;i<n;i++){
        boolean won=false;
        Map<Integer,Integer>countcolor=hm.getOrDefault(i,new HashMap<>());
        for(int count:countcolor.values()){
            if(count>i){won=true;break;}
        }
        if(won)winners++;
     }
     return winners;
    }}
