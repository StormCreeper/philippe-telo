package main;

import java.util.List;

import exceptions.MazeReadingException;
import graph.Dijkstra;
import graph.ShortestPaths;
import graph.Vertex;
import maze.Maze;
import ui.Window;

public class LabyrintheHexagonal {
	
	private Maze maze;
	public List<Vertex> path;

	public LabyrintheHexagonal() {
		maze = new Maze(10, 10);
		maze.reset();
		
		new Window(this);
	}
	public void reset() {
		maze.reset();
		path = null;
	}
	public void load() {
		try {
			maze.initFromTextFile("data/labyrinthe.maze");
			path = null;
		} catch (MazeReadingException e) {
			e.printStackTrace();
		}
	}
	
	public void solve() {
		ShortestPaths sp = Dijkstra.dijkstra(maze, maze.getDeparture(), maze.getArrival(), maze);
		path = sp.getShortestPath(maze.getArrival());
	}
	
	public Maze getMaze() {
		return maze;
	}

}
