package net.wigis.graph.dnv.layout.interfaces;

import net.wigis.graph.dnv.DNVGraph;

public interface CenterPositionFixedLayoutInterface extends LayoutInterface
{
	public void runLayout( DNVGraph graph, int level, float centerX, float centerY );
}
