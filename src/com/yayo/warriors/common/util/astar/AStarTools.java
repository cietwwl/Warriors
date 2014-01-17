package com.yayo.warriors.common.util.astar;

import java.util.List;


/**
 * A*算法池. 
 * @author liuyuhua
 */
public class AStarTools {
	
	/** A*池*/
//	private static final LinkedBlockingQueue<AStar> poolLinked = new LinkedBlockingQueue<AStar>();
	/** 地图障碍点集合 */
//	private ConcurrentLinkedHashMap<Integer, Set<Byte>> gameMapCloseList = new ConcurrentLinkedHashMap.Builder<Integer, Set<Byte>>().maximumWeightedCapacity(100).build();
	
	/** 初始化池的个数*/
//	private static final int INIT_POOL_COUNT = 5;
	
	/** 最大池对象个数*/
//	private static final int MAX_POOL_COUNT = 20;
	
//	static{
//		for(int i = 0 ; i < INIT_POOL_COUNT ; i++){
//			poolLinked.add(new AStar());
//		}
//	}
	

	/**
	 * 通过A*算法查找(请使用AStar2方法中的a*)
	 * @param map       地图二维数组数据
	 * @param x1                起始X坐标
	 * @param y1                起始y坐标
	 * @param x2                终点X坐标
	 * @param y2                终点Y坐标
	 * @return {@link Lint<Point>} 坐标路径集合
	 */
	@Deprecated
	public static List<Point> searchs(byte[][] map,int x1,int y1,int x2,int y2){
//		List<Point> path = new ArrayList<Point>();
//		if(map == null){
//			return path;
//		}
//		AStar astart = getAStar();
//		if(astart == null){
//			return path;
//		}
//		astart.initMap(map, map.length, map[0].length);
//		List<Point> points = astart.searchs(x1, y1, x2, y2);
//		if(points != null){
//			path.addAll(points);
//			release(astart);//回收A*对象
//		}
//		return path;
		
		AStar2 aStar = new AStar2(map, 2000);	//第二个参数表示2000毫秒后自动跳出
		return aStar.find(x1, y1, x2, y2);
	}
	
//	/**
//	 * 获取A*对象
//	 * @return {@link AStar} A*对象
//	 */
//	private static AStar getAStar(){
//		AStar aster = poolLinked.poll();
//		if(aster == null){
//			aster = new AStar();
//		}
//		return aster;
//	}
//	
//	/**
//	 * 回收A*
//	 * @param star A*对象
//	 */
//	private static void release(AStar star){
//		if(star == null){
//			throw new RuntimeException("回收A*时,A*对象为空!");
//		}
//		if(poolLinked.size() < MAX_POOL_COUNT){
//			poolLinked.add(star);
//		}
//	}
	
	
	
}
