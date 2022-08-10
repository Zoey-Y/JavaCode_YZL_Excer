public class mapMazeByHSPVersion{
	public static void main(String[] args) {
		/*
			Ҫ��:���Թ�,��������·���ۼ�
				1.����ͼ,�ö�ά�����ʾint[][] map = new int[8][7];
				2.(1:ǽ 0:�ǿ����ߵ�δ�߹���· 2:�ǿ����ߵ��߹���·[2����˵���߹��ĺۼ�] 3:��·)

		*/
		System.out.println("ԭʼ��ͼ");
		int[][] map = new int[8][7];
		for(int i = 0;i < 8;i++){//��
			for(int j = 0;j < 7;j++){//��
				if(i == 0 || i == 7){//i:��ά����(��ʾ��)
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

		System.out.println("�����ҵ��յ��·��");
		findWay way = new findWay();
		way.findWay(map,1,1);//������ʼλ�ô��θ�findway�����������������յ�֮·
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
	1.map[1][1]:���    map[6][5]:�յ�0
	2.(1:ǽ 0:�ǿ����ߵ�δ�߹���· 2:�ǿ����ߵ��߹���·[2����˵���߹��ĺۼ�] 3:��·)
	3.���õݹ�ķ���̽���ߵ��յ��·
	      a.�ݹ����Ҫ��һ����������,�˴�������������map[6][5] == 2,�ͷ���һ��true,
	      ���������������Ϊ�������յ�����һ�����һ������һ��trueʹ������ٸ���һ������һ��true��
	      һֱtrue��ԭʼ��,��ô����·��ͨ��

	      b.���˹�����: �� -> �� -> �� -> �� ��˳����̽��ǰ·

	      c.Ҫ˵����һ����ǵ��ߵ�����·(���ĸ������߲��˵�ʱ��,���µ�λ�û����ó�3��֮����ݵ���һ�㣬
	      �����Ϊ���Ժ�����·�Ͳ���������Ϊ̽���������·����·)��
	      �����Ϊ2��λ�ò���������(�����ظ�)
*/
class findWay{
	public boolean findWay(int[][] map,int i, int j){
		if(map[6][5] == 2){
			return true;
		}else {

			 if(map[i][j] == 0){//������λ����0,�Ϳ�������

				 	//Ԥ�������λ��(����һ����λ�ü�Ȼ�����˾ͼ����������ߵ�û���߹�)�������Ϊ 2 ��
				 	map[i][j] = 2;//������һϵ�е��ж���Ϊ��·�ͻ��Ϊ3����false����һ��

				 	   //�ݹ�Ŀ�ʼ,ע���ⲻ�ż����صģ��ȵݹ鵽�յ㣬�����յ㷵��booleanֵ
				 	if(findWay(map,i + 1,j )){//������������(���������1)
				 		return true;
				 	}else if(findWay(map,i,j + 1)){//������
				 		return true;
				 	}else if(findWay(map,i - 1,j)){//������
				 		return true;
				 	}else if(findWay(map,i,j - 1)){//������
				 		return true;
				 	}else {
				 		map[i][j] = 3;//����ķ����߲�ͨ��λ�ñ��Ϊ3Ȼ�󷵻�false����һ��
				 		return false; 
				 	}

			 }else{//map[i][j] == 1 �� 2 �� 3����ֱ�ӷ���false����һ������һ����������������
			 	return false;
			 }

		}
	}
}