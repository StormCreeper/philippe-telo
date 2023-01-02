package impls;

import java.util.HashMap;

import graph.MinDistance;
import graph.Vertex;

public class MinDistanceImpl implements MinDistance {
	
	private HashMap<Vertex, Integer> map;

	public MinDistanceImpl() {
		map = new HashMap<Vertex, Integer>();
	}

	@Override
	public void setMinDistance(Vertex vertex, int value) {
		map.put(vertex, value);

	}
	
	@Override
	public int getMinDistance(Vertex vertex) {
		return map.get(vertex);
	}

}