package org.tudelft.graphalytics.mapreducev2.bfs;

import org.tudelft.graphalytics.algorithms.BFSParameters;
import org.tudelft.graphalytics.mapreducev2.MapReduceJobLauncher;
import org.tudelft.graphalytics.mapreducev2.ToolRunnerJob;

public class BFSJobLauncher extends MapReduceJobLauncher {
	public static final String SOURCE_VERTEX_KEY = "BFS.source";

    private BFSParameters getParameters() {
    	assert (parameters instanceof BFSParameters);
    	return (BFSParameters)parameters;
    }

	@Override
	protected ToolRunnerJob<?> createDirectedJob(String input, String intermediate, String output) {
		return new BreadthFirstSearchJob(input, intermediate, output, getParameters(), true);
	}

	@Override
	protected ToolRunnerJob<?> createUndirectedJob(String input, String intermediate, String output) {
		return new BreadthFirstSearchJob(input, intermediate, output, getParameters(), false);
	}
}
