public class mapMazeByHSPVersion{
	public static void main(String[] args) {
		/*
			要求:做迷宫,并且留下路径痕迹
				1.画地图,用二维数组表示int[][] map = new int[8][7];
				2.(1:墙 0:是可以走但未走过的路 2:是可以走但走过的路[2可以说是走过的痕迹] 3:死路)

		*/
		System.out.println("原始地图");
		int[][] map = new int[8][7];
		for(int i = 0;i < 8;i++){//行
			for(int j = 0;j < 7;j++){//列
				if(i == 0 || i == 7){//i:二维数组(表示行)
					map[0][j] = 1;
					map[7][j] = 1;
				}else if(j == 0 || j == 6){
					map[i][0] = 1;
					map[i][6] = 1;
				}else{
					map[i][j] = 0;
				}
				map[3][1] = 1;
				map[3][2] = 1;

				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("最终找到终点的路径");
		findWay way = new findWay();
		way.findWay(map,1,1);//传个起始位置传参给findway让它从这里慢慢找终点之路
		for(int i = 0;i < 8;i++){
			for(int j = 0;j < 7;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}
}

/*
findWay:
	1.map[1][1]:起点    map[6][5]:终点0
	2.(1:墙 0:是可以走但未走过的路 2:是可以走但走过的路[2可以说是走过的痕迹] 3:死路)
	3.利用递归的方法探索走到终点的路
	      a.递归必须要有一个限制条件,此处的限制条件是map[6][5] == 2,就返回一个true,
	      设置这个条件是因为到达了终点后给上一层的那一步回馈一个true使其可以再给上一步返回一个true，
	      一直true回原始点,那么这条路就通啦

	      b.主人公按照: 下 -> 右 -> 上 -> 左 的顺序方向探索前路

	      c.要说明的一点就是当走到了死路(即四个方向都走不了的时候,当下的位置会设置成3，之后回溯到上一层，
	      标记是为了以后这条路就不用走了因为探测过走这条路是死路)。
	      被标记为2的位置不会再走了(避免重复)
*/
class findWay{
	public boolean findWay(int[][] map,int i, int j){
		if(map[6][5] == 2){
			return true;
		}else {

			 if(map[i][j] == 0){//若当下位置是0,就可以走辽

				 	//预设进来的位置(即下一步的位置既然进来了就假设它可以走但没有走过)把他标记为 2 先
				 	map[i][j] = 2;//待会结果一系列的判断若为死路就会改为3返回false到上一层

				 	   //递归的开始,注意这不着急返回的，先递归到终点，再由终点返回boolean值
				 	if(findWay(map,i + 1,j )){//先向下走试试(即纵坐标加1)
				 		return true;
				 	}else if(findWay(map,i,j + 1)){//向右走
				 		return true;
				 	}else if(findWay(map,i - 1,j)){//向上走
				 		return true;
				 	}else if(findWay(map,i,j - 1)){//向左走
				 		return true;
				 	}else {
				 		map[i][j] = 3;//上面的方向都走不通此位置标记为3然后返回false到上一层
				 		return false; 
				 	}

			 }else{//map[i][j] == 1 、 2 、 3这种直接返回false到上一层让上一层走其他方向试试
			 	return false;
			 }

		}
	}
}