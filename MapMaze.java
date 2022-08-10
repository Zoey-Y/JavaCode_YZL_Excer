/*package com.orange.demo;*/

/**
 * 创建地图
 *
 * @author boji
 * @date 2022/07/28
 */
public class MapMaze{
	public static void main(String[] args) {
		/*
			要求:
			 1.得到小球的路径(走的方向与走的策略有关,
			 这里采用:下->右->上->左 的顺序走)
			 2.我以map[1][1]为起点,以map[6][6]为终点
			思路:
			 1.先用二维数组绘制地图:(1:墙 0:是可以走但未走过的路 2:是可以走但走过的路[2可以说是走过的痕迹] 3:死路)
			 	a:(8行8列)先制作地图基本雏形
					0 0 0 0 0 0 0 0				 	   1 1 1 1 1 1 1 1
					0 0 0 0 0 0 0 0 				   1 0 0 0 0 0 0 1
					0 0 0 0 0 0 0 0				 	   1 0 0 0 0 0 0 1
					0 0 0 0 0 0 0 0		---------->	   1 0 0 0 0 0 0 1
					0 0 0 0 0 0 0 0				 	   1 0 0 0 0 0 0 1
					0 0 0 0 0 0 0 0				 	   1 0 0 0 0 0 0 1
					0 0 0 0 0 0 0 0 			 	   1 0 0 0 0 0 0 1
					0 0 0 0 0 0 0 0				 	   1 1 1 1 1 1 1 1
			 	 b:再在地图内设置墙体
			 	 [3][1]、[3][2]、[1][3]、[3][4]、[3][5]、[2][5]
			 	 [5][3]、[5][4]、[5][5]、[5][6]是墙
			 	 
			 	   1 1 1 1 1 1 1 1
			 	   1 0 0 1 0 0 0 1
			 	   1 0 0 0 0 1 0 1
			 	   1 1 1 0 1 1 0 1
			 	   1 0 0 0 0 0 0 1
			 	   1 0 0 1 1 1 1 1
			 	   1 0 0 0 0 0 0 1
			 	   1 1 1 1 1 1 1 1
			 	   
			 2.利用递归的方法找出一条通向终点的路
				 a:(条件类型是boolean,返回的是true)
				 
				 b:(先走一步再判断,
				 若递归到最后是终点自然返回true，
				 若在递归期间出现false自然会在上一层返回false
				 然后在上一层向下执行另一个方向,一直到找到正确的出路为止)

				 c:(为啥会想到用递归:我的感想就是递归是一种多层深入,直到到达了某种条件之后反馈回以前的步骤
				 若在深入期间遇到与递归条件相反的反馈,则会回溯到上一层的步骤进行其它方式的探索,可以利用这种特性
				 与小球寻找方向最终达到终点的方式结合) 	 
		*/
		int n = 8;
		int m = 8;
		
		System.out.println("原始地图");
		int[][] map = new int[n][m];//创建二维数组空间
		for(int i = 0;i < map.length;i++){
			for (int j = 0;j < map[i].length;j++) {
				//第一行 和 最后一行是墙
				if(i == 0 || i == map.length - 1){
					//每个二维数组内的第一个元素
					map[0][j] = 1;
					//每个二维数组内的第二个元素
					map[map.length - 1][j] = 1; 

			    	//第一列 和 最后一列是墙	
				}else if(j == 0 || j == map[i].length - 1){
					//每个一维数组内的头一个元素
					map[i][0] = 1;
					//每个一维数组内的最后一个元素
					map[i][map[i].length - 1] = 1;
				}
				else {
					 map[i][j] = 0;
				}
			 //地图内墙体额外设置
				map[3][1] = 1;
				map[3][2] = 1;
				map[1][3] = 1;
				map[3][4] = 1;
				map[3][5] = 1;
				map[2][5] = 1;
				map[5][3] = 1;
				map[5][4] = 1;
				map[5][5] = 1;
				map[5][6] = 1;
				 
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		findWay way = new findWay();
		System.out.println("找到到达终点的路线图是:");
		way.Way(map,1,1);
		for(int i = 0;i < n;i++){
			for(int j = 0;j < m;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}
}
/*
1.墙 0:是可以走但未走过的路 2:是可以走但走过的路[2可以说是走过的痕迹] 3:死路
2.我以map[1][1]为起点,以map[6][6]为终点
*/
class findWay{
					  
	public boolean Way(int[][] map,int n,int m){
		//起始位置[1][1]
		//终止位置[6][6]
		if(map[6][6] == 2){
			return true;
		}else {//若没到终点就找路
			if (map[n][m] == 0){//先给下一步的路进行判断能走就进来
				//先假定这一步算是走了在这里把下一步给定义个2(可以走但走过)
				map[n][m] = 2;
				//按照下 -> 右 -> 上 -> 左,递归方式探索前路,到终点再一次性返回true
				if(Way(map,n + 1,m)){
					return true;
				}else if(Way(map,n,m + 1)){
					return true;
				}else if(Way(map,n - 1,m)){
					return true;
				}else if(Way(map,n,m - 1)){
					return true;
				}else{//都走不通就返回false给上层
					return false;
				}
			}else {//若下一步是1(墙)、2(可以走但走过了的路)、3(死路)map[n][m] == 1,2,3时就返回false给上一层继续找
				return false;
			}
		}

	}
}
/*class maps{
	public void Map(int n,int m){ //n二维数组(行长),m一维数组(列长)
		
	} 
}*/
/*class otherWall{//其它墙体
	public void wall(int n,int m){
		maps m2 = new maps();
		m2.Map(n,m);
			for(int i = 0;i < n;i++){
				for(int j = 0;j < m;j++){
					
				}
			}
				
	}
}*/
